package com.hoopawolf.swordstone;

import com.hoopawolf.sword.SwordManager;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockSwordStoneVulcansRevenge extends BlockContainer {


    //Treat it like a normal block here. The Block Bounds are a good idea - the first three are X Y and Z of the botton-left corner,
    //And the second three are the top-right corner.
    public BlockSwordStoneVulcansRevenge() {
        super(Material.rock);
        this.setBlockBounds(.35F, .0F, .2F, .72F, 1.5F, .8F);
        setBlockName("swordStoneVulcansRevenge");
        setHardness(1000.0F);
        setBlockUnbreakable();


    }

    //Make sure you set this as your TileEntity class relevant for the block!
    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntitySwordStoneVulcansRevenge();
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
    public int quantityDropped(Random par2Random) {
        return 0;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9) {
        if (player.isSneaking()) {
            return false;
        }

            if (player.getCurrentEquippedItem() == null && !player.capabilities.isCreativeMode) {
                player.inventory.addItemStackToInventory(new ItemStack(SwordManager.vulcansRevengeSword, 1));
                world.setBlock(x, y, z, BlockManager.swordStoneInactive);
                world.markBlockForUpdate(x, y, z);

        }
        return false;


    }

}

