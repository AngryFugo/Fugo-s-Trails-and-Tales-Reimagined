package fugos_tatr.modid.item;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup FUGOS_TRAILS_AND_TALES_REIMAGINED_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, "fugos_trails_and_tales_reimagined_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.fugos_trails_and_tales_reimagined_group"))
                    .icon(() -> new ItemStack(ModBlocks.PEAR_PLANKS)).entries((displayContext, entries) -> {
                        entries.add(ModBlocks.COBBLED_SALT);
                        entries.add(ModBlocks.COBBLED_SALT_STAIRS);
                        entries.add(ModBlocks.COBBLED_SALT_SLAB);
                        entries.add(ModBlocks.COBBLED_SALT_WALL);

                        entries.add(ModBlocks.SALT_BLOCK);
                        entries.add(ModBlocks.SALT_BLOCK_STAIRS);
                        entries.add(ModBlocks.SALT_BLOCK_SLAB);
                        entries.add(ModBlocks.SALT_BLOCK_WALL);

                        entries.add(ModBlocks.SALT_BRICKS);
                        entries.add(ModBlocks.SALT_BRICK_STAIRS);
                        entries.add(ModBlocks.SALT_BRICK_SLAB);
                        entries.add(ModBlocks.SALT_BRICK_WALL);

                        entries.add(ModBlocks.SALT_TILES);
                        entries.add(ModBlocks.SALT_TILE_STAIRS);
                        entries.add(ModBlocks.SALT_TILE_SLAB);
                        entries.add(ModBlocks.SALT_TILE_WALL);



                        entries.add(ModBlocks.PEAR_SAPLING);

                        entries.add(ModBlocks.PEAR_LEAVES);

                        entries.add(ModBlocks.PEAR_LOG);
                        entries.add(ModBlocks.STRIPPED_PEAR_LOG);
                        entries.add(ModBlocks.PEAR_WOOD);
                        entries.add(ModBlocks.STRIPPED_PEAR_WOOD);

                        entries.add(ModBlocks.PEAR_PLANKS);

                        entries.add(ModBlocks.PEAR_STAIRS);
                        entries.add(ModBlocks.PEAR_SLAB);
                        entries.add(ModBlocks.PEAR_BUTTON);
                        entries.add(ModBlocks.PEAR_PRESSURE_PLATE);
                        entries.add(ModBlocks.PEAR_FENCE);
                        entries.add(ModBlocks.PEAR_FENCE_GATE);
                        entries.add(ModBlocks.PEAR_DOOR);
                        entries.add(ModBlocks.PEAR_TRAPDOOR);



                        entries.add(ModBlocks.CHESTNUT_SAPLING);

                        entries.add(ModBlocks.CHESTNUT_LEAVES);

                        entries.add(ModBlocks.CHESTNUT_LOG);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_LOG);
                        entries.add(ModBlocks.CHESTNUT_WOOD);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_WOOD);

                        entries.add(ModBlocks.CHESTNUT_PLANKS);

                        entries.add(ModBlocks.CHESTNUT_STAIRS);
                        entries.add(ModBlocks.CHESTNUT_SLAB);
                        entries.add(ModBlocks.CHESTNUT_BUTTON);
                        entries.add(ModBlocks.CHESTNUT_PRESSURE_PLATE);
                        entries.add(ModBlocks.CHESTNUT_FENCE);
                        entries.add(ModBlocks.CHESTNUT_FENCE_GATE);
                        entries.add(ModBlocks.CHESTNUT_DOOR);
                        entries.add(ModBlocks.CHESTNUT_TRAPDOOR);



                        entries.add(ModBlocks.MAPLE_SAPLING);

                        entries.add(ModBlocks.MAPLE_LEAVES);

                        entries.add(ModBlocks.MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_MAPLE_LOG);
                        entries.add(ModBlocks.MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAPLE_WOOD);

                        entries.add(ModBlocks.MAPLE_PLANKS);

                        entries.add(ModBlocks.MAPLE_STAIRS);
                        entries.add(ModBlocks.MAPLE_SLAB);
                        entries.add(ModBlocks.MAPLE_BUTTON);
                        entries.add(ModBlocks.MAPLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAPLE_FENCE);
                        entries.add(ModBlocks.MAPLE_FENCE_GATE);
                        entries.add(ModBlocks.MAPLE_DOOR);
                        entries.add(ModBlocks.MAPLE_TRAPDOOR);



                        entries.add(ModBlocks.PINE_SAPLING);

                        entries.add(ModBlocks.PINE_LEAVES);

                        entries.add(ModBlocks.PINE_LOG);
                        entries.add(ModBlocks.STRIPPED_PINE_LOG);
                        entries.add(ModBlocks.PINE_WOOD);
                        entries.add(ModBlocks.STRIPPED_PINE_WOOD);

                        entries.add(ModBlocks.PINE_PLANKS);

                        entries.add(ModBlocks.PINE_STAIRS);
                        entries.add(ModBlocks.PINE_SLAB);
                        entries.add(ModBlocks.PINE_BUTTON);
                        entries.add(ModBlocks.PINE_PRESSURE_PLATE);
                        entries.add(ModBlocks.PINE_FENCE);
                        entries.add(ModBlocks.PINE_FENCE_GATE);
                        entries.add(ModBlocks.PINE_DOOR);
                        entries.add(ModBlocks.PINE_TRAPDOOR);



                        entries.add(ModBlocks.PALM_SEED);

                        entries.add(ModBlocks.PALM_LEAVES);

                        entries.add(ModBlocks.PALM_LOG);
                        entries.add(ModBlocks.STRIPPED_PALM_LOG);
                        entries.add(ModBlocks.PALM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PALM_WOOD);

                        entries.add(ModBlocks.PALM_PLANKS);

                        entries.add(ModBlocks.PALM_STAIRS);
                        entries.add(ModBlocks.PALM_SLAB);
                        entries.add(ModBlocks.PALM_BUTTON);
                        entries.add(ModBlocks.PALM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALM_FENCE);
                        entries.add(ModBlocks.PALM_FENCE_GATE);



                        entries.add(ModBlocks.RUBBER_PROPAGULE);

                        entries.add(ModBlocks.RUBBER_LEAVES);

                        entries.add(ModBlocks.RUBBER_LOG);
                        entries.add(ModBlocks.STRIPPED_RUBBER_LOG);
                        entries.add(ModBlocks.RUBBER_WOOD);
                        entries.add(ModBlocks.STRIPPED_RUBBER_WOOD);

                        entries.add(ModBlocks.RUBBER_PLANKS);

                        entries.add(ModBlocks.RUBBER_STAIRS);
                        entries.add(ModBlocks.RUBBER_SLAB);
                        entries.add(ModBlocks.RUBBER_BUTTON);
                        entries.add(ModBlocks.RUBBER_PRESSURE_PLATE);
                        entries.add(ModBlocks.RUBBER_FENCE);
                        entries.add(ModBlocks.RUBBER_FENCE_GATE);



                        entries.add(ModItems.MASON_JAR);

                        entries.add(ModItems.PEAR);
                        entries.add(ModItems.PEAR_JUICE);

                        entries.add(ModItems.BLUE_BERRIES);
                        entries.add(ModItems.BLUE_BERRY_JAM);

                        entries.add(ModBlocks.TITANIUM_ORE);
                        entries.add(ModBlocks.TUFF_TITANIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_TITANIUM_ORE);
                        entries.add(ModBlocks.RAW_TITANIUM_BLOCK);
                        entries.add(ModBlocks.TITANIUM_BLOCK);

                        entries.add(ModItems.RAW_TITANIUM);
                        entries.add(ModItems.TITANIUM_INGOT);
                        entries.add(ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE);

                        entries.add(ModBlocks.ESTROLITE_ORE);
                        entries.add(ModItems.ESTROLITE);
                        entries.add(ModItems.KOURTNEYS_ESTROGEN);

                        entries.add(ModItems.ADAMANTITE_INGOT);

                        entries.add(ModItems.COBALT_INGOT);

                        entries.add(ModItems.MYTHRIL_INGOT);

                        entries.add(ModItems.ANCIENT_TOME);
                        entries.add(ModItems.ALLOY_ELYTRA);

                        entries.add(ModItems.TITANIUM_SWORD);
                        entries.add(ModItems.TITANIUM_SHOVEL);
                        entries.add(ModItems.TITANIUM_PICKAXE);
                        entries.add(ModItems.TITANIUM_AXE);
                        entries.add(ModItems.TITANIUM_HOE);

                        entries.add(ModItems.TITANIUM_HELMET);
                        entries.add(ModItems.TITANIUM_CHESTPLATE);
                        entries.add(ModItems.TITANIUM_LEGGINGS);
                        entries.add(ModItems.TITANIUM_BOOTS);

                        entries.add(ModItems.NETHERITE_HORSE_ARMOR);

                        entries.add(ModItems.BLUE_ROSE);

                        entries.add(ModBlocks.GARNET_CLUMP);

                        entries.add(ModItems.DRIED_RUBBER_CLUMPS);
                        entries.add(ModBlocks.RUBBER_BLOCK);

                        entries.add(ModItems.RUBBER_GLOOP_BOTTLE);

                        entries.add(ModItems.ALLEYCAT_DAGGERS);
                    }).build());

    public static void registerItemGroups() {
        FugosTrailsAndTalesReimagined.LOGGER.info("Registering Item Groups for " + FugosTrailsAndTalesReimagined.MOD_ID);
    }
}
