package com.github.printa.arsenal.server.item.util;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

public interface KeybindUsingArmor {
    void onKeyPacket(Player keyPresser, ItemStack itemStack, int type);
}
