package fugos_tatr.modid;

import fugos_tatr.modid.block.ModBlocks;
import fugos_tatr.modid.item.ModItemGroups;
import fugos_tatr.modid.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FugosTrailsAndTalesReimagined implements ModInitializer {
	public static final String MOD_ID = "fugos-trails-and-tales-reimagined";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		StrippableBlockRegistry.register(ModBlocks.AVOCADO_LOG, ModBlocks.STRIPPED_AVOCADO_LOG);
		StrippableBlockRegistry.register(ModBlocks.AVOCADO_WOOD, ModBlocks.STRIPPED_AVOCADO_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AVOCADO_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_AVOCADO_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AVOCADO_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_AVOCADO_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.AVOCADO_PLANKS, 5, 20);


		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_LOG, ModBlocks.STRIPPED_CHESTNUT_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_WOOD, ModBlocks.STRIPPED_CHESTNUT_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_PLANKS, 5, 20);


		StrippableBlockRegistry.register(ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG);
		StrippableBlockRegistry.register(ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAPLE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_MAPLE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAPLE_PLANKS, 5, 20);


		StrippableBlockRegistry.register(ModBlocks.PINE_LOG, ModBlocks.STRIPPED_PINE_LOG);
		StrippableBlockRegistry.register(ModBlocks.PINE_WOOD, ModBlocks.STRIPPED_PINE_WOOD);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PINE_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_PINE_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINE_PLANKS, 5, 20);
	}
}