package com.github.printa.arsenal.server.inventory;

import net.minecraft.resources.ResourceLocation;

public class PatternEntry {
    private final String name;
    private final ResourceLocation texture;

    public PatternEntry(String name, ResourceLocation texture) {
        this.name = name;
        this.texture = texture;
    }

    public String getName() {
        return name;
    }

    public ResourceLocation getTexture() {
        return texture;
    }
}
