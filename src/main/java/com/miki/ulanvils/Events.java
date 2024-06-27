package com.miki.ulanvils;

import net.minecraftforge.event.entity.player.AnvilRepairEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class Events {
    @SubscribeEvent()
    public static void anvilEvent(AnvilRepairEvent e) {
        e.setBreakChance(0f);
    }
}
