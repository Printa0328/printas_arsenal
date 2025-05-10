package com.github.printa.arsenal.client.model.entity;

import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Soul_knight_Entity;
import com.github.printa.arsenal.client.animation.Soul_knight_Animation;
import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedEntityModel;
import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedModelBox;
import com.github.L_Ender.lionfishapi.client.model.tools.BasicModelPart;
import com.google.common.collect.ImmutableList;

public class Soul_knight_Model extends AdvancedEntityModel<Soul_knight_Entity> {
	private final AdvancedModelBox root;
	private final AdvancedModelBox pelvis;
	private final AdvancedModelBox waist;
	private final AdvancedModelBox left_arm;
	private final AdvancedModelBox cube_r1;
	private final AdvancedModelBox left_arm_joint;
	private final AdvancedModelBox weapon;
	private final AdvancedModelBox head;
	private final AdvancedModelBox cube_r2;
	private final AdvancedModelBox fire;
	private final AdvancedModelBox cube_r3;
	private final AdvancedModelBox right_arm;
	private final AdvancedModelBox cube_r4;
	private final AdvancedModelBox right_arm_joint;
	private final AdvancedModelBox mark;
	private final AdvancedModelBox cape;
	private final AdvancedModelBox cape_right_1;
	private final AdvancedModelBox cape_left_1;
	private final AdvancedModelBox right_leg;
	private final AdvancedModelBox right_leg_joint;
	private final AdvancedModelBox left_leg;
	private final AdvancedModelBox left_leg_joint;

	public Soul_knight_Model() {
		texWidth = 256;
		texHeight = 256;

		root = new AdvancedModelBox(this,"root");
		root.setRotationPoint(0.0F, 24.0F, 0.0F);


		pelvis = new AdvancedModelBox(this,"pelvis");
		pelvis.setRotationPoint(0.0F, -27.0F, 0.0F);
		root.addChild(pelvis);
		pelvis.setTextureOffset(92, 90).addBox(-10.0F, 0.0F, -5.0F, 20.0F, 9.0F, 9.0F, 0.0F, false);

		waist = new AdvancedModelBox(this,"waist");
		waist.setRotationPoint(0.0F, 0.0F, 0.0F);
		pelvis.addChild(waist);
		waist.setTextureOffset(0, 66).addBox(-11.5F, -16.0F, -6.0F, 23.0F, 16.0F, 11.0F, 0.0F, false);
		waist.setTextureOffset(68, 66).addBox(-10.5F, 0.0F, -5.5F, 21.0F, 14.0F, 10.0F, 0.0F, false);

		left_arm = new AdvancedModelBox(this,"left_arm");
		left_arm.setRotationPoint(11.5F, -16.0F, -0.5F);
		waist.addChild(left_arm);
		setRotationAngle(left_arm, -0.7854F, 0.0F, 0.0F);
		left_arm.setTextureOffset(112, 28).addBox(0.0F, 0.0F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);

		cube_r1 = new AdvancedModelBox(this,"cube_r1");
		cube_r1.setRotationPoint(11.5F, 25.0F, 1.0F);
		left_arm.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 0.1309F);
		cube_r1.setTextureOffset(112, 0).addBox(-16.0F, -27.0F, -6.0F, 12.0F, 4.0F, 10.0F, 0.0F, false);

