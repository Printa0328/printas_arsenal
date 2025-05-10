package com.github.printa.arsenal.server.entity.InternalAnimationMonster;

import com.github.printa.arsenal.client.animation.Soul_knight_Animation;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.AI.InternalAttackGoal;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.AI.InternalMoveGoal;
import com.github.printa.arsenal.server.entity.effect.ScreenShake_Entity;
import com.github.printa.arsenal.server.entity.etc.SmartBodyHelper2;
import com.github.printa.arsenal.server.entity.etc.path.CMPathNavigateGround;
import com.github.printa.arsenal.server.registry.ModEffect;
import com.github.printa.arsenal.server.registry.ModEntities;
import com.github.printa.arsenal.server.registry.ModItems;
import com.github.printa.arsenal.server.registry.ModSounds;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.BodyRotationControl;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.List;

import static net.minecraft.sounds.SoundEvents.*;
import static net.minecraft.world.level.block.AnvilBlock.damage;

public class Soul_knight_Entity extends Internal_Animation_Monster {
    public AnimationState idleAnimationState = new AnimationState();
    public AnimationState deathAnimationState = new AnimationState();
    public AnimationState attack1AnimationState = new AnimationState();
    public AnimationState attack2_1AnimationState = new AnimationState();
    public AnimationState attack2_2AnimationState = new AnimationState();
    public AnimationState attack3AnimationState = new AnimationState();

    private boolean combo;

