package com.github.printa.arsenal.server.registries;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Werewolf_Entity;
import com.github.printa.arsenal.server.entity.effect.FallingBlock_Entity;
import com.github.printa.arsenal.server.entity.effect.ScreenShake_Entity;
import com.github.printa.arsenal.server.entity.projectile.Fire_Ball_Entity;
import com.github.printa.arsenal.server.entity.projectile.Ray_Of_Fire_Visual_Entity;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Soul_knight_Entity;
import com.google.common.base.Predicates;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Predicate;

public class EntityRegistry {
    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Arsenal.MODID);

    public static void register(IEventBus eventBus) {
        ENTITIES.register(eventBus);
    }
    public static final RegistryObject<EntityType<Ray_Of_Fire_Visual_Entity>> RAY_OF_FIRE_VISUAL_ENTITY = ENTITIES.register("ray_of_fire", () -> EntityType.Builder.<Ray_Of_Fire_Visual_Entity>of(Ray_Of_Fire_Visual_Entity::new, MobCategory.MISC)
            .sized(1F, 1F)
            .clientTrackingRange(64)
            .build(ResourceLocation.fromNamespaceAndPath(Arsenal.MODID, "ray_of_fire").toString()));

    public static final RegistryObject<EntityType<Fire_Ball_Entity>> FIRE_BALL = ENTITIES.register("fire_ball", () -> EntityType.Builder.<Fire_Ball_Entity>of(Fire_Ball_Entity::new, MobCategory.MISC)
            .sized(0.5F, 0.5F)
            .build(ResourceLocation.fromNamespaceAndPath(Arsenal.MODID, "fire_ball").toString()));

    public static final RegistryObject<EntityType<Soul_knight_Entity>> SOUL_KNIGHT = ENTITIES.register("soul_knight", () -> EntityType.Builder.<Soul_knight_Entity>of(Soul_knight_Entity::new, MobCategory.MONSTER)
            .sized(2.0F, 2.8F)
            .fireImmune()
            .clientTrackingRange(8)
            .build(ResourceLocation.fromNamespaceAndPath(Arsenal.MODID, "soul_knight").toString()));

    public static final RegistryObject<EntityType<Werewolf_Entity>> WEREWOLF = ENTITIES.register("werewolf", () -> EntityType.Builder.<Werewolf_Entity>of(Werewolf_Entity::new, MobCategory.MONSTER)
            .sized(1.5F, 4.0F)
            .clientTrackingRange(8)
            .build(ResourceLocation.fromNamespaceAndPath(Arsenal.MODID, "werewolf").toString()));

    public static final RegistryObject<EntityType<FallingBlock_Entity>> FALLING_BLOCK = ENTITIES.register("falling_block", () -> EntityType.Builder.<FallingBlock_Entity>of(FallingBlock_Entity::new, MobCategory.MISC)
            .sized(0.98F, 0.98F)
            .clientTrackingRange(10)
            .updateInterval(20)
            .build(ResourceLocation.fromNamespaceAndPath(Arsenal.MODID, "falling_block").toString()));

    public static final RegistryObject<EntityType<ScreenShake_Entity>> SCREEN_SHAKE = ENTITIES.register("screen_shake", () -> EntityType.Builder.<ScreenShake_Entity>of(ScreenShake_Entity::new, MobCategory.MISC)
            .noSummon()
            .sized(0.0f, 0.0f)
            .setUpdateInterval(Integer.MAX_VALUE)
            .build(ResourceLocation.fromNamespaceAndPath(Arsenal.MODID, "screen_shake").toString()));

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
}