		left_arm_joint = new AdvancedModelBox(this,"left_arm_joint");
		left_arm_joint.setRotationPoint(4.0F, 12.0F, 0.0F);
		left_arm.addChild(left_arm_joint);
		setRotationAngle(left_arm_joint, -1.7374F, -0.0522F, -0.3011F);
		left_arm_joint.setTextureOffset(124, 108).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);

		weapon = new AdvancedModelBox(this,"weapon");
		weapon.setRotationPoint(0.0F, 9.0F, 0.5F);
		left_arm_joint.addChild(weapon);
		setRotationAngle(weapon, 1.5708F, 0.0F, -1.5708F);
		weapon.setTextureOffset(0, 240).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 14.0F, 2.0F, 0.0F, false);
		weapon.setTextureOffset(8, 230).addBox(-4.5F, -33.0F, -1.0F, 9.0F, 24.0F, 2.0F, 0.0F, false);
		weapon.setTextureOffset(47, 223).addBox(-5.5F, -42.5F, 0.0F, 11.0F, 10.0F, 0.0F, 0.0F, false);
		weapon.setTextureOffset(0, 206).addBox(-11.0F, -9.0F, -1.5F, 22.0F, 2.0F, 3.0F, 0.0F, false);
		weapon.setTextureOffset(33, 242).addBox(-11.0F, -10.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		weapon.setTextureOffset(31, 236).addBox(-1.5F, 6.5F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		weapon.setTextureOffset(35, 252).addBox(8.0F, -10.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		head = new AdvancedModelBox(this,"head");
		head.setRotationPoint(0.0F, -16.0F, 0.0F);
		waist.addChild(head);
		head.setTextureOffset(0, 43).addBox(-9.0F, -4.0F, -10.0F, 18.0F, 4.0F, 19.0F, 0.0F, false);

		cube_r2 = new AdvancedModelBox(this,"cube_r2");
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		head.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.setTextureOffset(74, 43).addBox(-2.0F, -2.0F, -11.0F, 4.0F, 4.0F, 0.0F, 0.0F, false);

		fire = new AdvancedModelBox(this,"fire");
		fire.setRotationPoint(0.0F, 7.0F, -0.4F);
		head.addChild(fire);


		cube_r3 = new AdvancedModelBox(this,"cube_r3");
		cube_r3.setRotationPoint(4.25F, 0.0F, 5.65F);
		fire.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, -0.7854F, 0.0F);
		cube_r3.setTextureOffset(212, 235).addBox(-18.0F, -32.0F, -1.0F, 22.0F, 21.0F, 0.0F, 0.0F, false);
		cube_r3.setTextureOffset(212, 192).addBox(-7.0F, -32.0F, -12.0F, 0.0F, 21.0F, 22.0F, 0.0F, false);

		right_arm = new AdvancedModelBox(this,"right_arm");
		right_arm.setRotationPoint(-15.5F, -16.0F, -0.5F);
		waist.addChild(right_arm);
		right_arm.setTextureOffset(112, 28).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);

		cube_r4 = new AdvancedModelBox(this,"cube_r4");
		cube_r4.setRotationPoint(-7.5F, 25.0F, 1.0F);
		right_arm.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.1309F);
		cube_r4.setTextureOffset(112, 14).addBox(4.0F, -27.0F, -6.0F, 12.0F, 4.0F, 10.0F, 0.0F, false);

		right_arm_joint = new AdvancedModelBox(this,"right_arm_joint");
		right_arm_joint.setRotationPoint(0.0F, 12.0F, 0.0F);
		right_arm.addChild(right_arm_joint);
		right_arm_joint.setTextureOffset(124, 108).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 12.0F, 8.0F, 0.0F, false);

		mark = new AdvancedModelBox(this,"mark");
		mark.setRotationPoint(0.0F, 0.0F, -6.0F);
		waist.addChild(mark);
		mark.setTextureOffset(44, 93).addBox(-5.0F, 0.0F, 0.0F, 10.0F, 15.0F, 0.0F, 0.0F, false);

		cape = new AdvancedModelBox(this,"cape");
		cape.setRotationPoint(0.0F, -16.0F, 6.0F);
		waist.addChild(cape);
		cape.setTextureOffset(0, 0).addBox(-22.0F, 0.0F, 0.0F, 44.0F, 43.0F, 0.0F, 0.0F, false);

		cape_right_1 = new AdvancedModelBox(this,"cape_right_1");
		cape_right_1.setRotationPoint(22.0F, 0.0F, 0.001F);
		cape.addChild(cape_right_1);
		cape_right_1.setTextureOffset(66, 89).addBox(0.0F, 0.0F, -13.0F, 0.0F, 43.0F, 13.0F, 0.0F, false);

		cape_left_1 = new AdvancedModelBox(this,"cape_left_1");
		cape_left_1.setRotationPoint(-22.0F, 0.0F, 0.001F);
		cape.addChild(cape_left_1);
		cape_left_1.setTextureOffset(66, 89).addBox(0.0F, 0.0F, -13.0F, 0.0F, 43.0F, 13.0F, 0.0F, false);

		right_leg = new AdvancedModelBox(this,"right_leg");
		right_leg.setRotationPoint(-5.0F, -18.0F, -0.5F);
		root.addChild(right_leg);
		right_leg.setTextureOffset(156, 108).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

		right_leg_joint = new AdvancedModelBox(this,"right_leg_joint");
		right_leg_joint.setRotationPoint(0.0F, 9.0F, -4.0F);
		right_leg.addChild(right_leg_joint);
		right_leg_joint.setTextureOffset(123, 128).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

		left_leg = new AdvancedModelBox(this,"left_leg");
		left_leg.setRotationPoint(5.0F, -18.0F, -0.5F);
		root.addChild(left_leg);
		left_leg.setTextureOffset(156, 108).addBox(-4.0F, 0.0F, -4.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);

		left_leg_joint = new AdvancedModelBox(this,"left_leg_joint");
		left_leg_joint.setRotationPoint(0.0F, 9.0F, -4.0F);
		left_leg.addChild(left_leg_joint);
		left_leg_joint.setTextureOffset(123, 128).addBox(-4.0F, 0.0F, 0.0F, 8.0F, 9.0F, 8.0F, 0.0F, false);
		this.updateDefaultPose();
	}

	@Override
	public void setupAnim(Soul_knight_Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

		this.resetToDefaultPose();
		//this.faceTarget(netHeadYaw, headPitch, 1, head);
		this.animateWalk(Soul_knight_Animation.WALK, limbSwing, limbSwingAmount, 1.0F, 4.0F);
		this.animate(entity.getAnimationState("idle"), Soul_knight_Animation.IDLE, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("death"), Soul_knight_Animation.DEATH, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("attack1"), Soul_knight_Animation.ATTACK1, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("attack2_1"), Soul_knight_Animation.ATTACK2_1, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("attack2_2"), Soul_knight_Animation.ATTACK2_2, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("attack3"), Soul_knight_Animation.ATTACK3, ageInTicks, 1.0F);
	}

	public void setRotationAngle(AdvancedModelBox AdvancedModelBox, float x, float y, float z) {
		AdvancedModelBox.rotateAngleX = x;
		AdvancedModelBox.rotateAngleY = y;
		AdvancedModelBox.rotateAngleZ = z;
	}

	@Override
	public Iterable<BasicModelPart> parts() {
		return ImmutableList.of(root);
	}

	@Override
	public Iterable<AdvancedModelBox> getAllParts() {
		return ImmutableList.of( root,
				pelvis,
				waist,
				left_arm_joint,
				right_arm_joint,
				weapon,
				mark,
				left_leg_joint,
				right_leg_joint,
				cape,
				fire,
				cape_left_1,
				cape_right_1,
				right_arm,
				left_arm,
				head,
				right_leg,
				cube_r1,
				cube_r2,
				cube_r3,
				cube_r4,
				left_leg);
	}
}