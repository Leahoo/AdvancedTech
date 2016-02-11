package advancedtech.common.config;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by justinleahy on 2/10/16.
 */

public class AdvancedTechRecipes {

    private static final ItemStack lowSteelIngot = new ItemStack(AdvancedTechItems.lowSteelIngot, 1);
    private static final ItemStack medSteelIngot = new ItemStack(AdvancedTechItems.medSteelIngot, 1);
    private static final ItemStack highSteelIngot = new ItemStack(AdvancedTechItems.highSteelIngot, 1);

    private static final ItemStack lowSteelIngot9 = new ItemStack(AdvancedTechItems.lowSteelIngot, 9);
    private static final ItemStack medSteelIngot9 = new ItemStack(AdvancedTechItems.medSteelIngot, 9);
    private static final ItemStack highSteelIngot9 = new ItemStack(AdvancedTechItems.highSteelIngot, 9);

    private static final ItemStack lowSteelBlock = new ItemStack(AdvancedTechBlocks.lowSteelIngotBlock, 1);
    private static final ItemStack medSteelBlock = new ItemStack(AdvancedTechBlocks.medSteelIngotBlock, 1);
    private static final ItemStack highSteelBlock = new ItemStack(AdvancedTechBlocks.highSteelIngotBlock, 1);

    private static final ItemStack blastFurnace = new ItemStack(AdvancedTechBlocks.blastFurnace, 1);

    public static void registerRecipes() {
        GameRegistry.addRecipe(lowSteelBlock,
                "xxx",
                "xxx",
                "xxx",
                'x', lowSteelIngot);

        GameRegistry.addRecipe(medSteelBlock,
                "xxx",
                "xxx",
                "xxx",
                'x', medSteelIngot);

        GameRegistry.addRecipe(highSteelBlock,
                "xxx",
                "xxx",
                "xxx",
                'x', highSteelIngot);

        GameRegistry.addShapelessRecipe(lowSteelIngot9, lowSteelBlock);
        GameRegistry.addShapelessRecipe(medSteelIngot9, medSteelBlock);
        GameRegistry.addShapelessRecipe(highSteelIngot9, highSteelBlock);
    }

}
