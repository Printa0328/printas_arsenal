package com.github.printa.arsenal.server.item.util;

import com.github.printa.arsenal.util.CustomTabBehavior;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class BlockItemInventoryOnly extends BlockItem implements CustomTabBehavior {

    public BlockItemInventoryOnly(Block p_40565_, Item.Properties p_40566_) {
        super(p_40565_,p_40566_);
    }

    @Override
    public void fillItemCategory(CreativeModeTab.Output contents) {

    }
}
