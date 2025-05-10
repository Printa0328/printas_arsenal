package com.github.printa.arsenal.client.event;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.ClientProxy;
import com.github.printa.arsenal.client.gui.CustomBossBar;
import com.github.printa.arsenal.client.render.PRAItemStackRenderer;
import com.github.printa.arsenal.server.config.CMConfig;
import com.github.printa.arsenal.server.entity.effect.ScreenShake_Entity;
import com.github.printa.arsenal.server.registry.ModEffect;
import com.github.L_Ender.lionfishapi.client.event.EventGetFluidRenderType;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.renderer.block.LiquidBlockRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.material.FogType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.*;
import net.minecraftforge.client.gui.overlay.ForgeGui;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.joml.Matrix3f;
import org.joml.Matrix4f;

import java.util.Random;

@Mod.EventBusSubscriber(modid = Arsenal.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.FORGE)
@OnlyIn(Dist.CLIENT)
public class ClientEvent {
    public static final ResourceLocation FLAME_STRIKE = new ResourceLocation(Arsenal.MODID,"textures/entity/soul_flame_strike_sigil.png");
    private boolean previousLavaVision = false;
    private LiquidBlockRenderer previousFluidRenderer;
    private static final ResourceLocation SANDSTORM_ICON = new ResourceLocation(Arsenal.MODID,"textures/gui/sandstorm_icons.png");
    private static final ResourceLocation EFFECT_HEART = new ResourceLocation(Arsenal.MODID,"textures/gui/effect_heart.png");
    private static final ResourceLocation SANDSTORM_TEXTURE = new ResourceLocation(Arsenal.MODID,"textures/entity/ancient_remnant/sandstorm.png");
    private final Random random = new Random();
    private int lastHealth;
    private int displayHealth;
    private long lastHealthTime;
    private long healthBlinkTime;

