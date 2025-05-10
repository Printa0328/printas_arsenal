package com.github.printa.arsenal.client.render;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.model.block.WeaponWorkbenchBlock_Model;
import com.github.printa.arsenal.client.model.item.*;
import com.github.printa.arsenal.server.item.Soul_Metal_Great_Sword;
import com.github.printa.arsenal.server.registry.ModBlocks;
import com.github.printa.arsenal.server.registry.ModItems;
import com.github.printa.arsenal.server.item.Charge_Halberd;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PRAItemStackRenderer extends BlockEntityWithoutLevelRenderer {

    public static int ticksExisted = 0;

    // Model
    private static final Charge_halberd_Model CHARGE_HALBERD_MODEL = new Charge_halberd_Model();
    private static final Soul_Metal_Great_Sword_Model SOUL_KNIGHT_GREATSWORD_MODEL = new Soul_Metal_Great_Sword_Model();
    private static final WeaponWorkbenchBlock_Model WEAPON_WORKBENCH_MODEL = new WeaponWorkbenchBlock_Model();

    // Resource
    private static final ResourceLocation SOUL_METAL_GREAT_SWORD_TEXTURE = new ResourceLocation(Arsenal.MODID,"textures/item/soul_knight_great_sword.png");
    private static final ResourceLocation CHARGE_HALBERD_TEXTURE = new ResourceLocation(Arsenal.MODID,"textures/item/charge_halberd.png");
    private static final ResourceLocation CHARGE_HALBERD_SPEAR_TEXTURE = new ResourceLocation(Arsenal.MODID, "textures/item/charge_halberd_spear.png");
    private static final ResourceLocation CHARGE_HALBERD_AXE_TEXTURE = new ResourceLocation(Arsenal.MODID, "textures/item/charge_halberd_axe.png");
    private static final ResourceLocation CHARGE_HALBERD_HALBERD_TEXTURE = new ResourceLocation(Arsenal.MODID, "textures/item/charge_halberd_halberd.png");
    private static final ResourceLocation WEAPON_WORKBENCH_TEXTURE = new ResourceLocation(Arsenal.MODID, "textures/block/weapon_workbench.png");

    // Progress
    private static final ResourceLocation[] SOUL_METAL_GREAT_SWORD_PROGRESS = new ResourceLocation[5];
    private static final ResourceLocation[] TEXTURE_FIRE_PROGRESS = new ResourceLocation[8];

    public PRAItemStackRenderer() {
        super(Minecraft.getInstance().getBlockEntityRenderDispatcher(), Minecraft.getInstance().getEntityModels());
        for(int i = 0; i < 8; i++){
            TEXTURE_FIRE_PROGRESS[i] = new ResourceLocation(Arsenal.MODID,"textures/block/altar_of_fire/altar_fire_" + i + ".png");
        }

    }

    public static void incrementTick() {
        ticksExisted++;
    }


    @Override
    public void renderByItem(ItemStack itemStackIn, ItemDisplayContext transformType, PoseStack poseStack, MultiBufferSource bufferIn, int combinedLightIn, int combinedOverlayIn) {
        ClientLevel level = Minecraft.getInstance().level;
        float partialTick = Minecraft.getInstance().getPartialTick();
        boolean heldIn3d = transformType == ItemDisplayContext.THIRD_PERSON_LEFT_HAND || transformType == ItemDisplayContext.THIRD_PERSON_RIGHT_HAND || transformType == ItemDisplayContext.FIRST_PERSON_RIGHT_HAND || transformType == ItemDisplayContext.FIRST_PERSON_LEFT_HAND;
        boolean left = transformType == ItemDisplayContext.THIRD_PERSON_LEFT_HAND || transformType == ItemDisplayContext.FIRST_PERSON_LEFT_HAND;
        int tick;

        if(Minecraft.getInstance().player == null || Minecraft.getInstance().isPaused()){
            tick = ticksExisted;
        }else{
            tick = Minecraft.getInstance().player.tickCount;
        }

        // 아이템

        if (itemStackIn.getItem() == ModItems.SOUL_METAL_GREATSWORD.get()) {
            poseStack.translate(0.5F, 0.5F, 0.5F);
            ItemStack spriteItem = new ItemStack(ModItems.SOUL_METAL_GREATSWORD_SPRITE.get());
            spriteItem.setTag(itemStackIn.getTag());
            if (heldIn3d) {
                poseStack.pushPose();
                poseStack.scale(1.0F, -1.0F, -1.0F);
                for (int i = 0; i < 5; i++) {
                    if (Soul_Metal_Great_Sword.getFireTexture(itemStackIn)) {
                        int textureIndex = (int) ((tick * 0.35F) % 5);
                        SOUL_METAL_GREAT_SWORD_PROGRESS[i] = new ResourceLocation(Arsenal.MODID, "textures/item/soul_knight_great_sword_layer_" + textureIndex + ".png");
                        VertexConsumer vertexconsumer2 = ItemRenderer.getArmorFoilBuffer(bufferIn, CMRenderTypes.getghost(SOUL_METAL_GREAT_SWORD_PROGRESS[i]), false, itemStackIn.hasFoil());
                        SOUL_KNIGHT_GREATSWORD_MODEL.renderToBuffer(poseStack, vertexconsumer2, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
                    }
                }
                VertexConsumer vertexconsumer = ItemRenderer.getArmorFoilBuffer(bufferIn, RenderType.armorCutoutNoCull(SOUL_METAL_GREAT_SWORD_TEXTURE), false, itemStackIn.hasFoil());
                SOUL_KNIGHT_GREATSWORD_MODEL.renderToBuffer(poseStack, vertexconsumer, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
                poseStack.popPose();
            } else {
                renderStaticItemSprite(spriteItem, transformType, combinedLightIn, combinedOverlayIn, poseStack, bufferIn, level);
            }
        }

        if (itemStackIn.is(ModItems.CHARGE_HALBERD.get())) {
            poseStack.pushPose();
            poseStack.translate(0.5F, 0.5f, 0.5f);
            poseStack.scale(1.0F, -1.0F, -1.0F);

            VertexConsumer vertexconsumer = ItemRenderer.getArmorFoilBuffer(bufferIn, RenderType.armorCutoutNoCull(CHARGE_HALBERD_TEXTURE), false, itemStackIn.hasFoil());
            CHARGE_HALBERD_MODEL.renderToBuffer(poseStack, vertexconsumer, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);

            if (Charge_Halberd.isAxe(itemStackIn)) {
                VertexConsumer vertexconsumer2 = ItemRenderer.getArmorFoilBuffer(bufferIn, CMRenderTypes.getghost(CHARGE_HALBERD_AXE_TEXTURE), false, itemStackIn.hasFoil());
                CHARGE_HALBERD_MODEL.renderToBuffer(poseStack, vertexconsumer2, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
            } else if (Charge_Halberd.isSpear(itemStackIn)) {
                VertexConsumer vertexconsumer3 = ItemRenderer.getArmorFoilBuffer(bufferIn, CMRenderTypes.getghost(CHARGE_HALBERD_SPEAR_TEXTURE), false, itemStackIn.hasFoil());
                CHARGE_HALBERD_MODEL.renderToBuffer(poseStack, vertexconsumer3, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
            } else if (Charge_Halberd.isHalberd(itemStackIn)) {
                VertexConsumer vertexconsumer4 = ItemRenderer.getArmorFoilBuffer(bufferIn, CMRenderTypes.getghost(CHARGE_HALBERD_HALBERD_TEXTURE), false, itemStackIn.hasFoil());
                CHARGE_HALBERD_MODEL.renderToBuffer(poseStack, vertexconsumer4, combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
            }
            poseStack.popPose();
        }

        // 블록 엔티티

        if(itemStackIn.getItem() == ModBlocks.WEAPON_WORKBENCH.get().asItem()){
            poseStack.pushPose();
            poseStack.translate(0.5F, 1.50F, 0.5F);
            poseStack.scale(1.0F, -1.0F, -1.0F);
            WEAPON_WORKBENCH_MODEL.resetToDefaultPose();
            WEAPON_WORKBENCH_MODEL.renderToBuffer(poseStack, bufferIn.getBuffer(RenderType.entityCutoutNoCull(WEAPON_WORKBENCH_TEXTURE)), combinedLightIn, combinedOverlayIn, 1.0F, 1.0F, 1.0F, 1.0F);
            poseStack.popPose();
        }
    }

    private void renderStaticItemSprite(ItemStack spriteItem, ItemDisplayContext transformType, int combinedLightIn, int combinedOverlayIn, PoseStack poseStack, MultiBufferSource bufferIn, ClientLevel
            level) {
        {
            Minecraft.getInstance().getItemRenderer().renderStatic(spriteItem, transformType, transformType == ItemDisplayContext.GROUND ? combinedLightIn : 240, combinedOverlayIn, poseStack, bufferIn, level, 0);
        }
    }

    private void renderMapHand(PoseStack poseStack, MultiBufferSource bufferSource, int i, HumanoidArm humanoidArm) {
        RenderSystem.setShaderTexture(0, Minecraft.getInstance().player.getSkinTextureLocation());
        PlayerRenderer playerrenderer = (PlayerRenderer)Minecraft.getInstance().getEntityRenderDispatcher().<AbstractClientPlayer>getRenderer(Minecraft.getInstance().player);
        poseStack.pushPose();
        float f = humanoidArm == HumanoidArm.RIGHT ? 1.0F : -1.0F;
        poseStack.mulPose(Axis.YP.rotationDegrees(92.0F));
        poseStack.mulPose(Axis.XP.rotationDegrees(45.0F));
        poseStack.mulPose(Axis.ZP.rotationDegrees(f * -41.0F));
        poseStack.translate(f * 0.3F, -1.1F, 0.45F);
        if (humanoidArm == HumanoidArm.RIGHT) {
            playerrenderer.renderRightHand(poseStack, bufferSource, i, Minecraft.getInstance().player);
        } else {
            playerrenderer.renderLeftHand(poseStack, bufferSource, i, Minecraft.getInstance().player);
        }

        poseStack.popPose();
    }

    private ResourceLocation getIdleTexture(int age) {
        return SOUL_METAL_GREAT_SWORD_PROGRESS[Mth.clamp(age, 0, 4)];
    }
}
