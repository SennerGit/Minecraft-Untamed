package net.sen.untamed;

import net.neoforged.neoforge.event.server.ServerStartingEvent;
import net.sen.untamed.client.MinecraftUntamedClient;
import net.sen.untamed.client.events.MinecraftUntamedClientEvents;
import net.sen.untamed.common.registries.*;
import net.sen.untamed.common.config.Config;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;

@Mod(MinecraftUntamed.MODID)
public class MinecraftUntamed {
    public static final String MODID = "untamed";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MinecraftUntamed(IEventBus eventBus, ModContainer container, Dist dist) {
        if (dist.isClient()) {
            MinecraftUntamedClient.MinecraftUntamedClientRegistry(eventBus);
            MinecraftUntamedClientEvents.MinecraftUntamedClientEventHandler();
        }

        MinecraftUntamedItems.register(eventBus);
        MinecraftUntamedBlocks.register(eventBus);
        MinecraftUntamedBlockEntities.register(eventBus);
        MinecraftUntamedEntityTypes.register(eventBus);
        MinecraftUntamedArmourMaterials.register(eventBus);
        MinecraftUntamedCreativeModeTabs.register(eventBus);

        eventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);
        container.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        preInit(event);
        init(event);
        postInit(event);
    }

    private void preInit(FMLCommonSetupEvent event) {
    }

    private void init(FMLCommonSetupEvent event) {
    }

    private void postInit(FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
}
