package com.github.printa.arsenal.client.render.layer;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.model.entity.Soul_knight_Model;
import com.github.printa.arsenal.client.render.RenderUtil;
import com.github.printa.arsenal.client.render.entity.SoulKnight_Renderer;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Soul_knight_Entity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class Soul_knight_Layer extends RenderLayer<Soul_knight_Entity, Soul_knight_Model> {

    private static final ResourceLocation[] TEXTURE_PROGRESS = new ResourceLocation[6];

    public Soul_knight_Layer(SoulKnight_Renderer renderIn) {
        super(renderIn);
        for(int i = 0; i < 6; i++){
            TEXTURE_PROGRESS[i] = ResourceLocation.fromNamespaceAndPath(Arsenal.MODID,"textures/entity/soul_knight/soul_knight_" + i + ".png");
        }
    }

    public ResourceLocation getFireTexture(Soul_knight_Entity entity, int age) {
        return TEXTURE_PROGRESS[Mth.clamp(age, 0, 5)];
    }

    public @NotNull ResourceLocation getTextureLocation(Soul_knight_Entity entity){
        int $$0 = (int) (entity.tickCount);
        return getFireTexture(entity, (($$0 / 3) % 6));
    }

    @Override
    public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, Soul_knight_Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        VertexConsumer GlassConsumer = bufferIn.getBuffer(RenderUtil.GLASS_SURFACE());
        matrixStackIn.pushPose();
        this.getParentModel().renderToBuffer(matrixStackIn, GlassConsumer, packedLightIn, OverlayTexture.NO_OVERLAY, 1f,1f,1f, 1.0f);
        matrixStackIn.popPose();

        float $$1 = 1.0F - entity.deathTime / (float) entity.deathtimer();
        RenderType eyes = RenderType.eyes(this.getTextureLocation(entity));
        VertexConsumer VertexConsumer = bufferIn.getBuffer(eyes);
        matrixStackIn.pushPose();
        this.getParentModel().renderToBuffer(matrixStackIn, VertexConsumer, packedLightIn, OverlayTexture.NO_OVERLAY, $$1, $$1, $$1, 1.0F);
        matrixStackIn.popPose();
    }
}


