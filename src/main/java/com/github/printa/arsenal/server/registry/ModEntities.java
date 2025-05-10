package com.github.printa.arsenal.server.registry;


import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Werewolf_Entity;
import com.github.printa.arsenal.server.entity.effect.Cm_Falling_Block_Entity;
import com.github.printa.arsenal.server.entity.effect.ScreenShake_Entity;
import com.github.printa.arsenal.server.entity.projectile.Fire_Ball_Entity;
import com.github.printa.arsenal.server.entity.projectile.Ray_Of_Fire_Visual_Entity;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Soul_knight_Entity;
import com.google.common.base.Predicates;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Predicate;

@Mod.EventBusSubscriber(modid = Arsenal.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPE = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Arsenal.MODID);

    public static final RegistryObject<EntityType<Ray_Of_Fire_Visual_Entity>> RAY_OF_FIRE_VISUAL_ENTITY = ENTITY_TYPE.register("ray_of_fire", () -> EntityType.Builder.<Ray_Of_Fire_Visual_Entity>of(Ray_Of_Fire_Visual_Entity::new, MobCategory.MISC)
            .sized(1F, 1F)
            .clientTrackingRange(64)
            .build(Arsenal.MODID + ":ray_of_fire"));

    public static final RegistryObject<EntityType<Fire_Ball_Entity>> FIRE_BALL = ENTITY_TYPE.register("fire_ball", () -> EntityType.Builder.<Fire_Ball_Entity>of(Fire_Ball_Entity::new, MobCategory.MISC)
            .sized(0.5F, 0.5F)
            .build(Arsenal.MODID + ":fire_ball"));

    public static final RegistryObject<EntityType<Soul_knight_Entity>> SOUL_KNIGHT = ENTITY_TYPE.register("soul_knight", () -> EntityType.Builder.of(Soul_knight_Entity::new, MobCategory.MONSTER)
            .sized(2.0F, 2.8F)
            .fireImmune()
            .clientTrackingRange(8)
            .build(Arsenal.MODID + ":soul_knight"));

    public static final RegistryObject<EntityType<Werewolf_Entity>> WEREWOLF = ENTITY_TYPE.register("werewolf", () -> EntityType.Builder.of(Werewolf_Entity::new, MobCategory.MONSTER)
            .sized(1.5F, 4.0F)
            .clientTrackingRange(8)
            .build(Arsenal.MODID + ":werewolf"));

    public static final RegistryObject<EntityType<Cm_Falling_Block_Entity>> CM_FALLING_BLOCK = ENTITY_TYPE.register("cm_falling_block", () -> EntityType.Builder.<Cm_Falling_Block_Entity>of(Cm_Falling_Block_Entity::new, MobCategory.MISC)
            .sized(0.98F, 0.98F)
            .clientTrackingRange(10)
            .updateInterval(20)
            .build(Arsenal.MODID + ":cm_falling_block"));

    public static final RegistryObject<EntityType<ScreenShake_Entity>> SCREEN_SHAKE = ENTITY_TYPE.register("screen_shake", () -> EntityType.Builder.<ScreenShake_Entity>of(ScreenShake_Entity::new, MobCategory.MISC)
            .noSummon()
            .sized(0.0f, 0.0f)
            .setUpdateInterval(Integer.MAX_VALUE)
            .build(Arsenal.MODID + ":screen_shake"));

    public static Predicate<LivingEntity> buildPredicateFromTag(TagKey<EntityType<?>> entityTag){
        if(entityTag == null){
            return Predicates.alwaysFalse();
        }else{
            return (com.google.common.base.Predicate<LivingEntity>) e -> e.isAlive() && e.getType().is(entityTag);
        }
    }

    public static boolean rollSpawn(int rolls, RandomSource random, MobSpawnType reason){
        if(reason == MobSpawnType.SPAWNER){
            return true;
        }else{
            return rolls <= 0 || random.nextInt(rolls) == 0;
        }
    }

    @SubscribeEvent
    public static void initializeAttributes(EntityAttributeCreationEvent event) {
        event.put(SOUL_KNIGHT.get(), Soul_knight_Entity.soul_knight().build());
        event.put(WEREWOLF.get(), Werewolf_Entity.werewolf().build());
        SpawnPlacements.register(SOUL_KNIGHT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Soul_knight_Entity::canSoulKnightspawnSpawnRules);
    }
}

