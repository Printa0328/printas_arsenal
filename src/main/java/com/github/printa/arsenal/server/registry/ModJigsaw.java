package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.Arsenal;
import com.mojang.serialization.Codec;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElement;
import net.minecraft.world.level.levelgen.structure.pools.StructurePoolElementType;

public class ModJigsaw {
    public static StructurePoolElementType arsenal_ELEMENT;

    public static void registerJigsawElements() {
    }

    private static <P extends StructurePoolElement> StructurePoolElementType<P> register(String name, Codec<P> codec) {
        return Registry.register(BuiltInRegistries.STRUCTURE_POOL_ELEMENT, new ResourceLocation(Arsenal.MODID, name), () -> codec);
    }
}
