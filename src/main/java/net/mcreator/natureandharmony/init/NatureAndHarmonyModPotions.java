
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.natureandharmony.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.natureandharmony.NatureAndHarmonyMod;

public class NatureAndHarmonyModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, NatureAndHarmonyMod.MODID);
	public static final RegistryObject<Potion> ICE_POTION = REGISTRY.register("ice_potion", () -> new Potion(new MobEffectInstance(NatureAndHarmonyModMobEffects.ICE_SPIKE_SPEED.get(), 3600, 0, false, true)));
}
