
package net.mcreator.natureandharmony.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Collections;

public class BloodOakFenceBlock extends FenceBlock {
	public BloodOakFenceBlock() {
		super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.BAMBOO_WOOD).strength(0.8f, 10f).dynamicShape());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, 1));
	}
}
