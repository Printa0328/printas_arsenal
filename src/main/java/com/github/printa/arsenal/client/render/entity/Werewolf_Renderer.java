package com.github.printa.arsenal.client.render.entity;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.model.entity.Werewolf_Model;
import com.github.printa.arsenal.client.model.entity.Werewolf_with_Model;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Werewolf_Entity;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class Werewolf_Renderer extends MobRenderer<Werewolf_Entity, EntityModel<Werewolf_Entity>> {
    private static final ResourceLocation WEREWOLF_TEXTURES = new ResourceLocation(Arsenal.MODID, "textures/entity/werewolf.png");
    private final EntityModel<Werewolf_Entity> defaultModel;
    private final EntityModel<Werewolf_Entity> weaponModel;

    public Werewolf_Renderer(EntityRendererProvider.Context renderManagerIn) {
        super(renderManagerIn, new Werewolf_Model(), 1.0F);
        this.defaultModel = new Werewolf_Model();
        this.weaponModel = new Werewolf_with_Model();
    }

    @Override
    public ResourceLocation getTextureLocation(Werewolf_Entity entity) {
        return WEREWOLF_TEXTURES;
    }

    @Override
    protected float getFlipDegrees(Werewolf_Entity entity) {
        return 0;
    }

    @Override
    protected void scale(Werewolf_Entity entitylivingbaseIn, PoseStack matrixStackIn, float partialTickTime) {
        matrixStackIn.scale(1.2F, 1.2F, 1.2F);
    }

    @Override
    public void render(Werewolf_Entity entity, float entityYaw, float partialTicks, PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn) {
        if (entity.isHoldweapon()) {
            this.model = this.weaponModel;
        } else {
            this.model = this.defaultModel;
        }
        super.render(entity, entityYaw, partialTicks, matrixStackIn, bufferIn, packedLightIn);
    }
}
