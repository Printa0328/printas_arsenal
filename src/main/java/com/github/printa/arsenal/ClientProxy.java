package com.github.printa.arsenal;

import com.github.printa.arsenal.client.event.ClientEvent;
import com.github.printa.arsenal.client.particle.*;
import com.github.printa.arsenal.client.particle.util.AdvancedParticleHelper;
import com.github.printa.arsenal.client.particle.util.ParticleRibbon;
import com.github.printa.arsenal.client.render.PRAItemStackRenderer;
import com.github.printa.arsenal.client.render.entity.*;
import com.github.printa.arsenal.client.render.blockentity.*;
import com.github.printa.arsenal.client.render.item.CMItemRenderProperties;
import com.github.printa.arsenal.client.render.item.CustomArmorRenderProperties;
import com.github.printa.arsenal.server.registry.*;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.resources.sounds.AbstractTickableSoundInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nullable;
import java.util.*;
import java.util.concurrent.Callable;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = Arsenal.MODID, value = Dist.CLIENT)
public class ClientProxy extends CommonProxy {
    public static final Int2ObjectMap<AbstractTickableSoundInstance> ENTITY_SOUND_INSTANCE_MAP = new Int2ObjectOpenHashMap<>();
    public static final Map<BlockEntity, AbstractTickableSoundInstance> BLOCK_ENTITY_SOUND_INSTANCE_MAP = new HashMap<>();
    public static Map<UUID, Integer> bossBarRenderTypes = new HashMap<>();
    public static List<UUID> blockedEntityRenders = new ArrayList<>();

    public void init() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setupParticles);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::registerKeybinds);
    }

    public void setupParticles(RegisterParticleProvidersEvent registry) {
        Arsenal.LOGGER.debug("Registered particle factories");
        registry.registerSpriteSet(ModParticle.RING.get(), RingParticle.RingFactory::new);
        registry.registerSpriteSet(ModParticle.ADV_ORB.get(), AdvancedParticleHelper.Factory::new);
        registry.registerSpriteSet(ModParticle.ORB.get(), OrbParticle.OrbFactory::new);
        registry.registerSpriteSet(ModParticle.ADV_WISP.get(), AdvancedParticleHelper.Factory::new);
        registry.registerSpriteSet(ModParticle.WISP.get(), WispParticle.WispFactory::new);
        registry.registerSpriteSet(ModParticle.WISP2.get(), Wisp2ParticleType.Factory::new);
        registry.registerSpriteSet(ModParticle.FLAT_RIBBON.get(), ParticleRibbon.Factory::new);
    }

    public void clientInit() {
        ItemRenderer itemRendererIn = Minecraft.getInstance().getItemRenderer();
        MinecraftForge.EVENT_BUS.register(new ClientEvent());
        // 엔티티
        EntityRenderers.register(ModEntities.SOUL_KNIGHT.get(), Soul_knight_Renderer::new);
        EntityRenderers.register(ModEntities.WEREWOLF.get(), Werewolf_Renderer::new);
        EntityRenderers.register(ModEntities.FIRE_BALL.get(), Basic_Renderer::new);
        // 블럭 엔티티
        BlockEntityRenderers.register(ModBlockEntities.WEAPON_WORKBENCH.get(), WeaponWorkbenchBlock_Renderer::new);
    }

    public Level getWorld() {
        return Minecraft.getInstance().level;
    }

    public Player getClientSidePlayer() {
        return Minecraft.getInstance().player;
    }

    public void blockRenderingEntity(UUID id) {
        blockedEntityRenders.add(id);
    }

    public void releaseRenderingEntity(UUID id) {
        blockedEntityRenders.remove(id);
    }

    public boolean isFirstPersonPlayer(Entity entity) {return entity.equals(Minecraft.getInstance().cameraEntity) && Minecraft.getInstance().options.getCameraType().isFirstPerson();}

    @OnlyIn(Dist.CLIENT)
    public static Callable<BlockEntityWithoutLevelRenderer> getTEISR() {
        return PRAItemStackRenderer::new;
    }

    @Override
    public Object getISTERProperties() {
        return new CMItemRenderProperties();
    }

    @Override
    public Object getArmorRenderProperties() {
        return new CustomArmorRenderProperties();
    }

    public void clearSoundCacheFor(Entity entity) {
        ENTITY_SOUND_INSTANCE_MAP.remove(entity.getId());
    }

    public void clearSoundCacheFor(BlockEntity entity) {
        BLOCK_ENTITY_SOUND_INSTANCE_MAP.remove(entity);
    }

    public float getPartialTicks() {
        return Minecraft.getInstance().getPartialTick();
    }

    public boolean isKeyDown(int keyType) {
        if (keyType == -1) {
            return Minecraft.getInstance().options.keyLeft.isDown() || Minecraft.getInstance().options.keyRight.isDown() || Minecraft.getInstance().options.keyUp.isDown() || Minecraft.getInstance().options.keyDown.isDown() || Minecraft.getInstance().options.keyJump.isDown();
        }
        if (keyType == 0) {
            return Minecraft.getInstance().options.keyJump.isDown();
        }
        if (keyType == 1) {
            return Minecraft.getInstance().options.keySprint.isDown();
        }
        if (keyType == 3) {
            return Minecraft.getInstance().options.keyAttack.isDown();
        }
        if (keyType == 4) {
            return Minecraft.getInstance().options.keyShift.isDown();
        }
        return false;
    }


    @Override
    public void playWorldSound(@Nullable Object soundEmitter, byte type) {
        if (soundEmitter instanceof Entity entity && !entity.level().isClientSide) {
            return;
        }
    }

    private void registerKeybinds(RegisterKeyMappingsEvent e) {
    }

    public void removeBossBarRender(UUID bossBar) {
        bossBarRenderTypes.remove(bossBar);
    }

    public void setBossBarRender(UUID bossBar, int renderType) {
        bossBarRenderTypes.put(bossBar, renderType);
    }
}