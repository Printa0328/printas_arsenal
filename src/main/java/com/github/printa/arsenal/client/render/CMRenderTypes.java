package com.github.printa.arsenal.client.render;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.ClientProxy;
import com.github.printa.arsenal.ClientRegistry;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import com.mojang.blaze3d.vertex.Tesselator;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.renderer.RenderStateShard;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.InventoryMenu;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CMRenderTypes extends RenderType {
    public CMRenderTypes(String p_173178_, VertexFormat p_173179_, VertexFormat.Mode p_173180_, int p_173181_, boolean p_173182_, boolean p_173183_, Runnable p_173184_, Runnable p_173185_) {
        super(p_173178_, p_173179_, p_173180_, p_173181_, p_173182_, p_173183_, p_173184_, p_173185_);
    }
    public static final RenderStateShard.TransparencyStateShard ADDITIVE_TRANSPARENCY = new RenderStateShard.TransparencyStateShard("lightning_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    public static final RenderStateShard.TransparencyStateShard NORMAL_TRANSPARENCY = new RenderStateShard.TransparencyStateShard("lightning_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });
    protected static final RenderStateShard.TransparencyStateShard GHOST_TRANSPARANCY = new RenderStateShard.TransparencyStateShard("translucent_ghost_transparency", () -> {
        RenderSystem.enableBlend();
        RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
    }, () -> {
        RenderSystem.disableBlend();
        RenderSystem.defaultBlendFunc();
    });

    public static RenderType getBright(ResourceLocation locationIn) {
        TextureStateShard renderstate$texturestate = new TextureStateShard(locationIn, false, false);
        return create("bright", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, false, true, CompositeState
                .builder()
                .setTextureState(renderstate$texturestate)
                .setShaderState(RENDERTYPE_ENTITY_TRANSLUCENT_CULL_SHADER)
                .setTransparencyState(NO_TRANSPARENCY)
                .setCullState(NO_CULL)
                .setLightmapState(LIGHTMAP)
                .setOverlayState(OVERLAY)
                .createCompositeState(false));
    }
    public static RenderType getFlickering(ResourceLocation p_228652_0_, float lightLevel) {
        TextureStateShard renderstate$texturestate = new TextureStateShard(p_228652_0_, false, false);
        return create("flickering", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, false, true, CompositeState
                .builder()
                .setTextureState(renderstate$texturestate)
                .setShaderState(RENDERTYPE_ENTITY_TRANSLUCENT_CULL_SHADER)
                .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
                .setCullState(NO_CULL).setLightmapState(LIGHTMAP)
                .setOverlayState(OVERLAY)
                .createCompositeState(false));
    }
    public static RenderType getfullBright(ResourceLocation locationIn) {
        TextureStateShard renderstate$texturestate = new TextureStateShard(locationIn, false, false);
        return create("full_bright", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, false, true, CompositeState
                .builder()
                .setTextureState(renderstate$texturestate)
                .setShaderState(RENDERTYPE_ENTITY_TRANSLUCENT_CULL_SHADER)
                .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
                .setCullState(NO_CULL)
                .setLightmapState(LIGHTMAP)
                .setOverlayState(OVERLAY)
                .createCompositeState(false));
    }
    public static RenderType getGlowingEffect(ResourceLocation locationIn) {
        TextureStateShard renderstate$texturestate = new TextureStateShard(locationIn, false, false);
        return create("glow_effect", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, true, true, CompositeState.builder()
                .setTextureState(renderstate$texturestate)
                .setShaderState(RENDERTYPE_BEACON_BEAM_SHADER)
                .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
                .setCullState(NO_CULL).setOverlayState(OVERLAY)
                .setWriteMaskState(COLOR_WRITE)
                .createCompositeState(false));
    }
    public static RenderType getghost(ResourceLocation texture) {
        CompositeState renderState = CompositeState.builder()
                .setShaderState(RENDERTYPE_ENERGY_SWIRL_SHADER)
                .setCullState(NO_CULL)
                .setTextureState(new TextureStateShard(texture, false, false))
                .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
                .setLightmapState(LIGHTMAP)
                .setOverlayState(OVERLAY)
                .setWriteMaskState(COLOR_DEPTH_WRITE)
                .setDepthTestState(LEQUAL_DEPTH_TEST)
                .setLayeringState(NO_LAYERING)
                .createCompositeState(false);
        return create("ghost", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, true, true, renderState);
    }
    public static RenderType CMEyes(ResourceLocation locationIn) {
        RenderStateShard.TextureStateShard renderstateshard$texturestateshard = new RenderStateShard.TextureStateShard(locationIn, false, false);
        return create("cm_eyes", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, false, true, RenderType
                .CompositeState.builder()
                .setShaderState(RENDERTYPE_EYES_SHADER)
                .setTextureState(renderstateshard$texturestateshard)
                .setTransparencyState(ADDITIVE_TRANSPARENCY)
                .setCullState(NO_CULL)
                .setWriteMaskState(COLOR_WRITE).
                createCompositeState(false));
    }
    public static RenderType getPulse() {
        CompositeState renderState = CompositeState.builder()
                .setShaderState(RENDERTYPE_ENERGY_SWIRL_SHADER)
                .setCullState(NO_CULL)
                .setTextureState(new TextureStateShard(new ResourceLocation(Arsenal.MODID,"textures/particle/em_pulse.png"), true, true))
                .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
                .setLightmapState(LIGHTMAP)
                .setOverlayState(OVERLAY)
                .setWriteMaskState(COLOR_WRITE)
                .setDepthTestState(LEQUAL_DEPTH_TEST)
                .setLayeringState(VIEW_OFFSET_Z_LAYERING)
                .createCompositeState(false);
        return create("em_pulse", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, true, true, renderState);
    }

    public static RenderType getTrailEffect(ResourceLocation locationIn) {
        TextureStateShard renderstate$texturestate = new TextureStateShard(locationIn, false, false);
        return create("trail_effect", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, true, true, RenderType
                .CompositeState.builder()
                .setTextureState(renderstate$texturestate)
                .setShaderState(RENDERTYPE_ITEM_ENTITY_TRANSLUCENT_CULL_SHADER)
                .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
                .setOutputState(ITEM_ENTITY_TARGET)
                .setCullState(NO_CULL)
                .setLightmapState(LIGHTMAP)
                .setOverlayState(OVERLAY)
                .setWriteMaskState(COLOR_WRITE)
                .createCompositeState(false));
    }
    public static RenderType DragonDeath(ResourceLocation texture) {
        RenderType.CompositeState rendertype$compositestate = RenderType.CompositeState.builder().setShaderState(RENDERTYPE_ENTITY_ALPHA_SHADER)
                .setTextureState(new RenderStateShard.TextureStateShard(texture, false, false))
                .setCullState(NO_CULL)
                .createCompositeState(true);
        return create("entity_alpha", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256,true,true, rendertype$compositestate);
    }
    public static RenderType getShockWave() {
        CompositeState renderState = CompositeState.builder()
                .setShaderState(RENDERTYPE_ENERGY_SWIRL_SHADER)
                .setCullState(NO_CULL)
                .setTextureState(new TextureStateShard(new ResourceLocation(Arsenal.MODID,"textures/particle/shock_wave.png"), true, true))
                .setTransparencyState(TRANSLUCENT_TRANSPARENCY)
                .setLightmapState(LIGHTMAP)
                .setOverlayState(OVERLAY)
                .setWriteMaskState(COLOR_WRITE)
                .setDepthTestState(LEQUAL_DEPTH_TEST)
                .setLayeringState(VIEW_OFFSET_Z_LAYERING)
                .createCompositeState(false);
        return create("shock_wave", DefaultVertexFormat.NEW_ENTITY, VertexFormat.Mode.QUADS, 256, true, true, renderState);
    }
    public static final RenderType GLOWING_SPRITE = RenderType.create(
            Arsenal.MODID + ":glowing_sprite",
            DefaultVertexFormat.POSITION_TEX_COLOR,
            VertexFormat.Mode.QUADS, 256, true, false,
            RenderType.CompositeState.builder()
                    .setWriteMaskState(new RenderStateShard.WriteMaskStateShard(true, false))
                    .setLightmapState(new RenderStateShard.LightmapStateShard(false))
                    .setTransparencyState(ADDITIVE_TRANSPARENCY)
                    .setTextureState(new RenderStateShard.TextureStateShard(InventoryMenu.BLOCK_ATLAS, false, false))
                    .setShaderState(new ShaderStateShard(ClientRegistry::getGlowingSpriteShader))
                    .createCompositeState(false)
    );
    public static final RenderType GLOWING = RenderType.create(
            Arsenal.MODID + ":glowing",
            DefaultVertexFormat.POSITION_COLOR,
            VertexFormat.Mode.QUADS, 256, true, false,
            RenderType.CompositeState.builder()
                    .setWriteMaskState(new RenderStateShard.WriteMaskStateShard(true, false))
                    .setLightmapState(new RenderStateShard.LightmapStateShard(false))
                    .setTransparencyState(ADDITIVE_TRANSPARENCY)
                    .setShaderState(new ShaderStateShard(ClientRegistry::getGlowingShader))
                    .createCompositeState(false)
    );
    public static final RenderType DELAYED_PARTICLE = RenderType.create(
            Arsenal.MODID + ":delayed_particle",
            DefaultVertexFormat.PARTICLE,
            VertexFormat.Mode.QUADS, 256, true, false,
            RenderType.CompositeState.builder()
                    .setWriteMaskState(new RenderStateShard.WriteMaskStateShard(true, false))
                    .setTransparencyState(NORMAL_TRANSPARENCY)
                    .setTextureState(new RenderStateShard.TextureStateShard(TextureAtlas.LOCATION_PARTICLES, false, false))
                    .setShaderState(new ShaderStateShard(ClientRegistry::getSpriteParticleShader))
                    .createCompositeState(false)
    );
    public static final RenderType GLOWING_PARTICLE = RenderType.create(
            Arsenal.MODID + ":glowing_particle",
            DefaultVertexFormat.PARTICLE,
            VertexFormat.Mode.QUADS, 256, true, false,
            RenderType.CompositeState.builder()
                    .setWriteMaskState(new RenderStateShard.WriteMaskStateShard(true, false))
                    .setLightmapState(new RenderStateShard.LightmapStateShard(false))
                    .setTransparencyState(ADDITIVE_TRANSPARENCY)
                    .setTextureState(new RenderStateShard.TextureStateShard(TextureAtlas.LOCATION_PARTICLES, false, false))
                    .setShaderState(new ShaderStateShard(ClientRegistry::getGlowingParticleShader))
                    .createCompositeState(false)
    );
    public static final RenderType GLOWING_BLOCK_PARTICLE = RenderType.create(
            Arsenal.MODID + ":glowing_particle",
            DefaultVertexFormat.PARTICLE,
            VertexFormat.Mode.QUADS, 256, true, false,
            RenderType.CompositeState.builder()
                    .setWriteMaskState(new RenderStateShard.WriteMaskStateShard(true, false))
                    .setLightmapState(new RenderStateShard.LightmapStateShard(false))
                    .setTransparencyState(ADDITIVE_TRANSPARENCY)
                    .setTextureState(new RenderStateShard.TextureStateShard(InventoryMenu.BLOCK_ATLAS, false, false))
                    .setShaderState(new ShaderStateShard(ClientRegistry::getGlowingParticleShader))
                    .createCompositeState(false)
    );
    public static final RenderType VAPOR_TRANSLUCENT = RenderType.create(
            Arsenal.MODID + ":vapor_translucent",
            DefaultVertexFormat.BLOCK,
            VertexFormat.Mode.QUADS, 256, true, false,
            RenderType.CompositeState.builder()
                    .setLightmapState(new RenderStateShard.LightmapStateShard(false))
                    .setTransparencyState(NORMAL_TRANSPARENCY)
                    .setTextureState(new RenderStateShard.TextureStateShard(InventoryMenu.BLOCK_ATLAS, false, false))
                    .setShaderState(new ShaderStateShard(ClientRegistry::getVaporShader))
                    .createCompositeState(false)
    );
    public static ParticleRenderType PARTICLE_SHEET_TRANSLUCENT_NO_DEPTH = new ParticleRenderType() {
        public void begin(BufferBuilder bufferBuilder, TextureManager textureManager) {
            RenderSystem.depthMask(true);
            RenderSystem.disableCull();
            RenderSystem.setShaderTexture(0, TextureAtlas.LOCATION_PARTICLES);
            RenderSystem.enableBlend();
            RenderSystem.blendFunc(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            RenderSystem.blendFuncSeparate(GlStateManager.SourceFactor.SRC_ALPHA, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA, GlStateManager.SourceFactor.ONE, GlStateManager.DestFactor.ONE_MINUS_SRC_ALPHA);
            bufferBuilder.begin(VertexFormat.Mode.QUADS, DefaultVertexFormat.PARTICLE);
        }

        public void end(Tesselator tessellator) {
            tessellator.end();
        }

        public String toString() {
            return "PARTICLE_SHEET_TRANSLUCENT_NO_DEPTH";
        }
    };
}
