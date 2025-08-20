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
        valueLookupBuilder(BlockTags.FENCES)
                .add(ModBlocks.COBBLED_SALT_WALL)
                .add(ModBlocks.SALT_BLOCK_WALL)
                .add(ModBlocks.SALT_BRICK_WALL)
                .add(ModBlocks.SALT_TILE_WALL)

                .add(ModBlocks.PEAR_FENCE)
                .add(ModBlocks.CHESTNUT_FENCE)
                .add(ModBlocks.MAPLE_FENCE)
                .add(ModBlocks.PINE_FENCE)
                .add(ModBlocks.PALM_FENCE)
                .add(ModBlocks.RUBBER_FENCE);

        valueLookupBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.PEAR_FENCE_GATE)
                .add(ModBlocks.CHESTNUT_FENCE_GATE)
                .add(ModBlocks.MAPLE_FENCE_GATE)
                .add(ModBlocks.PINE_FENCE_GATE)
                .add(ModBlocks.PALM_FENCE_GATE)
                .add(ModBlocks.RUBBER_FENCE_GATE);

        valueLookupBuilder(BlockTags.WALLS)
                .add(ModBlocks.COBBLED_SALT_WALL)
                .add(ModBlocks.SALT_BLOCK_WALL)
                .add(ModBlocks.SALT_BRICK_WALL)
                .add(ModBlocks.SALT_TILE_WALL);

        valueLookupBuilder(BlockTags.STAIRS)
                .add(ModBlocks.COBBLED_SALT_STAIRS)
                .add(ModBlocks.SALT_BLOCK_STAIRS)
                .add(ModBlocks.SALT_BRICK_STAIRS)
                .add(ModBlocks.SALT_TILE_STAIRS)

                .add(ModBlocks.PEAR_STAIRS)
                .add(ModBlocks.CHESTNUT_STAIRS)
                .add(ModBlocks.MAPLE_STAIRS)
                .add(ModBlocks.PINE_STAIRS)
                .add(ModBlocks.PALM_STAIRS)
                .add(ModBlocks.RUBBER_STAIRS);

        valueLookupBuilder(BlockTags.SLABS)
                .add(ModBlocks.COBBLED_SALT_SLAB)
                .add(ModBlocks.SALT_BLOCK_SLAB)
                .add(ModBlocks.SALT_BRICK_SLAB)
                .add(ModBlocks.SALT_TILE_SLAB)

                .add(ModBlocks.PEAR_SLAB)
                .add(ModBlocks.CHESTNUT_SLAB)
                .add(ModBlocks.MAPLE_SLAB)
                .add(ModBlocks.PINE_SLAB)
                .add(ModBlocks.PALM_SLAB)
                .add(ModBlocks.RUBBER_SLAB);

        valueLookupBuilder(BlockTags.BUTTONS)
                .add(ModBlocks.PEAR_BUTTON)
                .add(ModBlocks.CHESTNUT_BUTTON)
                .add(ModBlocks.MAPLE_BUTTON)
                .add(ModBlocks.PINE_BUTTON)
                .add(ModBlocks.PALM_BUTTON)
                .add(ModBlocks.RUBBER_BUTTON);

        valueLookupBuilder(BlockTags.PRESSURE_PLATES)
                .add(ModBlocks.PEAR_PRESSURE_PLATE)
                .add(ModBlocks.CHESTNUT_PRESSURE_PLATE)
                .add(ModBlocks.MAPLE_PRESSURE_PLATE)
                .add(ModBlocks.PINE_PRESSURE_PLATE)
                .add(ModBlocks.PALM_PRESSURE_PLATE)
                .add(ModBlocks.RUBBER_PRESSURE_PLATE);

        valueLookupBuilder(BlockTags.DOORS)
                .add(ModBlocks.PEAR_DOOR)
                .add(ModBlocks.CHESTNUT_DOOR)
                .add(ModBlocks.MAPLE_DOOR)
                .add(ModBlocks.PINE_DOOR);

        valueLookupBuilder(BlockTags.TRAPDOORS)
                .add(ModBlocks.PEAR_TRAPDOOR)
                .add(ModBlocks.CHESTNUT_TRAPDOOR)
                .add(ModBlocks.MAPLE_TRAPDOOR)
                .add(ModBlocks.PINE_TRAPDOOR);

        valueLookupBuilder(BlockTags.LEAVES)
                .add(ModBlocks.PEAR_LEAVES)
                .add(ModBlocks.CHESTNUT_LEAVES)
                .add(ModBlocks.MAPLE_LEAVES)
                .add(ModBlocks.PINE_LEAVES)
                .add(ModBlocks.PALM_LEAVES)
                .add(ModBlocks.RUBBER_LEAVES);

        valueLookupBuilder(BlockTags.SAPLINGS)
                .add(ModBlocks.PEAR_SAPLING)
                .add(ModBlocks.CHESTNUT_SAPLING)
                .add(ModBlocks.MAPLE_SAPLING)
                .add(ModBlocks.PINE_SAPLING)
                .add(ModBlocks.PALM_SEED)
                .add(ModBlocks.RUBBER_PROPAGULE);

        valueLookupBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.PEAR_LOG)
                .add(ModBlocks.STRIPPED_PEAR_LOG)
                .add(ModBlocks.PEAR_WOOD)
                .add(ModBlocks.STRIPPED_PEAR_WOOD)

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
                .add(ModBlocks.STRIPPED_PINE_WOOD)

                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.PALM_WOOD)
                .add(ModBlocks.STRIPPED_PALM_WOOD)

                .add(ModBlocks.RUBBER_LOG)
                .add(ModBlocks.STRIPPED_RUBBER_LOG)
                .add(ModBlocks.RUBBER_WOOD)
                .add(ModBlocks.STRIPPED_RUBBER_WOOD);

        valueLookupBuilder(BlockTags.LOGS)
                .add(ModBlocks.PEAR_LOG)
                .add(ModBlocks.STRIPPED_PEAR_LOG)
                .add(ModBlocks.PEAR_WOOD)
                .add(ModBlocks.STRIPPED_PEAR_WOOD)

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
                .add(ModBlocks.STRIPPED_PINE_WOOD)

                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.PALM_WOOD)
                .add(ModBlocks.STRIPPED_PALM_WOOD)

                .add(ModBlocks.RUBBER_LOG)
                .add(ModBlocks.STRIPPED_RUBBER_LOG)
                .add(ModBlocks.RUBBER_WOOD)
                .add(ModBlocks.STRIPPED_RUBBER_WOOD);

        valueLookupBuilder(BlockTags.PLANKS)
                .add(ModBlocks.PEAR_PLANKS)
                .add(ModBlocks.PEAR_STAIRS)
                .add(ModBlocks.PEAR_SLAB)
                .add(ModBlocks.PEAR_BUTTON)
                .add(ModBlocks.PEAR_PRESSURE_PLATE)
                .add(ModBlocks.PEAR_FENCE)
                .add(ModBlocks.PEAR_FENCE_GATE)
                .add(ModBlocks.PEAR_DOOR)
                .add(ModBlocks.PEAR_TRAPDOOR)

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
                .add(ModBlocks.PINE_TRAPDOOR)

                .add(ModBlocks.PALM_PLANKS)
                .add(ModBlocks.PALM_STAIRS)
                .add(ModBlocks.PALM_SLAB)
                .add(ModBlocks.PALM_BUTTON)
                .add(ModBlocks.PALM_PRESSURE_PLATE)
                .add(ModBlocks.PALM_FENCE)
                .add(ModBlocks.PALM_FENCE_GATE)

                .add(ModBlocks.RUBBER_PLANKS)
                .add(ModBlocks.RUBBER_STAIRS)
                .add(ModBlocks.RUBBER_SLAB)
                .add(ModBlocks.RUBBER_BUTTON)
                .add(ModBlocks.RUBBER_PRESSURE_PLATE)
                .add(ModBlocks.RUBBER_FENCE)
                .add(ModBlocks.RUBBER_FENCE_GATE);

        valueLookupBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBBLED_SALT)
                .add(ModBlocks.COBBLED_SALT_STAIRS)
                .add(ModBlocks.COBBLED_SALT_SLAB)
                .add(ModBlocks.COBBLED_SALT_WALL)

                .add(ModBlocks.SALT_BLOCK)
                .add(ModBlocks.SALT_BLOCK_STAIRS)
                .add(ModBlocks.SALT_BLOCK_SLAB)
                .add(ModBlocks.SALT_BLOCK_WALL)

                .add(ModBlocks.SALT_BRICKS)
                .add(ModBlocks.SALT_BRICK_STAIRS)
                .add(ModBlocks.SALT_BRICK_SLAB)
                .add(ModBlocks.SALT_BRICK_WALL)

                .add(ModBlocks.SALT_TILES)
                .add(ModBlocks.SALT_TILE_STAIRS)
                .add(ModBlocks.SALT_TILE_SLAB)
                .add(ModBlocks.SALT_TILE_WALL)

                .add(ModBlocks.TITANIUM_ORE)
                .add(ModBlocks.TUFF_TITANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.RAW_TITANIUM_BLOCK)
                .add(ModBlocks.TITANIUM_BLOCK)

                .add(ModBlocks.ESTROLITE_ORE);

        valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ESTROLITE_ORE);

        valueLookupBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.TITANIUM_ORE);

        valueLookupBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.TUFF_TITANIUM_ORE)
                .add(ModBlocks.DEEPSLATE_TITANIUM_ORE)
                .add(ModBlocks.RAW_TITANIUM_BLOCK)
                .add(ModBlocks.TITANIUM_BLOCK);
    }
}
