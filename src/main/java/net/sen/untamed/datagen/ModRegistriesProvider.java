package net.sen.untamed.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.DatapackBuiltinEntriesProvider;
import net.sen.untamed.common.utils.ModUtils;
import net.sen.untamed.datagen.world.ModConfiguredFeatures;
import net.sen.untamed.datagen.world.ModPlacedFeatures;

import java.util.Collections;
import java.util.concurrent.CompletableFuture;

public class ModRegistriesProvider extends DatapackBuiltinEntriesProvider {
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap)
            .add(Registries.PLACED_FEATURE, ModPlacedFeatures::bootstrap)
;

    public ModRegistriesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Collections.singleton(ModUtils.getModId()));
    }
}
