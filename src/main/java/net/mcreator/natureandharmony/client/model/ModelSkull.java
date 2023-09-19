package net.mcreator.natureandharmony.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.6.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelSkull<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("nature_and_harmony", "model_skull"), "main");
	public final ModelPart LeftSide;
	public final ModelPart RightSide;
	public final ModelPart Face;
	public final ModelPart Jaw;
	public final ModelPart bb_main;

	public ModelSkull(ModelPart root) {
		this.LeftSide = root.getChild("LeftSide");
		this.RightSide = root.getChild("RightSide");
		this.Face = root.getChild("Face");
		this.Jaw = root.getChild("Jaw");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftSide = partdefinition.addOrReplaceChild("LeftSide", CubeListBuilder.create().texOffs(28, 21).addBox(-5.0F, -19.0F, 0.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 25)
				.addBox(-5.0F, -19.0F, -2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-5.0F, -19.0F, -4.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition RightSide = partdefinition.addOrReplaceChild("RightSide", CubeListBuilder.create().texOffs(32, 7).addBox(4.0F, -19.0F, -2.0F, 1.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 16)
				.addBox(4.0F, -19.0F, -4.0F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 31).addBox(4.0F, -19.0F, 0.0F, 1.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Face = partdefinition.addOrReplaceChild("Face",
				CubeListBuilder.create().texOffs(6, 37).addBox(-1.0F, -16.0F, -5.0F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 25).addBox(-4.0F, -16.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 37)
						.addBox(3.0F, -16.0F, -5.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 16).addBox(1.0F, -14.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 0)
						.addBox(-2.0F, -14.0F, -5.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 31).addBox(-2.0F, -13.0F, -5.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 23)
						.addBox(2.0F, -14.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 16).addBox(-4.0F, -19.0F, -5.0F, 8.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 7)
						.addBox(-4.0F, -14.0F, -5.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Jaw = partdefinition.addOrReplaceChild("Jaw",
				CubeListBuilder.create().texOffs(36, 34).addBox(2.0F, -10.0F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 20).addBox(2.0F, -10.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(8, 34)
						.addBox(-1.0F, -10.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 34).addBox(-4.0F, -10.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 20)
						.addBox(2.0F, -10.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 34).addBox(-4.0F, -10.0F, -4.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 37)
						.addBox(3.0F, -11.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(23, 29).addBox(-4.0F, -11.0F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 12)
						.addBox(-4.0F, -10.0F, 1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 25).addBox(-4.0F, -9.0F, -4.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -19.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
				.addBox(-4.0F, -19.0F, 4.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 16).addBox(-4.0F, -20.0F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		LeftSide.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightSide.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Face.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Jaw.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Jaw.xRot = headPitch / (180F / (float) Math.PI);
	}
}
