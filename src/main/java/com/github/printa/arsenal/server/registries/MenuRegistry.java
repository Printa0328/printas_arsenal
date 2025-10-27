package com.github.printa.arsenal.server.registries;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.inventory.WeaponWorkbench_Menu;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MenuRegistry {

    public static final DeferredRegister<MenuType<?>> DEF_REG = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Arsenal.MODID);

    public static final RegistryObject<MenuType<WeaponWorkbench_Menu>> WEAPON_WORKBENCH = DEF_REG.register("weapon_workbench", () -> new MenuType<WeaponWorkbench_Menu>(WeaponWorkbench_Menu::new, FeatureFlags.DEFAULT_FLAGS));
}
