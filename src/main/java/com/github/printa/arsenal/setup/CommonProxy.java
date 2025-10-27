package com.github.printa.arsenal.setup;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.ServerLifecycleHooks;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.github.printa.arsenal.Arsenal.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {

    public Level getWorld() {
        return ServerLifecycleHooks.getCurrentServer().overworld();
    }

    public Player getClientSidePlayer() {
        return null;
    }

    public void blockRenderingEntity(UUID id) {

    }

    public void releaseRenderingEntity(UUID id) {

    }

    public boolean isFirstPersonPlayer(Entity entity) {
        return false;
    }

    public Object getISTERProperties() {
        return null;
    }

    public Object getArmorRenderProperties() {
        return null;
    }

    public void removeBossBarRender(UUID bossBar) {

    }

    //public class ClientFireTickCache { public static final Map<UUID, Integer> FIRE_TICK_MAP = new HashMap<>();}

    public void setBossBarRender(UUID bossBar, int renderType) {

    }
}
