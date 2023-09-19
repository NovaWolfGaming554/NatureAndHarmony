
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.natureandharmony.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NatureAndHarmonyModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(NatureAndHarmonyModItems.ROSE_GOLD_SWORD.get());
			tabData.accept(NatureAndHarmonyModItems.ROSE_GOLD_ARMOR_HELMET.get());
			tabData.accept(NatureAndHarmonyModItems.ROSE_GOLD_ARMOR_CHESTPLATE.get());
			tabData.accept(NatureAndHarmonyModItems.ROSE_GOLD_ARMOR_LEGGINGS.get());
			tabData.accept(NatureAndHarmonyModItems.ROSE_GOLD_ARMOR_BOOTS.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(NatureAndHarmonyModItems.SKULL_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(NatureAndHarmonyModItems.ROSE_GOLD_PICKAXE.get());
			tabData.accept(NatureAndHarmonyModItems.ROSE_GOLD_AXE.get());
			tabData.accept(NatureAndHarmonyModItems.ROSE_GOLD_SHOVEL.get());
			tabData.accept(NatureAndHarmonyModItems.ROSE_GOLD_HOE.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("nature_and_harmony", "harmony_and_nature_blocks"),
				builder -> builder.title(Component.translatable("item_group.nature_and_harmony.harmony_and_nature_blocks")).icon(() -> new ItemStack(NatureAndHarmonyModBlocks.CHISELED_STONE_TILES.get())).displayItems((parameters, tabData) -> {
					tabData.accept(NatureAndHarmonyModBlocks.CRACKED_MOSSY_STONE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CRACKED_CHISELED_STONE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MOSSY_CHISELED_STONE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.STONE_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CHISELED_STONE_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.STONE_PILLAR.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.STONE_PANEL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.STONE_PATH.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.STONE_PATH_DIRT.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.STONE_PATH_GRASS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ASH.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SULPHUR_ORE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_MARBLE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_MARBLE_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_MARBLE_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_PANEL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_PILLAR_LOWER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_PILLAR_MIDDLE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_PILLAR_UPPER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLACK_MARBLE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_BLACK_MARBLE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_BLACK_MARBLE_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_BLACK_MARBLE_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BLACK_PANEL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BLACK_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BLACK_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BLACK_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BLACK_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BLACK_PILLAR_LOWER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BLACK_PILLAR_MIDDLE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MARBLE_BLACK_PILLAR_UPPER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LIMESTONE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_LIMESTONE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_LIMESTONE_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_LIMESTONE_STAIRS_RECIPE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LIMESTONE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CHISELED_LIMESTONE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LIMESTONE_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LIMESTONE_TILES_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LIMESTONE_TILES_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LIMESTONE_TILES_WALL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LIMESTONE_CRACKED_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTIMONITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_ANTIMONITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_ANTIMONITE_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_ANTIMONITE_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTIMONITE_PANEL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTIMONITE_PANEL_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTIMONITE_PANEL_STAIRS_RECIPE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTIMONITE_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTIMONITE_PATTERNED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTIMONITE_CHISELED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTHRACITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_ANTHRACITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_ANTHRACITE_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_ANTHRACITE_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTHRACITE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTHRACITE_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTHRACITE_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTHRACITE_TILED_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTHRACITE_BRICKS_SMALL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTHRACITE_BRICKS_SMALL_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTHRACITE_BRICKS_SMALL_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ANTHRACITE_SMALL_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ASH_GILDED_GOLD.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ASH_GILDED_IRON.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ASH_GILDED_DIAMOND.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.WITHERED_MOSS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LARGE_CHAINS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LARGE_LANTERN.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LARGE_LANTERN_WALL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_STEM.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_PLANKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_PLANKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_FENCE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_FENCE_GATE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_DOOR.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_TRAPDOOR.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_WART.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CAST_IRON_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CUT_CAST_IRON.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CUT_IRON_PANELS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MOSSY_NETHERRACK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CARVED_STONE_PANEL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LEATHER_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CALCITE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CALCITE_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CALCITE_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CALCITE_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CALCITE_BRICKS_WALL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CALCITE_PATH.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CALCITE_PATH_DIRT.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CALCITE_PATH_GRASS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.TUFF_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.TUFF_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.TUFF_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.TUFF_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.TUFF_BRICKS_WALL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.TUFF_PATH.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.TUFF_PATH_DIRT.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.TUFF_PATH_GRASS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SCORIA_GRAY.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SCORIA_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SCORIA_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SCORIA_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SCORIA_BRICKS_SLAB_RECIPE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SCORIA_RED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SCORIA_RED_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SCORIA_RED_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SCORIA_RED_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SCORIA_RED_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.NETHERRACK_PATH.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.NETHERRACK_PATH_CRIMSON_NYLIUM.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.NETHERRACK_PATH_WARPED_NYLIUM.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CUT_DIRT.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CAST_IRON_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.LARGE_CAST_IRON_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SMOOTH_CUT_CAST_IRON.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SMOOTH_CAST_IRON_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.RIBBED_CAST_IRON.get().asItem());
					tabData.accept(NatureAndHarmonyModItems.FLESH.get());
					tabData.accept(NatureAndHarmonyModItems.COOKED_FLESH.get());
					tabData.accept(NatureAndHarmonyModBlocks.TOPAZ_ORE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.TOPAZ_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_STONE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.GLOWING_OBSIDIAN.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_DIRT.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_GRASS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CARBORITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CARBORITE_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_GRASS_FLOWEREDF.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_LOG.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_LEAVES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_PLANKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_PLANKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_FENCE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_FENCE_GATE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_PRESSURE_PLATE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_BUTTON.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_DOOR.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BLOOD_OAK_TRAPDOOR.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.FROST.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.PEAK_SCHIST.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.PEAK_SCHIST_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.PEAK_SCHIST_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.PEAK_SCHIST_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.PEAK_SCHIST_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.PEAK_SCHIST_BRICKS_WALL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CARBORITE_COBBLESTONE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CRACKED_CARBORITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.VEKRENITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.VEKRENITE_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.VEKRENITE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.VEKRENITE_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.VEKRENITE_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.VEKRENITE_BRICKS_WALL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ROSE_GOLD_ORE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ROSE_GOLD_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.RAW_ROSE_GOLD_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BAUXITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BAUXITE_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BAUXITE_POLISHED_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BAUXITE_POLISHED_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CORKITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.POLISHED_CORKITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CORKITE_POLISHED_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CORKITE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CORKITE_POLISHED_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.HEATED_CORKITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MORGONITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MORGONITE_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MORGONITE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MORGONITE_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MORGONITE_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.VENOMITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.VENOMITE_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.VENOMITE_POLISHED_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.VENOMITE_POLISHED_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.RHODUSITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.RHODUSITE_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.RHODUSITE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.RHODUSITE_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.RHODUSITE_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.GREEN_FIRE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.MICHERITE_ORE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.QUARTZ_DUST_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CHALK_WHITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CHALK_BLUE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CHALK_RED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CREAMALAN.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CREAMALEN_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CREAMALEN_COBBLESTONE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CREAMALEN_SMOOTH.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_SNOWY.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_GRASS_RED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_GRASS_RED_FLOWERED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_POLISHED_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_POLISHED_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_CHISELED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_CARVED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.RAW_SILVER_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SILVER_ORE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.RAW_ACTINIUM_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ACTINIUM_ORE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_SAND.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_SANDSTONE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BLACK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BLACK_POLISHED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BLACK_POLISHED_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BLACK_POLISHED_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BLACK_BRICKS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BLACK_BRICKS_STAIRS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BLACK_BRICKS_SLAB.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BLACK_CHISELED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BLACK_TILES.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DARKONITE_BLACK_CARVED.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("nature_and_harmony", "nature_and_harmony_plants"),
				builder -> builder.title(Component.translatable("item_group.nature_and_harmony.nature_and_harmony_plants")).icon(() -> new ItemStack(NatureAndHarmonyModBlocks.RED_ROSE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(NatureAndHarmonyModBlocks.RED_ROSE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.PINK_ROSE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CYAN_ROSE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.WHITE_ROSE.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ASH_TUFFS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_ROOTS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_FLOWER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.EMINENCE_FUNGUS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_GRASS_PLANT.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_GRASS_TUFTS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_GRASS_TALL.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_GRASS_FROSTED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_GRASS_SHORT_FROSTED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_GRASS_TALL_FROSTED.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.UNDERWORLD_BELLFLOWER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.PURPLE_BURST_FLOWER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.YELLOW_BURSTDFLOWER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.BUDDED_FLOWER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CIRCULATUM_FLOWER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.OPEN_FLOWER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.SUN_DIAL_FLOWER.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.ICE_SPIKE_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.TALL_ICE_SPIKE_BLOCK.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.CACTUS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DEAD_WEEDS.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DEAD_WEEDS_2.get().asItem());
					tabData.accept(NatureAndHarmonyModBlocks.DEAD_WEEDS_3.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("nature_and_harmony", "nature_and_harmony_items"),
				builder -> builder.title(Component.translatable("item_group.nature_and_harmony.nature_and_harmony_items")).icon(() -> new ItemStack(NatureAndHarmonyModItems.SULPHUR.get())).displayItems((parameters, tabData) -> {
					tabData.accept(NatureAndHarmonyModItems.SULPHUR.get());
					tabData.accept(NatureAndHarmonyModItems.DIAMOND_SHARD.get());
					tabData.accept(NatureAndHarmonyModItems.MIRROR.get());
					tabData.accept(NatureAndHarmonyModItems.TOPAZ_CHUNKS.get());
					tabData.accept(NatureAndHarmonyModItems.TOPAZ.get());
					tabData.accept(NatureAndHarmonyModItems.TOPAZ_SHEARS.get());
					tabData.accept(NatureAndHarmonyModItems.TOPAZ_FISHING_ROD.get());
					tabData.accept(NatureAndHarmonyModItems.UNDERWORLD.get());
					tabData.accept(NatureAndHarmonyModItems.ROSE_GOLD_INGOT.get());
					tabData.accept(NatureAndHarmonyModItems.RAW_ROSE_GOLD.get());
					tabData.accept(NatureAndHarmonyModItems.COTTON.get());
					tabData.accept(NatureAndHarmonyModItems.COTTON_SEEDS.get());
					tabData.accept(NatureAndHarmonyModItems.STRAWBERRY_SEEDS.get());
					tabData.accept(NatureAndHarmonyModItems.TOMATO_SEEDS.get());
					tabData.accept(NatureAndHarmonyModItems.MICHRITE.get());
					tabData.accept(NatureAndHarmonyModItems.MICHERITE_AND_QUARTZ.get());
					tabData.accept(NatureAndHarmonyModItems.QUARTZ_DUST.get());
					tabData.accept(NatureAndHarmonyModItems.ICE_SPIKE.get());
					tabData.accept(NatureAndHarmonyModItems.SILVER_INGOT.get());
					tabData.accept(NatureAndHarmonyModItems.RAW_SILVER.get());
					tabData.accept(NatureAndHarmonyModItems.SILVER_THREAD.get());
					tabData.accept(NatureAndHarmonyModItems.ACTINIUM_INGOT.get());
					tabData.accept(NatureAndHarmonyModItems.RAW_ACTINIUM.get());
					tabData.accept(NatureAndHarmonyModItems.ACTINIUM_BOW.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("nature_and_harmony", "nature_and_harmony_foods"),
				builder -> builder.title(Component.translatable("item_group.nature_and_harmony.nature_and_harmony_foods")).icon(() -> new ItemStack(NatureAndHarmonyModItems.GRAPES.get())).displayItems((parameters, tabData) -> {
					tabData.accept(NatureAndHarmonyModItems.GRAPES.get());
					tabData.accept(NatureAndHarmonyModItems.GRAPES_WHITE.get());
					tabData.accept(NatureAndHarmonyModItems.GRAPE_JUICE.get());
					tabData.accept(NatureAndHarmonyModItems.WINE.get());
					tabData.accept(NatureAndHarmonyModItems.APPLE_CIDER.get());
					tabData.accept(NatureAndHarmonyModItems.GRAPE_CIDER.get());
					tabData.accept(NatureAndHarmonyModItems.APPLE_JUICE.get());
					tabData.accept(NatureAndHarmonyModItems.WHITE_WINE.get());
					tabData.accept(NatureAndHarmonyModItems.STRAWBERRY.get());
					tabData.accept(NatureAndHarmonyModItems.TOMATO.get());
					tabData.accept(NatureAndHarmonyModItems.CHOPPED_TOMATO.get());
					tabData.accept(NatureAndHarmonyModItems.CACTUS_FRUIT.get());
				})

		);
	}
}
