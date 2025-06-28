package fugos_tatr.modid.datagen;

import fugos_tatr.modid.block.ModBlocks;
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
        getOrCreateTagBuilder(ItemTags.LEAVES)
                .add(ModBlocks.MAPLE_LEAVES.asItem())
                .add(ModBlocks.PINE_LEAVES.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.AVOCADO_LOG.asItem())
                .add(ModBlocks.STRIPPED_AVOCADO_LOG.asItem())
                .add(ModBlocks.AVOCADO_WOOD.asItem())
                .add(ModBlocks.STRIPPED_AVOCADO_WOOD.asItem())

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

        getOrCreateTagBuilder(ItemTags.LOGS)
                .add(ModBlocks.AVOCADO_LOG.asItem())
                .add(ModBlocks.STRIPPED_AVOCADO_LOG.asItem())
                .add(ModBlocks.AVOCADO_WOOD.asItem())
                .add(ModBlocks.STRIPPED_AVOCADO_WOOD.asItem())

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

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.AVOCADO_PLANKS.asItem())
                .add(ModBlocks.CHESTNUT_PLANKS.asItem())
                .add(ModBlocks.MAPLE_PLANKS.asItem())
                .add(ModBlocks.PINE_PLANKS.asItem());

        getOrCreateTagBuilder(ModTags.Items.AVOCADO_LOGS)
                .add(ModBlocks.AVOCADO_LOG.asItem())
                .add(ModBlocks.STRIPPED_AVOCADO_LOG.asItem())
                .add(ModBlocks.AVOCADO_WOOD.asItem())
                .add(ModBlocks.STRIPPED_AVOCADO_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.CHESTNUT_LOGS)
                .add(ModBlocks.CHESTNUT_LOG.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG.asItem())
                .add(ModBlocks.CHESTNUT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.MAPLE_LOGS)
                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem());

        getOrCreateTagBuilder(ModTags.Items.PINE_LOGS)
                .add(ModBlocks.PINE_LOG.asItem())
                .add(ModBlocks.STRIPPED_PINE_LOG.asItem())
                .add(ModBlocks.PINE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PINE_WOOD.asItem());
    }
}