    @SubscribeEvent
    public void onCameraSetup(ViewportEvent.ComputeCameraAngles event) {
        Player player = Minecraft.getInstance().player;
        float delta = Minecraft.getInstance().getFrameTime();
        float ticksExistedDelta = player.tickCount + delta;
        if (CMConfig.ScreenShake && !Minecraft.getInstance().isPaused()) {
            if (player != null) {
                float shakeAmplitude = 0;
                for (ScreenShake_Entity ScreenShake : player.level().getEntitiesOfClass(ScreenShake_Entity.class, player.getBoundingBox().inflate(20, 20, 20))) {
                    if (ScreenShake.distanceTo(player) < ScreenShake.getRadius()) {
                        shakeAmplitude += ScreenShake.getShakeAmount(player, delta);
                    }
                }
                if (shakeAmplitude > 1.0f) shakeAmplitude = 1.0f;
                event.setPitch((float) (event.getPitch() + shakeAmplitude * Math.cos(ticksExistedDelta * 3 + 2) * 25));
                event.setYaw((float) (event.getYaw() + shakeAmplitude * Math.cos(ticksExistedDelta * 5 + 1) * 25));
                event.setRoll((float) (event.getRoll() + shakeAmplitude * Math.cos(ticksExistedDelta * 4) * 25));
            }

            if (Minecraft.getInstance().player.getEffect(ModEffect.EFFECTSTUN.get()) != null) {
                MobEffectInstance effectinstance1 = Minecraft.getInstance().player.getEffect(ModEffect.EFFECTSTUN.get());
                float shakeAmplitude = (float) ((1 + effectinstance1.getAmplifier()) * 0.01);
                event.setPitch((float) (event.getPitch() + shakeAmplitude * Math.cos(ticksExistedDelta * 3 + 2) * 25));
                event.setYaw((float) (event.getYaw() + shakeAmplitude * Math.cos(ticksExistedDelta * 5 + 1) * 25));
                event.setRoll((float) (event.getRoll() + shakeAmplitude * Math.cos(ticksExistedDelta * 4) * 25));
            }
        }

    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onFogDensity(ViewportEvent.RenderFog event) {
        FogType fogType = event.getCamera().getFluidInCamera();
        ItemStack itemstack = Minecraft.getInstance().player.getInventory().getArmor(3);

    }

    @SubscribeEvent
    public void MovementInput(MovementInputUpdateEvent event) {
        Player player = Minecraft.getInstance().player;
        if (player != null) {
        }
    }

    @SubscribeEvent
    public void onPreRenderHUD(RenderGuiOverlayEvent.Pre event) {
        Player player = Minecraft.getInstance().player;
        if (player != null) {
            Minecraft mc = Minecraft.getInstance();
            ForgeGui gui = (ForgeGui)mc.gui;
            if (player.isPassenger()) {
            }
        }
    }

    @SubscribeEvent
    public void onPostRenderHUD(RenderGuiOverlayEvent.Post event) {
        Player player = Minecraft.getInstance().player;
        if (player != null) {
            Minecraft mc = Minecraft.getInstance();
            ForgeGui gui = (ForgeGui)mc.gui;
            if (event.getOverlay() == VanillaGuiOverlay.AIR_LEVEL.type() && !mc.options.hideGui && gui.shouldDrawSurvivalElements()) {
                renderSandstormOverlay(event);
            }
        }
    }


    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onPreRenderEntity(RenderLivingEvent.Pre event) {
        LivingEntity player = event.getEntity();
        if (ClientProxy.blockedEntityRenders.contains(event.getEntity().getUUID())) {
            if (!Arsenal.PROXY.isFirstPersonPlayer(event.getEntity())) {
                MinecraftForge.EVENT_BUS.post(new RenderLivingEvent.Post(event.getEntity(), event.getRenderer(), event.getPartialTick(), event.getPoseStack(), event.getMultiBufferSource(), event.getPackedLight()));
                event.setCanceled(true);
            }
            ClientProxy.blockedEntityRenders.remove(event.getEntity().getUUID());
        }

    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onPreRenderPlayer(RenderPlayerEvent.Pre event) {
        Player player = event.getEntity();
    }

    public void drawVertex(Matrix4f p_229039_1_, Matrix3f p_229039_2_, VertexConsumer p_229039_3_, int p_229039_4_, int p_229039_5_, int p_229039_6_, float p_229039_7_, float p_229039_8_, int p_229039_9_, int p_229039_10_, int p_229039_11_, int p_229039_12_) {
        p_229039_3_.vertex(p_229039_1_, (float) p_229039_4_, (float) p_229039_5_, (float) p_229039_6_).color(255, 255, 255, 255).uv(p_229039_7_, p_229039_8_).overlayCoords(OverlayTexture.NO_OVERLAY).uv2(p_229039_12_).normal(p_229039_2_, (float) p_229039_9_, (float) p_229039_11_, (float) p_229039_10_).endVertex();
    }

    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        if (event.phase == TickEvent.Phase.START) {
            PRAItemStackRenderer.incrementTick();
        }

    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onRenderWorldLastEvent(RenderLevelStageEvent event) {
        if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY) {
            if (!CMConfig.shadersCompat) {
                ItemStack itemstack = Minecraft.getInstance().player.getInventory().getArmor(3);
                {
                }
            }
        }
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onGetFluidRenderType(EventGetFluidRenderType event) {
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public void onPoseHand(EventPosePlayerHand event) {
        LivingEntity player = (LivingEntity) event.getEntityIn();
    }

    private void CustomHealth(RenderGuiOverlayEvent.Pre event,int back){
        Player player = Minecraft.getInstance().player;
        Minecraft mc = Minecraft.getInstance();
        ForgeGui gui = (ForgeGui)mc.gui;
        GuiGraphics stack = event.getGuiGraphics();
        gui.setupOverlayRenderState(true, false);
        int width = event.getWindow().getGuiScaledWidth();
        int height = event.getWindow().getGuiScaledHeight();
        event.setCanceled(true);
        RenderSystem.setShaderTexture(0, EFFECT_HEART);
        RenderSystem.enableBlend();
        int health = Mth.ceil(player.getHealth());
        int tickCount = gui.getGuiTicks();
        boolean highlight = this.healthBlinkTime > (long) tickCount && (this.healthBlinkTime - (long) tickCount) / 3L % 2L == 1L;
        if (health < this.lastHealth && player.invulnerableTime > 0) {
            this.lastHealthTime = Util.getMillis();
            this.healthBlinkTime = tickCount + 20;
        } else if (health > this.lastHealth && player.invulnerableTime > 0) {
            this.lastHealthTime = Util.getMillis();
            this.healthBlinkTime = tickCount + 10;
        }

        if (Util.getMillis() - this.lastHealthTime > 1000L) {
            this.lastHealth = health;
            this.displayHealth = health;
            this.lastHealthTime = Util.getMillis();
        }

        this.lastHealth = health;
        int healthLast = this.displayHealth;
        AttributeInstance maxHealth = player.getAttribute(Attributes.MAX_HEALTH);
        float healthMax = (float) maxHealth.getValue();
        int absorbtion = Mth.ceil(player.getAbsorptionAmount());
        int healthRows = Mth.ceil((healthMax + (float) absorbtion) / 2.0F / 10.0F);
        int rowHeight = Math.max(10 - (healthRows - 2), 3);
        this.random.setSeed(tickCount * 312871L);
        int left = width / 2 - 91;
        int top = height - gui.leftHeight;
        gui.leftHeight += healthRows * rowHeight;
        if (rowHeight != 10) {
            gui.leftHeight += 10 - rowHeight;
        }

        int regen = -1;
        if (player.hasEffect(MobEffects.REGENERATION)) {
            regen = tickCount % Mth.ceil(healthMax + 5.0F);
        }

        int TOP = player.level().getLevelData().isHardcore() ? 9 : 0;
        int BACKGROUND = highlight ? back : 16;
        int margin = 34;
        float absorbtionRemaining = (float) absorbtion;

        for (int i = Mth.ceil((healthMax + (float) absorbtion) / 2.0F) - 1; i >= 0; --i) {
            int row = Mth.ceil((float) (i + 1) / 10.0F) - 1;
            int x = left + i % 10 * 8;
            int y = top - row * rowHeight;
            if (health <= 4) {
                y += this.random.nextInt(2);
            }

            if (i == regen) {
                y -= 2;
            }

            stack.blit(EFFECT_HEART, x, y, BACKGROUND, TOP, 9, 9);
            if (highlight) {
                if (i * 2 + 1 < healthLast) {
                    stack.blit(EFFECT_HEART, x, y, margin, TOP, 9, 9);
                } else if (i * 2 + 1 == healthLast) {
                    stack.blit(EFFECT_HEART, x, y, margin + 9, TOP, 9, 9);
                }
            }

            if (absorbtionRemaining > 0.0F) {
                if (absorbtionRemaining == (float) absorbtion && (float) absorbtion % 2.0F == 1.0F) {
                    stack.blit(EFFECT_HEART, x, y, margin + 9, TOP, 9, 9);
                    --absorbtionRemaining;
                } else {
                    stack.blit(EFFECT_HEART, x, y, margin, TOP, 9, 9);
                    absorbtionRemaining -= 2.0F;
                }
            } else if (i * 2 + 1 < health) {
                stack.blit(EFFECT_HEART, x, y, margin, TOP, 9, 9);
            } else if (i * 2 + 1 == health) {
                stack.blit(EFFECT_HEART, x, y, margin + 9, TOP, 9, 9);
            }
        }

        RenderSystem.disableBlend();
        RenderSystem.setShaderTexture(0, EFFECT_HEART);
    }

    private void renderSandstormOverlay(RenderGuiOverlayEvent.Post event) {
        Minecraft minecraft = Minecraft.getInstance();
        Minecraft mc = Minecraft.getInstance();
        ForgeGui gui = (ForgeGui) mc.gui;
        GuiGraphics stack = event.getGuiGraphics();
        gui.setupOverlayRenderState(true, false);
        int width = event.getWindow().getGuiScaledWidth();
        int height = event.getWindow().getGuiScaledHeight();
       
    }

    @SubscribeEvent(priority = EventPriority.HIGHEST)
    public void renderBossOverlay(CustomizeGuiOverlayEvent.BossEventProgress event){
        if(CMConfig.custombossbar) {
            if (ClientProxy.bossBarRenderTypes.containsKey(event.getBossEvent().getId())) {
                int renderTypeFor = ClientProxy.bossBarRenderTypes.get(event.getBossEvent().getId());

                CustomBossBar customBossBar = CustomBossBar.customBossBars.getOrDefault(renderTypeFor, null);
                if (customBossBar == null) return;

                event.setCanceled(true);
                customBossBar.renderBossBar(event);
            }
        }
    }
}
