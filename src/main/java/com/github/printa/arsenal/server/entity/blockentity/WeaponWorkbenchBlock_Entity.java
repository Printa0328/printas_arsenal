package com.github.printa.arsenal.server.entity.blockentity;

import com.github.printa.arsenal.server.registries.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WeaponWorkbenchBlock_Entity extends BlockEntity {

    public int tickCount;
    public boolean fire = false;
    public boolean lightning = false;
    public boolean cold = false;
    public boolean blood = false;
    public boolean acid = false;
    public boolean poison = false;
    public boolean necrotic = false;
    public boolean radiant = false;

    public WeaponWorkbenchBlock_Entity(BlockPos pos, BlockState state) {
        super(BlockEntityRegistry.WEAPON_WORKBENCH.get(), pos, state);
    }

    public static void commonTick(Level level, BlockPos pos, BlockState state, WeaponWorkbenchBlock_Entity entity) {
        entity.tick();
    }

    public void tick() {
        //this.saveAdditional(this.getUpdateTag());
        tickCount++;
    }

    @Override
    public CompoundTag getUpdateTag() {
        CompoundTag tag = super.getUpdateTag();
        tag.putBoolean("Fire", this.fire);
        tag.putBoolean("Lightning", this.fire);
        tag.putBoolean("Cold", this.fire);
        tag.putBoolean("Blood", this.fire);
        tag.putBoolean("Acid", this.fire);
        tag.putBoolean("Poison", this.fire);
        tag.putBoolean("Necrotic", this.fire);
        tag.putBoolean("Radiant", this.fire);
        return tag;
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        this.fire = tag.getBoolean("Fire");
        this.fire = tag.getBoolean("Lightning");
        this.fire = tag.getBoolean("Cold");
        this.fire = tag.getBoolean("Blood");
        this.fire = tag.getBoolean("Acid");
        this.fire = tag.getBoolean("Poison");
        this.fire = tag.getBoolean("Necrotic");
        this.fire = tag.getBoolean("Radiant");
    }

    @Override
    public void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        tag.putBoolean("Fire", this.fire);
        tag.putBoolean("Lightning", this.fire);
        tag.putBoolean("Cold", this.fire);
        tag.putBoolean("Blood", this.fire);
        tag.putBoolean("Acid", this.fire);
        tag.putBoolean("Poison", this.fire);
        tag.putBoolean("Necrotic", this.fire);
        tag.putBoolean("Radiant", this.fire);
    }
}