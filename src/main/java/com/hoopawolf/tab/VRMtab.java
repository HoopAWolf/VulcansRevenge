package com.hoopawolf.tab;

import com.hoopawolf.sword.SwordManager;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class VRMtab extends CreativeTabs {
    public VRMtab(final int par1, final String par2Str) {
        super(par1, par2Str);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem() {
        return new ItemStack(SwordManager.vulcansRevengeSword, 1, 0).getItem();

    }

    @Override
    public String getTranslatedTabLabel() {
        return EnumChatFormatting.GOLD + "Vulcan's Revenge Mod";
    }

}

