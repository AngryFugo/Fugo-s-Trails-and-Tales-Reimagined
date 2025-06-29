package fugos_tatr.modid.world;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> AVOCADO_TREE_PLACED_KEY = registerKey("avocado_tree_placed");
    public static final RegistryKey<PlacedFeature> CHESTNUT_TREE_PLACED_KEY = registerKey("chestnut_tree_placed");
    public static final RegistryKey<PlacedFeature> MAPLE_TREE_PLACED_KEY = registerKey("maple_tree_placed");
    public static final RegistryKey<PlacedFeature> PINE_TREE_PLACED_KEY = registerKey("pine_tree_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, AVOCADO_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.AVOCADO_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.AVOCADO_SAPLING));

        register(context, CHESTNUT_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHESTNUT_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.CHESTNUT_SAPLING));

        register(context, MAPLE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAPLE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.MAPLE_SAPLING));

        register(context, PINE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.PINE_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
