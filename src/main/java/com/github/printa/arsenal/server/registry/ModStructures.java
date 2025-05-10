package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.Arsenal;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.structure.StructureType;
import net.minecraft.world.level.levelgen.structure.pieces.StructurePieceType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModStructures {

    public static final DeferredRegister<StructurePieceType> STRUCTURE_PIECE_DEF_REG = DeferredRegister.create(Registries.STRUCTURE_PIECE, Arsenal.MODID);
    public static final DeferredRegister<StructureType<?>> STRUCTURE_TYPE_DEF_REG = DeferredRegister.create(Registries.STRUCTURE_TYPE, Arsenal.MODID);

}
