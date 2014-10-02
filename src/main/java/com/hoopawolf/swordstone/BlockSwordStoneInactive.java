package com.hoopawolf.swordstone;

import com.hoopawolf.lib.VRMEntityUtil;
import com.hoopawolf.sword.SwordManager;
import com.hoopawolf.vulcansrevenge.VulcansRevenge;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockSwordStoneInactive extends BlockContainer {

    //Treat it like a normal block here. The Block Bounds are a good idea - the first three are X Y and Z of the botton-left corner,
    //And the second three are the top-right corner.
    public BlockSwordStoneInactive() {
        super(Material.rock);
        setBlockBounds(.35F, .0F, .2F, .72F, 1F, .8F);
        setBlockName("swordStoneInactive");
        setCreativeTab(VulcansRevenge.tabVulcansRevenge);
        setBlockUnbreakable();
        setHardness(1000.0F);


    }

    //Make sure you set this as your TileEntity class relevant for the block!
    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntitySwordStoneInactive();
    }

    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l) {
        return false;
    }

    //It's not an opaque cube, so you need this.
    @Override
    public boolean isOpaqueCube() {
        return false;
    }


    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {

        EntityLightningBolt Lightning = new EntityLightningBolt(world, x, y, z);
        Item heldItem;
        Item sword = SwordManager.brokenSword;
        if (player.getCurrentEquippedItem() != null) {
            heldItem = player.getCurrentEquippedItem().getItem();
            if (heldItem == sword) {
                TileEntitySwordStoneActive.time = 0;
                VRMEntityUtil.spawnWeather(world, Lightning);
                world.setBlock(x, y, z, BlockManager.swordStoneActive);
                world.markBlockForUpdate(x, y, z);
                player.playSound("mob.enderdragon.growl", 2.0F, .6F);
                removeItem(player);
                if (!world.isRaining())
                    world.getWorldInfo().setRaining(true);
                world.setWorldTime(16000);
            }

        }
        return true;
    }

    public void removeItem(EntityPlayer ep) {
        IInventory inv = ep.inventory;
        int i = ep.inventory.currentItem;

        if (inv.getStackInSlot(i) != null) {
            ItemStack j = inv.getStackInSlot(i);
            if (j.getItem() != null && j.getItem() == SwordManager.brokenSword) {
                j.stackSize--;
            }
        }


    }


}



