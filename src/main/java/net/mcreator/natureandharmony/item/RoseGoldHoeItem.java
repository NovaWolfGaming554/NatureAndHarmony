
package net.mcreator.natureandharmony.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.natureandharmony.init.NatureAndHarmonyModItems;

public class RoseGoldHoeItem extends HoeItem {
	public RoseGoldHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 525;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 24;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(NatureAndHarmonyModItems.ROSE_GOLD_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
