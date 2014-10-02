package com.hoopawolf.sword;

import com.hoopawolf.vulcansrevenge.VulcansRevenge;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class SwordManager {

    public static Item brokenSword;
    public static Item vulcansRevengeSword;
    public static Item vulcansRevengeSwordHeavy;
    public static Item vulcansRevengeSwordFrost;
    public static Item vulcansRevengeSwordWither;

    public static void registerSwords() {

        brokenSword = new BrokenSword();
        vulcansRevengeSword = new VulcansRevengeSword(VulcansRevenge.VULCAN);
        vulcansRevengeSwordHeavy = new VulcansRevengeSwordHeavy(VulcansRevenge.VULCANHEAVY);
        vulcansRevengeSwordFrost = new VulcansRevengeSwordFrost(VulcansRevenge.VULCAN);
        vulcansRevengeSwordWither = new VulcansRevengeSwordWither(VulcansRevenge.VULCAN);

        GameRegistry.registerItem(brokenSword, "brokenSword");
        GameRegistry.registerItem(vulcansRevengeSword, "vulcansRevengeSword");
        GameRegistry.registerItem(vulcansRevengeSwordHeavy, "vulcansRevengeSwordHeavy");
        GameRegistry.registerItem(vulcansRevengeSwordFrost, "vulcansRevengeSwordFrost");
        GameRegistry.registerItem(vulcansRevengeSwordWither, "vulcansRevengeSwordWither");
    }


}
