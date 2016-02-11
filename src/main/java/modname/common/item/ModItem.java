package modname.common.item;

import modname.common.helper.ISimpleTextureHelper;
import modname.common.reference.Names;
import modname.common.reference.Reference;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by justinleahy on 2/10/16.
 */

public class ModItem extends Item implements ISimpleTextureHelper {
    ModelResourceLocation modelResourceLocation = null;

    public ModItem() {
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        super.onItemRightClick(itemStack, world, entityPlayer);
        return itemStack;
    }

    public void setDefaultModelLocation() {
        modelResourceLocation = Names.resourceLocationHelper(getUnlocalizedName());
    }

    @Override
    public ModelResourceLocation getDefaultModelLocation() {
        return modelResourceLocation;
    }
}
