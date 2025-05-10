package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.Arsenal;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Arsenal.MODID);

    public static final RegistryObject<SoundEvent> WEREWOLF_HURT = SOUNDS.register("werewolf_hurt",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Arsenal.MODID,"werewolf_hurt")));

    public static final RegistryObject<SoundEvent> SOUL_KNIGHT_HURT = SOUNDS.register("soul_knight_hurt",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Arsenal.MODID,"soul_knight_hurt")));

    public static final RegistryObject<SoundEvent> HALBERD_ATTACK_1 = SOUNDS.register("halberd_attack_1",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Arsenal.MODID,"halberd_attack_1")));

    public static final RegistryObject<SoundEvent> PHASE_CHANGE = SOUNDS.register("phase_change",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Arsenal.MODID,"phase_change")));

    public static final RegistryObject<SoundEvent> CAST_FIRE = SOUNDS.register("fire_cast",
            () -> SoundEvent.createVariableRangeEvent(new ResourceLocation(Arsenal.MODID,"fire_cast")));

}
