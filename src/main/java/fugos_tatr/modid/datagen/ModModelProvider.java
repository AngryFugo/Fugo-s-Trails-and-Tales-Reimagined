package fugos_tatr.modid.datagen;

import fugos_tatr.modid.block.ModBlocks;
import fugos_tatr.modid.block.custom.BlueBerryBush;
import fugos_tatr.modid.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import net.minecraft.client.data.TexturedModel;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.PEAR_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerSingleton(ModBlocks.PEAR_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.createLogTexturePool(ModBlocks.PEAR_LOG).log(ModBlocks.PEAR_LOG).wood(ModBlocks.PEAR_WOOD);
        blockStateModelGenerator.createLogTexturePool(ModBlocks.STRIPPED_PEAR_LOG).log(ModBlocks.STRIPPED_PEAR_LOG).wood(ModBlocks.STRIPPED_PEAR_WOOD);

        BlockStateModelGenerator.BlockTexturePool avocadoPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PEAR_PLANKS);

        avocadoPool.stairs(ModBlocks.PEAR_STAIRS);
        avocadoPool.slab(ModBlocks.PEAR_SLAB);
        avocadoPool.button(ModBlocks.PEAR_BUTTON);
        avocadoPool.pressurePlate(ModBlocks.PEAR_PRESSURE_PLATE);
        avocadoPool.fence(ModBlocks.PEAR_FENCE);
        avocadoPool.fenceGate(ModBlocks.PEAR_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PEAR_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PEAR_TRAPDOOR);



        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CHESTNUT_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerSingleton(ModBlocks.CHESTNUT_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.createLogTexturePool(ModBlocks.CHESTNUT_LOG).log(ModBlocks.CHESTNUT_LOG).wood(ModBlocks.CHESTNUT_WOOD);
        blockStateModelGenerator.createLogTexturePool(ModBlocks.STRIPPED_CHESTNUT_LOG).log(ModBlocks.STRIPPED_CHESTNUT_LOG).wood(ModBlocks.STRIPPED_CHESTNUT_WOOD);

        BlockStateModelGenerator.BlockTexturePool chestnutPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHESTNUT_PLANKS);

        chestnutPool.stairs(ModBlocks.CHESTNUT_STAIRS);
        chestnutPool.slab(ModBlocks.CHESTNUT_SLAB);
        chestnutPool.button(ModBlocks.CHESTNUT_BUTTON);
        chestnutPool.pressurePlate(ModBlocks.CHESTNUT_PRESSURE_PLATE);
        chestnutPool.fence(ModBlocks.CHESTNUT_FENCE);
        chestnutPool.fenceGate(ModBlocks.CHESTNUT_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.CHESTNUT_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CHESTNUT_TRAPDOOR);



        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.MAPLE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerSingleton(ModBlocks.MAPLE_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.createLogTexturePool(ModBlocks.MAPLE_LOG).log(ModBlocks.MAPLE_LOG).wood(ModBlocks.MAPLE_WOOD);
        blockStateModelGenerator.createLogTexturePool(ModBlocks.STRIPPED_MAPLE_LOG).log(ModBlocks.STRIPPED_MAPLE_LOG).wood(ModBlocks.STRIPPED_MAPLE_WOOD);

        BlockStateModelGenerator.BlockTexturePool maplePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAPLE_PLANKS);

        maplePool.stairs(ModBlocks.MAPLE_STAIRS);
        maplePool.slab(ModBlocks.MAPLE_SLAB);
        maplePool.button(ModBlocks.MAPLE_BUTTON);
        maplePool.pressurePlate(ModBlocks.MAPLE_PRESSURE_PLATE);
        maplePool.fence(ModBlocks.MAPLE_FENCE);
        maplePool.fenceGate(ModBlocks.MAPLE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.MAPLE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MAPLE_TRAPDOOR);



        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.PINE_SAPLING, BlockStateModelGenerator.CrossType.NOT_TINTED);

        blockStateModelGenerator.registerSingleton(ModBlocks.PINE_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.createLogTexturePool(ModBlocks.PINE_LOG).log(ModBlocks.PINE_LOG).wood(ModBlocks.PINE_WOOD);
        blockStateModelGenerator.createLogTexturePool(ModBlocks.STRIPPED_PINE_LOG).log(ModBlocks.STRIPPED_PINE_LOG).wood(ModBlocks.STRIPPED_PINE_WOOD);

        BlockStateModelGenerator.BlockTexturePool pinePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINE_PLANKS);

        pinePool.stairs(ModBlocks.PINE_STAIRS);
        pinePool.slab(ModBlocks.PINE_SLAB);
        pinePool.button(ModBlocks.PINE_BUTTON);
        pinePool.pressurePlate(ModBlocks.PINE_PRESSURE_PLATE);
        pinePool.fence(ModBlocks.PINE_FENCE);
        pinePool.fenceGate(ModBlocks.PINE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PINE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINE_TRAPDOOR);



        blockStateModelGenerator.registerTintableCrossBlockStateWithStages(ModBlocks.BLUE_BERRY_BUSH, BlockStateModelGenerator.CrossType.NOT_TINTED,
                BlueBerryBush.AGE, 0, 1, 2, 3);



        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALT_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SALT_BRICKS);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TUFF_TITANIUM_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.TITANIUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModBlocks.PEAR_SAPLING.asItem(), Models.GENERATED);

        itemModelGenerator.register(ModBlocks.CHESTNUT_SAPLING.asItem(), Models.GENERATED);

        itemModelGenerator.register(ModBlocks.MAPLE_SAPLING.asItem(), Models.GENERATED);

        itemModelGenerator.register(ModBlocks.PINE_SAPLING.asItem(), Models.GENERATED);



        itemModelGenerator.register(ModItems.MASON_JAR, Models.GENERATED);

        itemModelGenerator.register(ModItems.PEAR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PEAR_JUICE, Models.GENERATED);

        itemModelGenerator.register(ModItems.BLUE_BERRY_JAM, Models.GENERATED);

        itemModelGenerator.register(ModItems.RAW_TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);

        itemModelGenerator.register(ModItems.ANCIENT_TOME, Models.GENERATED);
        itemModelGenerator.register(ModItems.ALLOY_ELYTRA, Models.GENERATED);

        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_HOE, Models.HANDHELD);

        itemModelGenerator.register(ModItems.ALLEYCAT_DAGGERS, Models.HANDHELD);
    }
}
