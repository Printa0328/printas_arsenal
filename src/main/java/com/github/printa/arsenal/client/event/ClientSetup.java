package com.github.printa.arsenal.client.event;

import com.github.printa.arsenal.Arsenal;
import com.github.printa.arsenal.client.render.entity.RayofFireRenderer;
import com.github.printa.arsenal.server.registry.ModEntities;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Arsenal.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientSetup {

    @SubscribeEvent
    public static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(RayofFireRenderer.MODEL_LAYER_LOCATION, RayofFireRenderer::createBodyLayer);
    }

    @SubscribeEvent
    public static void rendererRegister(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.RAY_OF_FIRE_VISUAL_ENTITY.get(), RayofFireRenderer::new);
    }
}
