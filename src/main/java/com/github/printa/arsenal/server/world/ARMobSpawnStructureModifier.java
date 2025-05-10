package com.github.printa.arsenal.server.world;

import com.github.printa.arsenal.Arsenal;
import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraftforge.common.world.ModifiableStructureInfo;
import net.minecraftforge.common.world.StructureModifier;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ARMobSpawnStructureModifier implements StructureModifier {

    private static final RegistryObject<Codec<? extends StructureModifier>> SERIALIZER = RegistryObject.create(new ResourceLocation(Arsenal.MODID, "cataclysm_structure_spawns"), ForgeRegistries.Keys.STRUCTURE_MODIFIER_SERIALIZERS, Arsenal.MODID);

    public ARMobSpawnStructureModifier() {
    }

    @Override
    public void modify(Holder<Structure> structure, Phase phase, ModifiableStructureInfo.StructureInfo.Builder builder) {
        if (phase == Phase.ADD) {
            //WorldRegistry.modifyStructure(structure, builder);

        }
    }

    public Codec<? extends StructureModifier> codec() {
        return (Codec)SERIALIZER.get();
    }

    public static Codec<ARMobSpawnStructureModifier> makeCodec() {
        return Codec.unit(ARMobSpawnStructureModifier::new);
    }
}
