package com.github.printa.arsenal.server.config;

import com.github.printa.arsenal.Arsenal;
import net.minecraftforge.fml.config.ModConfig;

public class Config {

    public static void bake(ModConfig config) {
        try {

        } catch (Exception e) {
            Arsenal.LOGGER.warn("An exception was caused trying to load the config for CM");
            e.printStackTrace();
        }
    }
}