package com.github.printa.arsenal.client.particle;

import com.github.printa.arsenal.ClientRegistry;
import com.github.printa.arsenal.client.event.ClientEvent;
import com.github.printa.arsenal.client.event.ClientEvents;
import com.github.printa.arsenal.client.particle.util.GenericParticle;
import com.github.printa.arsenal.client.particle.util.GenericParticleData;
import com.github.printa.arsenal.client.render.CMRenderTypes;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.Camera;
import net.minecraft.client.multiplayer.ClientLevel;
import org.jetbrains.annotations.NotNull;

import static com.mojang.blaze3d.platform.GlConst.GL_ONE_MINUS_SRC_ALPHA;
import static com.mojang.blaze3d.platform.GlConst.GL_SRC_ALPHA;

public class Wisp2Particle extends GenericParticle {
    public Wisp2Particle(ClientLevel world, GenericParticleData data, double x, double y, double z, double vx, double vy, double vz) {
        super(world, data, x, y, z, vx, vy, vz);
    }

    @Override
    protected int getLightColor(float partialTicks) {
        return 0xF000F0;
    }

    @Override
    public void render(@NotNull VertexConsumer b, @NotNull Camera info, float pticks) {
        //super.render(ClientEvents.getDelayedRender().getBuffer(CMRenderTypes.GLOWING_PARTICLE), info, pticks);
        super.render(b, info, pticks);
    }
}
