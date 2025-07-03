package fugos_tatr.modid.item;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import fugos_tatr.modid.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {
    public static final Item MASON_JAR = register("mason_jar", Item::new, new Item.Settings());

    public static final Item PEAR = register("pear", Item::new, new Item.Settings().food(FoodComponents.APPLE));
    public static final Item PEAR_JUICE = register("pear_juice", Item::new, new Item.Settings().food(ModFoodComponents.PEAR_JAM, ConsumableComponents.drink().consumeSeconds(2.0F).sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK).build()).useRemainder(ModItems.MASON_JAR));

    public static final Item BLUE_BERRIES = register("blue_berries", createBlockItemWithUniqueName(ModBlocks.BLUE_BERRY_BUSH), new Item.Settings().food(ModFoodComponents.BLUE_BERRIES, ConsumableComponents.DRIED_KELP));
    public static final Item BLUE_BERRY_JAM = register("blue_berry_jam", Item::new, new Item.Settings().food(ModFoodComponents.BLUE_BERRY_JAM, ConsumableComponents.drink().consumeSeconds(2.0F).sound(SoundEvents.ITEM_HONEY_BOTTLE_DRINK).build()).useRemainder(ModItems.MASON_JAR));

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
