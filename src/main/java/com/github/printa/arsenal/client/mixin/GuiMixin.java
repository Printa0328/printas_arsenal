package com.github.printa.arsenal.client.mixin;

import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class GuiMixin {

    //TODO: can't this be an event?
    @Inject(method = "renderExperienceBar", at = @At(value = "HEAD"), cancellable = true)
    public void renderExperienceBar(GuiGraphics guiGraphics, int pXPos, CallbackInfo ci) {
    }
}