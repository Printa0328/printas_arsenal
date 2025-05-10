package com.github.printa.arsenal.client.particle.util;

import com.github.printa.arsenal.client.particle.util.network.GenericParticlePacket;
import com.github.printa.arsenal.client.particle.util.network.Networking;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.RegistryObject;

import java.util.Random;

public class ParticleHelper {

    public static void spawnParticles(Level level, ParticleOptions particle, double x, double y, double z, int count, double deltaX, double deltaY, double deltaZ, double speed, boolean force) {
        if (level == null || level.isClientSide()) {
            System.out.println("서버에서만 실행됩니다.");
            return;
        }

        if (!(level instanceof ServerLevel)) {
            System.out.println("레벨이 ServerLevel이 아닙니다.");
            return;
        }

        ServerLevel serverLevel = (ServerLevel) level;
        serverLevel.getServer().getPlayerList().getPlayers().forEach(player -> {
            System.out.println("플레이어 이름: " + player.getName().getString());
            serverLevel.sendParticles(player, particle, force, x, y, z, count, deltaX, deltaY, deltaZ, speed);
        });
    }
}