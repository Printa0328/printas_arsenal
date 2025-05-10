package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.Arsenal;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModMenu {

    public static final DeferredRegister<MenuType<?>> DEF_REG = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Arsenal.MODID);


}
