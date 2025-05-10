package com.github.printa.arsenal;

import com.mojang.blaze3d.vertex.DefaultVertexFormat;
import net.minecraft.client.renderer.ShaderInstance;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RegisterShadersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.ServerLifecycleHooks;

import javax.annotation.Nullable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import static com.github.printa.arsenal.Arsenal.MODID;


@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonProxy {

    public void init() {}

    public Player getClientSidePlayer() {
        return null;
    }

    public void clientInit() {}

    public void blockRenderingEntity(UUID id) {}

    public void releaseRenderingEntity(UUID id) {}

    public boolean isFirstPersonPlayer(Entity entity) {
        return false;
    }

    public Object getISTERProperties() {
        return null;
    }

    public Object getArmorRenderProperties() {
        return null;
    }

    public void onEntityStatus(Entity entity, byte updateKind) {}


    public void clearSoundCacheFor(Entity entity) {}

    public float getPartialTicks() {
        return 1.0F;
    }

    public boolean isKeyDown(int keyType) {
        return false;
    }

    public void clearSoundCacheFor(BlockEntity entity) {}

    public void playWorldSound(@Nullable Object soundEmitter, byte type) {}

    public void removeBossBarRender(UUID bossBar) {}

    public class ClientFireTickCache { public static final Map<UUID, Integer> FIRE_TICK_MAP = new HashMap<>();}

    public void setBossBarRender(UUID bossBar, int renderType) {}

    public Level getWorld() {return ServerLifecycleHooks.getCurrentServer().overworld();}
}
