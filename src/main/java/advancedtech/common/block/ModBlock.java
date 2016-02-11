package advancedtech.common.block;

import advancedtech.common.helper.ISimpleTextureHelper;
import advancedtech.common.reference.Names;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.model.ModelResourceLocation;

/**
 * Created by justinleahy on 2/10/16.
 */

public class ModBlock extends Block implements ISimpleTextureHelper{

    ModelResourceLocation modelResourceLocation = null;

    public ModBlock(Material material) {
        super(material);
    }

    public void setDefaultModelLocation() {
        modelResourceLocation = Names.resourceLocationHelper(getUnlocalizedName());
    }

    @Override
    public ModelResourceLocation getDefaultModelLocation() {
        return modelResourceLocation;
    }
}
