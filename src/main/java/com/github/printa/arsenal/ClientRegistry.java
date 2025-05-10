package com.github.printa.arsenal;

import com.github.printa.arsenal.client.render.CMRenderTypes;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterShadersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = Arsenal.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientRegistry {

    @OnlyIn(Dist.CLIENT)
    public static ShaderInstance GLOWING_SHADER, GLOWING_SPRITE_SHADER, GLOWING_PARTICLE_SHADER, VAPOR_SHADER, GLOWING_ENTITY_SHADER, SPRITE_PARTICLE_SHADER;

    public static ShaderInstance getGlowingShader() {
        return GLOWING_SHADER;
    }

    public static ShaderInstance getGlowingSpriteShader() {
        return GLOWING_SPRITE_SHADER;
    }

    public static ShaderInstance getGlowingParticleShader() {
        return GLOWING_PARTICLE_SHADER;
    }

    public static ShaderInstance getGlowingEntityShader() {
        return GLOWING_ENTITY_SHADER;
    }

    public static ShaderInstance getVaporShader() {
        return VAPOR_SHADER;
    }

    public static ShaderInstance getSpriteParticleShader() {
        return SPRITE_PARTICLE_SHADER;
    }

    @SubscribeEvent
    public static void shaderRegistry(RegisterShadersEvent event) throws IOException {
        event.registerShader(new ShaderInstance(event.getResourceProvider(), new ResourceLocation("arsenal:glowing"), DefaultVertexFormat.POSITION_COLOR),
                shader -> GLOWING_SHADER = shader);
        event.registerShader(new ShaderInstance(event.getResourceProvider(), new ResourceLocation("arsenal:glowing_sprite"), DefaultVertexFormat.POSITION_TEX_COLOR),
                shader -> GLOWING_SPRITE_SHADER = shader);
        event.registerShader(new ShaderInstance(event.getResourceProvider(), new ResourceLocation("arsenal:glowing_particle"), DefaultVertexFormat.PARTICLE),
                shader -> GLOWING_PARTICLE_SHADER = shader);
        event.registerShader(new ShaderInstance(event.getResourceProvider(), new ResourceLocation("arsenal:glowing_entity"), DefaultVertexFormat.NEW_ENTITY),
                shader -> GLOWING_ENTITY_SHADER = shader);
        event.registerShader(new ShaderInstance(event.getResourceProvider(), new ResourceLocation("arsenal:vapor"), DefaultVertexFormat.BLOCK),
                shader -> VAPOR_SHADER = shader);
        event.registerShader(new ShaderInstance(event.getResourceProvider(), new ResourceLocation("arsenal:sprite_particle"), DefaultVertexFormat.PARTICLE),
                shader -> SPRITE_PARTICLE_SHADER = shader);
    }
}
