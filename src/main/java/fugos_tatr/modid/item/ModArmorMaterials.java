package fugos_tatr.modid.item;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.util.ModTags;
import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.Map;

public class ModArmorMaterials {
    public static final int TITANIUM_BASE_DURABILITY = 50;

    public static final RegistryKey<EquipmentAsset> TITANIUM_ARMOR_KEY = RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, "titanium"));

    public static final ArmorMaterial TITANIUM_ARMOR_MATERIAL = new ArmorMaterial(
            TITANIUM_BASE_DURABILITY,
            Map.of(
                    EquipmentType.HELMET, 5,
                    EquipmentType.CHESTPLATE, 10,
                    EquipmentType.LEGGINGS, 8,
                    EquipmentType.BOOTS, 5
            ),
            7,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            5.0F,
            0.3F,
            ModItemTags.TITANIUM_TOOL_MATERIALS,
            TITANIUM_ARMOR_KEY
    );
}
