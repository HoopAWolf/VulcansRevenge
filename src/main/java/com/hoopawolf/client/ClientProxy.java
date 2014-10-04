package com.hoopawolf.client;

import com.hoopawolf.common.CommonProxy;
import com.hoopawolf.swordstone.*;
import cpw.mods.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy {

    @Override
    public void registerRenderers() {

        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySwordStoneInactive.class, new TileEntitySwordStoneInactiveRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySwordStoneActive.class, new TileEntitySwordSoneActiveRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySwordStoneVulcansRevenge.class, new TileEntitySwordStoneVulcansRevengeRenderer());

    }


}
