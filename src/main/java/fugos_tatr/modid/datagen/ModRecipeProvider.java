package fugos_tatr.modid.datagen;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.block.ModBlocks;
import fugos_tatr.modid.item.ModItems;
import fugos_tatr.modid.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.entity.ai.brain.task.AdmireItemTask;
import net.minecraft.item.Items;
import net.minecraft.recipe.SmithingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

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

                createShapeless(RecipeCategory.MISC, ModItems.MASON_JAR, 6)
                        .input(Items.GLASS_BOTTLE, 6)
                        .input(ItemTags.WOODEN_BUTTONS)
                        .criterion(hasItem(Items.GLASS_BOTTLE), conditionsFromItem(Items.GLASS_BOTTLE))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, ModItems.PEAR_JUICE, 6)
                        .input(ModItems.PEAR, 3)
                        .input(ModItems.MASON_JAR, 6)
                        .criterion(hasItem(ModItems.PEAR), conditionsFromItem(ModItems.PEAR))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.FOOD, ModItems.BLUE_BERRY_JAM, 3)
                        .input(ModItems.BLUE_BERRIES, 5)
                        .input(ModItems.MASON_JAR, 3)
                        .criterion(hasItem(ModItems.BLUE_BERRIES), conditionsFromItem(ModItems.BLUE_BERRIES))
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

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PEAR_BUTTON, 1)
                        .input(ModBlocks.PEAR_PLANKS.asItem())
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

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHESTNUT_BUTTON, 1)
                        .input(ModBlocks.CHESTNUT_PLANKS.asItem())
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

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_BUTTON, 1)
                        .input(ModBlocks.MAPLE_PLANKS.asItem())
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

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PINE_BUTTON, 1)
                        .input(ModBlocks.PINE_PLANKS.asItem())
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



                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4)
                        .input(ModTags.Items.PALM_LOGS)
                        .criterion(hasItem(ModBlocks.PALM_LOG), conditionsFromItem(ModBlocks.PALM_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_WOOD, 3)
                        .pattern("   ")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.PALM_LOG.asItem())
                        .criterion(hasItem(ModBlocks.PALM_LOG), conditionsFromItem(ModBlocks.PALM_LOG))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_BUTTON, 1)
                        .input(ModBlocks.PALM_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PRESSURE_PLATE, 1)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern(" RR")
                        .input('R', ModBlocks.PALM_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_FENCE, 3)
                        .pattern("   ")
                        .pattern("RSR")
                        .pattern("RSR")
                        .input('R', ModBlocks.PALM_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_FENCE_GATE, 1)
                        .pattern("   ")
                        .pattern("SRS")
                        .pattern("SRS")
                        .input('R', ModBlocks.PALM_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_STAIRS, 4)
                        .pattern("  R")
                        .pattern(" RR")
                        .pattern("RRR")
                        .input('R', ModBlocks.PALM_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.PALM_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.PALM_PLANKS), conditionsFromItem(ModBlocks.PALM_PLANKS))
                        .offerTo(exporter);



                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_PLANKS, 4)
                        .input(ModTags.Items.RUBBER_LOGS)
                        .criterion(hasItem(ModBlocks.RUBBER_LOG), conditionsFromItem(ModBlocks.RUBBER_LOG))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_WOOD, 3)
                        .pattern("   ")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.RUBBER_LOG.asItem())
                        .criterion(hasItem(ModBlocks.RUBBER_LOG), conditionsFromItem(ModBlocks.RUBBER_LOG))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_BUTTON, 1)
                        .input(ModBlocks.RUBBER_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.RUBBER_PLANKS), conditionsFromItem(ModBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_PRESSURE_PLATE, 1)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern(" RR")
                        .input('R', ModBlocks.RUBBER_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.RUBBER_PLANKS), conditionsFromItem(ModBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_FENCE, 3)
                        .pattern("   ")
                        .pattern("RSR")
                        .pattern("RSR")
                        .input('R', ModBlocks.RUBBER_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.RUBBER_PLANKS), conditionsFromItem(ModBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_FENCE_GATE, 1)
                        .pattern("   ")
                        .pattern("SRS")
                        .pattern("SRS")
                        .input('R', ModBlocks.RUBBER_PLANKS.asItem())
                        .input('S', Items.STICK)
                        .criterion(hasItem(ModBlocks.RUBBER_PLANKS), conditionsFromItem(ModBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_STAIRS, 4)
                        .pattern("  R")
                        .pattern(" RR")
                        .pattern("RRR")
                        .input('R', ModBlocks.RUBBER_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.RUBBER_PLANKS), conditionsFromItem(ModBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.RUBBER_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.RUBBER_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.RUBBER_PLANKS), conditionsFromItem(ModBlocks.RUBBER_PLANKS))
                        .offerTo(exporter);



                createShapeless(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_PLANKS, 4)
                        .input(ItemTags.PLANKS)
                        .input(Items.FLINT)
                        .criterion(hasItem(Items.FLINT_AND_STEEL), conditionsFromItem(Items.FLINT_AND_STEEL))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_STAIRS, 4)
                        .pattern("  R")
                        .pattern(" RR")
                        .pattern("RRR")
                        .input('R', ModBlocks.DEAD_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.DEAD_PLANKS), conditionsFromItem(ModBlocks.DEAD_PLANKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEAD_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.DEAD_PLANKS.asItem())
                        .criterion(hasItem(ModBlocks.DEAD_PLANKS), conditionsFromItem(ModBlocks.DEAD_PLANKS))
                        .offerTo(exporter);



                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_SALT_STAIRS, 4)
                        .pattern("R  ")
                        .pattern("RR ")
                        .pattern("RRR")
                        .input('R', ModBlocks.COBBLED_SALT.asItem())
                        .criterion(hasItem(ModBlocks.COBBLED_SALT), conditionsFromItem(ModBlocks.COBBLED_SALT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_SALT_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.COBBLED_SALT.asItem())
                        .criterion(hasItem(ModBlocks.COBBLED_SALT), conditionsFromItem(ModBlocks.COBBLED_SALT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_SALT_WALL, 6)
                        .pattern("   ")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModBlocks.COBBLED_SALT.asItem())
                        .criterion(hasItem(ModBlocks.COBBLED_SALT), conditionsFromItem(ModBlocks.COBBLED_SALT))
                        .offerTo(exporter);



                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BLOCK_STAIRS, 4)
                        .pattern("R  ")
                        .pattern("RR ")
                        .pattern("RRR")
                        .input('R', ModBlocks.SALT_BLOCK.asItem())
                        .criterion(hasItem(ModBlocks.SALT_BLOCK), conditionsFromItem(ModBlocks.SALT_BLOCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BLOCK_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.SALT_BLOCK.asItem())
                        .criterion(hasItem(ModBlocks.SALT_BLOCK), conditionsFromItem(ModBlocks.SALT_BLOCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BLOCK_WALL, 6)
                        .pattern("   ")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModBlocks.SALT_BLOCK.asItem())
                        .criterion(hasItem(ModBlocks.SALT_BLOCK), conditionsFromItem(ModBlocks.SALT_BLOCK))
                        .offerTo(exporter);



                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BRICKS, 4)
                        .pattern("   ")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.SALT_BLOCK.asItem())
                        .criterion(hasItem(ModBlocks.SALT_BLOCK), conditionsFromItem(ModBlocks.SALT_BLOCK))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BRICK_STAIRS, 4)
                        .pattern("R  ")
                        .pattern("RR ")
                        .pattern("RRR")
                        .input('R', ModBlocks.SALT_BRICKS.asItem())
                        .criterion(hasItem(ModBlocks.SALT_BRICKS), conditionsFromItem(ModBlocks.SALT_BRICKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BRICK_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.SALT_BRICKS.asItem())
                        .criterion(hasItem(ModBlocks.SALT_BRICKS), conditionsFromItem(ModBlocks.SALT_BRICKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_BRICK_WALL, 6)
                        .pattern("   ")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModBlocks.SALT_BRICKS.asItem())
                        .criterion(hasItem(ModBlocks.SALT_BRICKS), conditionsFromItem(ModBlocks.SALT_BRICKS))
                        .offerTo(exporter);



                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_TILES, 4)
                        .pattern("   ")
                        .pattern(" RR")
                        .pattern(" RR")
                        .input('R', ModBlocks.SALT_BRICKS.asItem())
                        .criterion(hasItem(ModBlocks.SALT_BRICKS), conditionsFromItem(ModBlocks.SALT_BRICKS))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_TILE_STAIRS, 4)
                        .pattern("R  ")
                        .pattern("RR ")
                        .pattern("RRR")
                        .input('R', ModBlocks.SALT_TILES.asItem())
                        .criterion(hasItem(ModBlocks.SALT_TILES), conditionsFromItem(ModBlocks.SALT_TILES))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_TILE_SLAB, 6)
                        .pattern("   ")
                        .pattern("   ")
                        .pattern("RRR")
                        .input('R', ModBlocks.SALT_TILES.asItem())
                        .criterion(hasItem(ModBlocks.SALT_TILES), conditionsFromItem(ModBlocks.SALT_TILES))
                        .offerTo(exporter);

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SALT_TILE_WALL, 6)
                        .pattern("   ")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModBlocks.SALT_TILES.asItem())
                        .criterion(hasItem(ModBlocks.SALT_TILES), conditionsFromItem(ModBlocks.SALT_TILES))
                        .offerTo(exporter);



                createShaped(RecipeCategory.MISC, ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE, 1)
                        .pattern("RRR")
                        .pattern("RFR")
                        .pattern("RRR")
                        .input('R', ModItems.TITANIUM_INGOT)
                        .input('F', Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                        .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                        .offerTo(exporter);

                createShaped(RecipeCategory.MISC, ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE, 2)
                        .pattern("RFR")
                        .pattern("RGR")
                        .pattern("RRR")
                        .input('R', ModItems.TITANIUM_INGOT)
                        .input('F', ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE)
                        .input('G', Items.COBBLED_DEEPSLATE)
                        .criterion(hasItem(ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE), conditionsFromItem(ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE))
                        .offerTo(exporter, String.valueOf(Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, "dupe")));

                createShaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TITANIUM_BLOCK, 1)
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .input('R', ModItems.TITANIUM_INGOT)
                        .criterion(hasItem(ModItems.TITANIUM_INGOT), conditionsFromItem(ModItems.TITANIUM_INGOT))
                        .offerTo(exporter);

                createShapeless(RecipeCategory.MISC, ModItems.TITANIUM_INGOT, 9)
                        .input(ModBlocks.TITANIUM_BLOCK)
                        .criterion(hasItem(ModBlocks.TITANIUM_BLOCK.asItem()), conditionsFromItem(ModBlocks.TITANIUM_BLOCK.asItem()))
                        .offerTo(exporter, String.valueOf(Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, "block_to_titanium")));

                createShapeless(RecipeCategory.FOOD, ModItems.KOURTNEYS_ESTROGEN, 1)
                        .input(ModItems.USED_KOURTNEYS_ESTROGEN)
                        .criterion(hasItem(ModItems.USED_KOURTNEYS_ESTROGEN), conditionsFromItem(ModItems.USED_KOURTNEYS_ESTROGEN))
                        .offerTo(exporter);
            }
        };
    }

    @Override
    public String getName() {
        return "Fugo's Trails and Tales Reimagined";
    }
}
