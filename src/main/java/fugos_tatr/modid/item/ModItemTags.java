package fugos_tatr.modid.item;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModItemTags {
    public static final TagKey<Item> TITANIUM_TOOL_MATERIALS = of("titanum_tool_materials");
    public static final TagKey<Item> TITANIUM_TOOLS = of("titanium_tools");

    private static TagKey<Item> of(String id) { return TagKey.of(RegistryKeys.ITEM, Identifier.ofVanilla(id)); }
}
