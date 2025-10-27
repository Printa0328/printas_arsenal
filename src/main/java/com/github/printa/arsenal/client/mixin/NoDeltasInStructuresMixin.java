package com.github.printa.arsenal.client.mixin;

import com.github.printa.arsenal.client.mixin.accessor.WorldGenRegionAccessor;
import com.github.printa.arsenal.server.registries.TagRegistry;
import com.github.printa.arsenal.util.MixinUtil;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.SectionPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.WorldGenRegion;
import net.minecraft.world.level.StructureManager;
import net.minecraft.world.level.chunk.ChunkStatus;
import net.minecraft.world.level.levelgen.feature.DeltaFeature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.DeltaFeatureConfiguration;
import net.minecraft.world.level.levelgen.structure.Structure;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;


@Mixin(DeltaFeature.class)
public class NoDeltasInStructuresMixin {

    @Inject(
            method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    private void arsenal_noDeltasInStructures(FeaturePlaceContext<DeltaFeatureConfiguration> context, CallbackInfoReturnable<Boolean> cir) {
        if(!(context.level() instanceof WorldGenRegion)) {
            return;
        }

        SectionPos sectionPos = SectionPos.of(context.origin());
        if (context.level().getChunk(sectionPos.x(), sectionPos.z(), ChunkStatus.STRUCTURE_REFERENCES, false) == null) {
            return;
        }

        Registry<Structure> configuredStructureFeatureRegistry = context.level().registryAccess().registryOrThrow(Registries.STRUCTURE);
        StructureManager structureManager = ((WorldGenRegionAccessor)context.level()).getStructureManager();
        for (Holder<Structure> configuredStructureFeature : configuredStructureFeatureRegistry.getOrCreateTag(TagRegistry.BLOCKED_BASALT)) {
            if (MixinUtil.getStructureAt(structureManager, context.origin(),  configuredStructureFeature.value()).isValid()) {
                cir.setReturnValue(false);
                return;
            }
        }
    }
}
