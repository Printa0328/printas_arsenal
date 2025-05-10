package com.github.printa.arsenal.client.animation;// Save this class in your mod and generate all required imports

import com.github.L_Ender.lionfishapi.client.model.AdvancedAnimations.AdvancedAnimationChannel;
import com.github.L_Ender.lionfishapi.client.model.AdvancedAnimations.AdvancedAnimationDefinition;
import com.github.L_Ender.lionfishapi.client.model.AdvancedAnimations.AdvancedKeyframe;
import com.github.L_Ender.lionfishapi.client.model.AdvancedAnimations.AdvancedKeyframeAnimations;

public class Werewolf_Animation {
	public static final AdvancedAnimationDefinition IDLE_WITHOUT_WEAPON = AdvancedAnimationDefinition.Builder.withLength(2.25F).looping()
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(0.0F, -1.9763F, 0.2164F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(2.5F, 0.0F, 10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-12.5F, 0.0F, -10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(2.5F, 0.0F, -10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-12.5F, 0.0F, 10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(2.6602F, -19.9802F, -0.9096F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(2.6393F, -1.3153F, -0.0557F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.2083F, AdvancedKeyframeAnimations.degreeVec(2.6436F, 21.4452F, 0.977F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.7083F, AdvancedKeyframeAnimations.degreeVec(2.6393F, -1.3153F, -0.0557F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(2.6602F, -19.9802F, -0.9096F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(27.8608F, -8.8604F, -4.6547F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(28.627F, -15.4697F, -8.2834F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(27.5224F, -7.7826F, 1.1549F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(27.4119F, -0.0476F, -0.0059F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(27.7021F, -6.6485F, -3.4787F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.875F, AdvancedKeyframeAnimations.degreeVec(28.3807F, -12.5787F, -6.7181F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(27.8608F, -8.8604F, -4.6547F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-1.3835F, -13.2376F, 7.0498F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(-0.0896F, 4.4339F, -2.3134F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-1.4854F, 15.1605F, -9.5401F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(-0.6893F, 10.5408F, -5.7133F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.875F, AdvancedKeyframeAnimations.degreeVec(-1.518F, -11.9979F, 6.5055F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(-0.8216F, -13.2721F, 7.0531F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("piercing", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(21.6496F, 22.8972F, 20.0049F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("snout", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("jaw", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(8.4472F, -0.3047F, -3.0064F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AdvancedAnimationDefinition WALK_WITHOUT_WEAPON = AdvancedAnimationDefinition.Builder.withLength(1.0833F).looping()
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("head", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(22.689F, 9.7716F, 12.6308F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-9.9977F, 4.8489F, 8.2659F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(22.689F, 9.7716F, 12.6308F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-32.5F, 0.0F, -10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-12.6256F, 1.8367F, 0.276F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-0.164F, 2.9174F, 0.3956F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(21.6143F, 4.6494F, 1.1493F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-17.9611F, 1.3704F, 0.2972F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(-40.1782F, -0.4844F, 0.8427F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-12.6256F, 1.8367F, 0.276F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.75F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(0.0F, 0.64F, 0.05F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(0.0F, 1.71F, -0.43F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.75F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(20.6934F, 0.2489F, -4.8091F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(30.5461F, 1.9667F, -4.7018F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(19.5569F, 0.0501F, -4.8024F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(108.3096F, -0.4659F, 0.2014F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(74.0487F, 8.3279F, -0.9784F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(20.6934F, 0.2489F, -4.8091F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.posVec(0.0F, 0.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.posVec(0.0F, 0.89F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-0.96F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(21.2722F, -4.622F, -1.0868F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(-18.3672F, -1.3345F, -0.26F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(-40.5378F, 0.5146F, -0.8283F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-13.0341F, -1.8005F, -0.2335F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(-0.5646F, -2.8825F, -0.3425F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(21.2722F, -4.622F, -1.0868F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.posVec(0.0F, 0.64F, 0.05F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.posVec(0.0F, 1.71F, -0.43F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.75F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(58.9375F, -2.9276F, -0.7532F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(108.2216F, -10.3672F, -4.4123F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(74.0498F, -8.2978F, 1.008F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(20.7005F, -0.2071F, 4.8026F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(30.5532F, -1.9244F, 4.7025F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(19.564F, -0.0085F, 4.7951F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(58.9375F, -2.9276F, -0.7532F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(0.0F, 0.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(0.0F, 0.89F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-0.96F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-10.189F, -9.7716F, -7.3692F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(27.4977F, -4.8489F, -11.7341F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-10.189F, -9.7716F, -7.3692F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-32.5F, 0.0F, 10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(2.6602F, -19.9802F, -0.9096F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(2.6393F, -1.3153F, -0.0557F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(2.6436F, 21.4452F, 0.977F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(2.6393F, -1.3153F, -0.0557F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(2.6602F, -19.9802F, -0.9096F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(27.8608F, -8.8604F, -4.6547F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.1667F, AdvancedKeyframeAnimations.degreeVec(28.627F, -15.4697F, -8.2834F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(27.5224F, 2.2174F, 1.1549F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(27.4119F, -0.0476F, -0.0059F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(27.7021F, -6.6485F, -3.4787F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(28.3807F, -12.5787F, -6.7181F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(27.8608F, -8.8604F, -4.6547F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-1.3835F, -13.2376F, 7.0498F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.1667F, AdvancedKeyframeAnimations.degreeVec(-0.0896F, 4.4339F, -2.3134F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(-1.4854F, 17.6605F, -9.5401F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-0.6893F, 10.5408F, -5.7133F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(-1.518F, -11.9979F, 6.5055F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-0.8216F, -13.2721F, 7.0531F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("piercing", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(29.0088F, 27.798F, 40.8454F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(22.6055F, 21.9554F, 22.5103F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(29.0088F, 27.798F, 40.8454F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(22.6055F, 21.9554F, 22.5103F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(29.0088F, 27.798F, 40.8454F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, -0.65F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.posVec(0.0F, 0.41F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, -0.65F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(0.0F, 0.41F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, -0.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.build();

	public static final AdvancedAnimationDefinition DEATH_WITHOUT_WEAPON = AdvancedAnimationDefinition.Builder.withLength(2.0F)
		.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(0.0F, -24.0F, 9.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("legs", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(0.0F, 2.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(12.5F, 10.0F, -55.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(67.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 67.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(117.5F, 12.5F, 17.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(75.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, -3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("lower_body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("lower_body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(15.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(27.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("neck", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-12.5F, 20.0F, 12.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-27.5F, -30.0F, 27.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(-27.5F, -30.0F, 27.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-62.5F, 70.0F, 37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-47.5F, 0.0F, -37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(-47.5F, 0.0F, -37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-110.0F, 0.0F, 20.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-75.0F, -62.5F, -15.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-80.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-20.0F, 45.0F, 30.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-55.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AdvancedAnimationDefinition GUARD = AdvancedAnimationDefinition.Builder.withLength(3.0F)
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(5.0F, -20.0F, -17.5F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(5.0F, -20.0F, -17.5F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 2.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 2.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 10.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 10.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-20.0F, -2.5F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(-20.0F, -2.5F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("neck", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-55.8946F, -37.577F, -0.9041F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(-55.8946F, -37.577F, -0.9041F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-89.1674F, -8.9809F, -69.9135F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(-89.1674F, -8.9809F, -69.9135F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-59.0312F, 32.0513F, -5.4047F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(-59.0312F, 32.0513F, -5.4047F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-87.5F, 10.0F, 80.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(-87.5F, 10.0F, 80.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(10.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("tail3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.degreeVec(20.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(2.75F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(3.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AdvancedAnimationDefinition COUNTER = AdvancedAnimationDefinition.Builder.withLength(2.0417F)
		.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.posVec(0.0F, -6.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(0.0F, -5.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.posVec(0.0F, -6.93F, 1.07F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(0.0F, -5.75F, 5.25F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.2083F, AdvancedKeyframeAnimations.posVec(0.0F, -8.75F, 5.25F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(5.0F, -20.0F, -17.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(5.0F, -20.0F, -17.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(5.0F, -20.0F, -17.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(31.4551F, 7.2264F, -4.7501F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(13.01F, 8.5F, -22.11F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(21.84F, 13.53F, -24.71F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(22.5F, 20.0F, -12.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(22.5F, 20.0F, -12.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(22.5F, 20.0F, -12.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(-1.0F, 3.0F, 7.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(1.0F, 4.0F, 10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(3.0F, 4.0F, -1.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(5.0F, 1.0F, -8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(5.0F, 1.0F, -8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(5.0F, 1.0F, -6.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-12.1475F, -59.4717F, 14.6432F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(51.08F, -75.29F, -30.53F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(3.8571F, 7.6332F, 13.1142F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(50.0F, -15.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(50.0F, -15.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(50.0F, -15.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 10.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 10.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 10.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(37.5F, 10.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(65.0F, 57.5F, 12.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(71.3086F, 10.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-13.25F, 8.44F, -0.6F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-13.25F, 8.44F, -0.6F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-13.25F, 8.44F, -0.6F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-45.0F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-35.0F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-35.0F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(0.0F, 3.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(2.0F, 3.0F, -3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.posVec(2.0F, 3.0F, -3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(2.0F, 3.0F, -3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(2.0F, 3.0F, -3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(65.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(77.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(67.5F, -15.0F, -15.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-35.0F, 10.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-20.0F, -2.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(-20.0F, -2.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-20.0F, -2.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-25.0F, -47.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-12.5F, -47.5F, -22.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(-9.22F, 2.97F, -12.66F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-25.0F, 57.5F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-25.0F, 57.5F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-25.0F, 57.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(0.0F, 3.0F, 3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.posVec(0.5F, 3.19F, 2.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(3.0F, 3.0F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(1.0F, 3.0F, -6.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(1.0F, 3.0F, -6.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(3.0F, 3.0F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(17.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(17.5F, -25.0F, -10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(39.7087F, -29.7808F, -21.0618F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(17.21F, 27.72F, 16.44F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(63.5919F, 50.8618F, 61.0604F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(63.5919F, 50.8618F, 61.0604F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(46.8F, 40.43F, 45.53F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("neck", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("piercing", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(21.6496F, 22.8972F, 20.0049F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(21.6496F, 22.8972F, 20.0049F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-55.8946F, -37.577F, -0.9041F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(-55.8946F, -37.577F, -0.9041F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-55.8946F, -37.577F, -0.9041F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(7.5982F, -28.162F, 40.3531F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(37.6F, 1.84F, 40.35F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(37.6F, 1.84F, 40.35F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(37.6F, 1.84F, 40.35F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(37.6F, 1.84F, 40.35F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(37.6F, 1.84F, 40.35F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.1667F, AdvancedKeyframeAnimations.posVec(0.0F, -2.75F, -2.12F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, -4.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-89.1674F, -8.9809F, -69.9135F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(-89.1674F, -8.9809F, -69.9135F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-89.1674F, -8.9809F, -69.9135F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-85.0F, 12.5F, -72.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(-85.0F, 12.5F, -72.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-85.0F, 12.5F, -72.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-85.0F, 12.5F, -72.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-85.0F, 12.5F, -72.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.2917F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-59.0312F, 32.0513F, -5.4047F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(-59.0312F, 32.0513F, -5.4047F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-59.0312F, 32.0513F, -5.4047F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(-66.9F, -123.44F, -18.17F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(-40.0518F, -116.9607F, -20.3023F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9583F, AdvancedKeyframeAnimations.degreeVec(-83.0067F, -34.9912F, 0.7985F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(-91.8072F, -69.3751F, 29.6962F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-91.8072F, -69.3751F, 29.6962F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(-59.3072F, -104.3751F, 19.6962F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.1667F, AdvancedKeyframeAnimations.posVec(-0.19F, -3.0F, 1.06F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.posVec(3.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9583F, AdvancedKeyframeAnimations.posVec(2.0F, 0.0F, -3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-87.5F, 10.0F, 80.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(-87.5F, 10.0F, 80.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-87.5F, 10.0F, 80.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(23.2256F, 9.3571F, 111.1361F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(15.0F, 0.0F, 102.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(8.8F, 21.09F, 104.65F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(4.37F, 32.96F, 74.92F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9583F, AdvancedKeyframeAnimations.degreeVec(-27.07F, 70.0F, 3.58F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(10.61F, 0.0F, 82.88F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.2917F, AdvancedKeyframeAnimations.degreeVec(10.61F, 0.0F, 82.88F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(10.61F, 0.0F, 82.88F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(-0.2579F, -0.5924F, 0.7633F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.posVec(-0.2579F, -0.5924F, 0.7633F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.0833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(5.0F, -32.19F, -0.6F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9583F, AdvancedKeyframeAnimations.degreeVec(0.0F, -77.5F, 22.8F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.2917F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 25.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AdvancedAnimationDefinition JAB = AdvancedAnimationDefinition.Builder.withLength(1.125F)
		.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(0.0F, -1.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, -3.55F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, -3.55F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(12.4022F, 1.9642F, -1.1888F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(12.4022F, 1.9642F, -1.1888F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(17.4022F, 1.9642F, -1.1888F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(27.58F, 1.67F, -1.01F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(27.58F, 1.67F, -1.01F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, -2.25F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(14.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(14.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(19.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(-0.3325F, -1.7999F, -0.8061F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-47.4574F, 1.3048F, -0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-47.4574F, 1.3048F, -0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(43.92F, -0.81F, 0.08F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.degreeVec(57.22F, -1.63F, 0.16F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(71.35F, -2.44F, 0.23F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(84.23F, -3.26F, 0.31F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(89.6195F, -4.0715F, 0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(89.6195F, -4.0715F, 0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -6.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -6.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(1.2486F, -30.2337F, 2.2409F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(17.5F, -32.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(10.0F, -37.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(10.0F, -37.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-87.8125F, 28.067F, -9.7157F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(-2.0F, 0.0F, -7.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, -19.0733F, -119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, -19.0733F, -119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(-9.89F, -7.84F, -73.2F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(5.5116F, -0.962F, 9.5208F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-18.35F, -0.23F, -101.75F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(29.2692F, -30.7611F, -34.2056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(29.2692F, -30.7611F, -34.2056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.degreeVec(15.27F, -21.76F, -21.21F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(4.2692F, 6.7389F, -46.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(4.2692F, -8.2611F, -31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(4.37F, -8.45F, -14.95F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(21.7692F, -8.2611F, -31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("right_fist1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist4", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist5", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, -12.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-30.1638F, 35.2763F, -12.1821F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-30.1638F, 35.2763F, -12.1821F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(-30.1638F, 35.2763F, -12.1821F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-30.1638F, 35.2763F, -12.1821F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-105.0F, 0.0F, 20.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-105.0F, 0.0F, 20.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(-105.0F, 0.0F, 20.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-105.0F, 0.0F, 20.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AdvancedAnimationDefinition STRAIGHT = AdvancedAnimationDefinition.Builder.withLength(1.125F)
		.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(0.0F, -1.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, -3.55F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, -3.55F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-27.5F, -15.0F, -5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-27.5F, -15.0F, -5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-47.4574F, -1.3048F, 0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-47.4574F, -1.3048F, 0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(43.92F, 0.81F, -0.08F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.degreeVec(57.22F, 1.63F, -0.16F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(71.35F, 2.44F, -0.23F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(84.23F, 3.26F, -0.31F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(89.6195F, 4.0715F, -0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(89.6195F, 4.0715F, -0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, 2.7641F, 4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, 2.7641F, 4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(12.4022F, 1.9642F, 6.3112F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(12.4022F, 1.9642F, 6.3112F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(17.4022F, 1.9642F, 6.3112F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(27.58F, 1.67F, 13.99F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(27.58F, 1.67F, 6.49F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, -2.25F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(14.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(14.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(19.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(-0.3325F, -1.7999F, -0.8061F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -6.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(1.2486F, -30.2337F, 2.2409F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(7.3977F, -18.501F, 5.9951F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(1.2486F, -30.2337F, 2.2409F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(7.3977F, -18.501F, 5.9951F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, -0.1275F, -0.4835F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, -0.1275F, -0.4835F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(70.4122F, 78.0321F, 93.2753F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(52.9122F, 128.0321F, 65.7753F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(52.9122F, 128.0321F, 65.7753F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(52.9122F, 128.0321F, 65.7753F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-2.0389F, -19.0733F, -89.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(27.9611F, -26.5733F, -104.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(27.9611F, -26.5733F, -104.2321F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(30.4611F, -11.5733F, -104.2321F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(0.0F, 7.5F, -27.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, -0.62F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-92.8125F, 21.933F, 9.7157F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, 19.0733F, 119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(2.9611F, 19.0733F, 114.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.degreeVec(-40.86F, 25.63F, 84.54F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.02F, -3.42F, 4.98F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(2.81F, -2.73F, 5.3F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-42.12F, 2.31F, 67.57F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(4.15F, 0.23F, 101.75F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(29.2692F, 30.7611F, 34.2056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(29.2692F, 30.7611F, 34.2056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.degreeVec(-14.73F, 21.76F, -6.29F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(-2.36F, 17.09F, 1.97F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(4.2692F, 8.2611F, 31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(4.2692F, 8.2611F, 31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(4.37F, 8.45F, 14.95F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(21.7692F, 8.2611F, 31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.posVec(-2.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AdvancedAnimationDefinition JAB_STRAIGHT = AdvancedAnimationDefinition.Builder.withLength(2.25F)
		.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(0.0F, -1.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, -3.55F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, -3.55F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.posVec(0.0F, -1.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.posVec(0.0F, -3.55F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.posVec(0.0F, -3.55F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(12.4022F, 1.9642F, -1.1888F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(12.4022F, 1.9642F, -1.1888F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(17.4022F, 1.9642F, -1.1888F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(27.58F, 1.67F, -1.01F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(27.58F, 1.67F, -1.01F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-57.46F, -6.66F, -3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-27.5F, -15.0F, -5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.degreeVec(-27.5F, -15.0F, -5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.degreeVec(-47.4574F, -1.3048F, 0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(-47.4574F, -1.3048F, 0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, -2.25F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, -2.25F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.14F, -0.14F, -7.39F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -7.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(14.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(14.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(19.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(19.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(139.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(43.92F, 0.81F, -0.08F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(57.22F, 1.63F, -0.16F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(71.35F, 2.44F, -0.23F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.625F, AdvancedKeyframeAnimations.degreeVec(84.23F, 3.26F, -0.31F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.degreeVec(89.6195F, 4.0715F, -0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(89.6195F, 4.0715F, -0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(-0.3325F, -1.7999F, -0.8061F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(-0.3325F, -1.7999F, -0.8061F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(-0.3325F, -1.7999F, -0.8061F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(-25.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, 2.7641F, 4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, 2.7641F, 4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 15.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-47.4574F, 1.3048F, -0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-47.4574F, 1.3048F, -0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-29.9574F, 1.3048F, -0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(12.4022F, 1.9642F, 6.3112F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.degreeVec(12.4022F, 1.9642F, 6.3112F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(17.4022F, 1.9642F, 6.3112F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.degreeVec(27.58F, 1.67F, 13.99F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(27.58F, 1.67F, 6.49F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(43.92F, -0.81F, 0.08F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.degreeVec(57.22F, -1.63F, 0.16F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(71.35F, -2.44F, 0.23F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(84.23F, -3.26F, 0.31F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(89.6195F, -4.0715F, 0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(89.6195F, -4.0715F, 0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(72.1195F, -4.0715F, 0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(14.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(14.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(19.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.posVec(-0.3325F, -1.7999F, -0.8061F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -6.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -6.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -6.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -6.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(1.2486F, -30.2337F, 2.2409F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(17.5F, -32.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(10.0F, -37.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(10.0F, -37.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(10.0F, -37.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(1.2486F, -30.2337F, 2.2409F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.degreeVec(17.5F, -32.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.degreeVec(17.5F, 12.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.7083F, AdvancedKeyframeAnimations.degreeVec(17.5F, 17.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(1.7083F, AdvancedKeyframeAnimations.posVec(0.0F, -0.1275F, -0.4835F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("head", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 25.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-87.8125F, 28.067F, -9.7157F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(37.9F, 110.8F, 81.02F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.8333F, AdvancedKeyframeAnimations.degreeVec(71.13F, 140.81F, 98.13F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(57.9F, 150.8F, 83.52F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, -19.0733F, -119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, -19.0733F, -119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(-9.89F, -7.84F, -73.2F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(5.5116F, -0.962F, 9.5208F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-18.35F, -0.23F, -101.75F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-18.35F, -0.23F, -101.75F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, -19.0733F, -119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(-14.54F, -19.07F, -104.23F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(25.46F, 0.93F, -96.73F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.8333F, AdvancedKeyframeAnimations.degreeVec(19.58F, -12.18F, -109.58F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(10.4611F, 5.9267F, -114.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(29.2692F, -30.7611F, -34.2056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.3333F, AdvancedKeyframeAnimations.degreeVec(29.2692F, -30.7611F, -34.2056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.degreeVec(-14.73F, -21.76F, 6.29F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(-28.1F, -7.58F, -9.77F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-9.27F, 3.94F, 9.02F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(4.2692F, -8.2611F, -31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(4.2692F, -8.2611F, -31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(4.37F, -8.45F, -14.95F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(21.7692F, -8.2611F, -31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(21.7692F, -8.2611F, -31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 7.5F, -2.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(12.5F, 0.0F, 11.88F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.4167F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
		))
		.addAnimation("right_fist1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, -2.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist4", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist5", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, -12.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, -12.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-30.1638F, 35.2763F, -12.1821F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-30.1638F, 35.2763F, -12.1821F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(-30.1638F, 35.2763F, -12.1821F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-30.1638F, 35.2763F, -12.1821F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-30.1638F, 35.2763F, -12.1821F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.degreeVec(-92.8125F, -10.567F, 9.7157F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-105.0F, 0.0F, 20.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-105.0F, 0.0F, 20.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(-105.0F, 0.0F, 20.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-105.0F, 0.0F, 20.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-105.0F, 0.0F, 20.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, 19.0733F, 119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, 19.0733F, 119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(-9.89F, 7.84F, 73.2F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.degreeVec(5.5116F, 0.962F, -9.5208F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.8333F, AdvancedKeyframeAnimations.degreeVec(-49.1F, 2.68F, 44.8F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.875F, AdvancedKeyframeAnimations.degreeVec(-42.12F, 2.31F, 67.57F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(-18.35F, 0.23F, 101.75F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 37.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(29.2692F, 30.7611F, 34.2056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.4583F, AdvancedKeyframeAnimations.degreeVec(29.2692F, 30.7611F, 34.2056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(-14.73F, 21.76F, -6.29F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(-28.1F, 7.58F, 9.77F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.625F, AdvancedKeyframeAnimations.degreeVec(-9.27F, -3.94F, -9.02F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.6667F, AdvancedKeyframeAnimations.degreeVec(4.2692F, 8.2611F, 31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.8333F, AdvancedKeyframeAnimations.degreeVec(4.2692F, 8.2611F, 31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.875F, AdvancedKeyframeAnimations.degreeVec(4.37F, 8.45F, 14.95F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.0F, AdvancedKeyframeAnimations.degreeVec(21.7692F, 8.2611F, 31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AdvancedAnimationDefinition SLIP_STRAIGHT = AdvancedAnimationDefinition.Builder.withLength(1.5833F)
		.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, -50.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(0.0F, -30.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.posVec(4.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.4583F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.posVec(0.0F, -0.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(0.0F, -1.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.posVec(0.0F, -3.55F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.3333F, AdvancedKeyframeAnimations.posVec(0.0F, -3.55F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-10.0F, 27.5F, 10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(-28.2F, 30.56F, 11.08F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(-30.0F, 27.5F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(-27.5F, -15.0F, -5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(-27.5F, -15.0F, -5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(-47.4574F, -1.3048F, 0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.3333F, AdvancedKeyframeAnimations.degreeVec(-47.4574F, -1.3048F, 0.6482F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(-3.0F, 0.0F, -3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.posVec(-2.0F, 0.0F, 4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.125F, AdvancedKeyframeAnimations.degreeVec(26.84F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(43.92F, 0.81F, -0.08F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(57.22F, 1.63F, -0.16F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(71.35F, 2.44F, -0.23F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9583F, AdvancedKeyframeAnimations.degreeVec(84.23F, 3.26F, -0.31F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(89.6195F, 4.0715F, -0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.3333F, AdvancedKeyframeAnimations.degreeVec(89.6195F, 4.0715F, -0.3831F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, 2.7641F, 4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.3333F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, 2.7641F, 4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-45.0F, 45.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 30.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(12.4022F, 1.9642F, 6.3112F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(12.4022F, 1.9642F, 6.3112F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(17.4022F, 1.9642F, 6.3112F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(27.58F, 1.67F, 13.99F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.3333F, AdvancedKeyframeAnimations.degreeVec(27.58F, 1.67F, 6.49F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, 13.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 12.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 12.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 6.75F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.3333F, AdvancedKeyframeAnimations.posVec(1.0F, -1.0F, 6.75F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(135.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.1667F, AdvancedKeyframeAnimations.degreeVec(135.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(46.03F, -0.21F, 0.11F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(14.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(14.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(19.5698F, 3.0099F, -1.6727F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(-0.3325F, -1.7999F, -0.8061F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.3333F, AdvancedKeyframeAnimations.degreeVec(-28.5339F, -2.7641F, -4.2326F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-10.0F, 55.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(-17.5F, 32.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.3333F, AdvancedKeyframeAnimations.degreeVec(-2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 8.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.3333F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(12.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(20.3F, 2.07F, -0.15F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(1.2486F, -30.2337F, 2.2409F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(17.5F, -32.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(17.5F, 12.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9583F, AdvancedKeyframeAnimations.degreeVec(17.5F, 17.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.9583F, AdvancedKeyframeAnimations.posVec(0.0F, -0.1275F, -0.4835F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(22.5F, 0.0F, 7.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(7.19F, -4.51F, 3.46F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(72.8979F, 65.795F, 106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(57.9F, 150.8F, 83.52F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(71.13F, 140.81F, 98.13F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(57.9F, 150.8F, 83.52F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(-1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-25.0F, 7.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(-24.77F, 4.54F, 8.18F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, -19.0733F, -119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.625F, AdvancedKeyframeAnimations.degreeVec(-14.54F, -19.07F, -104.23F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(25.46F, 0.93F, -96.73F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(19.58F, -12.18F, -109.58F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(10.4611F, 5.9267F, -114.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(0.0F, 7.5F, -2.5F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(12.5F, 0.0F, 11.88F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(-15.0F, 2.5F, -10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(-92.8125F, -10.567F, 9.7157F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(72.8979F, -65.795F, -106.0188F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(1.0F, 0.0F, -4.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
			new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(-15.0F, 22.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, 19.0733F, 119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(-14.5389F, 19.0733F, 119.2321F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(-9.89F, 7.84F, 73.2F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(5.5116F, 0.962F, -9.5208F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-49.1F, 2.68F, 44.8F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(-42.12F, 2.31F, 67.57F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-18.35F, 0.23F, 101.75F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION, 
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(29.2692F, 30.7611F, 34.2056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(29.2692F, 30.7611F, 34.2056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(-14.73F, 21.76F, -6.29F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(-28.1F, 7.58F, 9.77F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.875F, AdvancedKeyframeAnimations.degreeVec(-9.27F, -3.94F, -9.02F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(4.2692F, 8.2611F, 31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(4.2692F, 8.2611F, 31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(4.37F, 8.45F, 14.95F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(21.7692F, 8.2611F, 31.7056F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.addAnimation("left_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION, 
			new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
			new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
		))
		.build();

	public static final AdvancedAnimationDefinition EVASION = AdvancedAnimationDefinition.Builder.withLength(0.0F)
		
		.build();

	public static final AdvancedAnimationDefinition UPPER_CUT = AdvancedAnimationDefinition.Builder.withLength(0.0F)
		
		.build();

	public static final AdvancedAnimationDefinition IDLE_WITH_WEAPON = AdvancedAnimationDefinition.Builder.withLength(2.25F).looping()
			.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.posVec(0.0F, -1.9763F, 0.2164F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("head", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(2.5F, 0.0F, -10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-12.5F, 0.0F, 10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("tail3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(2.6602F, -19.9802F, -0.9096F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(2.6393F, -1.3153F, -0.0557F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.2083F, AdvancedKeyframeAnimations.degreeVec(2.6436F, 21.4452F, 0.977F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.7083F, AdvancedKeyframeAnimations.degreeVec(2.6393F, -1.3153F, -0.0557F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(2.6602F, -19.9802F, -0.9096F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("tail2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(27.8608F, -8.8604F, -4.6547F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(28.627F, -15.4697F, -8.2834F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(27.5224F, -7.7826F, 1.1549F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(27.4119F, -0.0476F, -0.0059F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(27.7021F, -6.6485F, -3.4787F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.875F, AdvancedKeyframeAnimations.degreeVec(28.3807F, -12.5787F, -6.7181F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(27.8608F, -8.8604F, -4.6547F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("tail1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-1.3835F, -13.2376F, 7.0498F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(-0.0896F, 4.4339F, -2.3134F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-1.4854F, 15.1605F, -9.5401F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.125F, AdvancedKeyframeAnimations.degreeVec(-0.6893F, 10.5408F, -5.7133F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.875F, AdvancedKeyframeAnimations.degreeVec(-1.518F, -11.9979F, 6.5055F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(-0.8216F, -13.2721F, 7.0531F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("piercing", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(21.6496F, 22.8972F, 20.0049F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("snout", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("jaw", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(1.25F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(2.25F, AdvancedKeyframeAnimations.degreeVec(2.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("right_fist1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("right_fist2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("right_fist3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("right_fist4", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("right_fist5", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.build();

	public static final AdvancedAnimationDefinition WALK_WITH_WEAPON = AdvancedAnimationDefinition.Builder.withLength(1.0833F).looping()
			.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("head", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(0.0F, -1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-12.6256F, 1.8367F, 0.276F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-0.164F, 2.9174F, 0.3956F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(21.6143F, 4.6494F, 1.1493F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-17.9611F, 1.3704F, 0.2972F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(-40.1782F, -0.4844F, 0.8427F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-12.6256F, 1.8367F, 0.276F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.75F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(0.0F, 0.64F, 0.05F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(0.0F, 1.71F, -0.43F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.75F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(20.6934F, 0.2489F, -4.8091F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(30.5461F, 1.9667F, -4.7018F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(19.5569F, 0.0501F, -4.8024F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(108.3096F, -0.4659F, 0.2014F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(74.0487F, 8.3279F, -0.9784F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(20.6934F, 0.2489F, -4.8091F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.posVec(0.0F, 0.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.posVec(0.0F, 0.89F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(-0.96F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(21.2722F, -4.622F, -1.0868F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(-18.3672F, -1.3345F, -0.26F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(-40.5378F, 0.5146F, -0.8283F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-13.0341F, -1.8005F, -0.2335F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(-0.5646F, -2.8825F, -0.3425F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(21.2722F, -4.622F, -1.0868F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.posVec(0.0F, 0.64F, 0.05F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.posVec(0.0F, 1.71F, -0.43F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.75F, -2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 1.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(58.9375F, -2.9276F, -0.7532F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.degreeVec(108.2216F, -10.3672F, -4.4123F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(74.0498F, -8.2978F, 1.008F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(20.7005F, -0.2071F, 4.8026F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(30.5532F, -1.9244F, 4.7025F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(19.564F, -0.0085F, 4.7951F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(58.9375F, -2.9276F, -0.7532F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(0.0F, 0.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.posVec(0.0F, 0.89F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-0.96F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(22.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.LINEAR)
			))
			.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-10.189F, -9.7716F, -7.3692F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(27.4977F, -4.8489F, -11.7341F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-10.189F, -9.7716F, -7.3692F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-32.5F, 0.0F, 10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-32.5F, 0.0F, 10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("tail3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(2.6602F, -19.9802F, -0.9096F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(2.6393F, -1.3153F, -0.0557F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(2.6436F, 21.4452F, 0.977F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.7917F, AdvancedKeyframeAnimations.degreeVec(2.6393F, -1.3153F, -0.0557F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(2.6602F, -19.9802F, -0.9096F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("tail2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(27.8608F, -8.8604F, -4.6547F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.1667F, AdvancedKeyframeAnimations.degreeVec(28.627F, -15.4697F, -8.2834F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(27.5224F, 2.2174F, 1.1549F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(27.4119F, -0.0476F, -0.0059F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(27.7021F, -6.6485F, -3.4787F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(28.3807F, -12.5787F, -6.7181F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(27.8608F, -8.8604F, -4.6547F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("tail1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(-1.3835F, -13.2376F, 7.0498F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.1667F, AdvancedKeyframeAnimations.degreeVec(-0.0896F, 4.4339F, -2.3134F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.375F, AdvancedKeyframeAnimations.degreeVec(-1.4854F, 17.6605F, -9.5401F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(-0.6893F, 10.5408F, -5.7133F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.7083F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.9167F, AdvancedKeyframeAnimations.degreeVec(-1.518F, -11.9979F, 6.5055F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(-1.3835F, -13.2376F, 7.0498F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("piercing", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(29.0088F, 27.798F, 40.8454F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.degreeVec(22.6055F, 21.9554F, 22.5103F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.degreeVec(29.0088F, 27.798F, 40.8454F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(22.6055F, 21.9554F, 22.5103F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.degreeVec(29.0088F, 27.798F, 40.8454F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, -0.65F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2083F, AdvancedKeyframeAnimations.posVec(0.0F, 0.41F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.25F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5417F, AdvancedKeyframeAnimations.posVec(0.0F, -0.65F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(0.0F, 0.41F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.0833F, AdvancedKeyframeAnimations.posVec(0.0F, -0.65F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("weapon", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("weapon", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.build();

	public static final AdvancedAnimationDefinition DEATH_WITH_WEAPON = AdvancedAnimationDefinition.Builder.withLength(2.0F)
			.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.posVec(0.0F, -14.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("legs", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(57.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-35.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(147.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("lower_body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("lower_body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(42.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("neck", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("head", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(5.4821F, 1.6913F, 4.7301F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(86.7094F, -15.2779F, 16.792F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-52.5661F, 6.1694F, -9.3285F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("tail1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(32.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("tail2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(-15.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("tail3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.75F, AdvancedKeyframeAnimations.degreeVec(12.5F, 15.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.build();

	public static final AdvancedAnimationDefinition JUMP_SLASH = AdvancedAnimationDefinition.Builder.withLength(2.1667F)
			.addAnimation("mid_root_controller", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.posVec(0.0F, -1.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(0.0F, -1.75F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.posVec(0.0F, 4.25F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.posVec(0.0F, 4.25F, 5.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.posVec(0.0F, -9.0F, 4.25F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.9167F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(-47.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-52.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(-58.75F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(-65.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, -3.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.posVec(0.0F, 2.0F, -13.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.posVec(0.0F, 2.0F, -13.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(57.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(62.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(40.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(40.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(112.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(-37.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(-5.0563F, 7.4559F, -1.053F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-5.0563F, 7.4559F, -1.053F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(22.4735F, 4.9648F, -0.8396F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(22.4735F, 4.9648F, -0.8396F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(22.4735F, 4.9648F, -0.8396F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(12.4735F, 4.9648F, -0.8396F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.posVec(-2.0F, 0.0F, 2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(-2.0F, 0.0F, 2.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.posVec(-1.0F, 1.0F, -12.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.posVec(-1.0F, 1.0F, -12.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fore_leg", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(37.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(42.5033F, -0.7873F, 2.3728F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(42.5033F, -0.7873F, 2.3728F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5F, AdvancedKeyframeAnimations.degreeVec(73.7533F, -0.7873F, 2.3728F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(80.0033F, -0.7873F, 2.3728F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_toes", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-27.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(35.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(-12.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 15.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(-7.5F, 15.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("pelvis", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.POSITION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, -12.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.posVec(0.0F, 1.0F, -12.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("body", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(15.6469F, 14.0761F, 5.2362F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(15.6469F, 14.0761F, 5.2362F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("neck", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(-17.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(-10.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("head", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(0.0F, -27.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, -27.5F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(20.3397F, -1.725F, 4.7055F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(37.8397F, -1.725F, 4.7055F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(-6.559F, -20.1687F, 7.4844F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.2083F, AdvancedKeyframeAnimations.degreeVec(-22.7382F, -18.9587F, -1.0954F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(-13.6384F, -16.7795F, 37.5916F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(24.7526F, -3.9498F, 7.4397F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(70.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(82.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(101.47F, -35.0679F, -32.0621F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.2083F, AdvancedKeyframeAnimations.degreeVec(95.8862F, -41.6023F, -35.4976F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(118.3441F, 3.6866F, 9.1018F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(81.6054F, -3.8525F, 10.5575F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(-1.7816F, 19.4013F, 19.4352F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.2083F, AdvancedKeyframeAnimations.degreeVec(25.3334F, 24.6589F, -7.4125F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(41.1299F, 35.6549F, -6.5738F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(31.8003F, 32.4986F, 1.9695F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fist1", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fist2", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fist3", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fist4", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("right_fist5", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("weapon", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(22.8429F, -2.1349F, 9.776F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.5F, AdvancedKeyframeAnimations.degreeVec(22.8429F, -2.1349F, 9.776F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.8333F, AdvancedKeyframeAnimations.degreeVec(-10.5178F, -21.1684F, 34.5196F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.9583F, AdvancedKeyframeAnimations.degreeVec(-9.7833F, -18.6123F, 30.2596F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.2083F, AdvancedKeyframeAnimations.degreeVec(-4.9207F, -14.1648F, 16.3558F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.2917F, AdvancedKeyframeAnimations.degreeVec(-8.9403F, 0.5526F, 36.1657F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.375F, AdvancedKeyframeAnimations.degreeVec(-1.2792F, -8.3345F, -8.6608F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.5417F, AdvancedKeyframeAnimations.degreeVec(7.5F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(9.3679F, -4.9257F, -14.2945F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.875F, AdvancedKeyframeAnimations.degreeVec(9.3679F, -4.9257F, -14.2945F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_fore_arm", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(-37.5F, 0.0F, 15.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.875F, AdvancedKeyframeAnimations.degreeVec(-37.5F, 0.0F, 15.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.addAnimation("left_fist", new AdvancedAnimationChannel(AdvancedAnimationChannel.Targets.ROTATION,
					new AdvancedKeyframe(0.0F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(0.2917F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(1.875F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM),
					new AdvancedKeyframe(2.1667F, AdvancedKeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F), AdvancedAnimationChannel.Interpolations.CATMULLROM)
			))
			.build();
}