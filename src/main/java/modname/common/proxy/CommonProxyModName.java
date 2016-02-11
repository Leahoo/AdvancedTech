package modname.common.proxy;

import net.minecraft.block.Block;
import net.minecraft.item.Item;

/**
 * Created by justinleahy on 2/10/16.
 */
public class CommonProxyModName {
    public void registerRenderThings() {}

    public void registerRenderInformation() {
        //No Rendering for Servers
    }

    public int addArmor(String armor) { return 0; }

    public void registerEventListener() {}

    public void registerItemTexture(final Item item, final String itemName) {}

    public void registerBlockTexture(final Block block, final String blockName) {}

    public void registerItemTexture(final Item item, final String itemName, int meta) {}

    public void registerBlockTexture(final Block block, final String itemName, int meta) {}
}
