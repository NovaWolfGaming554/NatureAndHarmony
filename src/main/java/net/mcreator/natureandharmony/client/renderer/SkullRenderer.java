
package net.mcreator.natureandharmony.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.natureandharmony.entity.SkullEntity;
import net.mcreator.natureandharmony.client.model.ModelSkull;

public class SkullRenderer extends MobRenderer<SkullEntity, ModelSkull<SkullEntity>> {
	public SkullRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelSkull(context.bakeLayer(ModelSkull.LAYER_LOCATION)), 0.6f);
		this.addLayer(new EyesLayer<SkullEntity, ModelSkull<SkullEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("nature_and_harmony:textures/entities/texture_skull_eyes.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SkullEntity entity) {
		return new ResourceLocation("nature_and_harmony:textures/entities/texture_skull.png");
	}
}
