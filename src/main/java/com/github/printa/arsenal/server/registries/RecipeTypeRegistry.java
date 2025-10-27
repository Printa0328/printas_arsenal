package com.github.printa.arsenal.server.registries;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.crafting.WeaponWorkbench_Recipe;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class RecipeTypeRegistry
{
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, Arsenal.MODID);

	public static final RegistryObject<RecipeType<WeaponWorkbench_Recipe>> WEAPON_WORKBENCH = RECIPE_TYPES.register("weapon_workbench", () -> registerRecipeType("weapon_workbench"));


	public static <T extends Recipe<?>> RecipeType<T> registerRecipeType(final String identifier) {
		return new RecipeType<>()
		{
			public String toString() {
				return Arsenal.MODID + ":" + identifier;
			}
		};
	}
}
