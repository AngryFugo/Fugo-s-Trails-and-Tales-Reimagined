package fugos_tatr.modid.item;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.block.ModBlocks;
import fugos_tatr.modid.item.custom.AlleycatDaggersItem;
import net.minecraft.block.Block;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.EquippableComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.data.recipe.VanillaRecipeGenerator;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.Unit;

import java.util.function.Function;

public class ModItems {
    public static final Item TITANIUM_SWORD = registerAlt("titanium_sword", settings -> new Item(settings.sword(ModToolMaterials.TITANIUM_TOOL_MATERIAL, 3f, -3.2f)));
    public static final Item TITANIUM_SHOVEL = register("titanium_shovel", settings -> new ShovelItem(ModToolMaterials.TITANIUM_TOOL_MATERIAL, -9.5f, -3f, settings), new Item.Settings());
    public static final Item TITANIUM_PICKAXE = registerAlt("titanium_pickaxe", settings -> new Item(settings.pickaxe(ModToolMaterials.TITANIUM_TOOL_MATERIAL, -7f, -2.6f)));
    public static final Item TITANIUM_AXE = register("titanium_axe", settings -> new AxeItem(ModToolMaterials.TITANIUM_TOOL_MATERIAL, 8f, -3.4f, settings), new Item.Settings());
    public static final Item TITANIUM_HOE = register("titanium_hoe", settings -> new HoeItem(ModToolMaterials.TITANIUM_TOOL_MATERIAL, -11.5f, 0, settings), new Item.Settings());

    public static final Item RAW_TITANIUM = register("raw_titanium", Item::new, new Item.Settings());
    public static final Item TITANIUM_INGOT = register("titanium_ingot", Item::new, new Item.Settings());
    public static final Item TITANIUM_UPGRADE_SMITHING_TEMPLATE = registerAlt("titanium_upgrade_smithing_template", SmithingTemplateItem::of);

    public static final Item ANCIENT_TOME = register("ancient_tome", Item::new, new Item.Settings());
    public static final Item ALLOY_ELYTRA = register("alloy_elytra", Item::new, new Item.Settings().maxDamage(864).rarity(Rarity.EPIC).component(DataComponentTypes.GLIDER, Unit.INSTANCE).component(DataComponentTypes.EQUIPPABLE, EquippableComponent.builder(EquipmentSlot.CHEST).equipSound(SoundEvents.ITEM_ARMOR_EQUIP_ELYTRA).model(EquipmentAssetKeys.ELYTRA).damageOnHurt(false).build()).repairable(ModItems.TITANIUM_INGOT));

    public static final Item MASON_JAR = register("mason_jar", Item::new, new Item.Settings());

    public static final Item PEAR = register("pear", Item::new, new Item.Settings().food(FoodComponents.APPLE));
    public static final Item PEAR_JUICE = register("pear_juice", Item::new, new Item.Settings().food(ModFoodComponents.PEAR_JAM, ConsumableComponents.drink().consumeSeconds(2.0F).sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK).build()).useRemainder(ModItems.MASON_JAR));

    public static final Item BLUE_BERRIES = register("blue_berries", createBlockItemWithUniqueName(ModBlocks.BLUE_BERRY_BUSH), new Item.Settings().food(ModFoodComponents.BLUE_BERRIES, ConsumableComponents.DRIED_KELP));
    public static final Item BLUE_BERRY_JAM = register("blue_berry_jam", Item::new, new Item.Settings().food(ModFoodComponents.BLUE_BERRY_JAM, ConsumableComponents.drink().consumeSeconds(2.0F).sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK).build()).useRemainder(ModItems.MASON_JAR));

    public static final Item ALLEYCAT_DAGGERS = register("alleycat_daggers", AlleycatDaggersItem::new, new Item.Settings().maxCount(1).useCooldown(1.1F).rarity(Rarity.EPIC));

    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    private static Function<Item.Settings, Item> createBlockItemWithUniqueName(Block block) {
        return (settings) -> new BlockItem(block, settings.useItemPrefixedTranslationKey());
    }

    private static Item registerAlt(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name)))));
    }

    public static void registerModItems() {
        FugosTrailsAndTalesReimagined.LOGGER.info("Registering Mod Items for " + FugosTrailsAndTalesReimagined.MOD_ID);
    }
}
