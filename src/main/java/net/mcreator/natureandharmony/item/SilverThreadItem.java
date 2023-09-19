
package net.mcreator.natureandharmony.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SilverThreadItem extends Item {
	public SilverThreadItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
