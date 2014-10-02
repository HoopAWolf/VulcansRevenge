package com.hoopawolf.worldgen;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.BiomeDictionary;

import java.util.Random;

public class VulcansRevengeWorldGenerator implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch (world.provider.dimensionId) {
            case -1:
                this.generateNether(world, random, chunkX * 16, chunkZ * 16);
            case 0:
                this.generateSurface(world, random, chunkX * 16, chunkZ * 16);
        }
    }

    private void generateSurface(World world, Random random, int blockX, int blockZ) {
        BiomeGenBase biome = world.getWorldChunkManager().getBiomeGenAt(blockX, blockZ);

        if (BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.FOREST) &&
                !BiomeDictionary.isBiomeOfType(biome, BiomeDictionary.Type.SNOWY)) {
            for (int a = 0; a < 6; a++) {
                int RandPosX = blockX + random.nextInt(16);
                int RandPosY = random.nextInt(150);
                int RandPosZ = blockZ + random.nextInt(16);
                (new VulcansRevengeWorldGen()).generate(world, random, RandPosX, RandPosY, RandPosZ);
            }
        }
    }

    private void generateNether(World world, Random random, int blockX, int blockZ) {
        int Xcoord = blockX + random.nextInt(16);
        int Ycoord = random.nextInt(60);
        int Zcoord = blockZ + random.nextInt(16);
    }

}