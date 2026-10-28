package net.propppplay.pikminorigin.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.propppplay.pikminorigin.Pikminorigin;

public class ModSounds {
    public static final SoundEvent PIKMIN_DIE = registerSoundEvent("pikmin_die");
    public static final SoundEvent PIKMIN_IDLE = registerSoundEvent("pikmin_idle");
    public static final SoundEvent PIKMIN_OUCH = registerSoundEvent("pikmin_ouch");
    public static final SoundEvent PIKMIN_THROW = registerSoundEvent("pikmin_throw");
    public static final SoundEvent PIKMIN_ROCK_THROW = registerSoundEvent("pikmin_rock_throw");
    public static final SoundEvent PIKMIN_ROCK_DIE = registerSoundEvent("pikmin_rock_die");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Pikminorigin.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        Pikminorigin.LOGGER.info("Registering Sounds for "+ Pikminorigin.MOD_ID);
    }
}
