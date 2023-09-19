
package net.mcreator.natureandharmony.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DiamondShardItem extends Item {
	public DiamondShardItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
