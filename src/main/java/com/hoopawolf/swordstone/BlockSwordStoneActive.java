package com.hoopawolf.swordstone;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockSwordStoneActive extends BlockContainer {

    private Random furnaceRand = new Random();

    //Treat it like a normal block here. The Block Bounds are a good idea - the first three are X Y and Z of the botton-left corner,
    //And the second three are the top-right corner.
    public BlockSwordStoneActive() {
        super(Material.rock);
        setBlockBounds(.35F, .0F, .2F, .72F, 1.5F, .8F);
        setBlockName("swordStoneActive");
        setHardness(1000.0F);
        setBlockUnbreakable();


    }

    //Make sure you set this as your TileEntity class relevant for the block!
    @Override
    public TileEntity createNewTileEntity(World world, int i) {
        return new TileEntitySwordStoneActive();
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
    public int quantityDropped(Random p_149745_1_) {

        return 0;
    }
}