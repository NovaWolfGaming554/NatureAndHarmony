
package net.mcreator.natureandharmony.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class MichriteItem extends Item {
	public MichriteItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
