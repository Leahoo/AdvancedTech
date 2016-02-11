package modname.common.block;

import modname.common.helper.ISimpleTextureHelper;
import modname.common.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;

/**
 * Created by justinleahy on 2/10/16.
 */
public class BlockBlastFurnace extends Block implements ISimpleTextureHelper {
    ModelResourceLocation modelResourceLocation = null;

    public BlockBlastFurnace() {
        super(Material.iron);
        setHardness(5.0F);
        setUnlocalizedName(Names.Blocks.BLAST_FURNACE);
        setCreativeTab(CreativeTabs.tabMaterials);
        modelResourceLocation = Names.resourceLocationHelper(getUnlocalizedName());
    }

    @Override
    public ModelResourceLocation getDefaultModelLocation() {
        return modelResourceLocation;
    }
}
