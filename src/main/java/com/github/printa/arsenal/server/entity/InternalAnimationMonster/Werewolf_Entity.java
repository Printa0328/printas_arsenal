package com.github.printa.arsenal.server.entity.InternalAnimationMonster;

import com.github.printa.arsenal.client.particle.util.AdvancedParticleHelper;
import com.github.printa.arsenal.client.particle.util.ParticleComponent;
import com.github.printa.arsenal.client.particle.util.RibbonComponent;
import com.github.printa.arsenal.client.particle.util.anim.AnimData;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.AI.InternalAttackGoal;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.AI.InternalMoveGoal;
import com.github.printa.arsenal.server.entity.etc.SmartBodyHelper2;
import com.github.printa.arsenal.server.entity.etc.path.CMPathNavigateGround;
import com.github.printa.arsenal.server.registries.EffectRegistry;
import com.github.printa.arsenal.server.registries.EntityRegistry;
import com.github.printa.arsenal.server.registries.ParticleRegistry;
import com.github.printa.arsenal.server.registries.SoundRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.EntityDataSerializers;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
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
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.phys.Vec3;

import javax.annotation.Nullable;
import java.util.List;

public class Werewolf_Entity extends Internal_Animation_Monster {
    public AnimationState idlewithweaponAnimationState = new AnimationState();
    public AnimationState idlewithoutweaponAnimationState = new AnimationState();
    public AnimationState deathwithweaponAnimationState = new AnimationState();
    public AnimationState deathwithoutweaponAnimationState = new AnimationState();
    public AnimationState guardAnimationState = new AnimationState();
    public AnimationState counterAnimationState = new AnimationState();
    public AnimationState jabAnimationState = new AnimationState();
    public AnimationState jab_straightAnimationState = new AnimationState();
    public AnimationState straightAnimationState = new AnimationState();
    public AnimationState slip_straightAnimationState = new AnimationState();
    public AnimationState upper_cutAnimationState = new AnimationState();
    public AnimationState evasionAnimationState = new AnimationState();
    public AnimationState jump_slashAnimationState = new AnimationState();

    private boolean Invulnerable;
    private boolean combo;
    private boolean inBlocking;
    private boolean holdWeapon = true;
    private int DamagedWeapon;
    private int blockingHurtCount;

    public static final int GUARD_COOLDOWN = 240;
    private int guard_cooldown = 0;

    public static final int JAB_STRAIGHT_COOLDOWN = 140;
    private int jab_straight_cooldown = 0;

    public static final int STRAIGHT_COOLDOWN = 80;
    private int straight_cooldown = 0;

    private static final EntityDataAccessor<Boolean> FLYING = SynchedEntityData.defineId(Werewolf_Entity.class, EntityDataSerializers.BOOLEAN);

    public Werewolf_Entity(EntityType entity, Level world) {
        super(entity, world);
        this.xpReward = 135;
        this.setPathfindingMalus(BlockPathTypes.UNPASSABLE_RAIL, 0.0F);
        this.setPathfindingMalus(BlockPathTypes.WATER, -1.0F);
    }

    @Override
    public float getStepHeight() {
        return 1.0F;
    }

