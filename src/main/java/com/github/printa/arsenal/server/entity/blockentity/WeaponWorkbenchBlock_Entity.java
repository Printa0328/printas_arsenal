package com.github.printa.arsenal.server.entity.blockentity;

import com.github.printa.arsenal.server.registry.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WeaponWorkbenchBlock_Entity extends BlockEntity {

    public int tickCount;
    public boolean fire = false;
    public boolean lightning = false;
    public boolean frost = false;
    public boolean blood = false;
    public boolean acid = false;
    public boolean poison = false;
    public boolean necrotic = false;
    public boolean radiant = false;

    public WeaponWorkbenchBlock_Entity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WEAPON_WORKBENCH.get(), pos, state);
    }

    public static void commonTick(Level level, BlockPos pos, BlockState state, WeaponWorkbenchBlock_Entity entity) {
        entity.tick();
    }

    public void tick() {
        tickCount++;
    }
}