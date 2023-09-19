
package net.mcreator.natureandharmony.potion;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.natureandharmony.procedures.IceSpikeSpeedEffectStartedappliedProcedure;

public class IceSpikeSpeedMobEffect extends MobEffect {
	public IceSpikeSpeedMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6684673);
	}

	@Override
	public String getDescriptionId() {
		return "effect.nature_and_harmony.ice_spike_speed";
	}

	@Override
	public boolean isInstantenous() {
		return true;
	}

	@Override
	public void applyInstantenousEffect(Entity source, Entity indirectSource, LivingEntity entity, int amplifier, double health) {
		IceSpikeSpeedEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
