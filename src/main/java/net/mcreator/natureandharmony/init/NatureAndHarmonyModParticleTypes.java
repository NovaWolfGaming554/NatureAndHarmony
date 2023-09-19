
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.natureandharmony.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.natureandharmony.NatureAndHarmonyMod;

public class NatureAndHarmonyModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, NatureAndHarmonyMod.MODID);
	public static final RegistryObject<SimpleParticleType> SULPHUR_DUST_PARTICLES = REGISTRY.register("sulphur_dust_particles", () -> new SimpleParticleType(true));
	public static final RegistryObject<SimpleParticleType> ICY_PARTICLE = REGISTRY.register("icy_particle", () -> new SimpleParticleType(false));
	public static final RegistryObject<SimpleParticleType> STAR = REGISTRY.register("star", () -> new SimpleParticleType(true));
}
