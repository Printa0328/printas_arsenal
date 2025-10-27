package com.github.printa.arsenal.client.particle;

import com.github.printa.arsenal.client.render.RenderUtil;
import com.github.printa.arsenal.server.registries.ParticleRegistry;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Locale;

@OnlyIn(Dist.CLIENT)
public class WispParticle extends TextureSheetParticle {
    private final double duration;

    public WispParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, double scale, int duration) {
        super(world, x, y, z);
        quadSize = (float) scale * 0.1f;
        lifetime = duration;
        xd = vx;
        yd = vy;
        zd = vz;
        this.duration = duration;
    }

    @Override
    public ParticleRenderType getRenderType() {
        return RenderUtil.PARTICLE_SHEET_TRANSLUCENT_NO_DEPTH;
    }

    @Override
    public int getLightColor(float delta) {
        return 240 | super.getLightColor(delta) & 0xFF0000;
    }

    @Override
    public void tick() {
        alpha = 0.1f;
        xo = x;
        yo = y;
        zo = z;
        super.tick();
        if (age >= lifetime) {
            remove();
        }
        age++;
    }

    @Override
    public void render(VertexConsumer buffer, Camera renderInfo, float partialTicks) {
        super.render(buffer, renderInfo, partialTicks);
    }

    @OnlyIn(Dist.CLIENT)
    public static final class WispFactory implements ParticleProvider<WispParticle.WispData> {
        private final SpriteSet spriteSet;

        public WispFactory(SpriteSet sprite) {
            this.spriteSet = sprite;
        }

        @Override
        public Particle createParticle(WispParticle.WispData typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            WispParticle particle = new WispParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, typeIn.getScale(), typeIn.getDuration());
            particle.setSpriteFromAge(spriteSet);
            particle.setColor(typeIn.getR(), typeIn.getG(), typeIn.getB());
            return particle;
        }
    }

    public static class WispData implements ParticleOptions {
        public static final Deserializer<WispParticle.WispData> DESERIALIZER = new Deserializer<WispParticle.WispData>() {
            public WispParticle.WispData fromCommand(ParticleType<WispParticle.WispData> particleTypeIn, StringReader reader) throws CommandSyntaxException {
                reader.expect(' ');
                float r = (float) reader.readDouble();
                reader.expect(' ');
                float g = (float) reader.readDouble();
                reader.expect(' ');
                float b = (float) reader.readDouble();
                reader.expect(' ');
                float scale = (float) reader.readDouble();
                reader.expect(' ');
                int duration = reader.readInt();
                return new WispParticle.WispData(r, g, b, scale, duration);
            }

            public WispParticle.WispData fromNetwork(ParticleType<WispParticle.WispData> particleTypeIn, FriendlyByteBuf buffer) {
                return new WispParticle.WispData(buffer.readFloat(), buffer.readFloat(), buffer.readFloat(), buffer.readFloat(), buffer.readInt());
            }
        };
        private final float r;
        private final float g;
        private final float b;
        private final float scale;
        private final int duration;

        public WispData(float r, float g, float b, float scale, int duration) {
            this.r = r;
            this.g = g;
            this.b = b;
            this.scale = scale;
            this.duration = duration;
        }

        @Override
        public void writeToNetwork(FriendlyByteBuf buffer) {
            buffer.writeFloat(this.r);
            buffer.writeFloat(this.g);
            buffer.writeFloat(this.b);
            buffer.writeFloat(this.scale);
            buffer.writeInt(this.duration);
        }

        @Override
        public String writeToString() {
            return String.format(Locale.ROOT, "%s %.2f %.2f %.2f %.2f %d", ForgeRegistries.PARTICLE_TYPES.getKey(this.getType()),
                    this.r, this.g, this.b, this.scale, this.duration);
        }

        @Override
        public ParticleType<WispParticle.WispData> getType() {
            return ParticleRegistry.WISP.get();
        }

        @OnlyIn(Dist.CLIENT)
        public float getR() {
            return this.r;
        }

        @OnlyIn(Dist.CLIENT)
        public float getG() {
            return this.g;
        }

        @OnlyIn(Dist.CLIENT)
        public float getB() {
            return this.b;
        }

        @OnlyIn(Dist.CLIENT)
        public float getScale() {
            return this.scale;
        }

        @OnlyIn(Dist.CLIENT)
        public int getDuration() {
            return this.duration;
        }

        public static Codec<WispParticle.WispData> CODEC(ParticleType<WispParticle.WispData> particleType) {
            return RecordCodecBuilder.create((codecBuilder) -> codecBuilder.group(
                            Codec.FLOAT.fieldOf("r").forGetter(WispParticle.WispData::getR),
                            Codec.FLOAT.fieldOf("g").forGetter(WispParticle.WispData::getG),
                            Codec.FLOAT.fieldOf("b").forGetter(WispParticle.WispData::getB),
                            Codec.FLOAT.fieldOf("scale").forGetter(WispParticle.WispData::getScale),
                            Codec.INT.fieldOf("duration").forGetter(WispParticle.WispData::getDuration)
                    ).apply(codecBuilder, WispParticle.WispData::new)
            );
        }
    }
}

