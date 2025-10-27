package com.github.printa.arsenal.server.entity.etc;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.message.MessageUpdateBossBar;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.BossEvent;

public class BossInfoServer extends ServerBossEvent {

    private int renderType;

    public BossInfoServer(Component component, BossEvent.BossBarColor bossBarColor, boolean dark, int renderType) {
        super(component, bossBarColor, BossBarOverlay.PROGRESS);
        this.setDarkenScreen(dark);
        this.renderType = renderType;
    }


    public void setRenderType(int renderType) {
        if (renderType != this.renderType) {
            this.renderType = renderType;
            Arsenal.sendMSGToAll(new MessageUpdateBossBar(this.getId(), renderType));
        }
    }

    public int getRenderType() {
        return this.renderType;
    }


    public void addPlayer(ServerPlayer serverPlayer) {
        Arsenal.sendNonLocal(new MessageUpdateBossBar(this.getId(), renderType), serverPlayer);
        super.addPlayer(serverPlayer);
    }

    public void removePlayer(ServerPlayer serverPlayer) {
        Arsenal.sendNonLocal(new MessageUpdateBossBar(this.getId(), -1), serverPlayer);
        super.removePlayer(serverPlayer);
    }

}
