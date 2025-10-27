package com.github.printa.arsenal.client.gui;

import com.github.printa.arsenal.server.inventory.PatternEntry;
import com.github.printa.arsenal.server.inventory.WeaponWorkbench_Menu;
import com.mojang.blaze3d.platform.Lighting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.screens.inventory.InventoryScreen;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.decoration.ArmorStand;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BannerPattern;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.joml.Quaternionf;

import javax.annotation.Nullable;
import java.util.List;

@OnlyIn(Dist.CLIENT)
public class WeaponWorkbench_GUI extends AbstractContainerScreen<WeaponWorkbench_Menu> implements ContainerListener {
    private static final ResourceLocation BG_LOCATION = new ResourceLocation("arsenal:textures/gui/container/weapon_workbench.png");
    private static final ResourceLocation SPRITES_SCROLL_LOCATION = new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/scroller.png");
    private static final ResourceLocation SCROLLER_SPRITE = new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/scroller_disabled.png");
    private static final ResourceLocation PATTERN_SELECTED_SPRITE = new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/pattern_selected.png");
    private static final ResourceLocation PATTERN_HIGHLIGHTED_SPRITE = new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/pattern_highlighted.png");
    private static final ResourceLocation PATTERN_SPRITE = new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/pattern.png");
    private static final ResourceLocation SPRITES_ACID_LOCATION = new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/acid.png");
    private static final ResourceLocation SPRITES_FIRE_LOCATION = new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/fire.png");
    public static final Quaternionf ARMOR_STAND_ANGLE;
    private static final int PATTERN_COLUMNS = 3;
    private static final int PATTERN_ROWS = 1;
    private static final int SCROLLER_WIDTH = 12;
    private static final int SCROLLER_HEIGHT = 17;
    private static final int SCROLLER_FULL_HEIGHT = 56;
    private static final int PATTERN_IMAGE_SIZE = 18;
    private static final int PATTERNS_X = 51;
    private static final int PATTERNS_Y = 17;
    @Nullable
    private ArmorStand armorStandPreview;
    private float scrollOffs;
    private boolean scrolling;
    private int startRow;

    public WeaponWorkbench_GUI(WeaponWorkbench_Menu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
        this.imageWidth = 232;
        this.imageHeight = 166;
        this.titleLabelX = 36;
        this.titleLabelY = 5;
        this.inventoryLabelX = 36;
        this.inventoryLabelY = this.imageHeight - 94;
    }

    protected void subInit() {
        this.armorStandPreview = new ArmorStand(this.minecraft.level, 0.0, 0.0, 0.0);
        this.armorStandPreview.setNoBasePlate(true);
        this.armorStandPreview.setShowArms(true);
        this.armorStandPreview.yBodyRot = 210.0F;
        this.armorStandPreview.setXRot(25.0F);
        this.armorStandPreview.yHeadRot = this.armorStandPreview.getYRot();
        this.armorStandPreview.yHeadRotO = this.armorStandPreview.getYRot();
        this.updateArmorStandPreview((this.menu).getSlot(3).getItem());
    }

    protected void init() {
        super.init();
        this.subInit();
        (this.menu).addSlotListener(this);
    }

    public void removed() {
        super.removed();
        (this.menu).removeSlotListener(this);
    }

    public void render(GuiGraphics p_281810_, int p_283312_, int p_283420_, float p_282956_) {
        this.renderBackground(p_281810_);
        super.render(p_281810_, p_283312_, p_283420_, p_282956_);
        this.renderFg(p_281810_, p_283312_, p_283420_, p_282956_);
        this.renderTooltip(p_281810_, p_283312_, p_283420_);
    }

    protected void renderFg(GuiGraphics graphics, int mouseX, int mouseY, float partialTick) {
        int spritesHeight = 9;
        int spritesWidth = 9;
        graphics.blit(SPRITES_FIRE_LOCATION, this.leftPos - 6, this.topPos + 22, 0.0F, 0.0F, spritesWidth, spritesHeight, 9, 9);
    }

    protected void renderBg(GuiGraphics guiGraphics, float partialTick, int mouseX, int mouseY) {;
        int i = this.leftPos;
        int j = this.topPos;

        guiGraphics.blit(BG_LOCATION, this.leftPos-27, this.topPos, 0.0F, 0.0F, this.imageWidth, this.imageHeight, 256, 256);
        InventoryScreen.renderEntityInInventory(guiGraphics, this.leftPos + 180, this.topPos + 75, 25, ARMOR_STAND_ANGLE, (Quaternionf)null, this.armorStandPreview);

        int k = (int)((SCROLLER_FULL_HEIGHT - SCROLLER_HEIGHT + 0.0F) * this.scrollOffs);
        guiGraphics.blit(SPRITES_SCROLL_LOCATION, this.leftPos + 36, this.topPos + SCROLLER_HEIGHT + k, 0.0F, 0.0F,12, 15, 12, 15);
        Lighting.setupForFlatItems();
            int j2 = i + PATTERNS_X;
            int k2 = j + PATTERNS_Y;
            List<PatternEntry> list = this.menu.getSelectablePatterns();

            label64:
            for (int l = 0; l < PATTERN_COLUMNS; l++) {
                for (int i1 = 0; i1 < PATTERN_ROWS; i1++) {
                    int j1 = l + this.startRow;
                    int k1 = j1 * PATTERN_ROWS + i1;
                    if (k1 >= list.size()) {
                        break label64;
                    }

                    int l1 = j2 + i1 * PATTERN_IMAGE_SIZE;
                    int i2 = k2 + l * PATTERN_IMAGE_SIZE;
                    boolean flag = mouseX >= l1 && mouseY >= i2 && mouseX < l1 + PATTERN_IMAGE_SIZE && mouseY < i2 + PATTERN_IMAGE_SIZE;
                    ResourceLocation resourcelocation1;
                    if (k1 == this.menu.getSelectedBannerPatternIndex()) {
                        resourcelocation1 = PATTERN_SELECTED_SPRITE;
                    } else if (flag) {
                        resourcelocation1 = PATTERN_HIGHLIGHTED_SPRITE;
                    } else {
                        resourcelocation1 = PATTERN_SPRITE;
                    }

                    ResourceLocation i3;
                    i3 = (this.menu.getSelectablePattern(k1));

                    guiGraphics.blit(resourcelocation1, l1, i2, 0.0F, 0.0F, PATTERN_IMAGE_SIZE, PATTERN_IMAGE_SIZE, PATTERN_IMAGE_SIZE, PATTERN_IMAGE_SIZE);
                    guiGraphics.blit(i3, l1, i2, 0.0F, 0.0F, PATTERN_IMAGE_SIZE, PATTERN_IMAGE_SIZE, PATTERN_IMAGE_SIZE, PATTERN_IMAGE_SIZE);
                }
            }
    }

