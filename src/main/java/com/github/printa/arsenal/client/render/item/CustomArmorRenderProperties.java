package com.github.printa.arsenal.client.render.item;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

public class CustomArmorRenderProperties implements IClientItemExtensions {

    private static boolean init;

    public static void initializeModels() {
        init = true;

    }

    public HumanoidModel<?> getHumanoidArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel<?> _default) {
        if(!init){
            initializeModels();
        }

        return _default;
    }
}
