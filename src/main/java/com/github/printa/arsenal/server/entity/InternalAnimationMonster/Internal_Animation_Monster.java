package com.github.printa.arsenal.server.entity.InternalAnimationMonster;


import com.github.printa.arsenal.server.entity.etc.Animation_Monsters;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.Mth;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.level.Level;

public class Internal_Animation_Monster extends Animation_Monsters implements Enemy {

    public static final EntityDataAccessor<Integer> ATTACK_STATE = SynchedEntityData.defineId(Internal_Animation_Monster.class, EntityDataSerializers.INT);
    public Internal_Animation_Monster(EntityType entity, Level world) {
        super(entity, world);
    }
    public int attackTicks;

    protected void defineSynchedData() {
        super.defineSynchedData();
        this.entityData.define(ATTACK_STATE, 0);
    }

    @Override
    public boolean hurt(DamageSource source, float damage) {
        if (source.is(DamageTypeTags.BYPASSES_INVULNERABILITY)) {
            return super.hurt(source, damage);
        } else {
            float soft = SoftDamageCap();
            float hard = HardDamageCap();
            float max = MaxDamageCap();

            if (damage <= soft) {
                return super.hurt(source, damage);
            }

            float degree = 1.0f - (float)Math.pow((max - damage) / (max - soft), 0.89f);
            damage = soft + (hard - soft) * degree;

            damage = Math.min(damage, hard);
        }
        return super.hurt(source, damage);
    }

    public float MaxDamageCap() {
        return Float.MAX_VALUE;
    }


    public float HardDamageCap() {
        return Float.MAX_VALUE;
    }

    public float SoftDamageCap() {
        return Float.MAX_VALUE;
    }

    public int getAttackState() {
        return this.entityData.get(ATTACK_STATE);
    }

    public void setAttackState(int input) {
        this.attackTicks = 0;
        this.entityData.set(ATTACK_STATE, input);
        this.level().broadcastEntityEvent(this, (byte) -input);
    }

    @Override
    public void handleEntityEvent(byte id) {
        if (id <= 0) {
            this.attackTicks = 0;
        }else {
            super.handleEntityEvent(id);
        }
    }

    public void tick() {
        super.tick();

        if (this.getAttackState() > 0) {
            ++this.attackTicks;
        }

    }



    @Override
    protected void tickDeath() {
        onDeathUpdate(this.deathtimer());
    }

    public int deathtimer(){
        return 20;
    }

    // TODO: Copied from parent classes
    @Override
    public void push(Entity entityIn) {
        if (!this.isSleeping()) {
            if (!this.isPassengerOfSameVehicle(entityIn)) {
                if (!entityIn.noPhysics && !this.noPhysics) {
                    double d0 = entityIn.getX() - this.getX();
                    double d1 = entityIn.getZ() - this.getZ();
                    double d2 = Mth.absMax(d0, d1);
                    if (d2 >= (double)0.01F) {
                        d2 = Mth.sqrt((float) d2);
                        d0 = d0 / d2;
                        d1 = d1 / d2;
                        double d3 = 1.0D / d2;
                        if (d3 > 1.0D) {
                            d3 = 1.0D;
                        }

                        d0 = d0 * d3;
                        d1 = d1 * d3;
                        d0 = d0 * (double)0.05F;
                        d1 = d1 * (double)0.05F;
                        // d0 = d0 * (double)(1.0F - this.entityCollisionReduction);
                        // d1 = d1 * (double)(1.0F - this.entityCollisionReduction);
                        if (!this.isVehicle()) {
                            if (canBePushedByEntity(entityIn)) {
                                this.push(-d0, 0.0D, -d1);
                            }
                        }

                        if (!entityIn.isVehicle()) {
                            entityIn.push(d0, 0.0D, d1);
                        }
                    }

                }
            }
        }
    }

}
