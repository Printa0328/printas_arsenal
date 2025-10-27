package com.github.printa.arsenal.client.event;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.render.ItemStackRenderer;
import com.github.printa.arsenal.client.render.RenderUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferBuilder;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.*;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.LogicalSide;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import org.joml.Matrix4f;
import org.lwjgl.opengl.GL11;

import java.util.HashMap;
import java.util.Map;

@Mod.EventBusSubscriber(modid = Arsenal.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientEvent {

    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            ItemStackRenderer.increaseTick();
        }
    }
    @OnlyIn(Dist.CLIENT)
    static MultiBufferSource.BufferSource DELAYED_RENDER = null;

    @OnlyIn(Dist.CLIENT)
    public static MultiBufferSource.BufferSource getDelayedRender() {
        if (DELAYED_RENDER == null) {
            Map<RenderType, BufferBuilder> buffers = new HashMap<>();
            for (RenderType type : new RenderType[]{
                    RenderUtil.GLOWING_PARTICLE}) {
                buffers.put(type, new BufferBuilder(ModList.get().isLoaded("rubidium") ? 262144 : type.bufferSize()));
            }
            DELAYED_RENDER = MultiBufferSource.immediateWithBuffers(buffers, new BufferBuilder(ModList.get().isLoaded("rubidium") ? 262144 : 256));
        }
        return DELAYED_RENDER;
    }

    @OnlyIn(Dist.CLIENT)
    static float clientTicks = 0;

    @OnlyIn(Dist.CLIENT)
    public static Matrix4f particleMVMatrix = null;

    @OnlyIn(Dist.CLIENT)
    public static void onRenderLast() {
        PoseStack viewStack = RenderSystem.getModelViewStack();
        viewStack.pushPose();
        viewStack.setIdentity();
        if (particleMVMatrix != null) viewStack.mulPoseMatrix(particleMVMatrix);
        RenderSystem.applyModelViewMatrix();
        RenderSystem.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        RenderSystem.blendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE);
        getDelayedRender().endBatch(RenderUtil.GLOWING_PARTICLE);
        viewStack.popPose();
        RenderSystem.applyModelViewMatrix();
    }

    @SubscribeEvent(priority = EventPriority.LOWEST)
    public static void onRenderStages(final RenderLevelStageEvent event) {
        if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_LEVEL) onRenderLast();
        if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_TRIPWIRE_BLOCKS)
            clientTicks += event.getPartialTick();
    }

    @OnlyIn(Dist.CLIENT)
    public static float getClientTicks() {
        return clientTicks;
    }

    public static int jumpTicks = 0;
    public static boolean wasJumping = false;

    @SubscribeEvent
    public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.side != LogicalSide.CLIENT) return;
        Player p = event.player;
        if (p instanceof LocalPlayer lp) {
            if (p.onGround()) jumpTicks = 0;
            wasJumping = p.onGround() || lp.input.jumping;
        }
    }

}
