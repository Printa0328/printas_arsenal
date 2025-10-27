package com.github.printa.arsenal.api;

import com.github.printa.arsenal.Arsenal;
import net.minecraft.resources.ResourceLocation;

import java.util.Optional;

public class AnimationHolder {
    private final ResourceLocation playerAnimation;
    public final boolean isPass;
    public final boolean animatesLegs;

    public AnimationHolder(String path, boolean playOnce, boolean animatesLegs) {
        this.playerAnimation = path.contains(":") ? ResourceLocation.parse(path) : Arsenal.id(path);
        this.isPass = false;
        this.animatesLegs = animatesLegs;
    }

    public AnimationHolder(String path, boolean playOnce) {
        this(path, playOnce, false);
    }

    private AnimationHolder(boolean isPass) {
        this.playerAnimation = null;
        this.isPass = isPass;
        this.animatesLegs = false;
    }

    private static final AnimationHolder empty = new AnimationHolder(false);
    private static final AnimationHolder pass = new AnimationHolder(true);

    /**
     * Represents an empty animation, making the player immediately stop animating at the end of a cast
     */
    public static AnimationHolder none() {
        return empty;
    }

    /**
     * Represents the lack of an animation, letting the previous animation (the cast start animation) continue to play after the spell ends, so long as the spell wasn't cancelled
     */
    public static AnimationHolder pass() {
        return pass;
    }

    public Optional<ResourceLocation> getForPlayer() {
        return playerAnimation == null ? Optional.empty() : Optional.of(playerAnimation);
    }
}