    protected void registerGoals() {
        this.goalSelector.addGoal(5, new RandomStrollGoal(this, 1.0D, 80));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.goalSelector.addGoal(8, new RandomLookAroundGoal(this));
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this));
        this.targetSelector.addGoal(2, new NearestAttackableTargetGoal<>(this, Player.class, true));
        this.goalSelector.addGoal(3, new InternalMoveGoal(this,false,1.0D));

        //hold weapon
        this.goalSelector.addGoal(0, new InternalAttackGoal(this,0,20,0,54,12,17){
            @Override
            public boolean canUse() {
                return super.canUse() && holdWeapon;
            }
        });

        //not hold weapon
        this.goalSelector.addGoal(0, new InternalAttackGoal(this,0,5,0,54,128,7){
            @Override
            public boolean canUse() {
                return super.canUse() && jab_straight_cooldown <= 0 && !holdWeapon;
            }

            @Override
            public void stop() {
                super.stop();
                Werewolf_Entity.this.jab_straight_cooldown = JAB_STRAIGHT_COOLDOWN;
            }
        });
        this.goalSelector.addGoal(0, new InternalAttackGoal(this,7,7,0,38,128,7){
            @Override
            public boolean canUse() {
                return super.canUse() && !holdWeapon;
            }
        });
        this.goalSelector.addGoal(0, new InternalAttackGoal(this,0,10,0,72,128,8){
            @Override
            public boolean canUse() {
                return super.canUse() && guard_cooldown <= 0 && !holdWeapon;
            }

            @Override
            public boolean canContinueToUse() {
                return super.canContinueToUse() && blockingHurtCount < 1 ;
            }

            @Override
            public void start() {
                super.start();
                Werewolf_Entity.this.guard_cooldown = GUARD_COOLDOWN;
            }

            @Override
            public void stop() {
                if (blockingHurtCount>=1){
                    inBlocking = false;
                    blockingHurtCount = 0;
                    entity.setAttackState(11);
                } else {
                    super.stop();
                }
            }
        });
        this.goalSelector.addGoal(0, new InternalAttackGoal(this,11,11,0,51,128,7){
            @Override
            public boolean canUse() {
                return super.canUse() && !holdWeapon;
            }

            @Override
            public void start() {
                super.start();
                Invulnerable = true;
            }

            @Override
            public void stop() {
                super.stop();
                Invulnerable = false;
            }
        });
        this.goalSelector.addGoal(0, new InternalAttackGoal(this,0,12,0,24,128,3){
            @Override
            public boolean canUse() {
                return super.canUse() && straight_cooldown <= 0 && !holdWeapon;
            }

            @Override
            public void stop() {
                super.stop();
                Werewolf_Entity.this.straight_cooldown = STRAIGHT_COOLDOWN;
            }
        });
        this.goalSelector.addGoal(0, new InternalAttackGoal(this,0,13,0,24,128,3){
            @Override
            public boolean canUse() {
                return super.canUse() && !holdWeapon;
            }
        });
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Monster.createMonsterAttributes()
                .add(Attributes.FOLLOW_RANGE, 24.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.30F)
                .add(Attributes.ATTACK_DAMAGE, 11.0F)
                .add(Attributes.MAX_HEALTH, 300)
                .add(Attributes.ARMOR, 0)
                .add(Attributes.ARMOR_TOUGHNESS, 0)
                .add(Attributes.KNOCKBACK_RESISTANCE, 1.0);
    }

    @Override
    public boolean isInvulnerableTo(DamageSource damageSource) {
        return this.Invulnerable == true
                || super.isInvulnerableTo(damageSource);
    }

    @Override
    public boolean hurt(DamageSource source, float damage) {
        if (this.inBlocking){
            blockingHurtCount++;
            this.CollisionParticle(5, 4.0F, 0.05F);
            this.playSound(SoundEvents.ZOMBIE_ATTACK_IRON_DOOR, 0.9F, 1.4F);
        } else {
            return super.hurt(source, damage);
        }
        return false;
    }

    public AnimationState getAnimationState(String input) {
        if (input == "idle_with_weapon") {
            return this.idlewithweaponAnimationState;
        } else if (input == "idle_without_weapon") {
            return this.idlewithoutweaponAnimationState;
        } else if (input == "death_with_weapon") {
            return this.deathwithweaponAnimationState;
        } else if (input == "death_without_weapon") {
            return this.deathwithoutweaponAnimationState;
        } else if (input == "guard") {
            return this.guardAnimationState;
        } else if (input == "counter") {
            return this.counterAnimationState;
        } else if (input == "jab") {
            return this.jabAnimationState;
        } else if (input == "straight") {
            return this.straightAnimationState;
        } else if (input == "jab_straight") {
            return this.jab_straightAnimationState;
        } else if (input == "slip_straight") {
            return this.slip_straightAnimationState;
        } else if (input == "upper_cut") {
            return this.upper_cutAnimationState;
        } else if (input == "evasion") {
            return this.evasionAnimationState;
        } else if (input == "jump_slash") {
            return this.jump_slashAnimationState;
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
                    case 5 -> {
                        this.stopAllAnimationStates();
                        this.jab_straightAnimationState.startIfStopped(this.tickCount);
                    }
                    case 7 -> {
                        this.stopAllAnimationStates();
                        this.slip_straightAnimationState.startIfStopped(this.tickCount);
                    }
                    case 10 -> {
                        this.stopAllAnimationStates();
                        this.guardAnimationState.startIfStopped(this.tickCount);
                    }
                    case 11 -> {
                        this.stopAllAnimationStates();
                        this.counterAnimationState.startIfStopped(this.tickCount);
                    }
                    case 12 -> {
                        this.stopAllAnimationStates();
                        this.straightAnimationState.startIfStopped(this.tickCount);
                    }
                    case 13 -> {
                        this.stopAllAnimationStates();
                        this.jabAnimationState.startIfStopped(this.tickCount);
                    }
                    case 14 -> {
                        this.stopAllAnimationStates();
                        this.deathwithoutweaponAnimationState.startIfStopped(this.tickCount);
                    }
                    case 20 -> {
                        this.stopAllAnimationStates();
                        this.jump_slashAnimationState.startIfStopped(this.tickCount);
                    }
                }
        }

        super.onSyncedDataUpdated(p_21104_);
    }

    public void stopAllAnimationStates() {
        this.guardAnimationState.stop();
        this.counterAnimationState.stop();
        this.jabAnimationState.stop();
        this.idlewithweaponAnimationState.stop();
        this.jab_straightAnimationState.stop();
        this.idlewithoutweaponAnimationState.stop();
        this.straightAnimationState.stop();
        this.slip_straightAnimationState.stop();
        this.upper_cutAnimationState.stop();
        this.evasionAnimationState.stop();
        this.jump_slashAnimationState.stop();
    }

    public void tick() {
        super.tick();
        if (this.level().isClientSide()) {
            if (this.isHoldweapon()) {
                this.idlewithweaponAnimationState.animateWhen(!this.walkAnimation.isMoving() && this.getAttackState() == 0, this.tickCount);
            } else {
                this.idlewithoutweaponAnimationState.animateWhen(!this.walkAnimation.isMoving() && this.getAttackState() == 0, this.tickCount);
            }
        }
        float healthAmount = this.getHealth() / this.getMaxHealth();
        if (healthAmount <= 0.5F) {
            holdWeapon = false;
        }
        if (guard_cooldown > 0) guard_cooldown--;
        if (jab_straight_cooldown > 0) jab_straight_cooldown--;
        if (straight_cooldown > 0) straight_cooldown--;
    }

    public void aiStep() {
        super.aiStep();
        if (this.getAttackState() == 5) {
            if (this.attackTicks == 9) {
                AreaAttack(6.0f, 3.0F, 50, 1F, 10);
            }
            if (this.attackTicks == 18) {
                float speed = 0.9f;
                float dodgeYaw = (float) Math.toRadians(Werewolf_Entity.this.getYRot() + 90);
                Vec3 m = Werewolf_Entity.this.getDeltaMovement().add(speed * Math.cos(dodgeYaw), 0, speed * Math.sin(dodgeYaw));
                Werewolf_Entity.this.setDeltaMovement(m.x, 0.0, m.z);
            }
            if (this.attackTicks == 30) {
                AreaAttack(6.0f, 3.0F, 60, 1.25F, 30);
            }
        }

        if (this.getAttackState() == 7) {
            if (this.attackTicks == 20) {
                ComboAreaAttack(6.0f, 3.0F, 70, 1, 10);
            }
        }

        if (this.getAttackState() == 10) {
            if (this.attackTicks <= 56 && this.attackTicks >= 4) {
                inBlocking = true;
            } else {
                inBlocking = false;
            }
        }

        if (this.getAttackState() == 11) {
            if (this.attackTicks == 10) {
                float f1 = (float) Math.cos(Math.toRadians(this.getYRot() + 90));
                float f2 = (float) Math.sin(Math.toRadians(this.getYRot() + 90));
                this.push(f1 * 1.3, 0, f2 * 1.3);
                //float speed = 1.4f;
                //float dodgeYaw = (float) Math.toRadians(Werewolf_Entity.this.getYRot() + 90);
                //Vec3 m = Werewolf_Entity.this.getDeltaMovement().add(speed * Math.cos(dodgeYaw), 0, speed * Math.sin(dodgeYaw));
                //Werewolf_Entity.this.setDeltaMovement(m.x, 0.1, m.z);
            }
            if (this.attackTicks == 18) {
                AreaAttack(6.5f, 3.0F, 90, 2.0f,100);
            }
        }

        if (this.getAttackState() == 12) {
            if (this.attackTicks == 7) {
                AreaAttack(4.0f, 3.0F, 50, 1.2f,0);
            }
        }

        if (this.getAttackState() == 13) {
            if (this.attackTicks == 7) {
                AreaAttack(4.0f, 3.0F, 50, 1.0f,0);
            }
        }

        if (this.getAttackState() == 20) {
            LivingEntity target = this.getTarget();
            if (this.attackTicks < 12 && target != null) {
                this.lookAt(target, 0.0F, 0F);
            } else {
                this.setYRot(this.yRotO);
            }
            if (this.attackTicks == 12) {
                double speed = 0.8;

                if (target != null) {
                    double Z = 0.15f * (target.getZ() - this.getZ());
                    double X = 0.15F * (target.getX() - this.getX());

                    double d1 = target.getY() - this.getY();
                    this.setDeltaMovement(X, speed + Mth.clamp(d1 * 0.075, 0.0, 7.0), Z);
                }
            }
            if (this.attackTicks == 23) {
                if (target != null) {
                    double Y = 0.15f * Math.abs(this.getY() - target.getY());
                    double Z = 0.15f * (target.getZ() - this.getZ());
                    double X = 0.15F * (target.getX() - this.getX());
                    this.setDeltaMovement(this.getDeltaMovement().add(X, -1.0d * Y, Z));

                }
            }
            if (this.attackTicks == 28) {
                if (target != null) {
                    AreaAttack(6.0f, 3.0F, 50, 1.0f, 0);
                }
            }
        }
    }

    public boolean isHoldweapon() {
        return this.holdWeapon;
    }

    public void addAdditionalSaveData(CompoundTag compound) {
        super.addAdditionalSaveData(compound);
        compound.putBoolean("isHoldweapon", isHoldweapon());
    }

    private void AreaAttack(float range, float height, float arc, float damage, int shieldbreakticks) {
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
                if (!isAlliedTo(entityHit) && !(entityHit instanceof Werewolf_Entity) && entityHit != this) {
                    boolean flag = entityHit.hurt(damagesource, (float) (this.getAttributeValue(Attributes.ATTACK_DAMAGE) * damage));
                    if (flag) {
                    }
                    if (entityHit.isDamageSourceBlocked(damagesource) && entityHit instanceof Player player && shieldbreakticks > 0) {
                        disableShield(player, shieldbreakticks);
                    }

                }
            }
        }
    }

    private void ComboAreaAttack(float range, float height, float arc, float damage, int shieldbreakticks) {
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
                if (!isAlliedTo(entityHit) && !(entityHit instanceof Werewolf_Entity) && entityHit != this) {
                    DamageSource damagesource = this.damageSources().mobAttack(this);
                    boolean flag = entityHit.hurt(damagesource, (float) (this.getAttributeValue(Attributes.ATTACK_DAMAGE) * damage));
                    if (flag) {
                        combo = true;
                    }
                    if (entityHit.isDamageSourceBlocked(damagesource) && entityHit instanceof Player player && shieldbreakticks > 0) {
                        disableShield(player, shieldbreakticks);
                    }
                }
            }
        }
    }

    private void CollisionParticle(int count, float scale, float sizeModifier) {
        if (this.level().isClientSide) {
            double phi = Math.PI * (3 - Math.sqrt(5));
            if (count > 0) count += this.random.nextInt(5);
            float width = this.getBbWidth() * sizeModifier;
            for (int i = 0; i < count; i++) {
                Vec3 pos = this.getPosOffset(this.random.nextBoolean(), 1.45F, (this.random.nextIntBetweenInclusive(-10, 10) * 0.1F) * width, this.getBbHeight() * 0.625F);
                double theta = phi * i;
                double y = 1 - (i / (count - 1D)) * 2;
                double radius = Math.sqrt(1 - y * y);
                double x = Math.cos(theta) * radius;
                double z = Math.sin(theta) * radius;
                float sideOffset = (float) (random.nextGaussian() * 0.2D) * (random.nextBoolean() ? 1 : -1);
                AdvancedParticleHelper.spawnParticle(this.level(), ParticleRegistry.ADV_ORB.get(), pos.x, pos.y, pos.z, x * (sizeModifier + sideOffset), y * sizeModifier, z * (sizeModifier + sideOffset), true, 0, 0, 0, 45, 0.5 * (scale), 230F / 255F, 230F / 255F, 104F / 255F, 0.0F, 2.5F, 5,
                        true, true, false, new ParticleComponent[]{
                                new RibbonComponent(ParticleRegistry.FLAT_RIBBON.get(), 5, 0, 0, 0, 0.01, 196F / 255F, 196F / 255F, 86F / 255F, 0.8F, true, true,
                                        new ParticleComponent[]{
                                                new RibbonComponent.PropertyOverLength(RibbonComponent.PropertyOverLength.EnumRibbonProperty.ALPHA, AnimData.KeyTrack.startAndEnd(1.0F, 0.0F)),
                                                new RibbonComponent.PropertyOverLength(RibbonComponent.PropertyOverLength.EnumRibbonProperty.SCALE, AnimData.KeyTrack.startAndEnd(0.0F * (scale), (scale)))
                                        }, false),
                        });
            }
        }
    }

    public Vec3 getPosOffset(boolean right, float frontBack, float leftRight, float height) {
        double yawRadians = Math.toRadians(this.getYRot() + 90.0F);
        double pitchRadians = Math.toRadians(this.getYRot() + (right ? 180 : 0));
        double x = this.getX() + frontBack * Math.cos(yawRadians) + (leftRight * Math.cos(pitchRadians));
        double y = this.getY() + height;
        double z = this.getZ() + frontBack * Math.sin(yawRadians) + (leftRight * Math.sin(pitchRadians));
        return new Vec3(x, y, z);
    }

    protected SoundEvent getHurtSound(DamageSource damageSourceIn) {
        return SoundRegistry.WEREWOLF_HURT.get();
    }

    protected SoundEvent getDeathSound() {
        return SoundEvents.IRON_GOLEM_DEATH;
    }

    public float MaxDamageCap() {
        return 150.0f;
    }

    public float HardDamageCap() {
        return 35.0f;
    }

    public float SoftDamageCap() {
        return 15.0f;
    }

    public void setFlying(boolean flying) {
        this.entityData.set(FLYING, flying);
    }

    public void die(DamageSource p_21014_) {
        super.die(p_21014_);
        this.setAttackState(14);
    }

    public int deathtimer(){
        return 60;
    }

    protected int decreaseAirSupply(int air) {
        return air;
    }

    public boolean causeFallDamage(float p_148711_, float p_148712_, DamageSource p_148713_) {
        return false;
    }

    @Override
    protected BodyRotationControl createBodyControl() {
        return new SmartBodyHelper2(this);
    }

    protected PathNavigation createNavigation(Level worldIn) {
        return new CMPathNavigateGround(this, worldIn);
    }

    public boolean canBeAffected(MobEffectInstance p_34192_) {
        return p_34192_.getEffect() != EffectRegistry.EFFECTSTUN.get() && super.canBeAffected(p_34192_);
    }

    public boolean checkSpawnRules(LevelAccessor worldIn, MobSpawnType spawnReasonIn) {
        return EntityRegistry.rollSpawn(1, this.getRandom(), spawnReasonIn) && super.checkSpawnRules(worldIn, spawnReasonIn);
    }

    public static boolean canSoulKnightspawnSpawnRules(EntityType<? extends Werewolf_Entity> p_219020_, LevelAccessor p_219021_, MobSpawnType p_219022_, BlockPos p_219023_, RandomSource p_219024_) {
        return checkAnyLightMonsterSpawnRules(p_219020_, p_219021_, p_219022_, p_219023_, p_219024_);
    }

    protected boolean shouldDespawnInPeaceful() {
        return false;
    }

    protected boolean canRide(Entity p_31508_) {
        return false;
    }
}




