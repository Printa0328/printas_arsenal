package com.github.printa.arsenal.api.client;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.api.attack.PlayerAnimation;
import dev.kosmx.playerAnim.api.layered.ModifierLayer;
import dev.kosmx.playerAnim.api.layered.modifier.AdjustmentModifier;
import dev.kosmx.playerAnim.api.layered.modifier.MirrorModifier;
import dev.kosmx.playerAnim.core.util.Vec3f;
import dev.kosmx.playerAnim.minecraftApi.PlayerAnimationFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.renderer.item.CompassItemPropertyFunction;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CrossbowItem;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.client.CuriosRendererRegistry;

import java.util.Optional;

@Mod.EventBusSubscriber(modid = Arsenal.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void clientSetup(final FMLClientSetupEvent e) {

        PlayerAnimationFactory.ANIMATION_DATA_FACTORY.registerFactory(
                PlayerAnimation.ANIMATION_RESOURCE,
                42,
                (player) -> {
                    var animation = new ModifierLayer<>();

                    animation.addModifierLast(new AdjustmentModifier((partName) -> {
                        switch (partName) {
                            case "rightArm", "leftArm" -> {
                                return Optional.of(new AdjustmentModifier.PartModifier(new Vec3f(player.getXRot() * Mth.DEG_TO_RAD, Mth.DEG_TO_RAD * (player.yHeadRot - player.yBodyRot), 0), Vec3f.ZERO));

                            }
                            default -> {
                                return Optional.empty();
                            }
                        }
                    }));
                    return animation;
                });

        //TetraProxy.PROXY.initClient();

    }
}
