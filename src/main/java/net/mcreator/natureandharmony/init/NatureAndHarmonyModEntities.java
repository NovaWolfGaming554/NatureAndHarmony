
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.natureandharmony.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.natureandharmony.entity.SkullEntity;
import net.mcreator.natureandharmony.entity.ActiniumBowEntity;
import net.mcreator.natureandharmony.NatureAndHarmonyMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NatureAndHarmonyModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, NatureAndHarmonyMod.MODID);
	public static final RegistryObject<EntityType<SkullEntity>> SKULL = register("skull",
			EntityType.Builder.<SkullEntity>of(SkullEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(70).setUpdateInterval(3).setCustomClientFactory(SkullEntity::new).fireImmune().sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<ActiniumBowEntity>> ACTINIUM_BOW = register("projectile_actinium_bow",
			EntityType.Builder.<ActiniumBowEntity>of(ActiniumBowEntity::new, MobCategory.MISC).setCustomClientFactory(ActiniumBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SkullEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SKULL.get(), SkullEntity.createAttributes().build());
	}
}
