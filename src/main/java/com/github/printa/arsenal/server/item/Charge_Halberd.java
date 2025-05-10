package com.github.printa.arsenal.server.item;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.server.event.ServerEventHandler;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import com.github.printa.arsenal.server.registry.ModSounds;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.ChatFormatting;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.event.level.NoteBlockEvent;

import javax.annotation.Nullable;
import java.util.*;

import java.util.UUID;

public class Charge_Halberd extends Item {
	private static final double REACH = 0.0D;
	private static final double DAMAGE = 7.0D;
	private static final double SPEED = -3.0D;
	private static final UUID[] WEAPON_MODIFIERS = new UUID[]{UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B77"), UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E12"), UUID.fromString("9F3D476D-C118-4544-8365-64846904B43F"), UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB111")};
	private final Multimap<Attribute, AttributeModifier> defaultAttributes;
	//private static int charge = 0;

	public Charge_Halberd(Properties properties) {
		super(properties);
		UUID uuid = WEAPON_MODIFIERS[0];
		ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
		builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", this.BaseDamage(), AttributeModifier.Operation.ADDITION));
		builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", this.BaseSpeed(), AttributeModifier.Operation.ADDITION));
		builder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(UUID.fromString("8F20D3D4-99E1-41D2-8CF4-F1C8B9E32F65"), "Tool modifier", 2.0F, AttributeModifier.Operation.ADDITION));
		defaultAttributes = builder.build();
    }

	public static int getCharge(ItemStack stack) {
		CompoundTag compoundtag = stack.getOrCreateTag();
		int charge = compoundtag.getInt("charge");
		return charge;
	}

	public static int getPhase(ItemStack stack) {
		CompoundTag compoundtag = stack.getOrCreateTag();
		int phase = compoundtag.getInt("phase");
		return phase;
	}

	public final double BaseDamage() {
		return 8.0;
	}

	public final double BaseSpeed() {
		return -3.0;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		ItemStack stack = player.getItemInHand(hand);
		CompoundTag compoundtag = stack.getOrCreateTag();
		int phase = compoundtag.getInt("phase");
		int charge = getCharge(stack);

		if (player.isShiftKeyDown()) {
			if (charge <= 10) {
				if (phase != 0 ) {
					setModeNone(stack);
					player.playSound(ModSounds.PHASE_CHANGE.get(), 0.5F, 0.65F);
					player.getCooldowns().addCooldown(this, 15);
					return InteractionResultHolder.consume(stack);
				}
			} else {
				setModeHalberd(stack);
				player.playSound(ModSounds.PHASE_CHANGE.get(), 0.5F, 1.15F);
				player.getCooldowns().addCooldown(this, 15);
				return InteractionResultHolder.consume(stack);
			}
		} else {
			if (charge >= 5) {
				setMode(stack);
				player.playSound(ModSounds.PHASE_CHANGE.get(), 0.6F, 1.0F);
				player.getCooldowns().addCooldown(this, 15);
				return InteractionResultHolder.consume(stack);
			}
		}
		//CHARGE_HALBERD_ATTACK_03.getForPlayer().ifPresent(resourceLocation -> animatePlayerStart(player, resourceLocation));
		return InteractionResultHolder.fail(stack);
	}

	//public AnimationHolder getCastStartAnimation() {return PlayerAnimation.CHARGE_HALBERD_CHARGE;}
	public static void setMode(ItemStack p_40887_) {
		CompoundTag compoundtag = p_40887_.getOrCreateTag();
		int phase = compoundtag.getInt("phase");
		int charge = compoundtag.getInt("charge");
		
			if (phase <= 1) {
				++phase;
			} else {
				phase = 1;
			}

		compoundtag.putInt("phase", phase);
		p_40887_.setTag(compoundtag);
	}

	public static void setModeNone(ItemStack p_40887_) {
		CompoundTag compoundtag = p_40887_.getOrCreateTag();
		int phase = compoundtag.getInt("phase");

			phase = 0;

		compoundtag.putInt("phase", phase);
		p_40887_.setTag(compoundtag);
	}

	public static void setModeHalberd(ItemStack p_40887_) {
		CompoundTag compoundtag = p_40887_.getOrCreateTag();
		int phase = compoundtag.getInt("phase");

		phase = 3;

		compoundtag.putInt("phase", phase);
		p_40887_.setTag(compoundtag);
	}

	private Multimap<Attribute, AttributeModifier> getOrCreateDurabilityAttributes(ItemStack p_40887_) {
		CompoundTag compoundtag = p_40887_.getOrCreateTag();
		int phase = compoundtag.getInt("phase");
		double reach = REACH + (phase == 1 ? 1.0 : phase == 3 ? 1 : 0.0) * 2;
		double damage = DAMAGE + (phase == 2 ? 1.0 : phase == 3 ? 1 : 0.0) * 4;
		double speed = SPEED + (phase == 1 ? 1.0 : phase == 3 ? 1 : 0.0) * 0.4;
		UUID uuid = WEAPON_MODIFIERS[0];
		ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
		builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", damage, AttributeModifier.Operation.ADDITION));
		builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", speed, AttributeModifier.Operation.ADDITION));
		builder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(UUID.fromString("8F20D3D4-99E1-41D2-8CF4-F1C8B9E32F65"), "Tool modifier", reach, AttributeModifier.Operation.ADDITION));
		Multimap<Attribute, AttributeModifier> attributeModifierMultimap = builder.build();
		return attributeModifierMultimap;
	}

	public static boolean isNone(ItemStack p_40933_) {
		CompoundTag compoundtag = p_40933_.getTag();
		return compoundtag != null && compoundtag.getInt("phase") == 0;
	}

	public static boolean isSpear(ItemStack stack) {
		CompoundTag compoundtag = stack.getTag();
		return compoundtag != null && compoundtag.getInt("phase") == 1;
	}

	public static boolean isAxe(ItemStack p_40933_) {
		CompoundTag compoundtag = p_40933_.getTag();
		return compoundtag != null && compoundtag.getInt("phase") == 2;
	}

	public static boolean isHalberd(ItemStack p_40933_) {
		CompoundTag compoundtag = p_40933_.getTag();
		return compoundtag != null && compoundtag.getInt("phase") == 3;
	}

	private boolean isCharged(Player player, ItemStack stack){
		return player.getAttackStrengthScale(0.5F) > 0.9F;
	}

	@Override
	public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
		CompoundTag compoundtag = stack.getOrCreateTag();
		int charge = compoundtag.getInt("charge");
		int phase = compoundtag.getInt("phase");
		Player player = (Player) attacker;
		if (isHalberd(stack)) {
			if (charge > 0) {
				--charge;
				if (charge <= 0) {
					setModeNone(stack);
					target.playSound(ModSounds.PHASE_CHANGE.get(), 0.5F, 0.65F);
				}
				if (Math.random() < 0.5) {
					if (charge > 0) {
						--charge;
						if (charge <= 0) {
							setModeNone(stack);
							target.playSound(ModSounds.PHASE_CHANGE.get(), 0.5F, 0.65F);
						}
					}
				}
			}
		} else if ((isCharged(player, stack)) && charge < 20) {
			++charge;
		} if (!target.level().isClientSide) {
			if (phase != 0) {
				target.playSound(ModSounds.HALBERD_ATTACK_1.get(), 0.6f, 1F + target.getRandom().nextFloat() * 0.5F);
			}
		}
			compoundtag.putInt("charge", charge);
			stack.setTag(compoundtag);
			return true;
	}

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
		if (slot == EquipmentSlot.MAINHAND) {
			return getOrCreateDurabilityAttributes(stack);
		} else {
			return super.getAttributeModifiers(slot, stack);
		}
	}

	@Override
	public boolean isEnchantable(ItemStack stack) {
		return true;
	}

	@Override
	public int getEnchantmentValue() {
		return 16;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
		return super.canApplyAtEnchantingTable(stack, enchantment) ||  enchantment.category == EnchantmentCategory.WEAPON && enchantment != Enchantments.SWEEPING_EDGE;
	}

	public boolean canAttackBlock(BlockState p_43409_, Level p_43410_, BlockPos p_43411_, Player p_43412_) {
		return !p_43412_.isCreative();
	}

	@Override
	public int getUseDuration(ItemStack stack) {
		return 250;
	}

	public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
		return equipmentSlot == EquipmentSlot.MAINHAND ? this.defaultAttributes : super.getDefaultAttributeModifiers(equipmentSlot);
	}

	@Override
	public UseAnim getUseAnimation(ItemStack stack) {
		return UseAnim.BLOCK;
	}

	@Override
	public void initializeClient(java.util.function.Consumer<IClientItemExtensions> consumer) {
		consumer.accept((IClientItemExtensions) Arsenal.PROXY.getISTERProperties());
	}

	@Override
	public void appendHoverText(ItemStack stack, @Nullable Level worldIn, List<Component> tooltip, TooltipFlag flagIn) {
		tooltip.add(Component.translatable("item.arsenal.charge_halberd.desc").withStyle(ChatFormatting.GRAY));
		tooltip.add(Component.translatable("item.arsenal.charge_halberd2_desc").withStyle(ChatFormatting.GRAY));
	}
}