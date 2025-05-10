package com.github.printa.arsenal.client.particle;

import com.github.printa.arsenal.client.particle.util.GenericParticleData;
import com.mojang.serialization.Codec;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.core.particles.ParticleType;
import org.jetbrains.annotations.NotNull;

public class Wisp2ParticleType extends ParticleType<GenericParticleData> {
    public Wisp2ParticleType() {
        super(false, GenericParticleData.DESERIALIZER);
    }

    @Override
    public @NotNull Codec<GenericParticleData> codec() {return GenericParticleData.codecFor(this);}

    public static class Factory implements ParticleProvider<GenericParticleData> {
        private final SpriteSet sprite;

        public Factory(SpriteSet sprite) {
            this.sprite = sprite;
        }

        @Override
        public Particle createParticle(@NotNull GenericParticleData data, @NotNull ClientLevel world, double x, double y, double z, double mx, double my, double mz) {
            Wisp2Particle ret = new Wisp2Particle(world, data, x, y, z, mx, my, mz);
            ret.pickSprite(sprite);
            return ret;
        }
    }
}
