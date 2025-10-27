package com.github.printa.arsenal.server.registries;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.crafting.WeaponWorkbench_Recipe;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RecipeSerializersRegistry
{
	public static final DeferredRegister<RecipeSerializer<?>> RECIPE_SERIALIZERS = DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Arsenal.MODID);

	public static final RegistryObject<RecipeSerializer<?>> WEAPON_WORKBENCH = RECIPE_SERIALIZERS.register("weapon_workbench", WeaponWorkbench_Recipe.Serializer::new);

}
