package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.util.CustomTabBehavior;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModGroup {


    public static final DeferredRegister<CreativeModeTab> DEF_REG = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Arsenal.MODID);

    public static final RegistryObject<CreativeModeTab> TAB = DEF_REG.register("arsenal", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.arsenal"))
            .icon(ModGroup::Icon)
            .displayItems((enabledFeatures, output) -> {
                // 스폰 알
                add(output, ModItems.SOUL_KNIGHT_SPAWN_EGG.get());
                add(output, ModItems.WEREWOLF_SPAWN_EGG.get());
                // 재료
                add(output, ModItems.SOUL_METAL_INGOT.get());
                // 무기및 도구
                add(output, ModItems.CHARGE_HALBERD.get());
                add(output, ModItems.SOUL_METAL_GREATSWORD.get());
                add(output, ModItems.FROST_BLADE.get());
                EnchantmentRegistry.addAllEnchantsToCreativeTab(output, EnchantmentRegistry.SOUL_METAL_GREAT_SWORD);
            })
            .build());


    private static ItemStack Icon() {
        ItemStack stack = new ItemStack(ModItems.CHARGE_HALBERD.get());
        CompoundTag tag = new CompoundTag();
        tag.putInt("phase", 3);
        stack.setTag(tag);
        return stack;
    }

    private static void add(CreativeModeTab.Output tab, ItemLike itemLike) {
        if (itemLike instanceof CustomTabBehavior customTabBehavior) {
            customTabBehavior.fillItemCategory(tab);
        } else {
            tab.accept(itemLike);
        }
    }





}

