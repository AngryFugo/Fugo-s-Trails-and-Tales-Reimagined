package fugos_tatr.modid.world;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.MegaPineFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> AVOCADO_TREE_KEY = registerKey("avocado_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHESTNUT_TREE_KEY = registerKey("chestnut_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MAPLE_TREE_KEY = registerKey("maple_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PINE_TREE_KEY = registerKey("pine_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, AVOCADO_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.AVOCADO_LOG),
                new StraightTrunkPlacer(5,1,1),

                BlockStateProvider.of(ModBlocks.AVOCADO_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),

                new TwoLayersFeatureSize(3, 1, 3)).dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK)).build());

        register(context, CHESTNUT_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CHESTNUT_LOG),
                new StraightTrunkPlacer(5,1,1),

                BlockStateProvider.of(ModBlocks.CHESTNUT_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),

                new TwoLayersFeatureSize(3, 1, 3)).dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK)).build());

        register(context, MAPLE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.MAPLE_LOG),
                new StraightTrunkPlacer(5,1,1),

                BlockStateProvider.of(ModBlocks.MAPLE_LEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 3),

                new TwoLayersFeatureSize(3, 1, 3)).dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK)).build());

        register(context, PINE_TREE_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.PINE_LOG),
                new StraightTrunkPlacer(8,2,2),

                BlockStateProvider.of(ModBlocks.PINE_LEAVES),
                new MegaPineFoliagePlacer(ConstantIntProvider.create(1), ConstantIntProvider.create(0), ConstantIntProvider.create(8)),

                new TwoLayersFeatureSize(3, 1, 3)).dirtProvider(BlockStateProvider.of(Blocks.GRASS_BLOCK)).build());
    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}
