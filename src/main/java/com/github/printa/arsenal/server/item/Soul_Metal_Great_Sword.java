package com.github.printa.arsenal.server.item;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.particle.util.AdvancedParticleHelper;
import com.github.printa.arsenal.client.particle.util.ParticleComponent;
import com.github.printa.arsenal.client.particle.util.RibbonComponent;
import com.github.printa.arsenal.client.particle.util.anim.AnimData;
import com.github.printa.arsenal.server.entity.projectile.Ray_Of_Fire_Visual_Entity;
import com.github.printa.arsenal.server.registry.EnchantmentRegistry;
import com.github.printa.arsenal.server.registry.ModParticle;
import com.github.printa.arsenal.server.registry.ModSounds;
import com.github.printa.arsenal.util.PRAamageTypes;
import com.github.printa.arsenal.client.particle.util.ParticleHelper;
import com.github.printa.arsenal.util.raycast;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import javax.annotation.Nullable;
import java.util.*;

import net.minecraft.nbt.CompoundTag;

import static com.github.printa.arsenal.api.attack.PlayerAnimation.*;
import static com.github.printa.arsenal.api.player.ClientSpellCastHelper.animatePlayerStart;

public class Soul_Metal_Great_Sword extends Item {
    private int repairTick = 0;
    private int fireTick = 0;
    private final Multimap<Attribute, AttributeModifier> defaultAttributes;

    public Soul_Metal_Great_Sword(Item.Properties properties) {
        super(properties);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 8.0D, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", -2.9F, AttributeModifier.Operation.ADDITION));
        this.defaultAttributes = builder.build();
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if (!target.level().isClientSide()) {
            if (target.isOnFire()) {
                fireTick = Math.min(fireTick + 80, 240);
            }
        }
        stack.hurtAndBreak(1, attacker, (entity) -> {
            entity.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        return super.hurtEnemy(stack, target, attacker);
    }

    public boolean mineBlock(ItemStack stack, Level level, BlockState blockState, BlockPos blockpos, LivingEntity livingentity) {
        if ((double)blockState.getDestroySpeed(level, blockpos) != 0.0D) {
            stack.hurtAndBreak(1, livingentity, (p_43385_) -> {
                p_43385_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
            });
        }

        return true;
    }

    @Override
    public void onUseTick(Level level, LivingEntity livingEntity, ItemStack stack, int count) {
        super.onUseTick(level, livingEntity, stack, count);
    }

    public static boolean getFireTexture(ItemStack stack) {
        CompoundTag tag = stack.getOrCreateTag();
        return tag.getBoolean("isFire");
        //return fireTick > 0;
    }

    public void setFire(int fireTick, ItemStack stack){
        CompoundTag tag = stack.getOrCreateTag();

        boolean previous = tag.getBoolean("isFire");
        boolean current = fireTick > 0;

        if (previous != current) {
            tag.putBoolean("isFire", current);
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int slot, boolean selected) {
        //if (!(entity instanceof Player player)) return;
        Player player = (Player) entity;
        CompoundTag tag = stack.getOrCreateTag();

        boolean heldHand = player.getMainHandItem() == stack;

        //tag.putInt("fireTick", fireTick);
        if (!heldHand) {
            fireTick = 0;
        } else {
            if (player.isOnFire()) {
                fireTick = Math.min(fireTick + 80, 240);
            }
            if (!level.isClientSide()) {
                setFire(fireTick, stack);
                if (fireTick > 0) {
                    fireTick--;
                    if (!level.isClientSide) {
                        if (stack.getEnchantmentLevel(EnchantmentRegistry.THERMAL_REPAIR.get()) > 0) {
                            repairTick++;
                            if (repairTick >= 10) {
                                if (stack.isDamaged()) {
                                    repairTick = 0;
                                    stack.setDamageValue(stack.getDamageValue() - 1);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (fireTick > 0) {
            player.playSound(ModSounds.CAST_FIRE.get(), 1.0F, 1.0F);
            if (stack.getEnchantmentLevel(EnchantmentRegistry.EMBER_OF_RAY.get()) > 0) {
                player.getCooldowns().addCooldown(this, 90 - 15 * stack.getEnchantmentLevel(EnchantmentRegistry.EMBER_OF_RAY.get()));
            } else {
                player.getCooldowns().addCooldown(this, 90);
            }
            var hitResult = raycast.raycastForEntity(level, player, getRange(1, player), true, .15f);
            level.addFreshEntity(new Ray_Of_Fire_Visual_Entity(level, player.getEyePosition(), hitResult.getLocation(), player));
            if (hitResult.getType() == HitResult.Type.ENTITY) {
                Entity target = ((EntityHitResult) hitResult).getEntity();
                LivingEntity livingEntity = (LivingEntity) target;
                if (!target.fireImmune()) {
                    fireTick = Math.min(fireTick + 80, 240);
                }
                target.setSecondsOnFire(3);
                target.hurt(PRAamageTypes.fireDamage(livingEntity, player), (float) player.getAttributeValue(Attributes.ATTACK_DAMAGE) * 1.5f);
                ParticleHelper.spawnParticles(level, ParticleTypes.SOUL_FIRE_FLAME, hitResult.getLocation().x, target.getY(), hitResult.getLocation().z, 4, 0, 0, 0, 0.1, true);
            } else if (hitResult.getType() == HitResult.Type.BLOCK) {
                ParticleHelper.spawnParticles(level, ParticleTypes.SOUL_FIRE_FLAME, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 4, 0, 0, 0, 0.1, true);
            }
            ParticleHelper.spawnParticles(level, ParticleTypes.SOUL_FIRE_FLAME, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 50, 0, 0, 0, 0.05, true);
            if (level.isClientSide()) {
                LASER_CAST.getForPlayer().ifPresent(resourceLocation -> animatePlayerStart(player, resourceLocation));
            }
            stack.hurtAndBreak(1, player, (p_43388_) -> {
                p_43388_.broadcastBreakEvent(player.getUsedItemHand());
            });
            return InteractionResultHolder.consume(stack);
        }
        return InteractionResultHolder.fail(stack);
    }

    public boolean canAttackBlock(BlockState p_43409_, Level p_43410_, BlockPos p_43411_, Player p_43412_) {
        return !p_43412_.isCreative();
    }

    public static float getRange(int level, LivingEntity caster) {
        return 8;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return true;
    }

    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
        return equipmentSlot == EquipmentSlot.MAINHAND ? this.defaultAttributes : super.getDefaultAttributeModifiers(equipmentSlot);
    }

    @Override
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        return super.canApplyAtEnchantingTable(stack, enchantment) || enchantment.category == EnchantmentCategory.WEAPON;
    }

    @Override
    public void initializeClient(java.util.function.Consumer<IClientItemExtensions> consumer) {
        consumer.accept((IClientItemExtensions) Arsenal.PROXY.getISTERProperties());
    }

    public int getEnchantmentValue() {
        return 16;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
        tooltip.add(Component.translatable("item.arsenal.soul_metal_great_sword.desc").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("item.arsenal.soul_metal_great_sword2.desc").withStyle(ChatFormatting.GRAY));
    }
}

