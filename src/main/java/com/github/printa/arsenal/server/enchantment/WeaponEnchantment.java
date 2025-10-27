package com.github.printa.arsenal.server.enchantment;

import com.github.printa.arsenal.server.registries.EnchantmentRegistry;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import org.jetbrains.annotations.NotNull;

public class WeaponEnchantment extends Enchantment {

    private int levels;
    private int minXP;
    private String registryName;

    public WeaponEnchantment(String name, Rarity rarity, EnchantmentCategory category, int levels, int minXP, EquipmentSlot... equipmentSlot) {
        super(rarity, category, equipmentSlot);
        this.levels = levels;
        this.minXP = minXP;
        this.registryName = name;
    }

    public int getMinCost(int i) {
        return 1 + (i - 1) * minXP;
    }

    public int getMaxCost(int i) {
        return super.getMinCost(i) + 30;
    }

    public int getMaxLevel() {
        return levels;
    }

    protected boolean checkCompatibility(@NotNull Enchantment enchantment) {
        return this != enchantment && EnchantmentRegistry.areCompatible(this, enchantment);
    }

    public String getName(){
        return registryName;
    }
}