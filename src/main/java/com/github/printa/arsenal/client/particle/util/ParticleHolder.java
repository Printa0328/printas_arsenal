package com.github.printa.arsenal.client.particle.util;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;

public class ParticleHolder {

    public static void spawnParticles(Level level, ParticleOptions particle, double x, double y, double z, int count, double deltaX, double deltaY, double deltaZ, double speed, boolean force) {
        if (level == null || level.isClientSide()) {
            return;
        }

        if (!(level instanceof ServerLevel)) {
            return;
        }

        ServerLevel serverLevel = (ServerLevel) level;
        serverLevel.getServer().getPlayerList().getPlayers().forEach(player -> {
            serverLevel.sendParticles(player, particle, force, x, y, z, count, deltaX, deltaY, deltaZ, speed);
        });
    }
}