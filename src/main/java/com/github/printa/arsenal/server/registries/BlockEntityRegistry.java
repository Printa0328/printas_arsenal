package com.github.printa.arsenal.server.registries;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.entity.blockentity.WeaponWorkbenchBlock_Entity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class BlockEntityRegistry {

    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPE_DEF_REG = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES,
            Arsenal.MODID);

    public static final RegistryObject<BlockEntityType<WeaponWorkbenchBlock_Entity>> WEAPON_WORKBENCH = BLOCK_ENTITY_TYPE_DEF_REG.register("weapon_workbench", () ->
            BlockEntityType.Builder.of(WeaponWorkbenchBlock_Entity::new, BlockRegistry.WEAPON_WORKBENCH.get()).build(null));
}
