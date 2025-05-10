package com.github.printa.arsenal.server.registry;

import com.github.printa.arsenal.client.overlays.ChargeOverlay;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterGuiOverlaysEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(Dist.CLIENT)

public class OverlayRegistry {

    @SubscribeEvent
    public static void onRegisterOverlays(RegisterGuiOverlaysEvent event) {


        event.registerBelow(VanillaGuiOverlay.HOTBAR.id(), "charge_icon", ChargeOverlay.instance);
    }
}
