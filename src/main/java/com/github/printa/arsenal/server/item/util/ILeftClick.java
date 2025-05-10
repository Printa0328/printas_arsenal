package com.github.printa.arsenal.server.item.util;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

public interface ILeftClick {

    boolean onLeftClick(ItemStack stack, LivingEntity playerIn);
}
