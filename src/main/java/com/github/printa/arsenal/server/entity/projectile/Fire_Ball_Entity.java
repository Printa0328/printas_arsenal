package com.github.printa.arsenal.server.entity.projectile;

import com.github.printa.arsenal.client.particle.util.*;
import com.github.printa.arsenal.server.registries.ParticleRegistry;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.HitResult;
import net.minecraft.world.phys.Vec3;

public class Fire_Ball_Entity extends SpellProjectileEntity {
    public Fire_Ball_Entity(EntityType<? extends SpellProjectileEntity> entityTypeIn, Level worldIn) {
        super(entityTypeIn, worldIn);
    }

    @Override
    public void tick() {
        super.tick();
        if (level().isClientSide) {
            Vec3 motion = getDeltaMovement();
            Vec3 pos = position();
            Vec3 norm = motion.normalize().scale(0.025f);
            for (int i = 0; i < 8; i++) {
                double lerpX = Mth.lerp(i / 8.0f, xOld, pos.x);
                double lerpY = Mth.lerp(i / 8.0f, yOld, pos.y);
                double lerpZ = Mth.lerp(i / 8.0f, zOld, pos.z);
                Particles.create(ParticleRegistry.WISP2)
                        .addVelocity(-norm.x, -norm.y, -norm.z)
                        .setAlpha(0.0625f, 0).setScale(0.625f, 0)
                        .setColor(0.75f, 1, 1, 0.375f, 0.5f, 0.75f)
                        .setLifetime(5)
                        .spawn(this.level(), lerpX, lerpY, lerpZ);
                Particles.create(ParticleRegistry.WISP2)
                        .addVelocity(-norm.x, -norm.y, -norm.z)
                        .setAlpha(0.125f, 0).setScale(0.25f, 0.125f)
                        .setColor(0.678f, 0.631f, 1, 0.251f, 0.875f, 0.75f)
                        .setLifetime(20)
                        .spawn(this.level(), lerpX, lerpY, lerpZ);
            }
        }
    }

    @Override
    protected void onImpact(HitResult ray, Entity target) {

        Entity caster = getOwner();
        handleSpellDamage(caster, target, target.damageSources().indirectMagic(this, caster), 4.0f);

        onImpact(ray);
    }

    @Override
    protected void onImpact(HitResult ray) {
        kill();
        if (!level().isClientSide) {
            Vec3 pos = ray.getLocation();
        }
    }
}
