
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.natureandharmony.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.natureandharmony.NatureAndHarmonyMod;

public class NatureAndHarmonyModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, NatureAndHarmonyMod.MODID);
	public static final RegistryObject<SoundEvent> LEATHERBLOCK = REGISTRY.register("leatherblock", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("nature_and_harmony", "leatherblock")));
	public static final RegistryObject<SoundEvent> LEATHERBLOCK2 = REGISTRY.register("leatherblock2", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("nature_and_harmony", "leatherblock2")));
	public static final RegistryObject<SoundEvent> LESTHERBLOCK3 = REGISTRY.register("lestherblock3", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("nature_and_harmony", "lestherblock3")));
}
