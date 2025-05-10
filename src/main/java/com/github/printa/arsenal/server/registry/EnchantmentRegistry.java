package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.enchantment.PRAWeaponEnchantment;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.EnchantmentInstance;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class EnchantmentRegistry {
    public static final DeferredRegister<Enchantment> DEF_REG = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Arsenal.MODID);
    public static final EnchantmentCategory SOUL_METAL_GREAT_SWORD = EnchantmentCategory.create("soul_metal_great_sword", (item -> item == ModItems.SOUL_METAL_GREATSWORD.get()));
    public static final RegistryObject<Enchantment> EMBER_OF_RAY = DEF_REG.register("ember_of_ray", () -> new PRAWeaponEnchantment("ember_of_ray", Enchantment.Rarity.COMMON, SOUL_METAL_GREAT_SWORD, 3, 12, EquipmentSlot.MAINHAND));
    public static final RegistryObject<Enchantment> THERMAL_REPAIR = DEF_REG.register("thermal_repair", () -> new PRAWeaponEnchantment("thermal_repair", Enchantment.Rarity.COMMON, SOUL_METAL_GREAT_SWORD, 1, 12, EquipmentSlot.MAINHAND));

    public static boolean areCompatible(PRAWeaponEnchantment enchantment1, Enchantment enchantment2) {
        if(enchantment1 == THERMAL_REPAIR.get() && enchantment2 == Enchantments.MENDING){
            return false;
        }
        return true;
    }

    public static void addAllEnchantsToCreativeTab(CreativeModeTab.Output output, EnchantmentCategory enchantmentCategory){
        for (RegistryObject<Enchantment> enchantObject : DEF_REG.getEntries()) {
            if (enchantObject.isPresent()) {
                Enchantment enchant = enchantObject.get();
                if(enchant.category == enchantmentCategory){
                    EnchantmentInstance instance = new EnchantmentInstance(enchant, enchant.getMaxLevel());
                    output.accept(EnchantedBookItem.createForEnchantment(instance));
                }
            }
        }
    }
}
