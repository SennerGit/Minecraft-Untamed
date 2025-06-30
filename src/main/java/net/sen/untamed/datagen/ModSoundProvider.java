package net.sen.untamed.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;
import net.sen.untamed.common.utils.ModUtils;

public class ModSoundProvider extends SoundDefinitionsProvider {
    /**
     * Creates a new instance of this data provider.
     *
     * @param output The {@linkplain PackOutput} instance provided by the data generator.
     * @param helper The existing file helper provided by the event you are initializing this provider in.
     */
    public ModSoundProvider(PackOutput output, ExistingFileHelper helper) {
        super(output, ModUtils.getModId(), helper);
    }

    @Override
    public void registerSounds() {

    }
}
