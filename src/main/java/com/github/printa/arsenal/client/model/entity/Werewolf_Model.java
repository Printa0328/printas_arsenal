package com.github.printa.arsenal.client.model.entity;

import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedEntityModel;
import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedModelBox;
import com.github.L_Ender.lionfishapi.client.model.tools.BasicModelPart;
import com.github.printa.arsenal.client.animation.Werewolf_Animation;
import com.github.printa.arsenal.server.entity.InternalAnimationMonster.Werewolf_Entity;
import com.google.common.collect.ImmutableList;

public class Werewolf_Model extends AdvancedEntityModel<Werewolf_Entity> {
	private final AdvancedModelBox root;
	private final AdvancedModelBox mid_root_controller;
	private final AdvancedModelBox mid_root;
	private final AdvancedModelBox legs;
	private final AdvancedModelBox left_leg;
	private final AdvancedModelBox left_fore_leg;
	private final AdvancedModelBox cube_r1;
	private final AdvancedModelBox left_toes;
	private final AdvancedModelBox right_leg;
	private final AdvancedModelBox right_fore_leg;
	private final AdvancedModelBox cube_r2;
	private final AdvancedModelBox right_toes;
	private final AdvancedModelBox pelvis;
	private final AdvancedModelBox lower_body;
	private final AdvancedModelBox cube_r3;
	private final AdvancedModelBox body;
	private final AdvancedModelBox cube_r4;
	private final AdvancedModelBox cube_r5;
	private final AdvancedModelBox cube_r6;
	private final AdvancedModelBox cube_r7;
	private final AdvancedModelBox cube_r8;
	private final AdvancedModelBox cube_r9;
	private final AdvancedModelBox cube_r10;
	private final AdvancedModelBox cube_r11;
	private final AdvancedModelBox cube_r12;
	private final AdvancedModelBox cube_r13;
	private final AdvancedModelBox neck;
	private final AdvancedModelBox cube_r14;
	private final AdvancedModelBox head;
	private final AdvancedModelBox cube_r15;
	private final AdvancedModelBox cube_r16;
	private final AdvancedModelBox cube_r17;
	private final AdvancedModelBox cube_r18;
	private final AdvancedModelBox cube_r19;
	private final AdvancedModelBox cube_r20;
	private final AdvancedModelBox cube_r21;
	private final AdvancedModelBox cube_r22;
	private final AdvancedModelBox left_ear;
	private final AdvancedModelBox cube_r23;
	private final AdvancedModelBox piercing;
	private final AdvancedModelBox right_ear;
	private final AdvancedModelBox cube_r24;
	private final AdvancedModelBox snout;
	private final AdvancedModelBox cube_r25;
	private final AdvancedModelBox jaw;
	private final AdvancedModelBox cube_r26;
	private final AdvancedModelBox nose;
	private final AdvancedModelBox cube_r27;
	private final AdvancedModelBox right_arm;
	private final AdvancedModelBox cube_r28;
	private final AdvancedModelBox cube_r29;
	private final AdvancedModelBox cube_r30;
	private final AdvancedModelBox right_fore_arm;
	private final AdvancedModelBox cube_r31;
	private final AdvancedModelBox right_fist;
	private final AdvancedModelBox right_fist1;
	private final AdvancedModelBox right_fist2;
	private final AdvancedModelBox cube_r32;
	private final AdvancedModelBox right_fist3;
	private final AdvancedModelBox cube_r33;
	private final AdvancedModelBox right_fist4;
	private final AdvancedModelBox cube_r34;
	private final AdvancedModelBox right_fist5;
	private final AdvancedModelBox cube_r35;
	private final AdvancedModelBox weapon;
	private final AdvancedModelBox cube_r36;
	private final AdvancedModelBox cube_r37;
	private final AdvancedModelBox cube_r38;
	private final AdvancedModelBox cube_r39;
	private final AdvancedModelBox cube_r40;
	private final AdvancedModelBox left_arm;
	private final AdvancedModelBox cube_r41;
	private final AdvancedModelBox cube_r42;
	private final AdvancedModelBox cube_r43;
	private final AdvancedModelBox left_fore_arm;
	private final AdvancedModelBox cube_r44;
	private final AdvancedModelBox left_fist;
	private final AdvancedModelBox left_fist1;
	private final AdvancedModelBox left_fist2;
	private final AdvancedModelBox cube_r45;
	private final AdvancedModelBox left_fist3;
	private final AdvancedModelBox cube_r46;
	private final AdvancedModelBox left_fist4;
	private final AdvancedModelBox cube_r47;
	private final AdvancedModelBox left_fist5;
	private final AdvancedModelBox cube_r48;
	private final AdvancedModelBox tail1;
	private final AdvancedModelBox tail2;
	private final AdvancedModelBox tail3;

