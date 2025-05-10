package com.github.printa.arsenal.client.render.entity;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.entity.projectile.Ray_Of_Fire_Visual_Entity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class RayofFireRenderer extends EntityRenderer<Ray_Of_Fire_Visual_Entity> {

    public static final ModelLayerLocation MODEL_LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(Arsenal.MODID, "ray_of_fire_model"), "main");
    private static final ResourceLocation TEXTURE_CORE = Arsenal.id("textures/entity/ray_of_fire/core.png");
    private static final ResourceLocation TEXTURE_OVERLAY = Arsenal.id("textures/entity/ray_of_fire/overlay.png");

    private final ModelPart body;

    public RayofFireRenderer(EntityRendererProvider.Context context) {
        super(context);
        ModelPart modelpart = context.bakeLayer(MODEL_LAYER_LOCATION);
        this.body = modelpart.getChild("body");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-8, -16, -8, 16, 32, 16), PartPose.ZERO);
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public boolean shouldRender(Ray_Of_Fire_Visual_Entity pLivingEntity, Frustum pCamera, double pCamX, double pCamY, double pCamZ) {
        return true;
    }

    @Override
    public void render(Ray_Of_Fire_Visual_Entity entity, float yaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferSource, int light) {
        poseStack.pushPose();
        float lifetime = Ray_Of_Fire_Visual_Entity.lifetime;
        float scalar = .25f;
        float length = 32 * scalar * scalar;
        float f = entity.tickCount + partialTicks;
        poseStack.translate(0, entity.getBoundingBox().getYsize() * .5f, 0);
        poseStack.mulPose(Axis.YP.rotationDegrees(-entity.getYRot() - 180.0F));
        poseStack.mulPose(Axis.XP.rotationDegrees(-entity.getXRot() - 90));
        poseStack.scale(scalar, scalar, scalar);

        //float scale = Mth.lerp(Mth.clamp(f / 6f, 0, 1), 1, 2.3f);

        float alpha = Mth.clamp(1f - f / lifetime, 0, 1);

        for (float i = 0; i < entity.distance * 4; i += length) {
            poseStack.translate(0, length, 0);
            //Render overlay
            //VertexConsumer consumer = bufferSource.getBuffer(RenderType.entityTranslucent(TEXTURE_OVERLAY));
            VertexConsumer consumer = bufferSource.getBuffer(RenderType.energySwirl(TEXTURE_OVERLAY, 0, 0));
            {
                poseStack.pushPose();
                float expansion = Mth.clampedLerp(1.2f, 0, f / (lifetime));
                poseStack.mulPose(Axis.YP.rotationDegrees(f * 5));
                poseStack.scale(expansion, 1, expansion);
                poseStack.mulPose(Axis.YP.rotationDegrees(45));
                this.body.render(poseStack, consumer, LightTexture.FULL_BRIGHT, OverlayTexture.NO_OVERLAY, 1, 1, 1, alpha);
                poseStack.popPose();
            }
            //Render core
            consumer = bufferSource.getBuffer(RenderType.energySwirl(TEXTURE_CORE, 0, 0));
            {
                poseStack.pushPose();
                float expansion = Mth.clampedLerp(1, 0, f / (lifetime - 8));
                poseStack.scale(expansion, 1, expansion);
                poseStack.mulPose(Axis.YP.rotationDegrees(f * -10));
                this.body.render(poseStack, consumer, LightTexture.FULL_BRIGHT, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
                poseStack.popPose();
            }
        }


        poseStack.popPose();

        super.render(entity, yaw, partialTicks, poseStack, bufferSource, light);
    }

    @Override
    public ResourceLocation getTextureLocation(Ray_Of_Fire_Visual_Entity entity) {
        return TEXTURE_CORE;
    }

}