package com.github.printa.arsenal.server.entity.InternalAnimationMonster.AI;

import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Internal_Animation_Monster;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.Goal;

import java.util.EnumSet;

public class InternalAttackGoal extends Goal {
    protected final Internal_Animation_Monster entity;
    private final int dependencePatternId;
    private final int patternId;
    private final int endPatternId;
    private final int attack_length_tick;
    private final int fix_look;
    private final float maximumRange;

    public InternalAttackGoal(Internal_Animation_Monster entity, int dependenceAttackId, int patternId, int endPatternId, int attack_length_tick, int fix_look, float maximumRange) {
        this(entity, dependenceAttackId, patternId, endPatternId, attack_length_tick, fix_look, maximumRange, EnumSet.of(Flag.MOVE, Flag.LOOK, Flag.JUMP));
    }

    public InternalAttackGoal(Internal_Animation_Monster entity, int dependencePatternId, int patternId, int endPatternId,int attack_length_tick,int fix_look,float maximumRange, EnumSet<Flag> interruptFlagTypes) {
        setFlags(interruptFlagTypes);
        this.entity = entity;
        this.dependencePatternId = dependencePatternId;
        this.patternId = patternId;
        this.endPatternId = endPatternId;
        this.attack_length_tick = attack_length_tick;
        this.fix_look = fix_look;
        this.maximumRange = maximumRange;
    }

    @Override
    public boolean canUse() {
        LivingEntity target = entity.getTarget();
        return target != null && target.isAlive() && this.entity.distanceTo(target) < maximumRange && this.entity.getAttackState() == dependencePatternId;
    }

    @Override
    public void start() {
        this.entity.setAttackState(patternId);
    }

    @Override
    public void stop() {
        this.entity.setAttackState(endPatternId);
    }

    @Override
    public boolean canContinueToUse() {
        return  this.entity.getAttackState() == patternId && this.entity.attackTicks <= attack_length_tick;
    }

    public void tick() {
        LivingEntity target = entity.getTarget();
        if (entity.attackTicks < fix_look && target != null) {
            entity.getLookControl().setLookAt(target, 30.0F, 30.0F);
            entity.lookAt(target, 30.0F, 30.0F);
        } else {
            entity.setYRot(entity.yRotO);
        }
    }

    @Override
    public boolean requiresUpdateEveryTick() {
        return false;
    }

}