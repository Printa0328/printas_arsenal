package com.github.printa.arsenal;

import com.github.printa.arsenal.client.model.CMModelLayers;
import com.github.printa.arsenal.client.particle.util.network.Networking;
import com.github.printa.arsenal.server.config.BiomeConfig;
import com.github.printa.arsenal.server.config.CMConfig;
import com.github.printa.arsenal.server.config.ConfigHolder;
import com.github.printa.arsenal.server.event.ServerEventHandler;
import com.github.printa.arsenal.server.registry.*;
import com.github.printa.arsenal.server.message.*;
import com.github.printa.arsenal.server.world.ARMobSpawnBiomeModifier;
import com.github.printa.arsenal.server.world.ARMobSpawnStructureModifier;
import com.mojang.serialization.Codec;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.StructureModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.config.ModConfigEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.server.ServerLifecycleHooks;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;

@Mod(Arsenal.MODID)
@Mod.EventBusSubscriber(modid = Arsenal.MODID)
public class Arsenal {
    public static final String MODID = "arsenal";
    public static final Logger LOGGER = LogManager.getLogger();
    public static final SimpleChannel NETWORK_WRAPPER;
    private static final String PROTOCOL_VERSION = Integer.toString(1);
    public static CommonProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);
    private static int packetsRegistered;


    static {
        NetworkRegistry.ChannelBuilder channel = NetworkRegistry.ChannelBuilder.named(new ResourceLocation(MODID, "main_channel"));
        String version = PROTOCOL_VERSION;
        version.getClass();
        channel = channel.clientAcceptedVersions(version::equals);
        version = PROTOCOL_VERSION;
        version.getClass();
        NETWORK_WRAPPER = channel.serverAcceptedVersions(version::equals).networkProtocolVersion(() -> {
            return PROTOCOL_VERSION;
        }).simpleChannel();
    }

    public Arsenal() {

        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        bus.addListener(OverlayRegistry::onRegisterOverlays);

        bus.addListener(this::setup);
        bus.addListener(this::setupClient);
        bus.addListener(this::onModConfigEvent);
        bus.addListener(this::setupEntityModelLayers);

        ModGroup.DEF_REG.register(bus);
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, ConfigHolder.COMMON_SPEC, "arsenal.toml");
        ModItems.ITEMS.register(bus);
        ModEffect.EFFECTS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        EnchantmentRegistry.DEF_REG.register(bus);
        ModParticle.PARTICLE.register(bus);
        ModStructures.STRUCTURE_PIECE_DEF_REG.register(bus);
        ModStructures.STRUCTURE_TYPE_DEF_REG.register(bus);
        ModBlockEntities.BLOCK_ENTITY_TYPE_DEF_REG.register(bus);
        ModEntities.ENTITY_TYPE.register(bus);
        ModSounds.SOUNDS.register(bus);
        ModRecipeSerializers.RECIPE_SERIALIZERS.register(bus);
        ModRecipeTypes.RECIPE_TYPES.register(bus);
        ModMenu.DEF_REG.register(bus);
        ModStructurePlacementType.STRUCTURE_PLACEMENT_TYPE.register(bus);
        ModStructureProcessor.STRUCTURE_PROCESSOR.register(bus);
        PROXY.init();
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(new ServerEventHandler());

        final DeferredRegister<Codec<? extends BiomeModifier>> biomeModifiers = DeferredRegister.create(ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, Arsenal.MODID);
        biomeModifiers.register(bus);
        biomeModifiers.register("arsenal_mob_spawns", ARMobSpawnBiomeModifier::makeCodec);
        final DeferredRegister<Codec<? extends StructureModifier>> structureModifiers = DeferredRegister.create(ForgeRegistries.Keys.STRUCTURE_MODIFIER_SERIALIZERS, Arsenal.MODID);
        structureModifiers.register(bus);
        structureModifiers.register("arsenal_structure_spawns", ARMobSpawnStructureModifier::makeCodec);
    }

    private void setupEntityModelLayers(final EntityRenderersEvent.RegisterLayerDefinitions event) {
        CMModelLayers.register(event);
    }

    @SubscribeEvent
    public void onModConfigEvent(final ModConfigEvent event) {
        final ModConfig config = event.getConfig();
        // Rebake the configs when they change
        if (config.getSpec() == ConfigHolder.COMMON_SPEC) {
            CMConfig.bake(config);
        }
        BiomeConfig.init();
    }

    public static ResourceLocation prefix(String path) {
        return new ResourceLocation(MODID, path.toLowerCase(Locale.ROOT));
    }

    public static <MSG> void sendMSGToServer(MSG message) {
        NETWORK_WRAPPER.sendToServer(message);
    }

    public static <MSG> void sendMSGToAll(MSG message) {
        for (ServerPlayer player : ServerLifecycleHooks.getCurrentServer().getPlayerList().getPlayers()) {
            sendNonLocal(message, player);
        }
    }
    
    public static <MSG> void sendNonLocal(MSG msg, ServerPlayer player) {
        NETWORK_WRAPPER.sendTo(msg, player.connection.connection, NetworkDirection.PLAY_TO_CLIENT);
    }

    private void setupClient(FMLClientSetupEvent event) {
        PROXY.clientInit();
    }


    private void setup(final FMLCommonSetupEvent event) {
        Networking.init();
        NETWORK_WRAPPER.registerMessage(packetsRegistered++, MessageCMMultipart.class, MessageCMMultipart::encode, MessageCMMultipart::new, MessageCMMultipart.Handler::onMessage);
        NETWORK_WRAPPER.registerMessage(packetsRegistered++, MessageUpdateblockentity.class, MessageUpdateblockentity::write, MessageUpdateblockentity::read, MessageUpdateblockentity.Handler::handle);
        NETWORK_WRAPPER.registerMessage(packetsRegistered++, MessageSwingArm.class, MessageSwingArm::write, MessageSwingArm::read, MessageSwingArm.Handler::handle);
        NETWORK_WRAPPER.registerMessage(packetsRegistered++, MessageUpdateBossBar.class, MessageUpdateBossBar::write, MessageUpdateBossBar::read, MessageUpdateBossBar::handle);
        NETWORK_WRAPPER.registerMessage(packetsRegistered++, MessageArmorKey.class, MessageArmorKey::write, MessageArmorKey::read, MessageArmorKey::handle);
        NETWORK_WRAPPER.registerMessage(packetsRegistered++, MessageParticle.class, MessageParticle::encode, MessageParticle::new, MessageParticle.Handler::onMessage);
        NETWORK_WRAPPER.registerMessage(packetsRegistered++, MessageFireTick.class, MessageFireTick::write, MessageFireTick::read, MessageFireTick.Handler::handle);
        NETWORK_WRAPPER.registerMessage(packetsRegistered++, UpdateItemTagMessage.class, UpdateItemTagMessage::write, UpdateItemTagMessage::read, UpdateItemTagMessage::handle);
        event.enqueueWork(ModItems::initDispenser);
        event.enqueueWork(ModJigsaw::registerJigsawElements);
    }

    public static ResourceLocation id(@NotNull String path) {
        return new ResourceLocation(Arsenal.MODID, path);
    }
}



