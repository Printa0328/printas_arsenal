package com.github.printa.arsenal.server.registry;


import com.github.printa.arsenal.Arsenal;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureProcessorType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public final class ModStructureProcessor {

    public static final DeferredRegister<StructureProcessorType<?>> STRUCTURE_PROCESSOR = DeferredRegister.create(Registries.STRUCTURE_PROCESSOR, Arsenal.MODID);
}
