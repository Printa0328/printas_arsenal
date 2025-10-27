package com.github.printa.arsenal.setup;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.particle.OrbParticle;
import com.github.printa.arsenal.client.particle.Wisp2ParticleType;
import com.github.printa.arsenal.client.particle.WispParticle;
import com.github.printa.arsenal.client.particle.util.AdvancedParticleHelper;
import com.github.printa.arsenal.client.particle.util.ParticleRibbon;
import com.github.printa.arsenal.client.render.entity.Basic_Renderer;
import com.github.printa.arsenal.client.render.entity.RayofFireRenderer;
import com.github.printa.arsenal.client.render.entity.SoulKnight_Renderer;
import com.github.printa.arsenal.client.render.entity.Werewolf_Renderer;
import com.github.printa.arsenal.server.registries.EntityRegistry;
import com.github.printa.arsenal.server.registries.ParticleRegistry;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.client.event.RegisterShadersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.io.IOException;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = Arsenal.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RayofFireRenderer.MODEL_LAYER_LOCATION, RayofFireRenderer::createBodyLayer);
    }

    @SubscribeEvent
    public static void rendererRegister(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(EntityRegistry.RAY_OF_FIRE_VISUAL_ENTITY.get(), RayofFireRenderer::new);
        event.registerEntityRenderer(EntityRegistry.SOUL_KNIGHT.get(), SoulKnight_Renderer::new);
        event.registerEntityRenderer(EntityRegistry.WEREWOLF.get(), Werewolf_Renderer::new);
        event.registerEntityRenderer(EntityRegistry.FIRE_BALL.get(), Basic_Renderer::new);
    }

    @SubscribeEvent
    public static void registerParticles(RegisterParticleProvidersEvent event) {
        event.registerSpriteSet(ParticleRegistry.ADV_ORB.get(), AdvancedParticleHelper.Factory::new);
        event.registerSpriteSet(ParticleRegistry.ORB.get(), OrbParticle.OrbFactory::new);
        event.registerSpriteSet(ParticleRegistry.ADV_WISP.get(), AdvancedParticleHelper.Factory::new);
        event.registerSpriteSet(ParticleRegistry.WISP.get(), WispParticle.WispFactory::new);
        event.registerSpriteSet(ParticleRegistry.WISP2.get(), Wisp2ParticleType.Factory::new);
        event.registerSpriteSet(ParticleRegistry.FLAT_RIBBON.get(), ParticleRibbon.Factory::new);
        event.registerSpriteSet(ParticleRegistry.ADV_SLASH.get(), AdvancedParticleHelper.Factory::new);
    }

    @SubscribeEvent
    public static void shaderRegistry(RegisterShadersEvent event) throws IOException {
        event.registerShader(new ShaderInstance(event.getResourceProvider(), ResourceLocation.fromNamespaceAndPath(Arsenal.MODID,"glowing_particle"), DefaultVertexFormat.PARTICLE),
                shader -> GLOWING_PARTICLE_SHADER = shader);
        event.registerShader(new ShaderInstance(event.getResourceProvider(), ResourceLocation.fromNamespaceAndPath(Arsenal.MODID,"glass_surface"), DefaultVertexFormat.NEW_ENTITY),
                shader -> GLASS_SURFACE_SHADER = shader);
    }

    public static ShaderInstance GLOWING_PARTICLE_SHADER, GLASS_SURFACE_SHADER;

    public static ShaderInstance getGlowingParticleShader() {
        return GLOWING_PARTICLE_SHADER;
    }
    public static ShaderInstance getGlassSurfaceShader() {
        return GLASS_SURFACE_SHADER;
    }
}