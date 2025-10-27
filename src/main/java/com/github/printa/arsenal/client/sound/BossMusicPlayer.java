package com.github.printa.arsenal.client.sound;

import com.github.printa.arsenal.server.config.Config;
import com.github.printa.arsenal.server.entity.etc.Animation_Monsters;
import net.minecraft.client.Minecraft;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;

public class BossMusicPlayer {
    public static BossMusicSound bossMusic;

    public static void playBossMusic(Animation_Monsters entity) {
        //if (!Config.BossMusic) return;

        SoundEvent soundEvent = entity.getBossMusic();
        if (soundEvent != null && entity.isAlive()) {
            Player player = Minecraft.getInstance().player;
            if (bossMusic != null) {
                float f2 = Minecraft.getInstance().options.getSoundSourceVolume(SoundSource.RECORDS);
                if (f2 <= 0) {
                    bossMusic = null;
                }
                else if (bossMusic.getBoss() == entity && !entity.canPlayerHearMusic(player)) {
                    bossMusic.setBoss(null);
                }
                else if (bossMusic.getBoss() == null && bossMusic.getSoundEvent() == soundEvent) {
                    bossMusic.setBoss(entity);
                }
            } else {
                if (entity.canPlayerHearMusic(player)) {
                    bossMusic = new BossMusicSound(entity.getBossMusic(), entity);
                }
            }
            if (bossMusic != null && !Minecraft.getInstance().getSoundManager().isActive(bossMusic)) {
                Minecraft.getInstance().getSoundManager().play(bossMusic);
            }
        }
    }

    public static void stopBossMusic(Animation_Monsters entity) {
        //if (!Config.BossMusic) return;

        if (bossMusic != null && bossMusic.getBoss() == entity)
            bossMusic.setBoss(null);
    }
}
