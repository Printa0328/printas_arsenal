package com.github.printa.arsenal.api.player;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.api.attack.PlayerAnimation;
import com.github.printa.arsenal.api.client.AnimationHashMap;
import dev.kosmx.playerAnim.api.firstPerson.FirstPersonConfiguration;
import dev.kosmx.playerAnim.api.firstPerson.FirstPersonMode;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.IAnimation;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.modifier.AbstractFadeModifier;
import dev.kosmx.playerAnim.core.data.KeyframeAnimation;
import dev.kosmx.playerAnim.core.util.Ease;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemDisplayContext;
import org.jetbrains.annotations.NotNull;

import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.client.Minecraft;
import java.util.UUID;

public class KeyframeAnimationHelper {

    public static void animatePlayerStart(Player player, ResourceLocation firstPersonAnim, ResourceLocation thirdPersonAnim) {
        Arsenal.LOGGER.debug("animatePlayerStart {} {} {}", player, firstPersonAnim, thirdPersonAnim);
        var keyframeAnimation_1pov = PlayerAnimationRegistry.getAnimation(firstPersonAnim);
        var keyframeAnimation_3pov = PlayerAnimationRegistry.getAnimation(thirdPersonAnim);

        if (keyframeAnimation_1pov == null || keyframeAnimation_3pov == null) {
            return;
        }

        var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData((AbstractClientPlayer) player).get(PlayerAnimation.ANIMATION_RESOURCE);
        if (animation == null) {
            return;
        }

        KeyframeAnimationPlayer castingAnimationPlayer;

        if (player instanceof LocalPlayer) {
            castingAnimationPlayer = new KeyframeAnimationPlayer(keyframeAnimation_1pov);
        } else {
            castingAnimationPlayer = new KeyframeAnimationPlayer(keyframeAnimation_3pov);
        }

        AnimationHashMap.castingAnimationPlayerLookup.put(player.getUUID(), castingAnimationPlayer);
        var armsFlag = true;
        var itemsFlag = true;

        if (armsFlag || itemsFlag) {
            castingAnimationPlayer.setFirstPersonMode(FirstPersonMode.THIRD_PERSON_MODEL);
            castingAnimationPlayer.setFirstPersonConfiguration(new FirstPersonConfiguration(armsFlag, armsFlag, itemsFlag, itemsFlag));
        } else {
            castingAnimationPlayer.setFirstPersonMode(FirstPersonMode.DISABLED);
        }

        animation.replaceAnimationWithFade(AbstractFadeModifier.standardFadeIn(2, Ease.INOUTSINE), castingAnimationPlayer, true);
    }
}