package com.github.printa.arsenal.server.registries;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.item.*;
import net.minecraft.core.BlockPos;
import net.minecraft.core.BlockSource;
import net.minecraft.core.dispenser.DefaultDispenseItemBehavior;
import net.minecraft.core.dispenser.DispenseItemBehavior;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
            Arsenal.MODID);

    /**
     * spawn egg
     */
    public static final RegistryObject<SpawnEggItem> SOUL_KNIGHT_SPAWN_EGG = ITEMS.register("soul_knight_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityRegistry.SOUL_KNIGHT, 0x485365, 0x5be3e8, new Item.Properties()));

    public static final RegistryObject<SpawnEggItem> WEREWOLF_SPAWN_EGG = ITEMS.register("werewolf_spawn_egg",
            () -> new ForgeSpawnEggItem(EntityRegistry.WEREWOLF, 0x292b2d, 0x31393e, new Item.Properties()));

    /**
     * Generic Items
     */
    public static final RegistryObject<Item> SOUL_METAL_INGOT = ITEMS.register("soul_metal_ingot",
            () -> new Item(new Item.Properties().fireResistant().rarity(Rarity.EPIC)));

    public static final RegistryObject<Item> IGNITION_CHARGE = ITEMS.register("ignition_charge",
            () -> new Workbench_Item());

    public static final RegistryObject<Item> INCOMPLETE_IGNITION_CHARGE = ITEMS.register("incomplete_ignition_charge",
            () -> new Item(new Item.Properties().fireResistant()));

    /**
     * Gear
     */
    public static final RegistryObject<Item> CHARGE_HALBERD = ITEMS.register("charge_halberd",
            () -> new Charge_Halberd(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.RARE)));

    public static final RegistryObject<Item> SOUL_METAL_GREATSWORD = ITEMS.register("soul_metal_great_sword",
            () -> new Soul_Metal_Great_Sword(new Item.Properties().stacksTo(1).fireResistant().rarity(Rarity.UNCOMMON).durability(250)));

    public static final RegistryObject<Item> SOUL_METAL_GREATSWORD_SPRITE = ITEMS.register("soul_metal_great_sword_inventory",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FROST_BLADE = ITEMS.register("frost_blade",
            () -> new Frost_Blade(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));

    public static void initDispenser(){
        DispenseItemBehavior dispenseItemBehavior = new DefaultDispenseItemBehavior() {
            private final DefaultDispenseItemBehavior defaultDispenseItemBehavior = new DefaultDispenseItemBehavior();

            public ItemStack execute(BlockSource blockSource, ItemStack itemStack) {
                DispensibleContainerItem dispensibleContainerItem = (DispensibleContainerItem) itemStack.getItem();
                BlockPos blockPos = blockSource.getPos().relative(blockSource.getBlockState().getValue(DispenserBlock.FACING));
                Level level = blockSource.getLevel();
                if (dispensibleContainerItem.emptyContents(null, level, blockPos, null)) {
                    dispensibleContainerItem.checkExtraContent(null, level, itemStack, blockPos);
                    return new ItemStack(Items.BUCKET);
                } else {
                    return this.defaultDispenseItemBehavior.dispense(blockSource, itemStack);
                }
            }
        };
    }
}


