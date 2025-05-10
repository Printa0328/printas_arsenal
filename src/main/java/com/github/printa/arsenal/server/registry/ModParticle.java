package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.particle.OrbParticle;
import com.github.printa.arsenal.client.particle.RingParticle;
import com.github.printa.arsenal.client.particle.Wisp2ParticleType;
import com.github.printa.arsenal.client.particle.WispParticle;
import com.github.printa.arsenal.client.particle.util.AdvancedParticleData;
import com.github.printa.arsenal.client.particle.util.RibbonParticleData;
import com.mojang.serialization.Codec;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModParticle {
    public static final DeferredRegister<ParticleType<?>> PARTICLE = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, Arsenal.MODID);
    public static final RegistryObject<Wisp2ParticleType>
            WISP2 = PARTICLE.register("wisp2", Wisp2ParticleType::new);
    public static final RegistryObject<ParticleType<RingParticle.RingData>> RING = PARTICLE.register("ring_0", () -> new ParticleType<RingParticle.RingData>(false, RingParticle.RingData.DESERIALIZER) {
        @Override
        public Codec<RingParticle.RingData> codec() {
            return RingParticle.RingData.CODEC(RING.get());
        }

    });
    public static final RegistryObject<ParticleType<WispParticle.WispData>> WISP = PARTICLE.register("wisp", () -> new ParticleType<WispParticle.WispData>(false, WispParticle.WispData.DESERIALIZER) {
        @Override
        public Codec<WispParticle.WispData> codec() {
            return WispParticle.WispData.CODEC(WISP.get());
        }
    });
    public static final RegistryObject<ParticleType<OrbParticle.OrbData>> ORB = PARTICLE.register("orb", () -> new ParticleType<OrbParticle.OrbData>(false, OrbParticle.OrbData.DESERIALIZER) {
        @Override
        public Codec<OrbParticle.OrbData> codec() {
            return OrbParticle.OrbData.CODEC(ORB.get());
        }
    });
    public static final RegistryObject<ParticleType<RibbonParticleData>> FLAT_RIBBON = ModParticle.registerRibbonParticle("flat_ribbon", RibbonParticleData.DESERIALIZER);
    public static final RegistryObject<ParticleType<AdvancedParticleData>> ADV_ORB = ModParticle.registerAdvancedParticle("adv_orb", AdvancedParticleData.DESERIALIZER);
    public static final RegistryObject<ParticleType<AdvancedParticleData>> ADV_WISP = ModParticle.registerAdvancedParticle("adv_wisp", AdvancedParticleData.DESERIALIZER);

    //registry
    private static RegistryObject<ParticleType<AdvancedParticleData>> registerAdvancedParticle(String key, ParticleOptions.Deserializer<AdvancedParticleData> deserializer) {
        return PARTICLE.register(key, () -> new ParticleType<AdvancedParticleData>(false, deserializer) {
            public Codec<AdvancedParticleData> codec() {
                return AdvancedParticleData.CODEC(this);
            }
        });
    }

    private static RegistryObject<ParticleType<RibbonParticleData>> registerRibbonParticle(String key, ParticleOptions.Deserializer<RibbonParticleData> deserializer) {
        return PARTICLE.register(key, () -> new ParticleType<RibbonParticleData>(false, deserializer) {
            public Codec<RibbonParticleData> codec() {
                return RibbonParticleData.CODEC_RIBBON(this);
            }
        });
    }
}
