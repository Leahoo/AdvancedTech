package modname.common;

import modname.common.config.ModNameBlocks;
import modname.common.config.ModNameItems;
import modname.common.proxy.CommonProxyModName;
import modname.common.reference.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by justinleahy on 2/10/16.
 */

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class ModName {

    @Instance(Reference.MOD_ID)
    public static ModName instance;

    @SidedProxy(clientSide = "modname.client.ClientProxyModName", serverSide = "modname.common.proxy.CommonProxyModName")
    public static CommonProxyModName proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        ModNameItems.registerItems();
        ModNameBlocks.registerBlocks();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }
}