	public Werewolf_Model() {
		texWidth = 256;
		texHeight = 256;

		root = new AdvancedModelBox(this,"root");
		root.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		mid_root_controller = new AdvancedModelBox(this,"mid_root_controller");
		mid_root_controller.setRotationPoint(-0.0266F, -0.1F, 0.0515F);
		root.addChild(mid_root_controller);
		

		mid_root = new AdvancedModelBox(this,"mid_root");
		mid_root.setRotationPoint(5.0F, -31.2922F, -3.0F);
		mid_root_controller.addChild(mid_root);
		

		legs = new AdvancedModelBox(this,"legs");
		legs.setRotationPoint(-4.9734F, 3.6672F, 2.9485F);
		mid_root.addChild(legs);
		

		left_leg = new AdvancedModelBox(this,"left_leg");
		left_leg.setRotationPoint(4.4F, 1.225F, -4.0F);
		legs.addChild(left_leg);
		setRotationAngle(left_leg, 0.1306F, -0.1128F, -0.1468F);
		left_leg.setTextureOffset(78, 42).addBox(-3.9F, -2.0F, -2.0F, 7.0F, 15.0F, 7.0F, 0.0F, false);

		left_fore_leg = new AdvancedModelBox(this,"left_fore_leg");
		left_fore_leg.setRotationPoint(-0.4F, 11.4F, 2.5F);
		left_leg.addChild(left_fore_leg);
		setRotationAngle(left_fore_leg, -0.2555F, -0.0072F, -0.056F);
		left_fore_leg.setTextureOffset(32, 100).addBox(-3.0F, -1.9F, -1.5F, 6.0F, 15.0F, 6.0F, 0.0F, false);

		cube_r1 = new AdvancedModelBox(this,"cube_r1");
		cube_r1.setRotationPoint(-0.0023F, 2.2849F, 4.2136F);
		left_fore_leg.addChild(cube_r1);
		setRotationAngle(cube_r1, 1.5708F, -1.5097F, 1.5708F);
		cube_r1.setTextureOffset(66, 48).addBox(0.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		left_toes = new AdvancedModelBox(this,"left_toes");
		left_toes.setRotationPoint(0.0F, 13.1F, 1.5F);
		left_fore_leg.addChild(left_toes);
		setRotationAngle(left_toes, 0.1302F, -0.0114F, 0.1304F);
		left_toes.setTextureOffset(66, 96).addBox(-3.0F, -1.0F, -7.0F, 6.0F, 3.0F, 10.0F, 0.0F, false);
		left_toes.setTextureOffset(22, 84).addBox(-3.0F, 0.0F, -9.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		left_toes.setTextureOffset(22, 84).addBox(-0.5F, 0.0F, -9.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		left_toes.setTextureOffset(22, 84).addBox(2.0F, 0.0F, -9.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		right_leg = new AdvancedModelBox(this,"right_leg");
		right_leg.setRotationPoint(-4.4F, 1.225F, -4.0F);
		legs.addChild(right_leg);
		setRotationAngle(right_leg, 0.1343F, 0.0317F, 0.0923F);
		right_leg.setTextureOffset(38, 78).addBox(-3.1F, -2.0F, -2.0F, 7.0F, 15.0F, 7.0F, 0.0F, false);

		right_fore_leg = new AdvancedModelBox(this,"right_fore_leg");
		right_fore_leg.setRotationPoint(0.4F, 11.4F, 2.5F);
		right_leg.addChild(right_fore_leg);
		setRotationAngle(right_fore_leg, -0.247F, 0.0083F, 0.0892F);
		right_fore_leg.setTextureOffset(98, 80).addBox(-3.0F, -1.9F, -1.5F, 6.0F, 15.0F, 6.0F, 0.0F, false);

		cube_r2 = new AdvancedModelBox(this,"cube_r2");
		cube_r2.setRotationPoint(0.0023F, 2.2849F, 4.2136F);
		right_fore_leg.addChild(cube_r2);
		setRotationAngle(cube_r2, 1.5708F, 1.5097F, -1.5708F);
		cube_r2.setTextureOffset(66, 48).addBox(-5.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, true);

		right_toes = new AdvancedModelBox(this,"right_toes");
		right_toes.setRotationPoint(0.0F, 13.1F, 1.5F);
		right_fore_leg.addChild(right_toes);
		setRotationAngle(right_toes, 0.1298F, 0.017F, -0.1298F);
		right_toes.setTextureOffset(0, 88).addBox(-3.0F, -1.0F, -7.0F, 6.0F, 3.0F, 10.0F, 0.0F, false);
		right_toes.setTextureOffset(22, 84).addBox(2.0F, 0.0F, -9.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		right_toes.setTextureOffset(22, 84).addBox(-0.5F, 0.0F, -9.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);
		right_toes.setTextureOffset(22, 84).addBox(-3.0F, 0.0F, -9.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		pelvis = new AdvancedModelBox(this,"pelvis");
		pelvis.setRotationPoint(-5.0F, 3.0F, 1.0F);
		mid_root.addChild(pelvis);
		setRotationAngle(pelvis, -0.2182F, 0.0F, 0.0F);
		

		lower_body = new AdvancedModelBox(this,"lower_body");
		lower_body.setRotationPoint(0.1266F, -4.5078F, 1.7485F);
		pelvis.addChild(lower_body);
		

		cube_r3 = new AdvancedModelBox(this,"cube_r3");
		cube_r3.setRotationPoint(0.4F, 4.5F, -0.75F);
		lower_body.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.1309F, 0.0F, 0.0F);
		cube_r3.setTextureOffset(40, 57).addBox(-6.0F, -11.0F, -4.05F, 11.0F, 13.0F, 8.0F, 0.0F, false);

		body = new AdvancedModelBox(this,"body");
		body.setRotationPoint(-0.1F, -2.5F, 0.7F);
		lower_body.addChild(body);
		setRotationAngle(body, 0.2182F, 0.0F, 0.0F);
		

		cube_r4 = new AdvancedModelBox(this,"cube_r4");
		cube_r4.setRotationPoint(3.0F, -11.612F, 4.6573F);
		body.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0873F, 0.0F, 0.0F);
		cube_r4.setTextureOffset(12, 0).addBox(-12.0F, -4.0F, -11.0F, 18.0F, 13.0F, 10.0F, 0.0F, false);

		cube_r5 = new AdvancedModelBox(this,"cube_r5");
		cube_r5.setRotationPoint(-9.6023F, -14.8151F, -1.1864F);
		body.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.6461F, -0.4524F, -1.9435F);
		cube_r5.setTextureOffset(66, 48).addBox(0.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r6 = new AdvancedModelBox(this,"cube_r6");
		cube_r6.setRotationPoint(-5.9023F, -14.9151F, -2.0864F);
		body.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.9622F, -0.2903F, -2.0716F);
		cube_r6.setTextureOffset(66, 48).addBox(0.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r7 = new AdvancedModelBox(this,"cube_r7");
		cube_r7.setRotationPoint(-2.2977F, -16.5151F, -3.9864F);
		body.addChild(cube_r7);
		setRotationAngle(cube_r7, 2.0661F, 0.1602F, -0.3427F);
		cube_r7.setTextureOffset(66, 48).addBox(-5.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, true);

		cube_r8 = new AdvancedModelBox(this,"cube_r8");
		cube_r8.setRotationPoint(5.9023F, -14.9151F, -2.0864F);
		body.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.9622F, 0.2903F, 2.0716F);
		cube_r8.setTextureOffset(66, 48).addBox(-5.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, true);

		cube_r9 = new AdvancedModelBox(this,"cube_r9");
		cube_r9.setRotationPoint(2.2977F, -16.5151F, -3.9864F);
		body.addChild(cube_r9);
		setRotationAngle(cube_r9, 2.0661F, -0.1602F, 0.3427F);
		cube_r9.setTextureOffset(66, 48).addBox(0.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r10 = new AdvancedModelBox(this,"cube_r10");
		cube_r10.setRotationPoint(9.6023F, -14.8151F, -1.1864F);
		body.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.6461F, 0.4524F, 1.9435F);
		cube_r10.setTextureOffset(66, 48).addBox(-5.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, true);

		cube_r11 = new AdvancedModelBox(this,"cube_r11");
		cube_r11.setRotationPoint(0.1023F, -8.2151F, -6.0864F);
		body.addChild(cube_r11);
		setRotationAngle(cube_r11, -2.6129F, -1.3118F, -0.6757F);
		cube_r11.setTextureOffset(66, 48).addBox(-4.7395F, 0.2772F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, true);

		cube_r12 = new AdvancedModelBox(this,"cube_r12");
		cube_r12.setRotationPoint(-0.1023F, -8.2151F, -6.0864F);
		body.addChild(cube_r12);
		setRotationAngle(cube_r12, -2.6129F, 1.3118F, 0.6757F);
		cube_r12.setTextureOffset(66, 48).addBox(-0.2605F, 0.2772F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r13 = new AdvancedModelBox(this,"cube_r13");
		cube_r13.setRotationPoint(-0.0023F, -2.0151F, -3.1864F);
		body.addChild(cube_r13);
		setRotationAngle(cube_r13, -1.5708F, 1.2043F, 1.5708F);
		cube_r13.setTextureOffset(66, 54).addBox(0.0F, -1.2F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, false);

		neck = new AdvancedModelBox(this,"neck");
		neck.setRotationPoint(-0.1F, -15.7331F, 2.2777F);
		body.addChild(neck);
		

		cube_r14 = new AdvancedModelBox(this,"cube_r14");
		cube_r14.setRotationPoint(0.2F, 0.6F, -0.8F);
		neck.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.4887F, 0.0F, 0.0F);
		cube_r14.setTextureOffset(110, 64).addBox(-2.6F, -6.0092F, -5.4519F, 5.0F, 7.0F, 7.0F, 0.0F, false);

		head = new AdvancedModelBox(this,"head");
		head.setRotationPoint(0.1F, -2.6603F, -3.6332F);
		neck.addChild(head);
		setRotationAngle(head, 0.0873F, 0.0F, 0.0F);
		

		cube_r15 = new AdvancedModelBox(this,"cube_r15");
		cube_r15.setRotationPoint(3.28F, -5.12F, -6.94F);
		head.addChild(cube_r15);
		setRotationAngle(cube_r15, 0.3065F, 0.0832F, 0.0263F);
		cube_r15.setTextureOffset(56, 123).addBox(-3.1882F, -0.1442F, -0.0275F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r16 = new AdvancedModelBox(this,"cube_r16");
		cube_r16.setRotationPoint(-3.28F, -5.12F, -6.94F);
		head.addChild(cube_r16);
		setRotationAngle(cube_r16, 0.3065F, -0.0832F, -0.0263F);
		cube_r16.setTextureOffset(82, 109).addBox(0.1882F, -0.1442F, -0.0275F, 3.0F, 2.0F, 4.0F, 0.0F, false);

		cube_r17 = new AdvancedModelBox(this,"cube_r17");
		cube_r17.setRotationPoint(-1.92F, -1.82F, -5.48F);
		head.addChild(cube_r17);
		setRotationAngle(cube_r17, 0.1309F, 0.0F, 0.0F);
		cube_r17.setTextureOffset(32, 84).addBox(-1.2F, -2.2F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);
		cube_r17.setTextureOffset(28, 84).addBox(5.04F, -2.2F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, false);

		cube_r18 = new AdvancedModelBox(this,"cube_r18");
		cube_r18.setRotationPoint(-0.0023F, -3.4217F, 0.6692F);
		head.addChild(cube_r18);
		setRotationAngle(cube_r18, 1.5708F, -1.2043F, -1.5708F);
		cube_r18.setTextureOffset(66, 48).addBox(0.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r19 = new AdvancedModelBox(this,"cube_r19");
		cube_r19.setRotationPoint(-0.0023F, 1.6783F, -3.6308F);
		head.addChild(cube_r19);
		setRotationAngle(cube_r19, -1.5708F, 1.0297F, 1.5708F);
		cube_r19.setTextureOffset(66, 54).addBox(0.0F, -1.2F, 0.0F, 5.0F, 3.0F, 0.0F, 0.0F, false);

		cube_r20 = new AdvancedModelBox(this,"cube_r20");
		cube_r20.setRotationPoint(2.9977F, -4.4217F, -2.4308F);
		head.addChild(cube_r20);
		setRotationAngle(cube_r20, -0.4173F, -1.0075F, 0.3587F);
		cube_r20.setTextureOffset(66, 48).addBox(0.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r21 = new AdvancedModelBox(this,"cube_r21");
		cube_r21.setRotationPoint(-2.9977F, -4.4217F, -2.4308F);
		head.addChild(cube_r21);
		setRotationAngle(cube_r21, -0.4173F, 1.0075F, -0.3587F);
		cube_r21.setTextureOffset(66, 42).addBox(-5.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r22 = new AdvancedModelBox(this,"cube_r22");
		cube_r22.setRotationPoint(-3.0F, -0.72F, 2.28F);
		head.addChild(cube_r22);
		setRotationAngle(cube_r22, 0.1745F, 0.0F, 0.0F);
		cube_r22.setTextureOffset(102, 0).addBox(0.0F, -6.0F, -8.4F, 6.0F, 6.0F, 8.0F, 0.0F, false);

		left_ear = new AdvancedModelBox(this,"left_ear");
		left_ear.setRotationPoint(3.0F, -6.0F, -3.0F);
		head.addChild(left_ear);
		

		cube_r23 = new AdvancedModelBox(this,"cube_r23");
		cube_r23.setRotationPoint(-1.0F, 0.32F, 0.46F);
		left_ear.addChild(cube_r23);
		setRotationAngle(cube_r23, 0.1888F, -0.206F, 0.1358F);
		cube_r23.setTextureOffset(70, 123).addBox(-1.6F, -6.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, false);

		piercing = new AdvancedModelBox(this,"piercing");
		piercing.setRotationPoint(0.55F, -2.08F, 0.285F);
		left_ear.addChild(piercing);
		setRotationAngle(piercing, 0.3779F, 0.3996F, 0.3492F);
		piercing.setTextureOffset(66, 78).addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);

		right_ear = new AdvancedModelBox(this,"right_ear");
		right_ear.setRotationPoint(-3.0F, -6.0F, -3.0F);
		head.addChild(right_ear);
		

		cube_r24 = new AdvancedModelBox(this,"cube_r24");
		cube_r24.setRotationPoint(1.0F, 0.32F, 0.46F);
		right_ear.addChild(cube_r24);
		setRotationAngle(cube_r24, 0.1888F, 0.206F, -0.1358F);
		cube_r24.setTextureOffset(56, 100).addBox(-2.4F, -6.0F, 0.0F, 4.0F, 6.0F, 0.0F, 0.0F, false);

		snout = new AdvancedModelBox(this,"snout");
		snout.setRotationPoint(0.0F, -3.3F, -6.0F);
		head.addChild(snout);
		

		cube_r25 = new AdvancedModelBox(this,"cube_r25");
		cube_r25.setRotationPoint(-1.1F, 0.54F, 0.0F);
		snout.addChild(cube_r25);
		setRotationAngle(cube_r25, 0.0785F, 0.0F, 0.0F);
		cube_r25.setTextureOffset(28, 121).addBox(-1.4F, -0.6612F, -5.7413F, 5.0F, 2.0F, 6.0F, 0.0F, false);
		cube_r25.setTextureOffset(102, 117).addBox(-1.4F, 1.3388F, -5.7413F, 5.0F, 2.0F, 6.0F, 0.0F, false);

		jaw = new AdvancedModelBox(this,"jaw");
		jaw.setRotationPoint(0.0F, 2.82F, 0.0F);
		snout.addChild(jaw);
		

		cube_r26 = new AdvancedModelBox(this,"cube_r26");
		cube_r26.setRotationPoint(-0.4F, 2.16F, 2.04F);
		jaw.addChild(cube_r26);
		setRotationAngle(cube_r26, 0.0436F, 0.0F, 0.0F);
		cube_r26.setTextureOffset(122, 78).addBox(-1.6F, -3.2F, -7.2F, 4.0F, 2.0F, 6.0F, 0.0F, false);

		nose = new AdvancedModelBox(this,"");
		nose.setRotationPoint(0.0F, 0.0F, -5.7F);
		snout.addChild(nose);
		

		cube_r27 = new AdvancedModelBox(this,"cube_r27");
		cube_r27.setRotationPoint(0.3F, 0.86F, 0.72F);
		nose.addChild(cube_r27);
		setRotationAngle(cube_r27, 0.1047F, 0.0F, 0.0F);
		cube_r27.setTextureOffset(12, 84).addBox(-1.8F, -1.0F, -1.2F, 3.0F, 2.0F, 2.0F, 0.0F, false);

		right_arm = new AdvancedModelBox(this,"right_arm");
		right_arm.setRotationPoint(-9.6F, -11.2F, 0.275F);
		body.addChild(right_arm);
		setRotationAngle(right_arm, 0.0F, 0.0873F, 0.1745F);
		right_arm.setTextureOffset(0, 101).addBox(-6.25F, 3.0F, -3.25F, 7.0F, 9.0F, 7.0F, 0.0F, false);

		cube_r28 = new AdvancedModelBox(this,"cube_r28");
		cube_r28.setRotationPoint(-4.7977F, -3.3151F, -0.9614F);
		right_arm.addChild(cube_r28);
		setRotationAngle(cube_r28, 2.6261F, 0.3797F, 1.2304F);
		cube_r28.setTextureOffset(66, 48).addBox(-5.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, true);

		cube_r29 = new AdvancedModelBox(this,"cube_r29");
		cube_r29.setRotationPoint(-6.2977F, 1.2849F, -0.9614F);
		right_arm.addChild(cube_r29);
		setRotationAngle(cube_r29, -2.8967F, 0.6799F, 0.1106F);
		cube_r29.setTextureOffset(66, 48).addBox(-5.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, true);

		cube_r30 = new AdvancedModelBox(this,"cube_r30");
		cube_r30.setRotationPoint(0.4F, 2.0F, 1.025F);
		right_arm.addChild(cube_r30);
		setRotationAngle(cube_r30, 0.0F, 0.0F, 0.0F);
		cube_r30.setTextureOffset(78, 64).addBox(-7.0F, -6.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		right_fore_arm = new AdvancedModelBox(this,"right_fore_arm");
		right_fore_arm.setRotationPoint(-2.75F, 12.0F, 0.25F);
		right_arm.addChild(right_fore_arm);
		setRotationAngle(right_fore_arm, -0.1309F, 0.0F, -0.1745F);
		right_fore_arm.setTextureOffset(106, 32).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);

		cube_r31 = new AdvancedModelBox(this,"cube_r31");
		cube_r31.setRotationPoint(0.0523F, 4.6849F, 2.2886F);
		right_fore_arm.addChild(cube_r31);
		setRotationAngle(cube_r31, 1.5708F, 1.4312F, -1.5708F);
		cube_r31.setTextureOffset(66, 48).addBox(-5.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, true);

		right_fist = new AdvancedModelBox(this,"right_fist");
		right_fist.setRotationPoint(0.0F, 9.0F, 0.75F);
		right_fore_arm.addChild(right_fist);
		setRotationAngle(right_fist, 0.2174F, 0.0189F, -0.0852F);
		right_fist.setTextureOffset(122, 86).addBox(-3.5F, 3.0F, -4.25F, 2.0F, 3.0F, 7.0F, 0.0F, true);
		right_fist.setTextureOffset(0, 117).addBox(-3.5F, 0.0F, -4.25F, 7.0F, 3.0F, 7.0F, 0.0F, true);

		right_fist1 = new AdvancedModelBox(this,"right_fist1");
		right_fist1.setRotationPoint(3.0F, 3.0F, -3.75F);
		right_fist.addChild(right_fist1);
		setRotationAngle(right_fist1, -0.4606F, -0.3152F, 0.1526F);
		right_fist1.setTextureOffset(122, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.05F, true);

		right_fist2 = new AdvancedModelBox(this,"right_fist2");
		right_fist2.setRotationPoint(0.0F, 2.0F, -0.5F);
		right_fist1.addChild(right_fist2);
		setRotationAngle(right_fist2, 1.6581F, 0.0F, 0.0F);
		right_fist2.setTextureOffset(122, 96).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 2.0F, 0.05F, true);

		cube_r32 = new AdvancedModelBox(this,"cube_r32");
		cube_r32.setRotationPoint(1.5F, -6.0F, 5.5F);
		right_fist2.addChild(cube_r32);
		setRotationAngle(cube_r32, 1.5708F, 0.0F, 0.0F);
		cube_r32.setTextureOffset(22, 84).addBox(-2.0F, -5.525F, -10.6F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		right_fist3 = new AdvancedModelBox(this,"right_fist3");
		right_fist3.setRotationPoint(-3.575F, 6.05F, -3.2625F);
		right_fist.addChild(right_fist3);
		setRotationAngle(right_fist3, 0.0843F, 0.0226F, -1.308F);
		right_fist3.setTextureOffset(122, 96).addBox(0.075F, -0.05F, -0.9875F, 2.0F, 3.0F, 2.0F, 0.05F, true);

		cube_r33 = new AdvancedModelBox(this,"cube_r33");
		cube_r33.setRotationPoint(1.175F, 2.55F, -0.0125F);
		right_fist3.addChild(cube_r33);
		setRotationAngle(cube_r33, 0.0F, 1.5708F, -1.5708F);
		cube_r33.setTextureOffset(22, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		right_fist4 = new AdvancedModelBox(this,"right_fist4");
		right_fist4.setRotationPoint(-3.45F, 6.05F, -0.7625F);
		right_fist.addChild(right_fist4);
		setRotationAngle(right_fist4, -0.0436F, 0.0F, -1.2654F);
		right_fist4.setTextureOffset(122, 96).addBox(-0.05F, -0.05F, -0.9875F, 2.0F, 3.0F, 2.0F, 0.05F, true);

		cube_r34 = new AdvancedModelBox(this,"cube_r34");
		cube_r34.setRotationPoint(1.05F, 2.55F, -0.0125F);
		right_fist4.addChild(cube_r34);
		setRotationAngle(cube_r34, 0.0F, 1.5708F, -1.5708F);
		cube_r34.setTextureOffset(22, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		right_fist5 = new AdvancedModelBox(this,"right_fist5");
		right_fist5.setRotationPoint(-3.5F, 6.05F, 1.7375F);
		right_fist.addChild(right_fist5);
		setRotationAngle(right_fist5, -0.215F, -0.0376F, -1.3049F);
		right_fist5.setTextureOffset(122, 96).addBox(0.0F, -0.05F, -0.9875F, 2.0F, 3.0F, 2.0F, 0.05F, true);

		cube_r35 = new AdvancedModelBox(this,"cube_r35");
		cube_r35.setRotationPoint(1.1F, 2.55F, -0.0125F);
		right_fist5.addChild(cube_r35);
		setRotationAngle(cube_r35, 0.0F, 1.5708F, -1.5708F);
		cube_r35.setTextureOffset(22, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, true);

		weapon = new AdvancedModelBox(this,"weapon");
		weapon.setRotationPoint(-0.3033F, 5.2313F, -0.7708F);
		right_fist.addChild(weapon);
		setRotationAngle(weapon, 1.6515F, 0.0536F, 0.3984F);

		cube_r36 = new AdvancedModelBox(this,"cube_r36");
		cube_r36.setRotationPoint(-0.2236F, -22.8258F, -10.4992F);
		weapon.addChild(cube_r36);
		setRotationAngle(cube_r36, 0.6981F, 0.0F, 0.0F);

		cube_r37 = new AdvancedModelBox(this,"cube_r37");
		cube_r37.setRotationPoint(-0.2246F, -36.0174F, -13.3235F);
		weapon.addChild(cube_r37);
		setRotationAngle(cube_r37, -0.3054F, 0.0F, 0.0F);

		cube_r38 = new AdvancedModelBox(this,"cube_r38");
		cube_r38.setRotationPoint(0.2754F, 8.4826F, 0.1765F);
		weapon.addChild(cube_r38);
		setRotationAngle(cube_r38, -0.2618F, 0.0F, 0.0F);

		cube_r39 = new AdvancedModelBox(this,"cube_r39");
		cube_r39.setRotationPoint(0.2754F, 5.9826F, 0.1765F);
		weapon.addChild(cube_r39);
		setRotationAngle(cube_r39, -0.2618F, 0.0F, 0.0F);

		cube_r40 = new AdvancedModelBox(this,"cube_r40");
		cube_r40.setRotationPoint(-0.2246F, -58.0174F, 0.6765F);
		weapon.addChild(cube_r40);
		setRotationAngle(cube_r40, 0.0F, -1.5708F, 0.0F);

		left_arm = new AdvancedModelBox(this,"left_arm");
		left_arm.setRotationPoint(9.6F, -11.2F, 0.275F);
		body.addChild(left_arm);
		setRotationAngle(left_arm, 0.0F, -0.0873F, -0.1745F);
		left_arm.setTextureOffset(98, 101).addBox(-0.75F, 3.0F, -3.25F, 7.0F, 9.0F, 7.0F, 0.0F, false);

		cube_r41 = new AdvancedModelBox(this,"cube_r41");
		cube_r41.setRotationPoint(4.7977F, -3.3151F, -0.9614F);
		left_arm.addChild(cube_r41);
		setRotationAngle(cube_r41, 2.6261F, -0.3797F, -1.2304F);
		cube_r41.setTextureOffset(66, 48).addBox(0.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r42 = new AdvancedModelBox(this,"cube_r42");
		cube_r42.setRotationPoint(6.2977F, 1.2849F, -0.9614F);
		left_arm.addChild(cube_r42);
		setRotationAngle(cube_r42, -2.8967F, -0.6799F, -0.1106F);
		cube_r42.setTextureOffset(66, 48).addBox(0.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		cube_r43 = new AdvancedModelBox(this,"cube_r43");
		cube_r43.setRotationPoint(-0.4F, 2.0F, 1.025F);
		left_arm.addChild(cube_r43);
		setRotationAngle(cube_r43, 0.0F, 0.0F, 0.0F);
		cube_r43.setTextureOffset(66, 80).addBox(-1.0F, -6.0F, -5.0F, 8.0F, 8.0F, 8.0F, 0.0F, false);

		left_fore_arm = new AdvancedModelBox(this,"left_fore_arm");
		left_fore_arm.setRotationPoint(2.75F, 12.0F, 0.25F);
		left_arm.addChild(left_fore_arm);
		setRotationAngle(left_fore_arm, -0.1309F, 0.0F, 0.1745F);
		left_fore_arm.setTextureOffset(106, 48).addBox(-3.0F, 0.0F, -3.0F, 6.0F, 10.0F, 6.0F, 0.0F, false);

		cube_r44 = new AdvancedModelBox(this,"cube_r44");
		cube_r44.setRotationPoint(-0.0523F, 4.6849F, 2.2886F);
		left_fore_arm.addChild(cube_r44);
		setRotationAngle(cube_r44, 1.5708F, -1.4312F, 1.5708F);
		cube_r44.setTextureOffset(66, 48).addBox(0.0F, -1.2F, 0.0F, 5.0F, 6.0F, 0.0F, 0.0F, false);

		left_fist = new AdvancedModelBox(this,"left_fist");
		left_fist.setRotationPoint(0.0F, 9.0F, 0.75F);
		left_fore_arm.addChild(left_fist);
		setRotationAngle(left_fist, -0.0869F, 0.0076F, 0.0869F);
		left_fist.setTextureOffset(122, 86).addBox(1.5F, 3.0F, -4.25F, 2.0F, 3.0F, 7.0F, 0.0F, false);
		left_fist.setTextureOffset(0, 117).addBox(-3.5F, 0.0F, -4.25F, 7.0F, 3.0F, 7.0F, 0.0F, false);

		left_fist1 = new AdvancedModelBox(this,"left_fist1");
		left_fist1.setRotationPoint(-3.0F, 3.0F, -3.75F);
		left_fist.addChild(left_fist1);
		setRotationAngle(left_fist1, -0.4606F, 0.3152F, -0.1526F);
		left_fist1.setTextureOffset(122, 96).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 3.0F, 2.0F, 0.05F, false);

		left_fist2 = new AdvancedModelBox(this,"left_fist2");
		left_fist2.setRotationPoint(0.0F, 2.0F, -0.5F);
		left_fist1.addChild(left_fist2);
		setRotationAngle(left_fist2, 1.6581F, 0.0F, 0.0F);
		left_fist2.setTextureOffset(122, 96).addBox(-1.0F, 0.0F, -0.5F, 2.0F, 3.0F, 2.0F, 0.05F, false);

		cube_r45 = new AdvancedModelBox(this,"cube_r45");
		cube_r45.setRotationPoint(-1.5F, -6.0F, 5.5F);
		left_fist2.addChild(cube_r45);
		setRotationAngle(cube_r45, 1.5708F, 0.0F, 0.0F);
		cube_r45.setTextureOffset(22, 84).addBox(1.0F, -5.525F, -10.6F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		left_fist3 = new AdvancedModelBox(this,"left_fist3");
		left_fist3.setRotationPoint(3.575F, 6.05F, -3.2625F);
		left_fist.addChild(left_fist3);
		setRotationAngle(left_fist3, 0.0843F, -0.0226F, 1.308F);
		left_fist3.setTextureOffset(122, 96).addBox(-2.075F, -0.05F, -0.9875F, 2.0F, 3.0F, 2.0F, 0.05F, false);

		cube_r46 = new AdvancedModelBox(this,"cube_r46");
		cube_r46.setRotationPoint(-1.175F, 2.55F, -0.0125F);
		left_fist3.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, -1.5708F, 1.5708F);
		cube_r46.setTextureOffset(22, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		left_fist4 = new AdvancedModelBox(this,"left_fist4");
		left_fist4.setRotationPoint(3.45F, 6.05F, -0.7625F);
		left_fist.addChild(left_fist4);
		setRotationAngle(left_fist4, -0.0436F, 0.0F, 1.2654F);
		left_fist4.setTextureOffset(122, 96).addBox(-1.95F, -0.05F, -0.9875F, 2.0F, 3.0F, 2.0F, 0.05F, false);

		cube_r47 = new AdvancedModelBox(this,"cube_r47");
		cube_r47.setRotationPoint(-1.05F, 2.55F, -0.0125F);
		left_fist4.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, -1.5708F, 1.5708F);
		cube_r47.setTextureOffset(22, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		left_fist5 = new AdvancedModelBox(this,"left_fist5");
		left_fist5.setRotationPoint(3.5F, 6.05F, 1.7375F);
		left_fist.addChild(left_fist5);
		setRotationAngle(left_fist5, -0.215F, 0.0376F, 1.3049F);
		left_fist5.setTextureOffset(122, 96).addBox(-2.0F, -0.05F, -0.9875F, 2.0F, 3.0F, 2.0F, 0.05F, false);

		cube_r48 = new AdvancedModelBox(this,"cube_r48");
		cube_r48.setRotationPoint(-1.1F, 2.55F, -0.0125F);
		left_fist5.addChild(cube_r48);
		setRotationAngle(cube_r48, 0.0F, -1.5708F, 1.5708F);
		cube_r48.setTextureOffset(22, 84).addBox(-0.5F, -1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

		tail1 = new AdvancedModelBox(this,"tail1");
		tail1.setRotationPoint(-0.1F, 4.3F, 2.95F);
		lower_body.addChild(tail1);
		setRotationAngle(tail1, -0.48F, 0.0F, 0.0F);
		tail1.setTextureOffset(68, 0).addBox(-3.0F, -3.297F, -0.1635F, 6.0F, 6.0F, 11.0F, 0.0F, false);

		tail2 = new AdvancedModelBox(this,"tail2");
		tail2.setRotationPoint(0.0F, -0.2649F, 8.7505F);
		tail1.addChild(tail2);
		setRotationAngle(tail2, 0.48F, 0.0F, 0.0F);
		tail2.setTextureOffset(66, 23).addBox(-3.5F, -4.047F, -1.0135F, 7.0F, 8.0F, 11.0F, 0.0F, false);

		tail3 = new AdvancedModelBox(this,"tail3");
		tail3.setRotationPoint(0.0F, -0.25F, 9.75F);
		tail2.addChild(tail3);
		setRotationAngle(tail3, 0.0436F, 0.0F, 0.0F);
		tail3.setTextureOffset(56, 109).addBox(-3.0F, -3.297F, -0.1635F, 6.0F, 7.0F, 7.0F, 0.0F, false);
		tail3.setTextureOffset(82, 117).addBox(-3.0F, -3.297F, 6.8365F, 6.0F, 7.0F, 4.0F, 0.0F, false);
		this.updateDefaultPose();
	}

	@Override
	public void setupAnim (Werewolf_Entity entity,float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		this.resetToDefaultPose();
		//this.faceTarget(netHeadYaw, 0, 1, head);
		if(entity.isHoldweapon()) {
			this.animateWalk(Werewolf_Animation.WALK_WITH_WEAPON, limbSwing, limbSwingAmount, 1.0F, 4.0F);
		} else {
			this.animateWalk(Werewolf_Animation.WALK_WITHOUT_WEAPON, limbSwing, limbSwingAmount, 1.0F, 4.0F);
		}
		this.animate(entity.getAnimationState("idle_with_weapon"), Werewolf_Animation.IDLE_WITH_WEAPON, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("idle_without_weapon"), Werewolf_Animation.IDLE_WITHOUT_WEAPON, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("guard"), Werewolf_Animation.GUARD, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("counter"), Werewolf_Animation.COUNTER, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("jab"), Werewolf_Animation.JAB, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("straight"), Werewolf_Animation.STRAIGHT, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("jab_straight"), Werewolf_Animation.JAB_STRAIGHT, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("slip_straight"), Werewolf_Animation.SLIP_STRAIGHT, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("death_with_weapon"), Werewolf_Animation.DEATH_WITH_WEAPON, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("death_without_weapon"), Werewolf_Animation.DEATH_WITHOUT_WEAPON, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("jump_slash"), Werewolf_Animation.JUMP_SLASH, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("evasion"), Werewolf_Animation.EVASION, ageInTicks, 1.0F);
		this.animate(entity.getAnimationState("upper_cut"), Werewolf_Animation.UPPER_CUT, ageInTicks, 1.0F);
	}

	public void setRotationAngle (AdvancedModelBox AdvancedModelBox, float x, float y, float z){
		AdvancedModelBox.rotateAngleX = x;
		AdvancedModelBox.rotateAngleY = y;
		AdvancedModelBox.rotateAngleZ = z;
	}

	@Override
	public Iterable<BasicModelPart> parts () {
		return ImmutableList.of(root);
	}

	@Override
	public Iterable<AdvancedModelBox> getAllParts () {
		return ImmutableList.of(root,
				mid_root_controller,
				mid_root,
				legs,
				left_leg,
				left_fore_leg,
				cube_r1,
				left_toes,
				right_leg,
				right_fore_leg,
				cube_r2,
				right_toes,
				pelvis,
				lower_body,
				cube_r3,
				cube_r4,
				body,
				cube_r5,
				cube_r6,
				cube_r7,
				cube_r8,
				cube_r9,
				cube_r10,
				cube_r11,
				cube_r12,
				cube_r13,
				neck,
				cube_r14,
				head,
				cube_r15,
				cube_r16,
				cube_r17,
				cube_r18,
				cube_r19,
				cube_r20,
				cube_r21,
				cube_r22,
				left_ear,
				cube_r23,
				piercing,
				right_ear,
				cube_r24,
				snout,
				cube_r25,
				jaw,
				cube_r26,
				nose,
				cube_r27,
				right_arm,
				cube_r28,
				cube_r29,
				cube_r30,
				right_fore_arm,
				cube_r31,
				right_fist,
				right_fist1,
				right_fist2,
				cube_r32,
				right_fist3,
				cube_r33,
				right_fist4,
				cube_r34,
				right_fist5,
				cube_r35,
				left_arm,
				cube_r36,
				cube_r37,
				cube_r38,
				left_fore_arm,
				cube_r39,
				left_fist,
				left_fist1,
				weapon,
				left_fist2,
				cube_r40,
				left_fist3,
				cube_r41,
				left_fist4,
				cube_r42,
				left_fist5,
				cube_r43,
				cube_r44,
				cube_r45,
				cube_r46,
				cube_r47,
				cube_r48,
				tail1,
				tail2,
				tail3);
	}
}