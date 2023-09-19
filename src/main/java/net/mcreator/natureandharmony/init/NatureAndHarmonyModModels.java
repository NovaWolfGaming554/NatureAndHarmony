
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.natureandharmony.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.natureandharmony.client.model.Modelsilkworm;
import net.mcreator.natureandharmony.client.model.Modelnighrwalker;
import net.mcreator.natureandharmony.client.model.Modelgoblin;
import net.mcreator.natureandharmony.client.model.ModelSkull;
import net.mcreator.natureandharmony.client.model.ModelShrieker;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class NatureAndHarmonyModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelgoblin.LAYER_LOCATION, Modelgoblin::createBodyLayer);
		event.registerLayerDefinition(ModelSkull.LAYER_LOCATION, ModelSkull::createBodyLayer);
		event.registerLayerDefinition(ModelShrieker.LAYER_LOCATION, ModelShrieker::createBodyLayer);
		event.registerLayerDefinition(Modelnighrwalker.LAYER_LOCATION, Modelnighrwalker::createBodyLayer);
		event.registerLayerDefinition(Modelsilkworm.LAYER_LOCATION, Modelsilkworm::createBodyLayer);
	}
}
