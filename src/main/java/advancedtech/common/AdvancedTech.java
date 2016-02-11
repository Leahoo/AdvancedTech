package advancedtech.common;

import advancedtech.common.config.AdvancedTechBlocks;
import advancedtech.common.config.AdvancedTechItems;
import advancedtech.common.proxy.CommonProxyAdvancedTech;
import advancedtech.common.reference.Reference;
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
public class AdvancedTech {

    @Instance(Reference.MOD_ID)
    public static AdvancedTech instance;

    @SidedProxy(clientSide = "advancedtech.client.ClientProxyAdvancedTech", serverSide = "advancedtech.common.proxy.CommonProxyAdvancedTech")
    public static CommonProxyAdvancedTech proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        AdvancedTechItems.registerItems();
        AdvancedTechBlocks.registerBlocks();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {

    }
}
