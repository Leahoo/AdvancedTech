package advancedtech.common.config;

import advancedtech.common.block.BlockBlastFurnace;
import advancedtech.common.reference.Names;
import net.minecraft.block.Block;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by justinleahy on 2/10/16.
 */
public class AdvancedTechBlocks {

    public static Block blastFurnace;

    public static void registerBlocks() {
        blastFurnace = new BlockBlastFurnace();
        GameRegistry.registerBlock(blastFurnace, Names.Blocks.BLAST_FURNACE);
    }

}
