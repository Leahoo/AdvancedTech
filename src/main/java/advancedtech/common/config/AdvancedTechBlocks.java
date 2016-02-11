package advancedtech.common.config;

import advancedtech.common.block.BlockBlastFurnace;
import advancedtech.common.block.ModBlock;
import advancedtech.common.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by justinleahy on 2/10/16.
 */
public class AdvancedTechBlocks {

    public static Block blastFurnace;

    public static Block lowSteelIngotBlock;
    public static Block medSteelIngotBlock;
    public static Block highSteelIngotBlock;

    public static void registerBlocks() {
        //Ingot Blocks
        lowSteelIngotBlock = new ModBlock(Material.iron).setHardness(5.0F).setUnlocalizedName(Names.Blocks.LOW_STEEL_INGOT);
        lowSteelIngotBlock.setCreativeTab(CreativeTabs.tabMaterials);
        ((ModBlock)lowSteelIngotBlock).setDefaultModelLocation();
        GameRegistry.registerBlock(lowSteelIngotBlock, Names.Blocks.LOW_STEEL_INGOT);

        medSteelIngotBlock = new ModBlock(Material.iron).setHardness(5.0F).setUnlocalizedName(Names.Blocks.MED_STEEL_INGOT);
        medSteelIngotBlock.setCreativeTab(CreativeTabs.tabMaterials);
        ((ModBlock)medSteelIngotBlock).setDefaultModelLocation();
        GameRegistry.registerBlock(medSteelIngotBlock, Names.Blocks.MED_STEEL_INGOT);

        highSteelIngotBlock = new ModBlock(Material.iron).setHardness(5.0F).setUnlocalizedName(Names.Blocks.HIGH_STEEL_INGOT);
        highSteelIngotBlock.setCreativeTab(CreativeTabs.tabMaterials);
        ((ModBlock)highSteelIngotBlock).setDefaultModelLocation();
        GameRegistry.registerBlock(highSteelIngotBlock, Names.Blocks.HIGH_STEEL_INGOT);


        blastFurnace = new BlockBlastFurnace();
        GameRegistry.registerBlock(blastFurnace, Names.Blocks.BLAST_FURNACE);
    }

}
