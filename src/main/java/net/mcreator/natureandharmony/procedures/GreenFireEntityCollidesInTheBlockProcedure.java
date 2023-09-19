package net.mcreator.natureandharmony.procedures;

import net.minecraft.world.entity.Entity;

public class GreenFireEntityCollidesInTheBlockProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.setSecondsOnFire(15);
	}
}
