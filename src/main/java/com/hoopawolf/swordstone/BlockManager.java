package com.hoopawolf.swordstone;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockManager {

    public static Block swordStoneInactive = null;
    public static Block swordStoneActive = null;
    public static Block swordStoneVulcansRevenge = null;


    public static void registerBlocks() {
        swordStoneInactive = new BlockSwordStoneInactive();
        swordStoneActive = new BlockSwordStoneActive();
        swordStoneVulcansRevenge = new BlockSwordStoneVulcansRevenge();

        GameRegistry.registerBlock(swordStoneInactive, "swordStoneInactive");
        GameRegistry.registerBlock(swordStoneActive, "swordStoneActive");
        GameRegistry.registerBlock(swordStoneVulcansRevenge, "swordStoneVulcansRevenge");
    }

}
