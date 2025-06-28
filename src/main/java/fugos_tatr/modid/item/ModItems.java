package fugos_tatr.modid.item;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {


    public static Item register(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    private static Item registerAlt(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name)))));
    }

    public static void registerModItems() {
        FugosTrailsAndTalesReimagined.LOGGER.info("Registering Mod Items for " + FugosTrailsAndTalesReimagined.MOD_ID);
    }
}
