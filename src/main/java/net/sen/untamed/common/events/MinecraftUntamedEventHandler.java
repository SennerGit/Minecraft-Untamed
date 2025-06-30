package net.sen.untamed.common.events;

import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.sen.untamed.MinecraftUntamed;

@EventBusSubscriber(modid = MinecraftUntamed.MODID)
public class MinecraftUntamedEventHandler {
    @SubscribeEvent
    public static void onPlayerTick(PlayerTickEvent.Post event) {

    }
}
