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



                        entries.add(ModItems.MASON_JAR);

                        entries.add(ModItems.PEAR);
                        entries.add(ModItems.PEAR_JUICE);

                        entries.add(ModItems.BLUE_BERRIES);
                        entries.add(ModItems.BLUE_BERRY_JAM);

                        entries.add(ModItems.ALLEYCAT_DAGGERS);
                    }).build());

    public static void registerItemGroups() {
        FugosTrailsAndTalesReimagined.LOGGER.info("Registering Item Groups for " + FugosTrailsAndTalesReimagined.MOD_ID);
    }
}
