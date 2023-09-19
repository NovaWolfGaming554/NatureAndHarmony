
package net.mcreator.natureandharmony.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.natureandharmony.init.NatureAndHarmonyModItems;

public class RoseGoldPickaxeItem extends PickaxeItem {
	public RoseGoldPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 525;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 2f;
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
		}, 1, -3f, new Item.Properties());
	}
}
