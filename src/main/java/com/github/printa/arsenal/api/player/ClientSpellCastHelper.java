package com.github.printa.arsenal.api.player;

import com.github.printa.arsenal.api.attack.PlayerAnimation;
import com.github.printa.arsenal.api.client.ClientMagicData;
import dev.kosmx.playerAnim.api.firstPerson.FirstPersonConfiguration;
import dev.kosmx.playerAnim.api.firstPerson.FirstPersonMode;
import dev.kosmx.playerAnim.api.layered.IAnimation;
import dev.kosmx.playerAnim.api.layered.KeyframeAnimationPlayer;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.modifier.AbstractFadeModifier;
import dev.kosmx.playerAnim.core.util.Ease;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationAccess;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationRegistry;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Player;

public class ClientSpellCastHelper {

    public static void animatePlayerStart(Player player, ResourceLocation resourceLocation) {
        //IronsSpellbooks.LOGGER.debug("animatePlayerStart {} {}", player, resourceLocation);
        var keyframeAnimation = PlayerAnimationRegistry.getAnimation(resourceLocation);
        if (keyframeAnimation != null) {
            //noinspection unchecked
            var animation = (ModifierLayer<IAnimation>) PlayerAnimationAccess.getPlayerAssociatedData((AbstractClientPlayer) player).get(PlayerAnimation.ANIMATION_RESOURCE);
            if (animation != null) {
                var castingAnimationPlayer = new KeyframeAnimationPlayer(keyframeAnimation);
                ClientMagicData.castingAnimationPlayerLookup.put(player.getUUID(), castingAnimationPlayer);
                var armsFlag = false;
                var itemsFlag = true;

                if (armsFlag || itemsFlag) {
                    castingAnimationPlayer.setFirstPersonMode(/*resourceLocation.getPath().equals("charge_arrow") ? FirstPersonMode.VANILLA : */FirstPersonMode.THIRD_PERSON_MODEL);
                    castingAnimationPlayer.setFirstPersonConfiguration(new FirstPersonConfiguration(armsFlag, armsFlag, itemsFlag, itemsFlag));
                } else {
                    castingAnimationPlayer.setFirstPersonMode(FirstPersonMode.DISABLED);
                }

                //You might use  animation.replaceAnimationWithFade(); to create fade effect instead of sudden change
                //animation.setAnimation(castingAnimationPlayer);
                animation.replaceAnimationWithFade(AbstractFadeModifier.standardFadeIn(2, Ease.INOUTSINE), castingAnimationPlayer, true);
            }
        }
    }
}
