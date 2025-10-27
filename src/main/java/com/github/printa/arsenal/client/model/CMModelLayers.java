package com.github.printa.arsenal.client.model;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;

@OnlyIn(Dist.CLIENT)
public class CMModelLayers {

    public static final ModelLayerLocation ELYTRA_ARMOR = createLocation("elytra_armor", "main");
    public static final ModelLayerLocation MONSTROUS_HELM = createLocation("monstrous", "main");
    public static final ModelLayerLocation IGNITIUM_ARMOR_MODEL = createLocation("ignitium_armor_model", "main");
    public static final ModelLayerLocation IGNITIUM_ARMOR_MODEL_LEGS = createLocation("ignitium_armor_model_leg", "main");
    public static final ModelLayerLocation CURSIUM_ARMOR_MODEL = createLocation("cursium_armor_model", "main");
    public static final ModelLayerLocation CURSIUM_ARMOR_MODEL_LEGS = createLocation("cursium_armor_model_leg", "main");

    public static final ModelLayerLocation BLOOM_STONE_PAULDRONS_MODEL = createLocation("bloom_stone_pauldrons_model", "main");
    public static final ModelLayerLocation BONE_REPTILE_ARMOR_MODEL = createLocation("bone_reptile_armor_model", "main");
    public static final ModelLayerLocation SANDSTORM_IN_A_BOTTLE_MODEL = createLocation("sandstorm_in_a_bottle_model", "main");
    public static final ModelLayerLocation STICKY_GLOVES_MODEL = createLocation("sticky_gloves_model", "main");
    public static final ModelLayerLocation KOBOLEDIATOR_HEAD_MODEL = createLocation("kobolediator_head_model", "main");
    public static final ModelLayerLocation APTRGANGR_HEAD_MODEL = createLocation("aptrgangr_head_model", "main");
    public static final ModelLayerLocation DRAUGR_HEAD_MODEL = createLocation("draugr_head_model", "main");
    public static final ModelLayerLocation IGNITED_BERSERKER_MODEL = createLocation("ignited_berserker_model", "main");

    public static void register(EntityRenderersEvent.RegisterLayerDefinitions event) {
    }

    private static ModelLayerLocation createLocation(String model, String layer) {
        return new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("arsenal", model), layer);
    }
}
