package advancedtech.client;

import advancedtech.common.proxy.CommonProxyAdvancedTech;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

/**
 * Created by justinleahy on 2/10/16.
 */

public class ClientProxyAdvancedTech extends CommonProxyAdvancedTech {
    @Override
    public void registerRenderThings() {}

    @Override
    public void registerRenderInformation() {}

    @Override
    public void registerBlockTexture(final Block block, final String blockName) {
        registerBlockTexture(block, blockName, 0);
    }

    @Override
    public void registerBlockTexture(final Block block, final String blockName, int meta) {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(Item.getItemFromBlock(block), meta, new ModelResourceLocation("advancedTech"));
    }

    @Override
    public void registerItemTexture(final Item item, final String itemName) {
        registerItemTexture(item, itemName, 0);
    }

    @Override
    public void registerItemTexture(final Item item, final String itemName, int meta) {
        RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
        renderItem.getItemModelMesher().register(item, meta, new ModelResourceLocation("advancedTech"));
    }

    @Override
    public int addArmor(String armor) {
        // return RenderingRegistry.addNewArmourRendererPrefix(armor)
        //TODO 1.8

        return -1;
    }

    @Override
    public void registerEventListener() {
        super.registerEventListener();
    }



}
