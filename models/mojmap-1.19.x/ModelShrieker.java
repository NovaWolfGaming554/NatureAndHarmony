// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelShrieker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "shrieker"), "main");
	private final ModelPart LeftLeg;
	private final ModelPart RightLeg;
	private final ModelPart Body;
	private final ModelPart Head;

	public ModelShrieker(ModelPart root) {
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
		this.Body = root.getChild("Body");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(0.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 17)
						.addBox(1.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 35)
						.addBox(1.0F, -9.0F, 0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 40)
						.addBox(-3.0F, -11.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition LowerLeftLeg_r1 = LeftLeg
				.addOrReplaceChild("LowerLeftLeg_r1",
						CubeListBuilder.create().texOffs(33, 36).addBox(1.0F, -5.0F, 0.0F, 2.0F, 4.0F, 2.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(31, 17)
						.addBox(-4.0F, -1.0F, -1.0F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 14)
						.addBox(-3.0F, -1.0F, -2.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-3.0F, -9.0F, 0.5F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(39, 23)
						.addBox(2.0F, -11.0F, 0.0F, 1.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition LowerRightLeg_r1 = RightLeg.addOrReplaceChild(
				"LowerRightLeg_r1", CubeListBuilder.create().texOffs(24, 36).addBox(-3.0F, -5.0F, 0.0F, 2.0F, 4.0F,
						2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-2.0F, -13.0F, -3.0F, 4.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-1.0F, -13.0F, 6.0F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 17)
						.addBox(-1.0F, -12.0F, 7.0F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(31, 22)
						.addBox(-2.0F, -13.5F, -4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(31, 0)
						.addBox(-2.0F, -10.5F, -4.0F, 4.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 19)
						.addBox(0.0F, -16.0F, -2.0F, 0.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition TeethFront_r1 = Head.addOrReplaceChild("TeethFront_r1",
				CubeListBuilder.create().texOffs(18, 6)
						.addBox(-2.0F, -13.0F, -12.0F, 4.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(-1.0F, -10.0F, -11.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition TeethRight_r1 = Head.addOrReplaceChild("TeethRight_r1",
				CubeListBuilder.create().texOffs(20, 7)
						.addBox(1.8F, -11.0F, -10.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 23)
						.addBox(-1.8F, -11.0F, -10.0F, 0.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(28, 6)
						.addBox(-2.0F, -9.8F, -7.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition HeadBottomFront_r1 = Head.addOrReplaceChild(
				"HeadBottomFront_r1", CubeListBuilder.create().texOffs(18, 0).addBox(-2.0F, -10.1F, -10.5F, 4.0F, 1.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition HeadTopfront_r1 = Head.addOrReplaceChild(
				"HeadTopfront_r1", CubeListBuilder.create().texOffs(11, 29).addBox(-2.0F, -12.8F, -13.5F, 4.0F, 1.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition HeadTopBack_r1 = Head.addOrReplaceChild(
				"HeadTopBack_r1", CubeListBuilder.create().texOffs(28, 30).addBox(-2.0F, -13.2F, -9.0F, 4.0F, 1.0F,
						4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}