package fugos_tatr.modid.datagen;

import fugos_tatr.modid.block.ModBlocks;
import fugos_tatr.modid.item.ModItemTags;
import fugos_tatr.modid.item.ModItems;
import fugos_tatr.modid.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
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
                .add(ModBlocks.PINE_LEAVES.asItem())
                .add(ModBlocks.PALM_LEAVES.asItem())
                .add(ModBlocks.RUBBER_LEAVES.asItem());

        valueLookupBuilder(ItemTags.SAPLINGS)
                .add(ModBlocks.PEAR_SAPLING.asItem())
                .add(ModBlocks.CHESTNUT_SAPLING.asItem())
                .add(ModBlocks.MAPLE_SAPLING.asItem())
                .add(ModBlocks.PINE_SAPLING.asItem())
                .add(ModBlocks.PALM_SEED.asItem())
                .add(ModBlocks.RUBBER_PROPAGULE.asItem());

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
                .add(ModBlocks.STRIPPED_PINE_WOOD.asItem())

                .add(ModBlocks.PALM_LOG.asItem())
                .add(ModBlocks.STRIPPED_PALM_LOG.asItem())
                .add(ModBlocks.PALM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PALM_WOOD.asItem())

                .add(ModBlocks.RUBBER_LOG.asItem())
                .add(ModBlocks.STRIPPED_RUBBER_LOG.asItem())
                .add(ModBlocks.RUBBER_WOOD.asItem())
                .add(ModBlocks.STRIPPED_RUBBER_WOOD.asItem());

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
                .add(ModBlocks.STRIPPED_PINE_WOOD.asItem())

                .add(ModBlocks.PALM_LOG.asItem())
                .add(ModBlocks.STRIPPED_PALM_LOG.asItem())
                .add(ModBlocks.PALM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PALM_WOOD.asItem())

                .add(ModBlocks.RUBBER_LOG.asItem())
                .add(ModBlocks.STRIPPED_RUBBER_LOG.asItem())
                .add(ModBlocks.RUBBER_WOOD.asItem())
                .add(ModBlocks.STRIPPED_RUBBER_WOOD.asItem());

        valueLookupBuilder(ItemTags.PLANKS)
                .add(ModBlocks.PEAR_PLANKS.asItem())
                .add(ModBlocks.CHESTNUT_PLANKS.asItem())
                .add(ModBlocks.MAPLE_PLANKS.asItem())
                .add(ModBlocks.PINE_PLANKS.asItem())
                .add(ModBlocks.PALM_PLANKS.asItem())
                .add(ModBlocks.RUBBER_PLANKS.asItem());

        valueLookupBuilder(ItemTags.WALLS)
                .add(ModBlocks.COBBLED_SALT_WALL.asItem())
                .add(ModBlocks.SALT_BLOCK_WALL.asItem())
                .add(ModBlocks.SALT_BRICK_WALL.asItem())
                .add(ModBlocks.SALT_TILE_WALL.asItem());

        valueLookupBuilder(ItemTags.STAIRS)
                .add(ModBlocks.COBBLED_SALT_STAIRS.asItem())
                .add(ModBlocks.SALT_BLOCK_STAIRS.asItem())
                .add(ModBlocks.SALT_BRICK_STAIRS.asItem())
                .add(ModBlocks.SALT_TILE_STAIRS.asItem())

                .add(ModBlocks.PEAR_STAIRS.asItem())
                .add(ModBlocks.CHESTNUT_STAIRS.asItem())
                .add(ModBlocks.MAPLE_STAIRS.asItem())
                .add(ModBlocks.PINE_STAIRS.asItem())
                .add(ModBlocks.PALM_STAIRS.asItem())
                .add(ModBlocks.RUBBER_STAIRS.asItem());

        valueLookupBuilder(ItemTags.SLABS)
                .add(ModBlocks.COBBLED_SALT_SLAB.asItem())
                .add(ModBlocks.SALT_BLOCK_SLAB.asItem())
                .add(ModBlocks.SALT_BRICK_SLAB.asItem())
                .add(ModBlocks.SALT_TILE_SLAB.asItem())

                .add(ModBlocks.PEAR_SLAB.asItem())
                .add(ModBlocks.CHESTNUT_SLAB.asItem())
                .add(ModBlocks.MAPLE_SLAB.asItem())
                .add(ModBlocks.PINE_SLAB.asItem())
                .add(ModBlocks.PALM_SLAB.asItem())
                .add(ModBlocks.RUBBER_SLAB.asItem());

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

        valueLookupBuilder(ModTags.Items.PALM_LOGS)
                .add(ModBlocks.PALM_LOG.asItem())
                .add(ModBlocks.STRIPPED_PALM_LOG.asItem())
                .add(ModBlocks.PALM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PALM_WOOD.asItem());

        valueLookupBuilder(ModTags.Items.RUBBER_LOGS)
                .add(ModBlocks.RUBBER_LOG.asItem())
                .add(ModBlocks.STRIPPED_RUBBER_LOG.asItem())
                .add(ModBlocks.RUBBER_WOOD.asItem())
                .add(ModBlocks.STRIPPED_RUBBER_WOOD.asItem());

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

        valueLookupBuilder(ItemTags.SWORD_ENCHANTABLE)
                .add(ModItems.TITANIUM_SWORD);

        valueLookupBuilder(ItemTags.MINING_ENCHANTABLE)
                .add(ModItems.TITANIUM_SHOVEL)
                .add(ModItems.TITANIUM_PICKAXE);

        valueLookupBuilder(ItemTags.MINING_LOOT_ENCHANTABLE)
                .add(ModItems.TITANIUM_SHOVEL)
                .add(ModItems.TITANIUM_PICKAXE);

        valueLookupBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.TITANIUM_LEGGINGS)
                .add(ModItems.TITANIUM_BOOTS);

        valueLookupBuilder(ItemTags.ARMOR_ENCHANTABLE)
                .add(ModItems.TITANIUM_HELMET)
                .add(ModItems.TITANIUM_CHESTPLATE)
                .add(ModItems.TITANIUM_LEGGINGS)
                .add(ModItems.TITANIUM_BOOTS);

        valueLookupBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.TITANIUM_HELMET);

        valueLookupBuilder(ItemTags.HEAD_ARMOR_ENCHANTABLE)
                .add(ModItems.TITANIUM_HELMET);

        valueLookupBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.TITANIUM_CHESTPLATE);

        valueLookupBuilder(ItemTags.CHEST_ARMOR_ENCHANTABLE)
                .add(ModItems.TITANIUM_CHESTPLATE);

        valueLookupBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.TITANIUM_LEGGINGS);

        valueLookupBuilder(ItemTags.LEG_ARMOR_ENCHANTABLE)
                .add(ModItems.TITANIUM_LEGGINGS);

        valueLookupBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.TITANIUM_BOOTS);

        valueLookupBuilder(ItemTags.FOOT_ARMOR_ENCHANTABLE)
                .add(ModItems.TITANIUM_BOOTS);

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
