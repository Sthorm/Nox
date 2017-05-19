package com.Sthorm.Noxmod;

/**
 * Created by Nick on 19-May-17.
 */
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import com.Sthorm.Noxmod.proxy.CommonProxy;


@Mod(modid = Noxmod.modId, name = Noxmod.name, version = Noxmod.version, acceptedMinecraftVersions = "[1.11.2]")
public class Noxmod
{

    public static final String modId = "nox";
    public static final String name = "Nox Mod";
    public static final String version = "Hello Kirk!!!!";

    @Mod.Instance(modId)
    public static Noxmod instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is bringing light to the darkest nights");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    @SidedProxy(serverSide = "com.Sthorm.Noxmod.proxy.CommonProxy", clientSide = "com.Sthorm.Noxmod.proxy.ClientProxy")
    public static CommonProxy proxy;

}