    public Soul_knight_Entity(EntityType entity, Level world) {
        super(entity, world);
        this.xpReward = 35;
        this.setPathfindingMalus(BlockPathTypes.UNPASSABLE_RAIL, 0.0F);
        this.setPathfindingMalus(BlockPathTypes.WATER, -1.0F);
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1.0D, 80));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.goalSelector.addGoal(2, new InternalMoveGoal(this,false,1.0D));

        this.goalSelector.addGoal(0, new InternalAttackGoal(this,0,1,0,56,24,5){
            @Override
            public boolean canUse() {
                LivingEntity target = entity.getTarget();
                return super.canUse() && Soul_knight_Entity.this.getRandom().nextFloat() * 100.0F < 30 && target !=null ;
            }
        });

        this.goalSelector.addGoal(0, new InternalAttackGoal(this,0,2,0,58,64,5){
            @Override
            public boolean canContinueToUse() {
                return super.canContinueToUse() && !combo;
            }

            @Override
            public void tick() {
                super.tick();
                if (entity.attackTicks == 8) {
                    float f1 = (float) Math.cos(Math.toRadians(entity.getYRot() + 90));
                    float f2 = (float) Math.sin(Math.toRadians(entity.getYRot() + 90));
                    entity.push(f1 * 1.2, 0, f2 * 1.2);
                }
            }

            @Override
            public void stop() {
                if (combo) {
                    entity.setAttackState(3);
                    combo = false;
                } else {
                    super.stop();
                }
            }
        });

        this.goalSelector.addGoal(0, new InternalAttackGoal(this,3,3,0,35,0,6));

        this.goalSelector.addGoal(0, new InternalAttackGoal(this,0,4,0,57,64,6));
    }

    public static AttributeSupplier.Builder soul_knight() {
        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 24.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.28F)
                .add(Attributes.ATTACK_DAMAGE, 7.0F)
                .add(Attributes.MAX_HEALTH, 100)
                .add(Attributes.ARMOR, 10)
                .add(Attributes.ARMOR_TOUGHNESS, 4)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1.0);
    }

    public MobType getMobType() {
        return MobType.UNDEAD;
    }

    @Override
    public boolean hurt(DamageSource source, float damage) {
        Entity entity = source.getDirectEntity();
        return super.hurt(source, damage);
    }


    protected int decreaseAirSupply(int air) {
        return air;
    }


    public boolean causeFallDamage(float p_148711_, float p_148712_, DamageSource p_148713_) {
        return false;
    }

    public AnimationState getAnimationState(String input) {
        if (input == "idle") {
            return this.idleAnimationState;
        } else if (input == "death") {
            return this.deathAnimationState;
        } else if (input == "attack1") {
            return this.attack1AnimationState;
        } else if (input == "attack2_1") {
            return this.attack2_1AnimationState;
        } else if (input == "attack2_2") {
            return this.attack2_2AnimationState;
        } else if (input == "attack3") {
            return this.attack3AnimationState;
        } else {
            return new AnimationState();
        }
    }


    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor p_29678_, DifficultyInstance p_29679_, MobSpawnType p_29680_, @Nullable SpawnGroupData p_29681_, @Nullable CompoundTag p_29682_) {
        return super.finalizeSpawn(p_29678_, p_29679_, p_29680_, p_29681_, p_29682_);
    }

    public void onSyncedDataUpdated(EntityDataAccessor<?> p_21104_) {
        if (ATTACK_STATE.equals(p_21104_)) {
            if (this.level().isClientSide)
                switch (this.getAttackState()) {
                    case 0 -> this.stopAllAnimationStates();
                    case 1 -> {
                        this.stopAllAnimationStates();
                        this.attack1AnimationState.startIfStopped(this.tickCount);
                    }
                    case 2 -> {
                        this.stopAllAnimationStates();
                        this.attack2_1AnimationState.startIfStopped(this.tickCount);
                    }
                    case 3 -> {
                        this.stopAllAnimationStates();
                        this.attack2_2AnimationState.startIfStopped(this.tickCount);
                    }
                    case 4 -> {
                        this.stopAllAnimationStates();
                        this.attack3AnimationState.startIfStopped(this.tickCount);
                    }
                    case 8  -> {
                        this.stopAllAnimationStates();
                        this.deathAnimationState.startIfStopped(this.tickCount);
                    }
                }
        }

        super.onSyncedDataUpdated(p_21104_);
    }

    public void stopAllAnimationStates() {
        this.attack1AnimationState.stop();
        this.attack2_1AnimationState.stop();
        this.attack2_2AnimationState.stop();
        this.attack3AnimationState.stop();
        this.deathAnimationState.stop();
    }



    public void die(DamageSource p_21014_) {
        super.die(p_21014_);
        this.setAttackState(8);
    }

    public int deathtimer(){
        return 60;
    }


    public void tick() {
        super.tick();
        if (this.level().isClientSide()) {
            this.idleAnimationState.animateWhen(!this.walkAnimation.isMoving(), this.tickCount);
        }
    }

    public void aiStep() {
        super.aiStep();
        if (this.getAttackState() == 1) {
            if (this.attackTicks == 25) {
                AreaAttack(6.0f, 3.0F, 40, 1.25F, 3,20);
            }
        }

        if (this.getAttackState() == 2) {
            if (this.attackTicks == 20) {
                ComboAreaAttack(6.0f, 1.0F, 70, 1, 5, 10);
            }
        }

        if (this.getAttackState() == 3) {
            if (this.attackTicks == 1) {
                float f1 = (float) Math.cos(Math.toRadians(this.getYRot() + 90));
                float f2 = (float) Math.sin(Math.toRadians(this.getYRot() + 90));
                this.push(f1 * 1.1, 0, f2 * 1.1);
            }
            if (this.attackTicks == 12) {
                AreaAttack(6.5f, 3.0F, 90, 1.5f, 5, 20);
            }
        }

        if (this.getAttackState() == 4) {
            if (this.attackTicks == 18) {
                AreaAttack(6.5f, 3.0F, 60, 1, 5, 0);
            }
        }
    }

    private void AreaAttack(float range, float height, float arc, float damage, int firetime, int shieldbreakticks) {
        List<LivingEntity> entitiesHit = this.getEntityLivingBaseNearby(range, height, range, range);
        for (LivingEntity entityHit : entitiesHit) {
            float entityHitAngle = (float) ((Math.atan2(entityHit.getZ() - this.getZ(), entityHit.getX() - this.getX()) * (180 / Math.PI) - 90) % 360);
            float entityAttackingAngle = this.yBodyRot % 360;
            if (entityHitAngle < 0) {
                entityHitAngle += 360;
            }
            if (entityAttackingAngle < 0) {
                entityAttackingAngle += 360;
            }
            DamageSource damagesource = this.damageSources().mobAttack(this);
            float entityRelativeAngle = entityHitAngle - entityAttackingAngle;
            float entityHitDistance = (float) Math.sqrt((entityHit.getZ() - this.getZ()) * (entityHit.getZ() - this.getZ()) + (entityHit.getX() - this.getX()) * (entityHit.getX() - this.getX()));
            if (entityHitDistance <= range && (entityRelativeAngle <= arc / 2 && entityRelativeAngle >= -arc / 2) || (entityRelativeAngle >= 360 - arc / 2 || entityRelativeAngle <= -360 + arc / 2)) {
                if (!isAlliedTo(entityHit) && !(entityHit instanceof Soul_knight_Entity) && entityHit != this) {
                    boolean flag = entityHit.hurt(damagesource, (float) (this.getAttributeValue(Attributes.ATTACK_DAMAGE) * damage));
                    if (flag) {
                        entityHit.setSecondsOnFire(firetime);
                    }
                    if (entityHit.isDamageSourceBlocked(damagesource) && entityHit instanceof Player player && shieldbreakticks > 0) {
                        disableShield(player, shieldbreakticks);
                    }

                }
            }
        }
    }


    private void ComboAreaAttack(float range, float height, float arc, float damage, int firetime, int shieldbreakticks) {
        List<LivingEntity> entitiesHit = this.getEntityLivingBaseNearby(range, height, range, range);
        for (LivingEntity entityHit : entitiesHit) {
            float entityHitAngle = (float) ((Math.atan2(entityHit.getZ() - this.getZ(), entityHit.getX() - this.getX()) * (180 / Math.PI) - 90) % 360);
            float entityAttackingAngle = this.yBodyRot % 360;
            if (entityHitAngle < 0) {
                entityHitAngle += 360;
            }
            if (entityAttackingAngle < 0) {
                entityAttackingAngle += 360;
            }
            float entityRelativeAngle = entityHitAngle - entityAttackingAngle;
            float entityHitDistance = (float) Math.sqrt((entityHit.getZ() - this.getZ()) * (entityHit.getZ() - this.getZ()) + (entityHit.getX() - this.getX()) * (entityHit.getX() - this.getX()));
            if (entityHitDistance <= range && (entityRelativeAngle <= arc / 2 && entityRelativeAngle >= -arc / 2) || (entityRelativeAngle >= 360 - arc / 2 || entityRelativeAngle <= -360 + arc / 2)) {
                if (!isAlliedTo(entityHit) && !(entityHit instanceof Soul_knight_Entity) && entityHit != this) {
                    DamageSource damagesource = this.damageSources().mobAttack(this);
                    boolean flag = entityHit.hurt(damagesource, (float) (this.getAttributeValue(Attributes.ATTACK_DAMAGE) * damage));
                    if (flag) {
                        entityHit.setSecondsOnFire(firetime);
                        combo = true;
                    }
                    if (entityHit.isDamageSourceBlocked(damagesource) && entityHit instanceof Player player && shieldbreakticks > 0) {
                        disableShield(player, shieldbreakticks);
                    }
                }
            }
        }
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return ModSounds.SOUL_KNIGHT_HURT.get();
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.IRON_GOLEM_DEATH;
    }

    @Override
    protected BodyRotationControl createBodyControl() {
        return new SmartBodyHelper2(this);
    }

    protected PathNavigation createNavigation(Level worldIn) {
        return new CMPathNavigateGround(this, worldIn);
    }

    public boolean canBeAffected(MobEffectInstance p_34192_) {
        return p_34192_.getEffect() != ModEffect.EFFECTSTUN.get() && super.canBeAffected(p_34192_);
    }

    public boolean checkSpawnRules(LevelAccessor worldIn, MobSpawnType spawnReasonIn) {
        return ModEntities.rollSpawn(1, this.getRandom(), spawnReasonIn) && super.checkSpawnRules(worldIn, spawnReasonIn);
    }

    public static boolean canSoulKnightspawnSpawnRules(EntityType<? extends Soul_knight_Entity> p_219020_, LevelAccessor p_219021_, MobSpawnType p_219022_, BlockPos p_219023_, RandomSource p_219024_) {
        return checkAnyLightMonsterSpawnRules(p_219020_, p_219021_, p_219022_, p_219023_, p_219024_);
    }

    protected boolean shouldDespawnInPeaceful() {
        return false;
    }

    protected boolean canRide(Entity p_31508_) {
        return false;
    }
}




