package fugos_tatr.modid.item;

import fugos_tatr.modid.util.ModTags;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;

public class ModToolMaterials {
    public static final ToolMaterial TITANIUM_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
            4062,
            35,
            12.5f,
            ToolMaterial.IRON.enchantmentValue(),
            ModItemTags.TITANIUM_TOOL_MATERIALS
    );
}
