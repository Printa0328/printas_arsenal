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

public class WeaponWorkbenchBlock_Renderer<T extends WeaponWorkbenchBlock_Entity> implements BlockEntityRenderer<T> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(Arsenal.MODID,"textures/block/weapon_workbench.png");
    private static final WeaponWorkbenchBlock_Model MODEL = new WeaponWorkbenchBlock_Model();

    public WeaponWorkbenchBlock_Renderer(Context rendererDispatcherIn) {
    }

    @Override
    public void render(T tileEntityIn, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int combinedLightIn, int combinedOverlayIn) {
        poseStack.pushPose();

        Direction dir = tileEntityIn.getBlockState().getValue(WeaponWorkbenchBlock.FACING);
        poseStack.translate(0.5F, 1.5F, 0.5F);
        poseStack.mulPose(dir.getOpposite().getRotation());
        poseStack.mulPose(Axis.XP.rotationDegrees(90.0F));

        boolean fireOn = tileEntityIn.fire;
        boolean lightningOn = tileEntityIn.fire;
        boolean coldOn = tileEntityIn.fire;
        boolean bloodOn = tileEntityIn.fire;
        boolean acidOn = tileEntityIn.fire;
        boolean poisonOn = tileEntityIn.fire;
        boolean radiantOn = tileEntityIn.fire;
        boolean necroticOn = tileEntityIn.fire;
        MODEL.fire.showModel = fireOn;
        MODEL.lightining.showModel = lightningOn;
        MODEL.cold.showModel = coldOn;
        MODEL.blood.showModel = bloodOn;
        MODEL.acid.showModel = acidOn;
        MODEL.poison.showModel = poisonOn;
        MODEL.radiant.showModel = radiantOn;
        MODEL.necrotic.showModel = necroticOn;
        MODEL.renderToBuffer(poseStack, bufferIn.getBuffer(RenderType.entityCutoutNoCull(TEXTURE)), combinedLightIn, combinedOverlayIn, 1, 1F, 1, 1);

        poseStack.popPose();
    }

}
