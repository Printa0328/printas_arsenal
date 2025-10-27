package com.github.printa.arsenal.client.model.block;// Made with Blockbench 4.12.4

import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedEntityModel;
import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedModelBox;
import com.github.L_Ender.lionfishapi.client.model.tools.BasicModelPart;
import com.google.common.collect.ImmutableList;
import net.minecraft.world.entity.Entity;

public class WeaponWorkbenchBlock_Model extends AdvancedEntityModel<Entity> {

	private final AdvancedModelBox root;
	public final AdvancedModelBox fire;
	public final AdvancedModelBox acid;
	public final AdvancedModelBox poison;
	public final AdvancedModelBox lightining;
	private final AdvancedModelBox cube_r1;
	public final AdvancedModelBox cold;
	private final AdvancedModelBox cube_r2;
	public final AdvancedModelBox blood;
	public final AdvancedModelBox necrotic;
	public final AdvancedModelBox radiant;
	private final AdvancedModelBox cube_r3;

	public WeaponWorkbenchBlock_Model() {
		texWidth = 64;
		texHeight = 64;

		root = new AdvancedModelBox(this);
		root.setRotationPoint(0.0F, 24.0F, 0.0F);
		root.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);

		fire = new AdvancedModelBox(this);
		fire.setRotationPoint(-4.5F, -18.0F, 3.5F);
		root.addChild(fire);
		setRotationAngle(fire, 0.0F, -0.6109F, 0.0F);
		fire.setTextureOffset(0, 0).addBox(-1.5176F, -2.0F, -0.0682F, 4.0F, 4.0F, 4.0F, 0.0F, false);

		acid = new AdvancedModelBox(this);
		acid.setRotationPoint(3.2435F, 0.0F, -4.3173F);
		root.addChild(acid);
		setRotationAngle(acid, 0.0F, 0.9163F, 0.0F);
		acid.setTextureOffset(0, 8).addBox(-1.0F, -17.0F, 0.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		acid.setTextureOffset(0, 10).addBox(-1.5F, -17.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		poison = new AdvancedModelBox(this);
		poison.setRotationPoint(4.5F, 0.0F, -3.25F);
		root.addChild(poison);
		setRotationAngle(poison, 0.0F, 0.7854F, 0.0F);
		poison.setTextureOffset(0, 8).addBox(-1.0F, -17.0F, 0.0F, 6.0F, 1.0F, 1.0F, 0.0F, false);
		poison.setTextureOffset(0, 10).addBox(-1.5F, -17.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.1F, false);

		lightining = new AdvancedModelBox(this);
		lightining.setRotationPoint(-5.5F, -0.05F, -0.75F);
		root.addChild(lightining);
		setRotationAngle(lightining, 0.0F, -0.1309F, 0.0F);
		lightining.setTextureOffset(48, 0).addBox(-2.0F, -21.0F, -2.0F, 4.0F, 5.0F, 4.0F, 0.0F, false);
		lightining.setTextureOffset(0, 12).addBox(-1.0F, -22.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
		lightining.setTextureOffset(48, 9).addBox(-1.5F, -22.5F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);

		cube_r1 = new AdvancedModelBox(this);
		cube_r1.setRotationPoint(-0.5F, -18.5F, 0.0F);
		lightining.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, -1.1345F, 0.0F);
		cube_r1.setTextureOffset(6, 10).addBox(-1.0F, -2.0F, 0.0F, 3.0F, 4.0F, 0.0F, 0.0F, false);

		cold = new AdvancedModelBox(this);
		cold.setRotationPoint(-3.25F, -18.55F, -5.5F);
		root.addChild(cold);
		setRotationAngle(cold, 0.0F, -0.5236F, 0.0F);
		cold.setTextureOffset(0, 32).addBox(-2.5F, -2.5F, 0.0F, 5.0F, 5.0F, 0.0F, 0.0F, false);

		cube_r2 = new AdvancedModelBox(this);
		cube_r2.setRotationPoint(0.0F, 0.5F, -0.5F);
		cold.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.setTextureOffset(0, 32).addBox(-3.0F, -3.0F, 0.0F, 5.0F, 5.0F, 0.0F, 0.0F, false);

		blood = new AdvancedModelBox(this);
		blood.setRotationPoint(1.0F, 0.0F, -5.0F);
		root.addChild(blood);
		setRotationAngle(blood, 0.0F, -0.0873F, 0.0F);
		blood.setTextureOffset(12, 10).addBox(-1.0F, -19.5F, -1.0F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		blood.setTextureOffset(0, 0).addBox(-1.0F, -19.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

		necrotic = new AdvancedModelBox(this);
		necrotic.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(necrotic);
		necrotic.setTextureOffset(5, 32).addBox(-2.25F, -21.0F, 3.0F, 5.0F, 5.0F, 5.0F, 0.0F, false);

		radiant = new AdvancedModelBox(this);
		radiant.setRotationPoint(0.0F, 0.0F, 0.0F);
		root.addChild(radiant);

		cube_r3 = new AdvancedModelBox(this);
		cube_r3.setRotationPoint(5.0F, -16.0F, 4.0F);
		radiant.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.7854F, 0.0F);
		cube_r3.setTextureOffset(25, 32).addBox(-1.0F, -6.0F, -1.0F, 6.0F, 6.0F, 0.0F, 0.0F, false);
		this.updateDefaultPose();
	}

	@Override
	public Iterable<BasicModelPart> parts() {
		return ImmutableList.of(root);
	}

	@Override
	public Iterable<AdvancedModelBox> getAllParts() {
		return ImmutableList.of(root,fire,acid,poison,lightining,cube_r1,cold,cube_r2,blood,necrotic,radiant,cube_r3);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.resetToDefaultPose();
	}

	public void setRotationAngle(AdvancedModelBox AdvancedModelBox, float x, float y, float z) {
		AdvancedModelBox.rotateAngleX = x;
		AdvancedModelBox.rotateAngleY = y;
		AdvancedModelBox.rotateAngleZ = z;
	}
}