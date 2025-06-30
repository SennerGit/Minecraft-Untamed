package net.sen.untamed.datagen.models;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import static net.sen.untamed.common.registries.MinecraftUntamedItems.*;

public class ModItemModelProvider extends ModItemModelHelper {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, existingFileHelper);
    }

    @Override
    protected void generateItems() {

    }

    @Override
    protected void generateBlocks() {
    }
}