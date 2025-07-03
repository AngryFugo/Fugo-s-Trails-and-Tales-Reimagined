package fugos_tatr.modid.sound;

import fugos_tatr.modid.FugosTrailsAndTalesReimagined;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent ALLEYCAT_KNIFE_THROW = registerSoundEvent("alleycat_knife_throw");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(FugosTrailsAndTalesReimagined.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        FugosTrailsAndTalesReimagined.LOGGER.info("Registering Mod Sounds for " + FugosTrailsAndTalesReimagined.MOD_ID);
    }
}
