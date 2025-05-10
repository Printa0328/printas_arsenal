package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.block.WeaponWorkbenchBlock;
import com.github.printa.arsenal.server.item.util.BlockItemCMRender;
import com.github.printa.arsenal.server.item.util.CMBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Arsenal.MODID);

    public static RegistryObject<Block> registerBlockAndItem(String name, Supplier<Block> block, Item.Properties blockItemProps, boolean specialRender){
        RegistryObject<Block> blockObj = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> specialRender ?  new BlockItemCMRender(blockObj, blockItemProps) :  new CMBlockItem(blockObj, blockItemProps));
        return blockObj;
    }

    public static final RegistryObject<Block> WEAPON_WORKBENCH = registerBlockAndItem("weapon_workbench",
            WeaponWorkbenchBlock::new, new Item.Properties(), true);
    }