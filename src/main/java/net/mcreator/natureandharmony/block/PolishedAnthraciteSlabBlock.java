
package net.mcreator.natureandharmony.block;

import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.properties.SlabType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.item.ItemStack;

import java.util.List;
import java.util.Collections;

public class PolishedAnthraciteSlabBlock extends SlabBlock {
	public PolishedAnthraciteSlabBlock() {
		super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.POLISHED_DEEPSLATE).strength(1f, 10f).dynamicShape());
	}

	@Override
	public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
		List<ItemStack> dropsOriginal = super.getDrops(state, builder);
		if (!dropsOriginal.isEmpty())
			return dropsOriginal;
		return Collections.singletonList(new ItemStack(this, state.getValue(TYPE) == SlabType.DOUBLE ? 2 : 1));
	}
}
