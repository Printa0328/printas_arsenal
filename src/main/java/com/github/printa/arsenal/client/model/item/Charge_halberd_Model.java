package com.github.printa.arsenal.client.model.item;// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports


import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedEntityModel;
import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedModelBox;
import com.github.L_Ender.lionfishapi.client.model.tools.BasicModelPart;
import com.google.common.collect.ImmutableList;
import net.minecraft.world.entity.Entity;

public class Charge_halberd_Model extends AdvancedEntityModel<Entity> {
	private final AdvancedModelBox root;
	private final AdvancedModelBox spear;
	private final AdvancedModelBox cube_r1;
	private final AdvancedModelBox axe;
	private final AdvancedModelBox pommel;
	private final AdvancedModelBox cube_r2;

	public Charge_halberd_Model() {
		texWidth = 128;
		texHeight = 128;

		root = new AdvancedModelBox(this);
		root.setRotationPoint(0.0F, 10.0F, 0.0F);
		root.setTextureOffset(40, 37).addBox(-1.5F, -27.0F, -1.5F, 3.0F, 1.0F, 3.0F, 0.0F, false);
		root.setTextureOffset(28, 32).addBox(-1.5F, -30.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		root.setTextureOffset(28, 37).addBox(-1.5F, -40.0F, -1.5F, 3.0F, 2.0F, 3.0F, 0.0F, false);
		root.setTextureOffset(0, 32).addBox(-1.0F, -41.0F, -1.0F, 2.0F, 51.0F, 2.0F, 0.0F, false);
		root.setTextureOffset(34, 42).addBox(-0.5F, -46.0F, 0.0F, 1.0F, 5.0F, 0.0F, 0.0F, false);
		root.setTextureOffset(29, 43).addBox(-0.5F, 10.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		root.setTextureOffset(0, 0).addBox(-9.0F, -46.0F, 0.0F, 23.0F, 32.0F, 0.0F, 0.0F, false);

		spear = new AdvancedModelBox(this);
		spear.setRotationPoint(-1.5F, -36.5F, 0.0F);
		root.addChild(spear);
		spear.setTextureOffset(8, 49).addBox(-5.0F, -20.0F, 0.0F, 13.0F, 17.0F, 0.0F, 0.0F, false);

		cube_r1 = new AdvancedModelBox(this);
		cube_r1.setRotationPoint(1.5F, 0.0F, 1.5F);
		spear.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 1.5708F, 0.0F);
		cube_r1.setTextureOffset(8, 49).addBox(-5.0F, -20.0F, 0.0F, 13.0F, 17.0F, 0.0F, 0.0F, false);

		axe = new AdvancedModelBox(this);
		axe.setRotationPoint(-1.5F, -36.5F, 0.0F);
		root.addChild(axe);
		axe.setTextureOffset(57, 0).addBox(-7.5F, -9.5F, 0.0F, 23.0F, 32.0F, 0.0F, 0.0F, false);

		pommel = new AdvancedModelBox(this);
		pommel.setRotationPoint(0.0F, -26.0F, 0.0F);
		root.addChild(pommel);
		pommel.setTextureOffset(66, 97).addBox(-3.5F, 34.75F, 0.0F, 7.0F, 7.0F, 0.0F, 0.0F, false);

		cube_r2 = new AdvancedModelBox(this);
		cube_r2.setRotationPoint(0.0F, 41.75F, 0.5F);
		pommel.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 1.5708F, 0.0F);
		cube_r2.setTextureOffset(66, 97).addBox(-3.0F, -7.0F, 0.0F, 7.0F, 7.0F, 0.0F, 0.0F, false);
		this.updateDefaultPose();
	}

	public void setRotationAngle(AdvancedModelBox AdvancedModelBox, float x, float y, float z) {
		AdvancedModelBox.rotateAngleX = x;
		AdvancedModelBox.rotateAngleY = y;
		AdvancedModelBox.rotateAngleZ = z;
	}

	@Override
	public void setupAnim(Entity entity, float pullAmount, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.resetToDefaultPose();

	}

	@Override
	public Iterable<AdvancedModelBox> getAllParts() {
		return ImmutableList.of(root, spear, axe, pommel, cube_r1, cube_r2);
	}

	@Override
	public Iterable<BasicModelPart> parts() {
		return ImmutableList.of(root);
	}
}