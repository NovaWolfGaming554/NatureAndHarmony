
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.natureandharmony.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.natureandharmony.potion.IceSpikeSpeedMobEffect;
import net.mcreator.natureandharmony.NatureAndHarmonyMod;

public class NatureAndHarmonyModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, NatureAndHarmonyMod.MODID);
	public static final RegistryObject<MobEffect> ICE_SPIKE_SPEED = REGISTRY.register("ice_spike_speed", () -> new IceSpikeSpeedMobEffect());
}
