package com.github.printa.arsenal.server.registries;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.util.CustomTabBehavior;
import net.minecraft.core.registries.Registries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class CreativeTabRegistry {


    public static final DeferredRegister<CreativeModeTab> DEF_REG = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Arsenal.MODID);

    public static final RegistryObject<CreativeModeTab> TAB = DEF_REG.register("arsenal", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.arsenal"))
            .icon(CreativeTabRegistry::Icon)
            .displayItems((enabledFeatures, output) -> {
                // 스폰 알
                add(output, ItemRegistry.SOUL_KNIGHT_SPAWN_EGG.get());
                add(output, ItemRegistry.WEREWOLF_SPAWN_EGG.get());
                // 아이템
                add(output, ItemRegistry.SOUL_METAL_INGOT.get());
                add(output, ItemRegistry.IGNITION_CHARGE.get());
                add(output, ItemRegistry.INCOMPLETE_IGNITION_CHARGE.get());
                // 무기및 도구
                add(output, ItemRegistry.CHARGE_HALBERD.get());
                add(output, ItemRegistry.SOUL_METAL_GREATSWORD.get());
                //add(output, ModItems.FROST_BLADE.get());
                // 블록
                add(output, BlockRegistry.WEAPON_WORKBENCH.get());
                EnchantmentRegistry.addAllEnchantsToCreativeTab(output, EnchantmentRegistry.SOUL_METAL_GREAT_SWORD);
            })
            .build());


    private static ItemStack Icon() {
        ItemStack stack = new ItemStack(ItemRegistry.CHARGE_HALBERD.get());
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

