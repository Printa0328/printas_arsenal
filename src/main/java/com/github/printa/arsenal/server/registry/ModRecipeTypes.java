package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.Arsenal;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModRecipeTypes
{
	public static final DeferredRegister<RecipeType<?>> RECIPE_TYPES = DeferredRegister.create(ForgeRegistries.RECIPE_TYPES, Arsenal.MODID);


	public static <T extends Recipe<?>> RecipeType<T> registerRecipeType(final String identifier) {
		return new RecipeType<>()
		{
			public String toString() {
				return Arsenal.MODID + ":" + identifier;
			}
		};
	}
}
