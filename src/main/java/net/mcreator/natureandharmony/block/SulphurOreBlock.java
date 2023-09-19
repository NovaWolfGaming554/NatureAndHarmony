
package net.mcreator.natureandharmony.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

public class SulphurOreBlock extends FallingBlock {
	public SulphurOreBlock() {
		super(BlockBehaviour.Properties.of(Material.SAND).sound(SoundType.SOUL_SOIL).strength(1f, 10f).speedFactor(0.8f).jumpFactor(0.8f));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
