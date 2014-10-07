package com.hoopawolf.vulcansrevenge;


import com.hoopawolf.common.CommonProxy;
import com.hoopawolf.lib.Reference;
import com.hoopawolf.lib.VRMEventHandler;
import com.hoopawolf.sword.SwordManager;
import com.hoopawolf.swordstone.BlockManager;
import com.hoopawolf.swordstone.TileEntitySwordStoneActive;
import com.hoopawolf.swordstone.TileEntitySwordStoneInactive;
import com.hoopawolf.swordstone.TileEntitySwordStoneVulcansRevenge;
import com.hoopawolf.tab.VRMtab;
import com.hoopawolf.worldgen.VulcansRevengeWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.WeightedRandomChestContent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.Version)

public class VulcansRevenge {

    @Mod.Instance(Reference.MOD_ID)
    public static VulcansRevenge instance;


    @SidedProxy(clientSide = "com.hoopawolf.client.ClientProxy", serverSide = "com.hoopawolf.common.CommonProxy")
    public static CommonProxy proxy;

    public static Item.ToolMaterial VULCAN = EnumHelper.addToolMaterial("VULCAN", 1, 2500, 6F, 6, 1);
    public static Item.ToolMaterial VULCANHEAVY = EnumHelper.addToolMaterial("VULCANHEAVY", 1, 2500, 6F, 36, 1);


    public static CreativeTabs tabVulcansRevenge = new VRMtab(
            CreativeTabs.getNextID(), "tabVulcansRevenge");


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

        BlockManager.registerBlocks();

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        SwordManager.registerSwords();
        proxy.registerRenderers();
        GameRegistry.registerTileEntity(TileEntitySwordStoneInactive.class, "tileEntitySwordStoneInactive");
        GameRegistry.registerTileEntity(TileEntitySwordStoneActive.class, "tileEntitySwordStoneActive");
        GameRegistry.registerTileEntity(TileEntitySwordStoneVulcansRevenge.class, "tileEntitySwordStoneVulcansRevenge");

        GameRegistry.registerWorldGenerator(new VulcansRevengeWorldGenerator(), 0);

        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CORRIDOR).addItem(new WeightedRandomChestContent(new ItemStack(SwordManager.brokenSword), 0, 1, 40));
        ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(SwordManager.brokenSword), 0, 1, 10));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(SwordManager.brokenSword), 0, 1, 30));
        ChestGenHooks.getInfo(ChestGenHooks.STRONGHOLD_CROSSING).addItem(new WeightedRandomChestContent(new ItemStack(SwordManager.brokenSword), 0, 1, 40));
        ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_JUNGLE_CHEST).addItem(new WeightedRandomChestContent(new ItemStack(SwordManager.brokenSword), 0, 1, 5));

    }


    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

        MinecraftForge.EVENT_BUS.register(new VRMEventHandler());

    }


}
