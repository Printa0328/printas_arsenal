package com.github.printa.arsenal.server.inventory;

import com.github.printa.arsenal.server.crafting.WeaponWorkbench_Recipe;
import com.github.printa.arsenal.server.registries.BlockRegistry;
import com.github.printa.arsenal.server.registries.MenuRegistry;
import com.github.printa.arsenal.server.registries.RecipeTypeRegistry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.List;

public class WeaponWorkbench_Menu extends AbstractContainerMenu {
    private static final int INVENTORY_SLOTS_PER_ROW = 9;
    private static final int INVENTORY_SLOTS_PER_COLUMN = 3;
    protected final ContainerLevelAccess access;
    protected final Player player;
    final DataSlot selectedBannerPatternIndex = DataSlot.standalone();;
    private final List<PatternEntry> selectablePatterns = List.of(
            new PatternEntry("dagger", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/dagger.png")),
            new PatternEntry("straight_sword", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/straight_sword.png")),
            new PatternEntry("thrusting_sword", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/thrusting_sword.png")),
            new PatternEntry("curved_sword", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/curved_sword.png")),
            new PatternEntry("katana", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/katana.png")),
            new PatternEntry("axe", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/axe.png")),
            new PatternEntry("hammer", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/hammer.png")),
            new PatternEntry("flail", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/flail.png")),
            new PatternEntry("spear", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/spear.png")),
            new PatternEntry("greatsword", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/greatsword.png")),
            new PatternEntry("halberd", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/halberd.png")),
            new PatternEntry("scythe", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/scythe.png")),
            new PatternEntry("special_weapon", new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/special_weapon.png"))

    );
    protected final Container inputSlots;
    private final List<Integer> inputSlotIndexes;
    protected final ResultContainer resultSlots = new ResultContainer();
    private final int resultSlotIndex;

    private final Level level;
    @Nullable
    private WeaponWorkbench_Recipe selectedRecipe;
    private final List<WeaponWorkbench_Recipe> recipes;

    public WeaponWorkbench_Menu(int container_id, Inventory inventory) {
        this(MenuRegistry.WEAPON_WORKBENCH.get(), container_id, inventory, ContainerLevelAccess.NULL);
    }

    public WeaponWorkbench_Menu(@Nullable MenuType<?> type, int container_id, Inventory inventory, ContainerLevelAccess access) {
        super(type, container_id);
        this.access = access;
        this.level = inventory.player.level();
        this.player = inventory.player;
        ItemCombinerMenuSlotDefinition $$4 = this.createInputSlotDefinitions();
        this.inputSlots = this.createContainer($$4.getNumOfInputSlots());
        this.inputSlotIndexes = $$4.getInputSlotIndexes();
        this.resultSlotIndex = $$4.getResultSlotIndex();
        this.createInputSlots($$4);
        this.createResultSlot($$4);
        this.createInventorySlots(inventory);
        this.recipes = this.level.getRecipeManager().getAllRecipesFor(RecipeTypeRegistry.WEAPON_WORKBENCH.get());
        this.createInventorySlots(inventory);
        this.addDataSlot(this.selectedBannerPatternIndex);
    }

    private void createInputSlots(ItemCombinerMenuSlotDefinition p_267172_) {
        Iterator var2 = p_267172_.getSlots().iterator();

        while(var2.hasNext()) {
            final ItemCombinerMenuSlotDefinition.SlotDefinition $$1 = (ItemCombinerMenuSlotDefinition.SlotDefinition)var2.next();
            this.addSlot(new Slot(this.inputSlots, $$1.slotIndex(), $$1.x(), $$1.y()) {
                public boolean mayPlace(ItemStack p_267156_) {
                    return $$1.mayPlace().test(p_267156_);
                }
            });
        }

    }

    private SimpleContainer createContainer(int p_267204_) {
        return new SimpleContainer(p_267204_) {
            public void setChanged() {
                super.setChanged();
                WeaponWorkbench_Menu.this.slotsChanged(this);
            }
        };
    }

    private void createResultSlot(ItemCombinerMenuSlotDefinition p_267000_) {
        this.addSlot(new Slot(this.resultSlots, p_267000_.getResultSlot().slotIndex(), p_267000_.getResultSlot().x(), p_267000_.getResultSlot().y()) {
            public boolean mayPlace(ItemStack p_39818_) {
                return false;
            }

            public boolean mayPickup(Player p_39813_) {
                return WeaponWorkbench_Menu.this.mayPickup(p_39813_, this.hasItem());
            }

            public void onTake(Player p_150604_, ItemStack p_150605_) {
                WeaponWorkbench_Menu.this.onTake(p_150604_, p_150605_);
            }
        });
    }

    public ItemStack quickMoveStack(Player p_39792_, int p_39793_) {
        ItemStack $$2 = ItemStack.EMPTY;
        Slot $$3 = (Slot)this.slots.get(p_39793_);
        if ($$3 != null && $$3.hasItem()) {
            ItemStack $$4 = $$3.getItem();
            $$2 = $$4.copy();
            int $$5 = this.getInventorySlotStart();
            int $$6 = this.getUseRowEnd();
            if (p_39793_ == this.getResultSlot()) {
                if (!this.moveItemStackTo($$4, $$5, $$6, true)) {
                    return ItemStack.EMPTY;
                }

                $$3.onQuickCraft($$4, $$2);
            } else if (this.inputSlotIndexes.contains(p_39793_)) {
                if (!this.moveItemStackTo($$4, $$5, $$6, false)) {
                    return ItemStack.EMPTY;
                }
            } else if (this.canMoveIntoInputSlots($$4) && p_39793_ >= this.getInventorySlotStart() && p_39793_ < this.getUseRowEnd()) {
                int $$7 = this.getSlotToQuickMoveTo($$2);
                if (!this.moveItemStackTo($$4, $$7, this.getResultSlot(), false)) {
                    return ItemStack.EMPTY;
                }
            } else if (p_39793_ >= this.getInventorySlotStart() && p_39793_ < this.getInventorySlotEnd()) {
                if (!this.moveItemStackTo($$4, this.getUseRowStart(), this.getUseRowEnd(), false)) {
                    return ItemStack.EMPTY;
                }
            } else if (p_39793_ >= this.getUseRowStart() && p_39793_ < this.getUseRowEnd() && !this.moveItemStackTo($$4, this.getInventorySlotStart(), this.getInventorySlotEnd(), false)) {
                return ItemStack.EMPTY;
            }

            if ($$4.isEmpty()) {
                $$3.setByPlayer(ItemStack.EMPTY);
            } else {
                $$3.setChanged();
            }

            if ($$4.getCount() == $$2.getCount()) {
                return ItemStack.EMPTY;
            }

            $$3.onTake(p_39792_, $$4);
        }

        return $$2;
    }

    public boolean stillValid(Player p_39780_) {
        return (Boolean)this.access.evaluate((p_39785_, p_39786_) -> {
            return !this.isValidBlock(p_39785_.getBlockState(p_39786_)) ? false : p_39780_.distanceToSqr((double)p_39786_.getX() + 0.5, (double)p_39786_.getY() + 0.5, (double)p_39786_.getZ() + 0.5) <= 64.0;
        }, true);
    }

    public boolean clickMenuButton(Player p_39867_, int p_39868_) {
        if (p_39868_ >= 0 && p_39868_ < this.selectablePatterns.size()) {
            this.selectedBannerPatternIndex.set(p_39868_);
            this.setupResultSlot(this.selectablePatterns.get(p_39868_));
            return true;
        } else {
            return false;
        }
    }

    public int getSelectedBannerPatternIndex() {
        return this.selectedBannerPatternIndex.get();
    }

    public ResourceLocation getSelectablePattern(int k) {
        if ( k >= 0 && k < selectablePatterns.size()) {
            return selectablePatterns.get(k).getTexture();
        } else {
            return new ResourceLocation("arsenal:textures/gui/sprites/container/weapon_workbench/warning.png");
        }
    }


    protected ItemCombinerMenuSlotDefinition createInputSlotDefinitions() {
        return ItemCombinerMenuSlotDefinition.create().withSlot
                (0, 87, 37, (p_266883_) -> {return true;})
                .withSlot(1, 105, 37, (p_267323_) -> {return true;})
                .withSlot(2, 96, 17, (p_267323_) -> {return true;})
                .withResultSlot(3, 144, 34).build();
    }

    private void createInventorySlots(Inventory inventory) {
        int $$3;
        for($$3 = 0; $$3 < 3; ++$$3) {
            for(int $$2 = 0; $$2 < 9; ++$$2) {
                this.addSlot(new Slot(inventory, $$2 + $$3 * 9 + 9, 36 + $$2 * 18, 84 + $$3 * 18));
            }
        }

        for($$3 = 0; $$3 < 9; ++$$3) {
            this.addSlot(new Slot(inventory, $$3, 36 + $$3 * 18, 142));
        }

    }

    protected boolean isValidBlock(BlockState p_266887_) {
        return p_266887_.is(BlockRegistry.WEAPON_WORKBENCH.get());
    }

    protected boolean mayPickup(Player p_267240_, boolean p_266679_) {
        return this.selectedRecipe != null && this.selectedRecipe.matches(this.inputSlots, this.level);
    }


    protected void onTake(Player p_267006_, ItemStack p_266731_) {
        p_266731_.onCraftedBy(p_267006_.level(), p_267006_, p_266731_.getCount());
        this.resultSlots.awardUsedRecipes(p_267006_, this.getRelevantItems());
        this.shrinkStackInSlot(0);
        this.shrinkStackInSlot(1);
        this.access.execute((p_267191_, p_267098_) -> {
            p_267191_.levelEvent(1044, p_267098_, 0);
        });

    }

    private List<ItemStack> getRelevantItems() {
        return List.of(this.inputSlots.getItem(0), this.inputSlots.getItem(1), this.inputSlots.getItem(2));
    }

    private void shrinkStackInSlot(int p_267273_) {
        ItemStack itemstack = this.inputSlots.getItem(p_267273_);
        itemstack.shrink(1);
        this.inputSlots.setItem(p_267273_, itemstack);
    }

    public void createResult() {
        List<WeaponWorkbench_Recipe> list = this.level.getRecipeManager().getRecipesFor(RecipeTypeRegistry.WEAPON_WORKBENCH.get(), this.inputSlots, this.level).stream().filter((p_267116_) -> {
            return p_267116_ instanceof WeaponWorkbench_Recipe;
        }).map((p_266971_) -> {
            return (WeaponWorkbench_Recipe)p_266971_;
        }).toList();
        if (list.isEmpty()) {
            this.resultSlots.setItem(0, ItemStack.EMPTY);
        } else {
            WeaponWorkbench_Recipe legacyupgraderecipe = list.get(0);
            ItemStack itemstack = legacyupgraderecipe.assemble(this.inputSlots, this.level.registryAccess());
            if (itemstack.isItemEnabled(this.level.enabledFeatures())) {
                this.selectedRecipe = legacyupgraderecipe;
                this.resultSlots.setRecipeUsed(legacyupgraderecipe);
                this.resultSlots.setItem(0, itemstack);
            }
        }

    }

    public List<PatternEntry> getSelectablePatterns() {
        return this.selectablePatterns;
    }
    
    private void setupResultSlot(PatternEntry entry) {
    }

    public int getSlotToQuickMoveTo(ItemStack p_267241_) {
        return this.shouldQuickMoveToAdditionalSlot(p_267241_) ? 1 : 0;
    }

    protected boolean shouldQuickMoveToAdditionalSlot(ItemStack p_267176_) {
        return this.recipes.stream().anyMatch((p_267065_) -> {
            return p_267065_.isAdditionIngredient(p_267176_);
        });
    }

    public boolean canTakeItemForPickAll(ItemStack p_266810_, Slot p_267252_) {
        return p_267252_.container != this.resultSlots && super.canTakeItemForPickAll(p_266810_, p_267252_);
    }

    protected boolean canMoveIntoInputSlots(ItemStack p_39787_) {
        return true;
    }

    public int getResultSlot() {
        return this.resultSlotIndex;
    }

    private int getInventorySlotStart() {
        return this.getResultSlot() + 1;
    }

    private int getInventorySlotEnd() {
        return this.getInventorySlotStart() + 27;
    }

    private int getUseRowStart() {
        return this.getInventorySlotEnd();
    }

    private int getUseRowEnd() {
        return this.getUseRowStart() + 9;
    }
}
