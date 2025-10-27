package com.github.printa.arsenal.server.config;


import com.github.L_Ender.lionfishapi.config.biome.BiomeEntryType;
import com.github.L_Ender.lionfishapi.config.biome.SpawnBiomeData;

public class DefaultBiomes {

    public static final SpawnBiomeData DEEPLING = new SpawnBiomeData()
            .addBiomeEntry(BiomeEntryType.REGISTRY_NAME, false, "minecraft:forest", 0);
}
