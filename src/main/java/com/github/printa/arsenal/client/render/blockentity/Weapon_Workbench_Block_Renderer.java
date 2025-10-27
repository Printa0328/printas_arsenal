package com.github.printa.arsenal.client.render.blockentity;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.model.block.WeaponWorkbenchBlock_Model;
import com.github.printa.arsenal.server.block.WeaponWorkbenchBlock;
import com.github.printa.arsenal.server.entity.blockentity.WeaponWorkbenchBlock_Entity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider.Context;

import java.util.Objects;

public class Weapon_Workbench_Block_Renderer implements BlockEntityRenderer<WeaponWorkbenchBlock_Entity> {

    private static final ResourceLocation TEXTURE = ResourceLocation.tryBuild(Arsenal.MODID,"textures/block/weapon_workbench.png");
    private static final WeaponWorkbenchBlock_Model MODEL = new WeaponWorkbenchBlock_Model();

    public Weapon_Workbench_Block_Renderer(Context rendererDispatcherIn) {
    }

    @Override
    public void render(WeaponWorkbenchBlock_Entity entity, float delta, PoseStack poseStack, MultiBufferSource buffer, int combinedLightIn, int combinedOverlayIn) {
        poseStack.pushPose();

        Direction dir = entity.getBlockState().getValue(WeaponWorkbenchBlock.FACING);
        poseStack.translate(0.5F, 1.5F, 0.5F);
        poseStack.mulPose(dir.getRotation());
        poseStack.mulPose(Axis.XP.rotationDegrees(90.0F));

        MODEL.fire.showModel = entity.fire;
        MODEL.lightining.showModel = entity.lightning;
        MODEL.cold.showModel = entity.cold;
        MODEL.blood.showModel = entity.blood;
        MODEL.acid.showModel = entity.acid;
        MODEL.poison.showModel = entity.poison;
        MODEL.radiant.showModel = entity.radiant;
        MODEL.necrotic.showModel = entity.necrotic;

        MODEL.renderToBuffer(poseStack, buffer.getBuffer(RenderType.entityCutoutNoCull(Objects.requireNonNull(TEXTURE))), combinedLightIn, combinedOverlayIn, 1, 1F, 1, 1);

        poseStack.popPose();
    }

}
