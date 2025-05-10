package com.github.printa.arsenal.client.render.item;


import com.github.printa.arsenal.client.render.PRAItemStackRenderer;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

public class CMItemRenderProperties implements IClientItemExtensions {

    public BlockEntityWithoutLevelRenderer getCustomRenderer() {
        return new PRAItemStackRenderer();
    }
}
