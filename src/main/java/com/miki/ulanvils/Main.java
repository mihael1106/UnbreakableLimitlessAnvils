package com.miki.ulanvils;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Main.MODID)
public class Main
{
    public static final String MODID = "ul_anvils";

    public Main()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
