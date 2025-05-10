package com.github.printa.arsenal.server.event;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.message.UpdateItemTagMessage;
import com.github.printa.arsenal.server.registry.*;
import com.github.printa.arsenal.server.item.Charge_Halberd;
import com.github.printa.arsenal.server.item.util.ILeftClick;
import com.github.printa.arsenal.server.message.MessageSwingArm;
import com.github.L_Ender.lionfishapi.server.event.StandOnFluidEvent;
import com.google.common.collect.Multimap;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.player.AttackEntityEvent;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.Collection;
import java.util.Timer;
import java.util.TimerTask;

@Mod.EventBusSubscriber(modid = Arsenal.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ServerEventHandler {


    @SubscribeEvent
    public void onLivingUpdateEvent(LivingEvent.LivingTickEvent event) {

    }

    @SubscribeEvent
    public void StandOnFluidEventEvent(StandOnFluidEvent event) {
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {

    }


    @SubscribeEvent
    public void onLivingDamage(LivingHurtEvent event) {
        LivingEntity target = event.getEntity();
    }

    @SubscribeEvent
    public static void onPlayerAttack(AttackEntityEvent event) {
        Entity target = event.getTarget();
        Player player = (Player) event.getEntity();

        if (event.isCancelable() && event.getEntity().hasEffect(ModEffect.EFFECTSTUN.get())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void BlockHeal(LivingHealEvent event) {
    }

    @SubscribeEvent
    public void onLivingJump(LivingEvent.LivingJumpEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity.getEffect(ModEffect.EFFECTSTUN.get()) != null){
            entity.setDeltaMovement(entity.getDeltaMovement().x(), 0.0D, entity.getDeltaMovement().z());
        }
    }

    @SubscribeEvent
    public void onPlayerLeftClick(PlayerInteractEvent.LeftClickBlock event) {
        Player player = event.getEntity();
        if (event.isCancelable() && player.hasEffect(ModEffect.EFFECTSTUN.get())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void onUseItem(LivingEntityUseItemEvent event) {
        LivingEntity living = event.getEntity();
        if (event.isCancelable() && living.hasEffect(ModEffect.EFFECTSTUN.get())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void onPlaceBlock(BlockEvent.EntityPlaceEvent event) {
        Entity entity = event.getEntity();
        if (entity instanceof LivingEntity living) {
            if (event.isCancelable() && living.hasEffect(ModEffect.EFFECTSTUN.get())) {
                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public void onFillBucket(FillBucketEvent event) {
        LivingEntity living = event.getEntity();
        if (living != null) {
            if (event.isCancelable() && living.hasEffect(ModEffect.EFFECTSTUN.get())) {
                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public void onBreakBlock(BlockEvent.BreakEvent event) {
        if (event.isCancelable() && event.getPlayer().hasEffect(ModEffect.EFFECTSTUN.get())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.RightClickEmpty event) {
        if (event.isCancelable() && event.getEntity().hasEffect(ModEffect.EFFECTSTUN.get())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.LeftClickEmpty event) {
        if (event.isCancelable() && event.getEntity().hasEffect(ModEffect.EFFECTSTUN.get())) {
            event.setCanceled(true);
        }
        boolean flag = false;
        ItemStack leftItem = event.getEntity().getOffhandItem();
        ItemStack rightItem = event.getEntity().getMainHandItem();
        if(!event.getEntity().hasEffect(ModEffect.EFFECTSTUN.get())){
            if (leftItem.getItem() instanceof ILeftClick) {
                ((ILeftClick) leftItem.getItem()).onLeftClick(leftItem, event.getEntity());
                flag = true;
            }
            if (rightItem.getItem() instanceof ILeftClick) {
                ((ILeftClick) rightItem.getItem()).onLeftClick(rightItem, event.getEntity());
                flag = true;
            }
            if (event.getLevel().isClientSide && flag) {
                Arsenal.sendMSGToServer(MessageSwingArm.INSTANCE);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.EntityInteract event) {
        if (event.isCancelable() && event.getEntity().hasEffect(ModEffect.EFFECTSTUN.get())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.RightClickBlock event) {
        if (event.isCancelable() && event.getEntity().hasEffect(ModEffect.EFFECTSTUN.get())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.LeftClickBlock event) {
        if (event.isCancelable() && event.getEntity().hasEffect(ModEffect.EFFECTSTUN.get())) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void onLivingSetTargetEvent(LivingChangeTargetEvent event) {
        if (event.getNewTarget() != null && event.getEntity() instanceof Mob mob) {
            if (mob.getType().is(ModTag.LAVA_MONSTER) && event.getEntity().getLastHurtByMob() != event.getNewTarget()) {
            }
        }
    }

    @SubscribeEvent
    public void onLivingDamage(LivingDamageEvent event) {
        LivingEntity entity = event.getEntity();
        if (entity.getHealth() <= event.getAmount() && entity.hasEffect(ModEffect.EFFECTSTUN.get())) {
            entity.removeEffect(ModEffect.EFFECTSTUN.get());
        }
        if (!event.getEntity().getItemBySlot(EquipmentSlot.LEGS).isEmpty() && event.getSource() != null && event.getSource().getEntity() != null) {
        }
    }

    @SubscribeEvent
    public void onShieldDamage(ShieldBlockEvent event) {
        DamageSource source = event.getDamageSource();
    }
    @SubscribeEvent
    public void DeathEvent(LivingDeathEvent event) {
        DamageSource source = event.getSource();
        if (!event.getEntity().level().isClientSide) {
            if (!source.is(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
                if(tryCursiumPlateRebirth(event.getEntity())){
                    event.setCanceled(true);
                }
            }
        }
    }

    private boolean tryCursiumPlateRebirth(LivingEntity living) {
        ItemStack chestplate = living.getItemBySlot(EquipmentSlot.CHEST);
        return false;
    }


    @SubscribeEvent
    public void onLivingAttack(LivingAttackEvent event) {
    }



    @SubscribeEvent
    public void onLivingAttack(CriticalHitEvent event) {
        ItemStack weapon = event.getEntity().getMainHandItem();
        if (!weapon.isEmpty() && event.getTarget() instanceof LivingEntity) {
        }
        if ((weapon.is(ModItems.CHARGE_HALBERD.get()))) {
            if (Charge_Halberd.isHalberd(weapon)) {
                event.setDamageModifier(2.25F);
            }
        }
    }

    @SubscribeEvent
    public void onLivingFall(LivingFallEvent event) {
    }

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent.RightClickItem event) {
        if (event.isCancelable() && event.getEntity().hasEffect(ModEffect.EFFECTSTUN.get())) {
            event.setCanceled(true);
        }
    }

}


