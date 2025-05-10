package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.Arsenal;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.placement.StructurePlacementType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;


public final class ModStructurePlacementType {
    public static final DeferredRegister<StructurePlacementType<?>> STRUCTURE_PLACEMENT_TYPE = DeferredRegister.create(Registries.STRUCTURE_PLACEMENT, Arsenal.MODID);
}