    protected void renderErrorIcon(GuiGraphics guigraphics, int width, int height) {
        if ((this.menu.getSlot(0).hasItem() || this.menu.getSlot(1).hasItem()) && !this.menu.getSlot(this.menu.getResultSlot()).hasItem()) {
            guigraphics.blit(BG_LOCATION, width, height, this.imageWidth, 0, 28, 21);
        }
    }

    private int totalRowCount() {
        return this.menu.getSelectablePatterns().size();
    }


    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        this.scrolling = false;
            int i = this.leftPos + PATTERNS_X;
            int j = this.topPos + PATTERNS_Y;

            for(int k = 0; k < PATTERN_COLUMNS; k++) {
                for(int l = 0; l < PATTERN_ROWS; l++) {
                    double d0 = mouseX - (double)(i + l * PATTERN_IMAGE_SIZE);
                    double d1 = mouseY - (double)(j + k * PATTERN_IMAGE_SIZE);
                    int i1 = k + this.startRow;
                    int j1 = i1 * PATTERN_ROWS + l;
                    if (d0 >= 0.0 && d1 >= 0.0 && d0 < PATTERN_IMAGE_SIZE && d1 < PATTERN_IMAGE_SIZE && (this.menu).clickMenuButton(this.minecraft.player, j1)) {
                        Minecraft.getInstance().getSoundManager().play(SimpleSoundInstance.forUI(SoundEvents.UI_LOOM_SELECT_PATTERN, 1.0F));
                        this.minecraft.gameMode.handleInventoryButtonClick((this.menu).containerId, j1);
                        return true;
                    }
                }
            }

            i = this.leftPos + 36;
            j = this.topPos + 17;
            if (mouseX >= (double)i && mouseX < (double)(i + SCROLLER_WIDTH) && mouseY >= (double) j && mouseY < (double)(j + SCROLLER_FULL_HEIGHT)) {
                this.scrolling = true;
            }

        return super.mouseClicked(mouseX, mouseY, button);
    }

    public boolean mouseDragged(double mouseX, double mouseY, int button, double dragX, double dragY) {
        int i = this.totalRowCount();
        if (this.scrolling) {
            int j = this.topPos + PATTERNS_Y;
            int k = j + SCROLLER_FULL_HEIGHT;
            this.scrollOffs = ((float)mouseY - (float)j - 7.5F) / ((float)(k - j) - 15.0F);
            this.scrollOffs = Mth.clamp(this.scrollOffs, 0.0F, 1.0F);
            this.startRow = Math.max((int) ((double) (this.scrollOffs * (float)i) + 0.5), 0);
            return true;
        } else {
            return super.mouseDragged(mouseX, mouseY, button, dragX, dragY);
        }
    }

    public boolean mouseScrolled(double mouseX, double mouseY, double scrollY) {
        int i = this.totalRowCount();
        float f = (float) scrollY / (float) i ;
        this.scrollOffs = Mth.clamp(this.scrollOffs - f, 0.0F, 1.0F);
        this.startRow = Math.max((int) (this.scrollOffs * (float) i + 0.5F), 0);

        return true;
    }

    protected boolean hasClickedOutside(double mouseX, double mouseY, int guiLeft, int guiTop, int mouseButton) {
        return mouseX < (double)guiLeft
                || mouseY < (double)guiTop
                || mouseX >= (double)(guiLeft + this.imageWidth)
                || mouseY >= (double)(guiTop + this.imageHeight);
    }

    private void updateArmorStandPreview(ItemStack p_268225_) {
        if (this.armorStandPreview != null) {
            EquipmentSlot[] var2 = EquipmentSlot.values();
            int var3 = var2.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                EquipmentSlot $$1 = var2[var4];
                this.armorStandPreview.setItemSlot($$1, ItemStack.EMPTY);
            }

            if (!p_268225_.isEmpty()) {
                ItemStack $$2 = p_268225_.copy();
                Item var8 = p_268225_.getItem();
                if (var8 instanceof ArmorItem) {
                    ArmorItem $$3 = (ArmorItem)var8;
                    this.armorStandPreview.setItemSlot($$3.getEquipmentSlot(), $$2);
                } else {
                    this.armorStandPreview.setItemSlot(EquipmentSlot.OFFHAND, $$2);
                }
            }

        }
    }

    public void dataChanged(AbstractContainerMenu p_169759_, int p_169760_, int p_169761_) {
    }

    public void slotChanged(AbstractContainerMenu p_98910_, int p_98911_, ItemStack p_98912_) {
    }

    static {
        ARMOR_STAND_ANGLE = (new Quaternionf()).rotationXYZ(0.43633232F, 0.0F, 3.1415927F);
    }
}