package com.github.printa.arsenal.server.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class Workbench_Item extends Item {
    private static final Component description = Component.translatable("item.arsenal.workbench_item_tooltip").withStyle(ChatFormatting.GRAY);

    public Workbench_Item() {
        super(new Item.Properties().fireResistant());
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(description);
    }
}
