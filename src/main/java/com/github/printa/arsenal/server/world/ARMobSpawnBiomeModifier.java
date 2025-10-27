package com.github.printa.arsenal.server.world;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.registries.WorldRegistry;
import com.mojang.serialization.Codec;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.world.BiomeModifier;
import net.minecraftforge.common.world.ModifiableBiomeInfo;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ARMobSpawnBiomeModifier implements BiomeModifier {
    private static final RegistryObject<Codec<? extends BiomeModifier>> SERIALIZER = RegistryObject.create(ResourceLocation.fromNamespaceAndPath(Arsenal.MODID, "arsenal_mob_spawns"), ForgeRegistries.Keys.BIOME_MODIFIER_SERIALIZERS, Arsenal.MODID);

    public ARMobSpawnBiomeModifier() {
    }

    public void modify(Holder<Biome> biome, Phase phase, ModifiableBiomeInfo.BiomeInfo.Builder builder) {
        if (phase == Phase.ADD) {
            WorldRegistry.addBiomeSpawns(biome, builder);
        }
    }

    public Codec<? extends BiomeModifier> codec() {
        return (Codec)SERIALIZER.get();
    }

    public static Codec<ARMobSpawnBiomeModifier> makeCodec() {
        return Codec.unit(ARMobSpawnBiomeModifier::new);
    }
}
