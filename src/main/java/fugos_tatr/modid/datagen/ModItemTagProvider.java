package fugos_tatr.modid.datagen;

import fugos_tatr.modid.block.ModBlocks;
import fugos_tatr.modid.item.ModItemTags;
import fugos_tatr.modid.item.ModItems;
import fugos_tatr.modid.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        valueLookupBuilder(ItemTags.LEAVES)
                .add(ModBlocks.PEAR_LEAVES.asItem())
                .add(ModBlocks.CHESTNUT_LEAVES.asItem())
                .add(ModBlocks.MAPLE_LEAVES.asItem())
                .add(ModBlocks.PINE_LEAVES.asItem());

        valueLookupBuilder(ItemTags.SAPLINGS)
                .add(ModBlocks.PEAR_SAPLING.asItem())
                .add(ModBlocks.CHESTNUT_SAPLING.asItem())
                .add(ModBlocks.MAPLE_SAPLING.asItem())
                .add(ModBlocks.PINE_SAPLING.asItem());

        valueLookupBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.PEAR_LOG.asItem())
                .add(ModBlocks.STRIPPED_PEAR_LOG.asItem())
                .add(ModBlocks.PEAR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PEAR_WOOD.asItem())

                .add(ModBlocks.CHESTNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem())
                .add(ModBlocks.CHESTNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD.asItem())

                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem())

                .add(ModBlocks.PINE_LOG.asItem())
                .add(ModBlocks.STRIPPED_PINE_LOG.asItem())
                .add(ModBlocks.PINE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PINE_WOOD.asItem());

        valueLookupBuilder(ItemTags.LOGS)
                .add(ModBlocks.PEAR_LOG.asItem())
                .add(ModBlocks.STRIPPED_PEAR_LOG.asItem())
                .add(ModBlocks.PEAR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PEAR_WOOD.asItem())

                .add(ModBlocks.CHESTNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem())
                .add(ModBlocks.CHESTNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD.asItem())

                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem())

                .add(ModBlocks.PINE_LOG.asItem())
                .add(ModBlocks.STRIPPED_PINE_LOG.asItem())
                .add(ModBlocks.PINE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PINE_WOOD.asItem());

        valueLookupBuilder(ItemTags.PLANKS)
                .add(ModBlocks.PEAR_PLANKS.asItem())
                .add(ModBlocks.CHESTNUT_PLANKS.asItem())
                .add(ModBlocks.MAPLE_PLANKS.asItem())
                .add(ModBlocks.PINE_PLANKS.asItem());

        valueLookupBuilder(ItemTags.SLABS)
                .add(ModBlocks.PEAR_SLAB.asItem())
                .add(ModBlocks.CHESTNUT_SLAB.asItem())
                .add(ModBlocks.MAPLE_SLAB.asItem())
                .add(ModBlocks.PINE_SLAB.asItem());

        valueLookupBuilder(ModTags.Items.AVOCADO_LOGS)
                .add(ModBlocks.PEAR_LOG.asItem())
                .add(ModBlocks.STRIPPED_PEAR_LOG.asItem())
                .add(ModBlocks.PEAR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PEAR_WOOD.asItem());

        valueLookupBuilder(ModTags.Items.CHESTNUT_LOGS)
                .add(ModBlocks.CHESTNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem())
                .add(ModBlocks.CHESTNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD.asItem());

        valueLookupBuilder(ModTags.Items.MAPLE_LOGS)
                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem());

        valueLookupBuilder(ModTags.Items.PINE_LOGS)
                .add(ModBlocks.PINE_LOG.asItem())
                .add(ModBlocks.STRIPPED_PINE_LOG.asItem())
                .add(ModBlocks.PINE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PINE_WOOD.asItem());

        valueLookupBuilder(ItemTags.SWORDS)
                .add(ModItems.TITANIUM_SWORD);

        valueLookupBuilder(ItemTags.SHOVELS)
                .add(ModItems.TITANIUM_SHOVEL);

        valueLookupBuilder(ItemTags.PICKAXES)
                .add(ModItems.TITANIUM_PICKAXE);

        valueLookupBuilder(ItemTags.AXES)
                .add(ModItems.TITANIUM_AXE);

        valueLookupBuilder(ItemTags.HOES)
                .add(ModItems.TITANIUM_HOE);

        valueLookupBuilder(ModItemTags.TITANIUM_TOOLS)
                .add(ModItems.TITANIUM_SWORD)
                .add(ModItems.TITANIUM_SHOVEL)
                .add(ModItems.TITANIUM_PICKAXE)
                .add(ModItems.TITANIUM_AXE)
                .add(ModItems.TITANIUM_HOE);

        valueLookupBuilder(ModItemTags.TITANIUM_TOOL_MATERIALS)
                .add(ModItems.TITANIUM_INGOT);
    }
}
