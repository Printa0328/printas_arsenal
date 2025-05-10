package com.github.printa.arsenal.api.attack;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.api.AnimationHolder;
import net.minecraft.resources.ResourceLocation;

public class PlayerAnimation {
    public static ResourceLocation ANIMATION_RESOURCE = new ResourceLocation(Arsenal.MODID, "animation");

    public static final AnimationHolder LASER_CAST = new AnimationHolder("laser_cast", true);
}