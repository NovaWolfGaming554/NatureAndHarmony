
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.natureandharmony.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterParticleProvidersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.natureandharmony.client.particle.SulphurDustParticlesParticle;
import net.mcreator.natureandharmony.client.particle.StarParticle;
import net.mcreator.natureandharmony.client.particle.IcyParticleParticle;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NatureAndHarmonyModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(NatureAndHarmonyModParticleTypes.SULPHUR_DUST_PARTICLES.get(), SulphurDustParticlesParticle::provider);
		event.registerSpriteSet(NatureAndHarmonyModParticleTypes.ICY_PARTICLE.get(), IcyParticleParticle::provider);
		event.registerSpriteSet(NatureAndHarmonyModParticleTypes.STAR.get(), StarParticle::provider);
	}
}
