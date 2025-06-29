package fugos_tatr.modid.datagen;

import fugos_tatr.modid.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.AVOCADO_FENCE)
                .add(ModBlocks.CHESTNUT_FENCE)
                .add(ModBlocks.MAPLE_FENCE)
                .add(ModBlocks.PINE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.AVOCADO_FENCE_GATE)
                .add(ModBlocks.CHESTNUT_FENCE_GATE)
                .add(ModBlocks.MAPLE_FENCE_GATE)
                .add(ModBlocks.PINE_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.STAIRS)
                .add(ModBlocks.AVOCADO_STAIRS)
                .add(ModBlocks.CHESTNUT_STAIRS)
                .add(ModBlocks.MAPLE_STAIRS)
                .add(ModBlocks.PINE_STAIRS);

        getOrCreateTagBuilder(BlockTags.SLABS)
                .add(ModBlocks.AVOCADO_SLAB)
                .add(ModBlocks.CHESTNUT_SLAB)
                .add(ModBlocks.MAPLE_SLAB)
                .add(ModBlocks.PINE_SLAB);

        getOrCreateTagBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.AVOCADO_BUTTON)
                .add(ModBlocks.CHESTNUT_BUTTON)
                .add(ModBlocks.MAPLE_BUTTON)
                .add(ModBlocks.PINE_BUTTON);

        getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.AVOCADO_PRESSURE_PLATE)
                .add(ModBlocks.CHESTNUT_PRESSURE_PLATE)
                .add(ModBlocks.MAPLE_PRESSURE_PLATE)
                .add(ModBlocks.PINE_PRESSURE_PLATE);

        getOrCreateTagBuilder(BlockTags.DOORS)
                .add(ModBlocks.AVOCADO_DOOR)
                .add(ModBlocks.CHESTNUT_DOOR)
                .add(ModBlocks.MAPLE_DOOR)
                .add(ModBlocks.PINE_DOOR);

        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.AVOCADO_TRAPDOOR)
                .add(ModBlocks.CHESTNUT_TRAPDOOR)
                .add(ModBlocks.MAPLE_TRAPDOOR)
                .add(ModBlocks.PINE_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.AVOCADO_LEAVES)
                .add(ModBlocks.CHESTNUT_LEAVES)
                .add(ModBlocks.MAPLE_LEAVES)
                .add(ModBlocks.PINE_LEAVES);

        getOrCreateTagBuilder(BlockTags.SAPLINGS)
                .add(ModBlocks.AVOCADO_SAPLING)
                .add(ModBlocks.CHESTNUT_SAPLING)
                .add(ModBlocks.MAPLE_SAPLING)
                .add(ModBlocks.PINE_SAPLING);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.AVOCADO_LOG)
                .add(ModBlocks.STRIPPED_AVOCADO_LOG)
                .add(ModBlocks.AVOCADO_WOOD)
                .add(ModBlocks.STRIPPED_AVOCADO_WOOD)

                .add(ModBlocks.CHESTNUT_LOG)
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG)
                .add(ModBlocks.CHESTNUT_WOOD)
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD)

                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_MAPLE_WOOD)

                .add(ModBlocks.PINE_LOG)
                .add(ModBlocks.STRIPPED_PINE_LOG)
                .add(ModBlocks.PINE_WOOD)
                .add(ModBlocks.STRIPPED_PINE_WOOD);

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.AVOCADO_LOG)
                .add(ModBlocks.STRIPPED_AVOCADO_LOG)
                .add(ModBlocks.AVOCADO_WOOD)
                .add(ModBlocks.STRIPPED_AVOCADO_WOOD)

                .add(ModBlocks.CHESTNUT_LOG)
                .add(ModBlocks.STRIPPED_CHESTNUT_LOG)
                .add(ModBlocks.CHESTNUT_WOOD)
                .add(ModBlocks.STRIPPED_CHESTNUT_WOOD)

                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_MAPLE_WOOD)

                .add(ModBlocks.PINE_LOG)
                .add(ModBlocks.STRIPPED_PINE_LOG)
                .add(ModBlocks.PINE_WOOD)
                .add(ModBlocks.STRIPPED_PINE_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.AVOCADO_PLANKS)
                .add(ModBlocks.AVOCADO_STAIRS)
                .add(ModBlocks.AVOCADO_SLAB)
                .add(ModBlocks.AVOCADO_BUTTON)
                .add(ModBlocks.AVOCADO_PRESSURE_PLATE)
                .add(ModBlocks.AVOCADO_FENCE)
                .add(ModBlocks.AVOCADO_FENCE_GATE)
                .add(ModBlocks.AVOCADO_DOOR)
                .add(ModBlocks.AVOCADO_TRAPDOOR)

                .add(ModBlocks.CHESTNUT_PLANKS)
                .add(ModBlocks.CHESTNUT_STAIRS)
                .add(ModBlocks.CHESTNUT_SLAB)
                .add(ModBlocks.CHESTNUT_BUTTON)
                .add(ModBlocks.CHESTNUT_PRESSURE_PLATE)
                .add(ModBlocks.CHESTNUT_FENCE)
                .add(ModBlocks.CHESTNUT_FENCE_GATE)
                .add(ModBlocks.CHESTNUT_DOOR)
                .add(ModBlocks.CHESTNUT_TRAPDOOR)

                .add(ModBlocks.MAPLE_PLANKS)
                .add(ModBlocks.MAPLE_STAIRS)
                .add(ModBlocks.MAPLE_SLAB)
                .add(ModBlocks.MAPLE_BUTTON)
                .add(ModBlocks.MAPLE_PRESSURE_PLATE)
                .add(ModBlocks.MAPLE_FENCE)
                .add(ModBlocks.MAPLE_FENCE_GATE)
                .add(ModBlocks.MAPLE_DOOR)
                .add(ModBlocks.MAPLE_TRAPDOOR)

                .add(ModBlocks.PINE_PLANKS)
                .add(ModBlocks.PINE_STAIRS)
                .add(ModBlocks.PINE_SLAB)
                .add(ModBlocks.PINE_BUTTON)
                .add(ModBlocks.PINE_PRESSURE_PLATE)
                .add(ModBlocks.PINE_FENCE)
                .add(ModBlocks.PINE_FENCE_GATE)
                .add(ModBlocks.PINE_DOOR)
                .add(ModBlocks.PINE_TRAPDOOR);
    }
}
