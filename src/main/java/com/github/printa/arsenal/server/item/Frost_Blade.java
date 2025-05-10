package com.github.printa.arsenal.server.item;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.particle.util.AdvancedParticleHelper;
import com.github.printa.arsenal.client.particle.util.ParticleComponent;
import com.github.printa.arsenal.client.particle.util.anim.AnimData;
import com.github.printa.arsenal.server.entity.projectile.Fire_Ball_Entity;
import com.github.printa.arsenal.server.entity.projectile.SpellProjectileEntity;
import com.github.printa.arsenal.server.registry.ModEntities;
import com.github.printa.arsenal.server.registry.ModParticle;
import com.github.printa.arsenal.server.registry.ModSounds;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Optional;
import java.util.Random;

public class Frost_Blade extends Item {
    private final Multimap<Attribute, AttributeModifier> defaultAttributes;
    private static final double OFFSET = 1.5;
    static final Random random = new Random();

    public Frost_Blade(Item.Properties properties) {
        super(properties);
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 8.0D, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", -2.9F, AttributeModifier.Operation.ADDITION));
        this.defaultAttributes = builder.build();
    }

    private Entity getPlayerLookTarget(Level level, LivingEntity living) {
        Entity pointedEntity = null;
        double range = 40.0D;
        Vec3 srcVec = living.getEyePosition();
        Vec3 lookVec = living.getViewVector(1.0F);
        Vec3 destVec = srcVec.add(lookVec.x() * range, lookVec.y() * range, lookVec.z() * range);
        float var9 = 2.0F;
        List<Entity> possibleList = level.getEntities(living, living.getBoundingBox().expandTowards(lookVec.x() * range, lookVec.y() * range, lookVec.z() * range).inflate(var9, var9, var9));
        double hitDist = 0;

        for (Entity possibleEntity : possibleList) {
            AABB collisionBB = possibleEntity.getBoundingBox().inflate(1.0d, 1.0d, 1.0d);
            Optional<Vec3> interceptPos = collisionBB.clip(srcVec, destVec);

            if (collisionBB.contains(srcVec)) {
                if (0.0D < hitDist || hitDist == 0.0D) {
                    pointedEntity = possibleEntity;
                    hitDist = 0.0D;
                }
            } else if (interceptPos.isPresent()) {
                double possibleDist = srcVec.distanceTo(interceptPos.get());

                if (possibleDist < hitDist || hitDist == 0.0D) {
                    pointedEntity = possibleEntity;
                    hitDist = possibleDist;
                }
            }

        }
        return pointedEntity;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        return cast(world, player, hand, ModEntities.FIRE_BALL.get(), ModSounds.HALBERD_ATTACK_1.get());
    }

    public InteractionResultHolder<ItemStack> cast(final Level world, final Player entity, final InteractionHand hand, @NotNull final EntityType<? extends SpellProjectileEntity> spellProjectile, final SoundEvent soundEvent) {
        ItemStack stack = entity.getItemInHand(hand);

        if (!world.isClientSide()) {
            Vec3 pos = entity.position().add(entity.getLookAngle().scale(0.5)).add(0.5 * Math.sin(Math.toRadians(225 - entity.yHeadRot)), entity.getBbHeight() * 2 / 3, 0.5 * Math.cos(Math.toRadians(225 - entity.yHeadRot)));
            Vec3 vel = entity.getEyePosition(0).add(entity.getLookAngle().scale(40)).subtract(pos).scale(1.0 / 20);

            int projectileAmount = 1;
            int trackingAmount = 1;

            for (int i = 0; i < projectileAmount; i++) {
                SpellProjectileEntity spellProjectileEntity = spellProjectile.create(world);
                if (spellProjectileEntity != null) {
                    if (trackingAmount > 0) {
                        spellProjectileEntity.isTracking = true;
                        trackingAmount--;
                    }

                    Vec3 randomized = Vec3.ZERO;

                    if (i > 0) {
                        randomized = new Vec3(random.nextDouble(-OFFSET, OFFSET), random.nextDouble(-OFFSET, OFFSET), random.nextDouble(-OFFSET, OFFSET));
                        spellProjectileEntity.noImmunityFrame = true;
                    }

                    world.addFreshEntity(spellProjectileEntity.shoot(pos.x + randomized.x(), pos.y + randomized.y(), pos.z + randomized.z(), vel.x, vel.y, vel.z, entity, stack));
                }
            }

            world.playSound(null, pos.x, pos.y, pos.z, soundEvent, SoundSource.NEUTRAL, 0.75f, random.nextFloat() * 0.2f + 0.9f);
            stack.hurtAndBreak(1, entity, player -> player.broadcastBreakEvent(hand));
            entity.getCooldowns().addCooldown(this,  15);
        }

        if (!entity.swinging) {
            entity.swing(hand);
        }

        return InteractionResultHolder.success(stack);
    }

    public int getUseDuration(ItemStack p_77626_1_) {
        return 72000;
    }

    public boolean canAttackBlock(BlockState p_43409_, Level p_43410_, BlockPos p_43411_, Player p_43412_) {
        return !p_43412_.isCreative();
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
        return super.canApplyAtEnchantingTable(stack, enchantment) ||  enchantment.category == EnchantmentCategory.WEAPON;
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
        tooltip.add(Component.translatable("item.arsenal.frost_blade.desc").withStyle(ChatFormatting.GRAY));
        tooltip.add(Component.translatable("item.arsenal.frost_blade.desc").withStyle(ChatFormatting.GRAY));
    }
}
