package com.github.printa.arsenal.server.registry;


import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.potion.*;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEffect {

    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS,
            Arsenal.MODID);

    public static final RegistryObject<MobEffect> EFFECTSTUN = EFFECTS.register("stun", EffectStun::new);
}
