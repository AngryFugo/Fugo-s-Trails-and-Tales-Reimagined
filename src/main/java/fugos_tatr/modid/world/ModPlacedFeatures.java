package fugos_tatr.modid.world;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> PEAR_TREE_PLACED_KEY = registerKey("pear_tree_placed");
    public static final RegistryKey<PlacedFeature> CHESTNUT_TREE_PLACED_KEY = registerKey("chestnut_tree_placed");
    public static final RegistryKey<PlacedFeature> MAPLE_TREE_PLACED_KEY = registerKey("maple_tree_placed");
    public static final RegistryKey<PlacedFeature> PINE_TREE_PLACED_KEY = registerKey("pine_tree_placed");
    public static final RegistryKey<PlacedFeature> PALM_TREE_PLACED_KEY = registerKey("palm_tree_placed");
    public static final RegistryKey<PlacedFeature> RUBBER_TREE_PLACED_KEY = registerKey("rubber_tree_placed");

    public static final RegistryKey<PlacedFeature> TITANIUM_PLACED_KEY = registerKey("titanium_placed");
    public static final RegistryKey<PlacedFeature> ESTROLITE_PLACED_KEY = registerKey("estrolite_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, PEAR_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PEAR_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.PEAR_SAPLING));

        register(context, CHESTNUT_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CHESTNUT_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.CHESTNUT_SAPLING));

        register(context, MAPLE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MAPLE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.MAPLE_SAPLING));

        register(context, PINE_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PINE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2, 0.1f, 2), ModBlocks.PINE_SAPLING));

        register(context, PALM_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.PALM_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0,0.1f,1), ModBlocks.PALM_SEED));

        register(context, RUBBER_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBBER_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(0, 0.1f, 1), ModBlocks.RUBBER_PROPAGULE));



        register(context, TITANIUM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TITANIUM_KEY),
                ModOrePlacement.modifiersWithCount(4,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-20), YOffset.fixed(20))));


        register(context, ESTROLITE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.ESTROLITE_KEY),
                ModOrePlacement.modifiersWithCount(3,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-50), YOffset.fixed(50))));


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
