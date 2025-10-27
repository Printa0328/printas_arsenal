package com.github.printa.arsenal.server.item;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.api.player.KeyframeAnimationHelper;
import com.github.printa.arsenal.server.entity.projectile.Ray_Of_Fire_Visual_Entity;
import com.github.printa.arsenal.server.registries.EnchantmentRegistry;
import com.github.printa.arsenal.server.registries.SoundRegistry;
import com.github.printa.arsenal.util.PRAamageTypes;
import com.github.printa.arsenal.client.particle.util.ParticleHolder;
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
import org.jetbrains.annotations.NotNull;

import static com.github.printa.arsenal.api.attack.PlayerAnimation.*;

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

    private boolean attackStrengthScale(Player player){
        return player.getAttackStrengthScale(0.0F) > 0.85F;
    }

    @Override
    public boolean hurtEnemy(@NotNull ItemStack stack, LivingEntity target, @NotNull LivingEntity attacker) {
        if (!target.level().isClientSide()) {
            if(attacker instanceof Player player) {
                if (attackStrengthScale(player)) {
                    if (target.isOnFire()) {
                        fireTick = Math.min(fireTick + 80, 240);
                    }
                }
            }
        }
        stack.hurtAndBreak(1, attacker, (entity) -> entity.broadcastBreakEvent(EquipmentSlot.MAINHAND));
        return super.hurtEnemy(stack, target, attacker);
    }

    public boolean mineBlock(@NotNull ItemStack stack, @NotNull Level level, BlockState state, @NotNull BlockPos pos, @NotNull LivingEntity entity) {
        if ((double)state.getDestroySpeed(level, pos) != 0.0D) {
            stack.hurtAndBreak(1, entity, ($$0) -> {
                $$0.broadcastBreakEvent(EquipmentSlot.MAINHAND);
            });
        }

        return true;
    }

    @Override
    public void onUseTick(@NotNull Level level, @NotNull LivingEntity entity, @NotNull ItemStack stack, int count) {
        super.onUseTick(level, entity, stack, count);
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
    public void inventoryTick(ItemStack stack, @NotNull Level level, @NotNull Entity entity, int slot, boolean selected) {
        //if (!(entity instanceof Player player)) return;
        Player player = (Player) entity;
        CompoundTag tag = stack.getOrCreateTag();

        boolean heldHand = player.getMainHandItem() == stack;

        //tag.putInt("fireTick", fireTick);
        /**if (!heldHand) {
            fireTick = 0;
        } else {*/
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
        /*}*/
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level level, Player player, @NotNull InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);

        if (fireTick > 0) {
            player.playSound(SoundRegistry.CAST_FIRE.get(), 1.0F, 1.0F);
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
                ParticleHolder.spawnParticles(level, ParticleTypes.SOUL_FIRE_FLAME, hitResult.getLocation().x, target.getY(), hitResult.getLocation().z, 4, 0, 0, 0, 0.1, true);
            } else if (hitResult.getType() == HitResult.Type.BLOCK) {
                ParticleHolder.spawnParticles(level, ParticleTypes.SOUL_FIRE_FLAME, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 4, 0, 0, 0, 0.1, true);
            }
            ParticleHolder.spawnParticles(level, ParticleTypes.SOUL_FIRE_FLAME, hitResult.getLocation().x, hitResult.getLocation().y, hitResult.getLocation().z, 50, 0, 0, 0, 0.05, true);
            if (level.isClientSide()) {
                //LASER_CAST.getForPlayer().ifPresent(resourceLocation -> animatePlayerStart(player, resourceLocation));
                LASER_CAST.getForPlayer().ifPresent(firstPersonAnim ->
                        LASER_CAST.getForPlayer().ifPresent(thirdPersonAnim ->
                                KeyframeAnimationHelper.animatePlayerStart(player, firstPersonAnim, thirdPersonAnim)
                        )
                );
            }
            stack.hurtAndBreak(1, player, (sound) -> {
                sound.broadcastBreakEvent(player.getUsedItemHand());
            });
            return InteractionResultHolder.consume(stack);
        }
        return InteractionResultHolder.fail(stack);
    }

    public boolean canAttackBlock(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pose, Player player) {
        return !player.isCreative();
    }

    public static float getRange(int level, LivingEntity caster) {
        return 8;
    }

    @Override
    public boolean isEnchantable(@NotNull ItemStack stack) {
        return true;
    }

    public @NotNull Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(@NotNull EquipmentSlot equipmentslot) {
        return equipmentslot == EquipmentSlot.MAINHAND ? this.defaultAttributes : super.getDefaultAttributeModifiers(equipmentslot);
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
    public void appendHoverText(@NotNull ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, @NotNull TooltipFlag flag) {
        tooltip.add(Component.translatable("item.arsenal.soul_metal_great_sword.desc").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("item.arsenal.soul_metal_great_sword2.desc").withStyle(ChatFormatting.GRAY));
    }
}

