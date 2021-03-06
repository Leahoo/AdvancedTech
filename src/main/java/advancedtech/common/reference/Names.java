package advancedtech.common.reference;

import net.minecraft.client.resources.model.ModelResourceLocation;

/**
 * Created by justinleahy on 2/10/16.
 */
public class Names {

    public static final class Blocks {
        public static final String LOW_STEEL_INGOT = "lowSteelIngotBlock";
        public static final String MED_STEEL_INGOT = "medSteelIngotBlock";
        public static final String HIGH_STEEL_INGOT = "highSteelIngotBlock";
        public static final String[] INGOT_SUBTYPES = {LOW_STEEL_INGOT, MED_STEEL_INGOT, HIGH_STEEL_INGOT};

        public static final String BLAST_FURNACE = "blastFurnace";
    }

    public static final class Items {
        public static final String LOW_STEEL_INGOT = "lowSteelIngot";
        public static final String MED_STEEL_INGOT = "medSteelIngot";
        public static final String HIGH_STEEL_INGOT = "highSteelIngot";
        public static final String PIG_IRON = "pigIron";
        public static final String[] INGOT_SUBTYPES = {LOW_STEEL_INGOT, MED_STEEL_INGOT, HIGH_STEEL_INGOT, PIG_IRON};

        public static final String COKE_COAL = "cokeCoal";
        
        public static final String SILICON = "silicon";
    }

    public static ModelResourceLocation resourceLocationHelper(String unlocalizedName) {
        return new ModelResourceLocation(Reference.MOD_ID + ":" + unlocalizedName.substring(5), "inventory");
    }
}
