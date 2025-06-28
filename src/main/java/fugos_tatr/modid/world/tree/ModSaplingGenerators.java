package fugos_tatr.modid.world.tree;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator MAPLE = new SaplingGenerator(FugosTrailsAndTalesReimagined.MOD_ID + ":maple",
            Optional.empty(), Optional.of(ModConfiguredFeatures.MAPLE_TREE_KEY), Optional.empty());

    public static final SaplingGenerator PINE = new SaplingGenerator(FugosTrailsAndTalesReimagined.MOD_ID + ":pine",
            Optional.empty(), Optional.of(ModConfiguredFeatures.PINE_TREE_KEY), Optional.empty());
}
