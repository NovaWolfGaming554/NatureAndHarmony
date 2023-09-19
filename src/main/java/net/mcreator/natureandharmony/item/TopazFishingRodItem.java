
package net.mcreator.natureandharmony.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.FishingRodItem;

public class TopazFishingRodItem extends FishingRodItem {
	public TopazFishingRodItem() {
		super(new Item.Properties().durability(150));
	}

	@Override
	public int getEnchantmentValue() {
		return 2;
	}
}
