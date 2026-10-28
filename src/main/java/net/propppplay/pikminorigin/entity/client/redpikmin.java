package net.propppplay.pikminorigin.entity.client;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import net.propppplay.pikminorigin.entity.animation.ModAnimations;
import net.propppplay.pikminorigin.entity.custom.RedpikminEntity;

// Made with Blockbench 5.2.2
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports
public class redpikmin<T extends RedpikminEntity> extends SinglePartEntityModel<T> {
	private final ModelPart root;
	private final ModelPart torso;
	private final ModelPart head;
	private final ModelPart stem;
	private final ModelPart leaf;
	private final ModelPart bud;
	private final ModelPart flower;
	private final ModelPart ears;
	private final ModelPart nose;
	private final ModelPart rightleg;
	private final ModelPart leftleg;
	private final ModelPart rightarm;
	private final ModelPart leftarm;
	public redpikmin(ModelPart root) {
		this.root = root.getChild("root");
		this.torso = this.root.getChild("torso");
		this.head = this.torso.getChild("head");
		this.stem = this.head.getChild("stem");
		this.leaf = this.stem.getChild("leaf");
		this.bud = this.stem.getChild("bud");
		this.flower = this.stem.getChild("flower");
		this.ears = this.head.getChild("ears");
		this.nose = this.head.getChild("nose");
		this.rightleg = this.torso.getChild("rightleg");
		this.leftleg = this.torso.getChild("leftleg");
		this.rightarm = this.torso.getChild("rightarm");
		this.leftarm = this.torso.getChild("leftarm");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData torso = root.addChild("torso", ModelPartBuilder.create().uv(0, 18).cuboid(-1.5F, -6.0F, -1.5F, 3.0F, 4.0F, 3.0F, new Dilation(0.0F))
				.uv(0, 10).cuboid(-1.0F, -7.0F, -1.0F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData head = torso.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F, new Dilation(0.0F))
				.uv(20, 13).cuboid(-1.0F, -0.75F, -2.4F, 2.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -7.0F, 0.0F));

		ModelPartData stem = head.addChild("stem", ModelPartBuilder.create(), ModelTransform.of(0.0F, -5.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		ModelPartData cube_r1 = stem.addChild("cube_r1", ModelPartBuilder.create().uv(20, 21).cuboid(-1.0F, -5.0F, -1.0F, 0.0F, 5.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 1.0F, 0.0F, -1.5708F, 0.0F));

		ModelPartData leaf = stem.addChild("leaf", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

		ModelPartData cube_r2 = leaf.addChild("cube_r2", ModelPartBuilder.create().uv(20, 0).cuboid(0.0F, -4.0F, -1.5F, 0.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -1.5708F, 0.0F, 1.5708F));

		ModelPartData bud = stem.addChild("bud", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

		ModelPartData cube_r3 = bud.addChild("cube_r3", ModelPartBuilder.create().uv(12, 18).cuboid(-1.5F, 0.1F, -1.5F, 3.0F, 0.0F, 3.0F, new Dilation(0.0F))
				.uv(20, 7).cuboid(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		ModelPartData flower = stem.addChild("flower", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -5.0F, 0.0F));

		ModelPartData cube_r4 = flower.addChild("cube_r4", ModelPartBuilder.create().uv(-6, 26).cuboid(-3.0F, 0.25F, -3.0F, 6.0F, 0.0F, 6.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -1.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData cube_r5 = flower.addChild("cube_r5", ModelPartBuilder.create().uv(12, 26).cuboid(-0.65F, -5.75F, -1.35F, 2.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 5.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

		ModelPartData ears = head.addChild("ears", ModelPartBuilder.create().uv(0, 15).cuboid(-5.5F, -4.0F, 0.0F, 11.0F, 3.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData nose = head.addChild("nose", ModelPartBuilder.create().uv(26, 12).cuboid(-0.5F, -0.5F, -2.0F, 1.0F, 1.0F, 2.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.5F, -2.5F));

		ModelPartData rightleg = torso.addChild("rightleg", ModelPartBuilder.create().uv(22, 21).cuboid(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.99F, -2.0F, 0.0F));

		ModelPartData leftleg = torso.addChild("leftleg", ModelPartBuilder.create().uv(24, 17).cuboid(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(0.99F, -2.0F, 0.0F));

		ModelPartData rightarm = torso.addChild("rightarm", ModelPartBuilder.create().uv(16, 21).cuboid(-1.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(-1.5F, -6.0F, 0.0F));

		ModelPartData leftarm = torso.addChild("leftarm", ModelPartBuilder.create().uv(12, 21).cuboid(0.0F, 0.0F, -0.5F, 1.0F, 4.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.5F, -6.0F, 0.0F));
		return TexturedModelData.of(modelData, 32, 32);
	}
	@Override
	public void setAngles(RedpikminEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.getPart().traverse().forEach(ModelPart::resetTransform);
		this.setHeadAngles(netHeadYaw, headPitch);

		this.animateMovement(ModAnimations.WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.updateAnimation(entity.idleAnimationState, ModAnimations.IDLE, ageInTicks, 1f);

	}

	private void setHeadAngles(float headYaw, float headPitch) {
		headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
		headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

		this.head.yaw = headYaw * 0.017453292F;
		this.head.pitch = headPitch * 0.017453292F;
	}

	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		torso.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart getPart() {
		return torso;
	}
}