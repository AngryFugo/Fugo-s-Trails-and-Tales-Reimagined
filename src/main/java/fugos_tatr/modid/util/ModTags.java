package fugos_tatr.modid.util;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> AVOCADO_LOGS = createTag("avocado_logs");
        public static final TagKey<Item> CHESTNUT_LOGS = createTag("chestnut_logs");
        public static final TagKey<Item> MAPLE_LOGS = createTag("maple_logs");
        public static final TagKey<Item> PINE_LOGS = createTag("pine_logs");
        public static final TagKey<Item> PALM_LOGS = createTag("palm_logs");
        public static final TagKey<Item> RUBBER_LOGS =  createTag("rubber_logs");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name));
        }
    }
}
