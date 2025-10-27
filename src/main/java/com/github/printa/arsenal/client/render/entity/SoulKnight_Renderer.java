package com.github.printa.arsenal.client.render.entity;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.model.entity.Soul_knight_Model;
import com.github.printa.arsenal.client.render.layer.Soul_knight_Layer;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Soul_knight_Entity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SoulKnight_Renderer extends MobRenderer<Soul_knight_Entity, Soul_knight_Model> {
    private static final ResourceLocation SOUL_KNIGHT_TEXTURES = new ResourceLocation(Arsenal.MODID, "textures/entity/soul_knight/soul_knight.png");

    public SoulKnight_Renderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new Soul_knight_Model(), 1.0F);
        this.addLayer(new Soul_knight_Layer(this));
    }

    @Override
    public ResourceLocation getTextureLocation(Soul_knight_Entity entity) {
        return SOUL_KNIGHT_TEXTURES;
    }

    @Override
    protected float getFlipDegrees(Soul_knight_Entity entity) {
        return 0;
    }

    @Override
    protected void scale(Soul_knight_Entity entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(1.0F, 1.0F, 1.0F);
    }
}
