package modname.common.config;

import modname.common.item.ModItem;
import modname.common.reference.Names;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by justinleahy on 2/10/16.
 */

public class ModNameItems {

    public static Item lowSteelIngot;
    public static Item medSteelIngot;
    public static Item highSteelIngot;

    public static void registerItems() {
        //Ingots
        lowSteelIngot = new ModItem().setUnlocalizedName(Names.Items.LOW_STEEL_INGOT);
        lowSteelIngot.setCreativeTab(CreativeTabs.tabMaterials);
        ((ModItem)lowSteelIngot).setDefaultModelLocation();
        GameRegistry.registerItem(lowSteelIngot, "Low Quality Steel Ingot");

        medSteelIngot = new ModItem().setUnlocalizedName(Names.Items.MED_STEEL_INGOT);
        medSteelIngot.setCreativeTab(CreativeTabs.tabMaterials);
        ((ModItem)medSteelIngot).setDefaultModelLocation();
        GameRegistry.registerItem(medSteelIngot, "Steel Ingot");

        highSteelIngot = new ModItem().setUnlocalizedName(Names.Items.HIGH_STEEL_INGOT);
        highSteelIngot.setCreativeTab(CreativeTabs.tabMaterials);
        ((ModItem)highSteelIngot).setDefaultModelLocation();
        GameRegistry.registerItem(highSteelIngot, "High Quality Steel Ingot");
    }
}
