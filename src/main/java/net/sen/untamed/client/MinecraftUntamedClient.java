package net.sen.untamed.client;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.neoforge.client.gui.ConfigurationScreen;
import net.neoforged.neoforge.client.gui.IConfigScreenFactory;
import net.sen.untamed.MinecraftUntamed;

// This class will not load on dedicated servers. Accessing client side code from here is safe.
@Mod(value = MinecraftUntamed.MODID, dist = Dist.CLIENT)
public class MinecraftUntamedClient {
    public MinecraftUntamedClient(ModContainer container) {
        container.registerExtensionPoint(IConfigScreenFactory.class, ConfigurationScreen::new);
    }

    public static void MinecraftUntamedClientRegistry(IEventBus eventBus) {
        eventBus.addListener(MinecraftUntamedClient::renderEntities);
        eventBus.addListener(MinecraftUntamedClient::registerLayer);
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event)
    {
        event.enqueueWork(() -> {
        });
    }

    private static void renderEntities(EntityRenderersEvent.RegisterRenderers  event) {
    }

    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
    }
}