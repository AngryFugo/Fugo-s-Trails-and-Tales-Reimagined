package fugos_tatr.modid.datagen;

import fugos_tatr.modid.block.ModBlocks;
import fugos_tatr.modid.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup wrapperLookup, RecipeExporter recipeExporter) {
        return new RecipeGenerator(wrapperLookup, recipeExporter) {
            @Override
            public void generate() {
                createShapeless(RecipeCategory.MISC, Items.SLIME_BALL, 1)
                        .input(Items.MAGMA_CREAM)
                        .criterion(hasItem(Items.MAGMA_CREAM), conditionsFromItem(Items.MAGMA_CREAM))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, Items.MAGMA_CREAM, 1)
                        .input(Items.SLIME_BALL)
                        .criterion(hasItem(Items.SLIME_BALL), conditionsFromItem(Items.SLIME_BALL))
                        .offerTo(exporter);



                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_PLANKS, 4)
                        .input(ModTags.Items.AVOCADO_LOGS)
                        .criterion(hasItem(ModBlocks.PEAR_LOG), conditionsFromItem(ModBlocks.PEAR_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_WOOD, 3)
                        .pattern("   ")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.PEAR_LOG.asItem())
                        .criterion(hasItem(ModBlocks.PEAR_LOG), conditionsFromItem(ModBlocks.PEAR_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_DOOR, 3)
                        .pattern(" RR")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.PEAR_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PEAR_PLANKS), conditionsFromItem(ModBlocks.PEAR_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_TRAPDOOR, 2)
                        .pattern("   ")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModBlocks.PEAR_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PEAR_PLANKS), conditionsFromItem(ModBlocks.PEAR_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_PRESSURE_PLATE, 1)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern(" RR")
                        .input('R', ModBlocks.PEAR_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PEAR_PLANKS), conditionsFromItem(ModBlocks.PEAR_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_FENCE, 3)
                        .pattern("   ")
                        .pattern("RSR")
                        .pattern("RSR")
                        .input('R', ModBlocks.PEAR_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.PEAR_PLANKS), conditionsFromItem(ModBlocks.PEAR_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_FENCE_GATE, 1)
                        .pattern("   ")
                        .pattern("SRS")
                        .pattern("SRS")
                        .input('R', ModBlocks.PEAR_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.PEAR_PLANKS), conditionsFromItem(ModBlocks.PEAR_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_STAIRS, 4)
                        .pattern("  R")
                        .pattern(" RR")
                        .pattern("RRR")
                        .input('R', ModBlocks.PEAR_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PEAR_PLANKS), conditionsFromItem(ModBlocks.PEAR_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.PEAR_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PEAR_PLANKS), conditionsFromItem(ModBlocks.PEAR_PLANKS))
                        .offerTo(exporter);



                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_PLANKS, 4)
                        .input(ModTags.Items.CHESTNUT_LOGS)
                        .criterion(hasItem(ModBlocks.CHESTNUT_LOG), conditionsFromItem(ModBlocks.CHESTNUT_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_WOOD, 3)
                        .pattern("   ")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.CHESTNUT_LOG.asItem())
                        .criterion(hasItem(ModBlocks.CHESTNUT_LOG), conditionsFromItem(ModBlocks.CHESTNUT_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_DOOR, 3)
                        .pattern(" RR")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.CHESTNUT_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_TRAPDOOR, 2)
                        .pattern("   ")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModBlocks.CHESTNUT_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_PRESSURE_PLATE, 1)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern(" RR")
                        .input('R', ModBlocks.CHESTNUT_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_FENCE, 3)
                        .pattern("   ")
                        .pattern("RSR")
                        .pattern("RSR")
                        .input('R', ModBlocks.CHESTNUT_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_FENCE_GATE, 1)
                        .pattern("   ")
                        .pattern("SRS")
                        .pattern("SRS")
                        .input('R', ModBlocks.CHESTNUT_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_STAIRS, 4)
                        .pattern("  R")
                        .pattern(" RR")
                        .pattern("RRR")
                        .input('R', ModBlocks.CHESTNUT_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.CHESTNUT_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.CHESTNUT_PLANKS), conditionsFromItem(ModBlocks.CHESTNUT_PLANKS))
                        .offerTo(exporter);



                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_PLANKS, 4)
                        .input(ModTags.Items.MAPLE_LOGS)
                        .criterion(hasItem(ModBlocks.MAPLE_LOG), conditionsFromItem(ModBlocks.MAPLE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_WOOD, 3)
                        .pattern("   ")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.MAPLE_LOG.asItem())
                        .criterion(hasItem(ModBlocks.MAPLE_LOG), conditionsFromItem(ModBlocks.MAPLE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_DOOR, 3)
                        .pattern(" RR")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.MAPLE_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_TRAPDOOR, 2)
                        .pattern("   ")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModBlocks.MAPLE_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_PRESSURE_PLATE, 1)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern(" RR")
                        .input('R', ModBlocks.MAPLE_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_FENCE, 3)
                        .pattern("   ")
                        .pattern("RSR")
                        .pattern("RSR")
                        .input('R', ModBlocks.MAPLE_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_FENCE_GATE, 1)
                        .pattern("   ")
                        .pattern("SRS")
                        .pattern("SRS")
                        .input('R', ModBlocks.MAPLE_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_STAIRS, 4)
                        .pattern("  R")
                        .pattern(" RR")
                        .pattern("RRR")
                        .input('R', ModBlocks.MAPLE_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.MAPLE_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.MAPLE_PLANKS), conditionsFromItem(ModBlocks.MAPLE_PLANKS))
                        .offerTo(exporter);



                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_PLANKS, 4)
                        .input(ModTags.Items.PINE_LOGS)
                        .criterion(hasItem(ModBlocks.PINE_LOG), conditionsFromItem(ModBlocks.PINE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_WOOD, 3)
                        .pattern("   ")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.PINE_LOG.asItem())
                        .criterion(hasItem(ModBlocks.PINE_LOG), conditionsFromItem(ModBlocks.PINE_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_DOOR, 3)
                        .pattern(" RR")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.PINE_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_TRAPDOOR, 2)
                        .pattern("   ")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModBlocks.PINE_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_PRESSURE_PLATE, 1)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern(" RR")
                        .input('R', ModBlocks.PINE_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_FENCE, 3)
                        .pattern("   ")
                        .pattern("RSR")
                        .pattern("RSR")
                        .input('R', ModBlocks.PINE_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_FENCE_GATE, 1)
                        .pattern("   ")
                        .pattern("SRS")
                        .pattern("SRS")
                        .input('R', ModBlocks.PINE_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_STAIRS, 4)
                        .pattern("  R")
                        .pattern(" RR")
                        .pattern("RRR")
                        .input('R', ModBlocks.PINE_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.PINE_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PINE_PLANKS), conditionsFromItem(ModBlocks.PINE_PLANKS))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Fugo's Trails and Tales Reimagined";
    }
}
