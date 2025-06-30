package net.sen.untamed.common.registries;

import net.minecraft.world.item.*;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.WallSignBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.sen.untamed.common.utils.ModUtils;

import java.util.Locale;
import java.util.function.Supplier;

public class MinecraftUntamedItems {
    private static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ModUtils.getModId());

    private static DeferredItem<Item> createItem(String name) {
        return ITEMS.register(name, () -> new Item(new Item.Properties()));
    }

    private static <T extends Item> DeferredItem<T> createItem(String name, Supplier<T> item) {
        return ITEMS.register(name, item);
    }

    private static Supplier<Item> createSignItem(String name, Supplier<StandingSignBlock> sign, Supplier<WallSignBlock> wallSign) {
        return ITEMS.register(name.toLowerCase(Locale.ROOT), () -> new SignItem(new Item.Properties().stacksTo(16), sign.get(), wallSign.get()));
    }

    private static Supplier<Item> createHangingSignItem(String name, Supplier<CeilingHangingSignBlock> sign, Supplier<WallHangingSignBlock> wallSign) {
        return ITEMS.register(name.toLowerCase(Locale.ROOT), () -> new HangingSignItem(sign.get(), wallSign.get(),new Item.Properties().stacksTo(16)));
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
