package com.github.printa.arsenal.setup;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Soul_knight_Entity;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Werewolf_Entity;
import com.github.printa.arsenal.server.registries.EntityRegistry;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import static com.github.printa.arsenal.server.registries.EntityRegistry.SOUL_KNIGHT;

@Mod.EventBusSubscriber(modid = Arsenal.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonSetup {

    @SubscribeEvent
    public static void onAttributeCreate(EntityAttributeCreationEvent event) {
        event.put(EntityRegistry.SOUL_KNIGHT.get(), Soul_knight_Entity.createAttributes().build());
        event.put(EntityRegistry.WEREWOLF.get(), Werewolf_Entity.createAttributes().build());
    }

    @SubscribeEvent
    public static void spawnPlacements(SpawnPlacementRegisterEvent event) {
        // 아이언 스펠
        //event.register(SOUL_KNIGHT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (type, serverLevelAccessor, spawnType, blockPos, random) -> Utils.checkMonsterSpawnRules(serverLevelAccessor, spawnType, blockPos, random), SpawnPlacementRegisterEvent.Operation.OR);

        // 원본 코드
        SpawnPlacements.register(SOUL_KNIGHT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Soul_knight_Entity::canSoulKnightSpawnRules);

        // 아래 코드 수정좀
        //event.register(ModEntities.SOUL_KNIGHT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Soul_knight_Entity::canSoulKnightSpawnRules,SpawnPlacementRegisterEvent.Operation.OR);
    }
}