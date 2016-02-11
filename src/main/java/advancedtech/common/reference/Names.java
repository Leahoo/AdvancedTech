package advancedtech.common.reference;

import net.minecraft.client.resources.model.ModelResourceLocation;

/**
 * Created by justinleahy on 2/10/16.
 */
public class Names {

    public static final class Blocks {
        public static final String BLAST_FURNACE = "blastFurnace";
    }

    public static final class Items {
        public static final String LOW_STEEL_INGOT = "lowSteelIngot";
        public static final String MED_STEEL_INGOT = "medSteelIngot";
        public static final String HIGH_STEEL_INGOT = "highSteelIngot";
        public static final String[] INGOT_SUBTYPES = {LOW_STEEL_INGOT, MED_STEEL_INGOT, HIGH_STEEL_INGOT};
    }

    public static ModelResourceLocation resourceLocationHelper(String unlocalizedName) {
        return new ModelResourceLocation(Reference.MOD_ID + ":" + unlocalizedName.substring(5), "inventory");
    }
}
