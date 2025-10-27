package com.github.printa.arsenal.client.overlays;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.registries.ItemRegistry;
import com.github.printa.arsenal.server.item.Charge_Halberd;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;
import net.minecraft.world.entity.player.Player;

public class ChargeOverlay implements IGuiOverlay {
    public static ChargeOverlay instance = new ChargeOverlay();
    public final static ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(Arsenal.MODID, "textures/gui/charge_icons.png");
    static final int IMAGE_WIDTH = 22;
    static final int IMAGE_HEIGHT = 22;
    public void render(ForgeGui gui, GuiGraphics guiHelper, float partialTick, int screenWidth, int screenHeight) {
        Player player = Minecraft.getInstance().player;
        if (player != null) {
            ItemStack heldItem = player.getMainHandItem();
            if (heldItem.is(ItemRegistry.CHARGE_HALBERD.get())) {
                int charge = Charge_Halberd.getCharge(heldItem);
                String chargeString = charge + "/" + 20;

                int barX = screenWidth / 2 - IMAGE_WIDTH / 2;
                int barY = screenHeight / 2 + IMAGE_WIDTH * 5 / 2;
                int COMPLETE_HEIGHT = (int) (IMAGE_HEIGHT * charge / 20);
                int offsetY = IMAGE_HEIGHT - COMPLETE_HEIGHT;

                guiHelper.blit(TEXTURE, barX, barY, 0, 0, IMAGE_WIDTH, IMAGE_HEIGHT, 64, 64);
                guiHelper.blit(TEXTURE, barX, barY + offsetY, 22, 22 + offsetY, IMAGE_WIDTH, COMPLETE_HEIGHT, 64, 64);


                int textX = barX + (IMAGE_WIDTH - gui.getFont().width(chargeString)) / 2;
                int textY = barY + IMAGE_HEIGHT - gui.getFont().lineHeight / 2 + 1 + IMAGE_HEIGHT / 5;
                guiHelper.drawString(gui.getFont(), chargeString, textX, textY, 0xFFFFFF);
            }
        }
    }

    private int getCharge(ItemStack stack) {
        if (stack.hasTag() && stack.getTag().contains("charge")) {
            return stack.getTag().getInt("charge");
        }
        return 0;
    }
}

