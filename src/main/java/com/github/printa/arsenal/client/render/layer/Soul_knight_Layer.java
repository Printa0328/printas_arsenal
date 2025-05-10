package com.github.printa.arsenal.client.render.layer;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.model.entity.Soul_knight_Model;
import com.github.printa.arsenal.client.render.CMRenderTypes;
import com.github.printa.arsenal.client.render.entity.Soul_knight_Renderer;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Soul_knight_Entity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.WalkAnimationState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class Soul_knight_Layer extends RenderLayer<Soul_knight_Entity, Soul_knight_Model> {
    private static final ResourceLocation[] TEXTURE_PROGRESS = new ResourceLocation[6];


    public Soul_knight_Layer(Soul_knight_Renderer renderIn) {
        super(renderIn);
        for(int i = 0; i < 6; i++){
            TEXTURE_PROGRESS[i] = new ResourceLocation(Arsenal.MODID,"textures/entity/soul_knight/soul_knight_" + i + ".png");
            RenderType eyes = RenderType.eyes(TEXTURE_PROGRESS[i]);
        }
    }

    public  ResourceLocation getTextureLocation(Soul_knight_Entity entity){
        int f3 = (int) (entity.tickCount);
        return getGrowingTexture(entity, (int) ((f3 / 3.0F) % 6));
    }
    @Override
    public void render(PoseStack matrixStackIn, MultiBufferSource bufferIn, int packedLightIn, Soul_knight_Entity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
        float f = 1.0F - entity.deathTime / (float) entity.deathtimer();
        RenderType eyes = RenderType.eyes(this.getTextureLocation(entity));
        VertexConsumer VertexConsumer = bufferIn.getBuffer(eyes);
        this.getParentModel().renderToBuffer(matrixStackIn, VertexConsumer, packedLightIn, OverlayTexture.NO_OVERLAY, f, f, f, 1.0F);
    }

    public ResourceLocation getGrowingTexture(Soul_knight_Entity entity, int age) {
        return TEXTURE_PROGRESS[Mth.clamp(age, 0, 5)];

    }
}


