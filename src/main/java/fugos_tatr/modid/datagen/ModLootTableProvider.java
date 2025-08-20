package fugos_tatr.modid.datagen;

import fugos_tatr.modid.block.ModBlocks;
import fugos_tatr.modid.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.TableBonusLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
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

        addDrop(ModBlocks.COBBLED_SALT);
        addDrop(ModBlocks.COBBLED_SALT_STAIRS);
        addDrop(ModBlocks.COBBLED_SALT_SLAB);
        addDrop(ModBlocks.COBBLED_SALT_WALL);

        addDrop(ModBlocks.SALT_BLOCK);
        addDrop(ModBlocks.SALT_BLOCK_STAIRS);
        addDrop(ModBlocks.SALT_BLOCK_SLAB);
        addDrop(ModBlocks.SALT_BLOCK_WALL);

        addDrop(ModBlocks.SALT_BRICKS);
        addDrop(ModBlocks.SALT_BRICK_STAIRS);
        addDrop(ModBlocks.SALT_BRICK_SLAB);
        addDrop(ModBlocks.SALT_BRICK_WALL);

        addDrop(ModBlocks.SALT_TILES);

        addDrop(ModBlocks.PEAR_SAPLING);

        addDrop(ModBlocks.PEAR_LEAVES, pearLeavesDrops(ModBlocks.PEAR_LEAVES, ModBlocks.PEAR_SAPLING, 0.0625f));

        addDrop(ModBlocks.PEAR_LOG);
        addDrop(ModBlocks.STRIPPED_PEAR_LOG);
        addDrop(ModBlocks.PEAR_WOOD);
        addDrop(ModBlocks.STRIPPED_PEAR_WOOD);

        addDrop(ModBlocks.PEAR_PLANKS);

        addDrop(ModBlocks.PEAR_STAIRS);
        addDrop(ModBlocks.PEAR_SLAB);
        addDrop(ModBlocks.PEAR_BUTTON);
        addDrop(ModBlocks.PEAR_PRESSURE_PLATE);
        addDrop(ModBlocks.PEAR_FENCE);
        addDrop(ModBlocks.PEAR_FENCE_GATE);

        addDrop(ModBlocks.PEAR_DOOR, doorDrops(ModBlocks.PEAR_DOOR));
        addDrop(ModBlocks.PEAR_TRAPDOOR);



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



        addDrop(ModBlocks.PALM_SEED);

        addDrop(ModBlocks.PALM_LEAVES, leavesDrops(ModBlocks.PALM_LEAVES, ModBlocks.PALM_SEED, 0.0625f));

        addDrop(ModBlocks.PALM_LOG);
        addDrop(ModBlocks.STRIPPED_PALM_LOG);
        addDrop(ModBlocks.PALM_WOOD);
        addDrop(ModBlocks.STRIPPED_PALM_WOOD);

        addDrop(ModBlocks.PALM_PLANKS);

        addDrop(ModBlocks.PALM_STAIRS);
        addDrop(ModBlocks.PALM_SLAB);
        addDrop(ModBlocks.PALM_BUTTON);
        addDrop(ModBlocks.PALM_PRESSURE_PLATE);
        addDrop(ModBlocks.PALM_FENCE);
        addDrop(ModBlocks.PALM_FENCE_GATE);



        addDrop(ModBlocks.DEAD_PLANKS);

        addDrop(ModBlocks.DEAD_STAIRS);
        addDrop(ModBlocks.DEAD_SLAB);



        addDrop(ModBlocks.TITANIUM_ORE, multipleOreDrops(ModBlocks.TITANIUM_ORE, ModItems.RAW_TITANIUM, 1, 2));
        addDrop(ModBlocks.TUFF_TITANIUM_ORE, multipleOreDrops(ModBlocks.TUFF_TITANIUM_ORE, ModItems.RAW_TITANIUM, 1, 2));
        addDrop(ModBlocks.DEEPSLATE_TITANIUM_ORE, multipleOreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.RAW_TITANIUM, 1, 3));
        addDrop(ModBlocks.RAW_TITANIUM_BLOCK);
        addDrop(ModBlocks.TITANIUM_BLOCK);

        addDrop(ModBlocks.ESTROLITE_ORE, multipleOreDrops(ModBlocks.ESTROLITE_ORE, ModItems.ESTROLITE, 1, 3));

        addDrop(ModBlocks.BLUE_ROSE_BLOCK, ModItems.BLUE_ROSE);
        addPottedPlantDrops(ModBlocks.POTTED_BLUE_ROSE_BLOCK);

        addDrop(ModBlocks.GARNET_CLUMP);

        addDrop(ModBlocks.DRIED_RUBBER_CLUMPS_BLOCK, ModItems.DRIED_RUBBER_CLUMPS);
        addDrop(ModBlocks.RUBBER_BLOCK);
    }

    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

    public LootTable.Builder pearLeavesDrops(Block leaves, Block sapling, float... saplingChance) {
        RegistryWrapper.Impl<Enchantment> impl = this.registries.getOrThrow(RegistryKeys.ENCHANTMENT);
        return this.leavesDrops(leaves, sapling, saplingChance).pool(LootPool.builder().rolls(ConstantLootNumberProvider.create(1.0F)).conditionally(this.createWithoutShearsOrSilkTouchCondition()).with(((LeafEntry.Builder)this.addSurvivesExplosionCondition(leaves, ItemEntry.builder(ModItems.PEAR))).conditionally(TableBonusLootCondition.builder(impl.getOrThrow(Enchantments.FORTUNE), new float[]{0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F}))));
    }
}
