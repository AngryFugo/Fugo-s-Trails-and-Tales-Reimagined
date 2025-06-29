package fugos_tatr.modid.datagen;

import fugos_tatr.modid.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);

        addDrop(ModBlocks.AVOCADO_SAPLING);

        addDrop(ModBlocks.AVOCADO_LEAVES, leavesDrops(ModBlocks.AVOCADO_LEAVES, ModBlocks.AVOCADO_SAPLING, 0.0625f));

        addDrop(ModBlocks.AVOCADO_LOG);
        addDrop(ModBlocks.STRIPPED_AVOCADO_LOG);
        addDrop(ModBlocks.AVOCADO_WOOD);
        addDrop(ModBlocks.STRIPPED_AVOCADO_WOOD);

        addDrop(ModBlocks.AVOCADO_PLANKS);

        addDrop(ModBlocks.AVOCADO_STAIRS);
        addDrop(ModBlocks.AVOCADO_SLAB);
        addDrop(ModBlocks.AVOCADO_BUTTON);
        addDrop(ModBlocks.AVOCADO_PRESSURE_PLATE);
        addDrop(ModBlocks.AVOCADO_FENCE);
        addDrop(ModBlocks.AVOCADO_FENCE_GATE);

        addDrop(ModBlocks.AVOCADO_DOOR, doorDrops(ModBlocks.AVOCADO_DOOR));
        addDrop(ModBlocks.AVOCADO_TRAPDOOR);



        addDrop(ModBlocks.CHESTNUT_SAPLING);

        addDrop(ModBlocks.CHESTNUT_LEAVES, leavesDrops(ModBlocks.CHESTNUT_LEAVES, ModBlocks.CHESTNUT_SAPLING, 0.0625f));

        addDrop(ModBlocks.CHESTNUT_LOG);
        addDrop(ModBlocks.STRIPPED_CHESTNUT_LOG);
        addDrop(ModBlocks.CHESTNUT_WOOD);
        addDrop(ModBlocks.STRIPPED_CHESTNUT_WOOD);

        addDrop(ModBlocks.CHESTNUT_PLANKS);

        addDrop(ModBlocks.CHESTNUT_STAIRS);
        addDrop(ModBlocks.CHESTNUT_SLAB);
        addDrop(ModBlocks.CHESTNUT_BUTTON);
        addDrop(ModBlocks.CHESTNUT_PRESSURE_PLATE);
        addDrop(ModBlocks.CHESTNUT_FENCE);
        addDrop(ModBlocks.CHESTNUT_FENCE_GATE);

        addDrop(ModBlocks.CHESTNUT_DOOR, doorDrops(ModBlocks.CHESTNUT_DOOR));
        addDrop(ModBlocks.CHESTNUT_TRAPDOOR);



        addDrop(ModBlocks.MAPLE_SAPLING);

        addDrop(ModBlocks.MAPLE_LEAVES, leavesDrops(ModBlocks.MAPLE_LEAVES, ModBlocks.MAPLE_SAPLING, 0.0625f));

        addDrop(ModBlocks.MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_MAPLE_LOG);
        addDrop(ModBlocks.MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_MAPLE_WOOD);

        addDrop(ModBlocks.MAPLE_PLANKS);

        addDrop(ModBlocks.MAPLE_STAIRS);
        addDrop(ModBlocks.MAPLE_SLAB);
        addDrop(ModBlocks.MAPLE_BUTTON);
        addDrop(ModBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAPLE_FENCE);
        addDrop(ModBlocks.MAPLE_FENCE_GATE);

        addDrop(ModBlocks.MAPLE_DOOR, doorDrops(ModBlocks.MAPLE_DOOR));
        addDrop(ModBlocks.MAPLE_TRAPDOOR);



        addDrop(ModBlocks.PINE_SAPLING);

        addDrop(ModBlocks.PINE_LEAVES, leavesDrops(ModBlocks.PINE_LEAVES, ModBlocks.PINE_SAPLING, 0.0625f));

        addDrop(ModBlocks.PINE_LOG);
        addDrop(ModBlocks.STRIPPED_PINE_LOG);
        addDrop(ModBlocks.PINE_WOOD);
        addDrop(ModBlocks.STRIPPED_PINE_WOOD);

        addDrop(ModBlocks.PINE_PLANKS);

        addDrop(ModBlocks.PINE_STAIRS);
        addDrop(ModBlocks.PINE_SLAB);
        addDrop(ModBlocks.PINE_BUTTON);
        addDrop(ModBlocks.PINE_PRESSURE_PLATE);
        addDrop(ModBlocks.PINE_FENCE);
        addDrop(ModBlocks.PINE_FENCE_GATE);

        addDrop(ModBlocks.PINE_DOOR, doorDrops(ModBlocks.PINE_DOOR));
        addDrop(ModBlocks.PINE_TRAPDOOR);
    }
}
