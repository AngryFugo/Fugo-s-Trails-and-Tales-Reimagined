package fugos_tatr.modid.world.tree;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator PEAR = new SaplingGenerator(FugosTrailsAndTalesReimagined.MOD_ID + ":pear",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PEAR_TREE_KEY), Optional.empty());

    public static final SaplingGenerator CHESTNUT = new SaplingGenerator(FugosTrailsAndTalesReimagined.MOD_ID + ":chestnut",
            Optional.empty(), Optional.of(ModConfiguredFeatures.CHESTNUT_TREE_KEY), Optional.empty());

    public static final SaplingGenerator MAPLE = new SaplingGenerator(FugosTrailsAndTalesReimagined.MOD_ID + ":maple",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MAPLE_TREE_KEY), Optional.empty());

    public static final SaplingGenerator PINE = new SaplingGenerator(FugosTrailsAndTalesReimagined.MOD_ID + ":pine",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PINE_TREE_KEY), Optional.empty());

    public static final SaplingGenerator PALM = new SaplingGenerator(FugosTrailsAndTalesReimagined.MOD_ID + ":palm",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PALM_TREE_KEY), Optional.empty());

    public static final SaplingGenerator RUBBER = new SaplingGenerator(FugosTrailsAndTalesReimagined.MOD_ID + ":rubber",
            Optional.empty(), Optional.of(ModConfiguredFeatures.RUBBER_TREE_KEY), Optional.empty());
}
