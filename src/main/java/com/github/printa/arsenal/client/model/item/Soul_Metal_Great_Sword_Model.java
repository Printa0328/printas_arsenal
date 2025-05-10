package com.github.printa.arsenal.client.model.item;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with MCP mappings
// Paste this class into your mod and generate all required imports

import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedEntityModel;
import com.github.L_Ender.lionfishapi.client.model.tools.AdvancedModelBox;
import com.github.L_Ender.lionfishapi.client.model.tools.BasicModelPart;
import com.google.common.collect.ImmutableList;
import net.minecraft.world.entity.Entity;

public class Soul_Metal_Great_Sword_Model extends AdvancedEntityModel<Entity> {
	private final AdvancedModelBox root;

	public Soul_Metal_Great_Sword_Model() {
		texWidth = 128;
		texHeight = 128;

		root = new AdvancedModelBox(this);
		root.setRotationPoint(-0.5F, 11.0F, 0.0F);
		setRotationAngle(root, 0.0F, 0.0F, 0.0F);
		root.setTextureOffset(60, 40).addBox(-1.5F, -6.0F, -1.0F, 3.0F, 19.0F, 2.0F, 0.0F, false);
		root.setTextureOffset(38, 6).addBox(-6.5F, -42.0F, -0.5F, 13.0F, 33.0F, 1.0F, 0.0F, false);
		root.setTextureOffset(38, 40).addBox(-5.5F, -66.0F, 0.0F, 11.0F, 26.0F, 0.0F, 0.0F, false);
		root.setTextureOffset(0, 0).addBox(-9.5F, -73.0F, 0.0F, 19.0F, 64.0F, 0.0F, 0.0F, false);
		root.setTextureOffset(38, 0).addBox(-13.0F, -9.0F, -1.5F, 26.0F, 3.0F, 3.0F, 0.0F, false);
		root.setTextureOffset(14, 64).addBox(-13.0F, -10.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		root.setTextureOffset(60, 59).addBox(-2.5F, 11.0F, -1.5F, 5.0F, 2.0F, 3.0F, 0.0F, false);
		root.setTextureOffset(0, 64).addBox(9.0F, -10.0F, -1.5F, 4.0F, 1.0F, 3.0F, 0.0F, false);
	}

	public void setRotationAngle(AdvancedModelBox AdvancedModelBox, float x, float y, float z) {
		AdvancedModelBox.rotateAngleX = x;
		AdvancedModelBox.rotateAngleY = y;
		AdvancedModelBox.rotateAngleZ = z;
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
	}

	@Override
	public Iterable<AdvancedModelBox> getAllParts() {return ImmutableList.of(root);}

	@Override
	public Iterable<BasicModelPart> parts() {
		return ImmutableList.of(root);
	}
}