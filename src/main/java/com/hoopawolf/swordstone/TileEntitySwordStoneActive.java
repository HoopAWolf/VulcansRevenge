package com.hoopawolf.swordstone;

import com.hoopawolf.lib.VRMEntityUtil;
import com.hoopawolf.particle.EntityFlameParticleFX;
import com.hoopawolf.particle.EntityPortalParticleFX;
import com.hoopawolf.particle.EntitySmokeParticleFX;
import com.hoopawolf.particle.EntitySnowParticleFX;
import com.hoopawolf.sword.SwordManager;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.*;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ChatComponentTranslation;

import java.util.Random;

public class TileEntitySwordStoneActive extends TileEntity {
    boolean reset = true;

    public static long time = 0;
    public static int tickParts = 0;
    public static int seconds = 0;
    public static int minutes = 0;

    boolean breakThis = false;

    Random r = new Random();

    public boolean anyPlayerInRange() {
        return this.worldObj.getClosestPlayer((double) this.xCoord + 0.5D, (double) this.yCoord, (double) this.zCoord + 0.5D, 10) != null;
    }

    @Override
    public void updateEntity() {


        if (worldObj.isRemote) {

            for (int i = 0; i < 10; i++) {

                Random rand = new Random();

                double d = rand.nextGaussian() * 0.004D;
                Minecraft.getMinecraft().effectRenderer.addEffect(new EntityFlameParticleFX(worldObj, xCoord + 0.5,
                        yCoord,
                        zCoord + 0.5, d, 0.5D));
                Minecraft.getMinecraft().effectRenderer.addEffect(new EntityPortalParticleFX(worldObj, xCoord + 0.5,
                        yCoord + 0.5,
                        zCoord + 0.5, d, 0.5D));
                Minecraft.getMinecraft().effectRenderer.addEffect(new EntitySmokeParticleFX(worldObj, xCoord + 0.5,
                        yCoord + 1,
                        zCoord + 0.5, d, 0.5D));

                Minecraft.getMinecraft().effectRenderer.addEffect(new EntitySnowParticleFX(worldObj, xCoord + 0.5,
                        yCoord + 1.5,
                        zCoord + 0.5, d, 0.5D));
            }
        }


        time++;
        tickParts = (int) (time % 20);
        seconds = (int) (time / 20);
        minutes = (int) (time / 1200);

        if (this.worldObj != null) {
            int randomChance = r.nextInt(15);
            boolean spawn = randomChance == 0;
            boolean spawn1 = randomChance == 1;
            boolean spawn2 = randomChance == 2;
            boolean spawn3 = randomChance == 3;
            boolean spawn4 = randomChance == 4;


            Item sword = SwordManager.brokenSword;


            if (this.anyPlayerInRange()) {

                if (reset) {
                    time = 0;
                    reset = false;
                }

                if (time % 20 == 0) {

                    System.out.println("" + minutes);

                    switch (minutes) {

                        case 6:
                            Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentTranslation(
                                    "chat.vrm.congratulations"));
                            Minecraft.getMinecraft().thePlayer.playSound("random.levelup", 2.0F, .6F);
                            if (worldObj.isRaining()) {
                                worldObj.getWorldInfo().setRaining(false);
                            }
                            worldObj.setWorldTime(0);
                            breakThis = true;
                            time = 0;
                            break;

                        case 5:
                            if (spawn4) {
                                EntityGhast ghast = new EntityGhast(this.worldObj);
                                if (r.nextInt(2) == 1)
                                    ghast.setLocationAndAngles(this.xCoord + r.nextInt(5), this.yCoord + 8, this.zCoord + r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                else
                                    ghast.setLocationAndAngles(this.xCoord - r.nextInt(5), this.yCoord + 8, this.zCoord - r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                VRMEntityUtil.spawnInWorld(worldObj, ghast);
                            }

                        case 4:
                            if (spawn4) {
                                EntityWitch witch = new EntityWitch(this.worldObj);
                                if (r.nextInt(2) == 1)
                                    witch.setLocationAndAngles(this.xCoord + r.nextInt(5), this.yCoord, this.zCoord + r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                else
                                    witch.setLocationAndAngles(this.xCoord - r.nextInt(5), this.yCoord, this.zCoord - r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                VRMEntityUtil.spawnInWorld(worldObj, witch);
                            }


                        case 3:
                            if (spawn3) {
                                EntitySilverfish silverfish = new EntitySilverfish(this.worldObj);
                                if (r.nextInt(2) == 1)
                                    silverfish.setLocationAndAngles(this.xCoord + r.nextInt(5), this.yCoord, this.zCoord + r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                else
                                    silverfish.setLocationAndAngles(this.xCoord - r.nextInt(5), this.yCoord, this.zCoord - r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                VRMEntityUtil.spawnInWorld(worldObj, silverfish);
                            }

                        case 2:
                            if (spawn2) {
                                EntitySpider spider = new EntitySpider(this.worldObj);
                                if (r.nextInt(2) == 1)
                                    spider.setLocationAndAngles(this.xCoord + r.nextInt(5), this.yCoord, this.zCoord + r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                else
                                    spider.setLocationAndAngles(this.xCoord - r.nextInt(5), this.yCoord, this.zCoord - r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                VRMEntityUtil.spawnInWorld(worldObj, spider);
                            }

                        case 1:
                            if (spawn1) {
                                EntitySkeleton skeleton = new EntitySkeleton(this.worldObj);
                                if (r.nextInt(2) == 1)
                                    skeleton.setLocationAndAngles(this.xCoord + r.nextInt(5), this.yCoord, this.zCoord + r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                else
                                    skeleton.setLocationAndAngles(this.xCoord - r.nextInt(5), this.yCoord, this.zCoord - r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                skeleton.setCurrentItemOrArmor(0, new ItemStack(Items.bow, 1));
                                VRMEntityUtil.spawnInWorld(worldObj, skeleton);
                            }


                        case 0:
                            if (spawn) {
                                EntityZombie zombie = new EntityZombie(this.worldObj);
                                if (r.nextInt(2) == 1)
                                    zombie.setLocationAndAngles(this.xCoord + r.nextInt(5), this.yCoord, this.zCoord + r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                else
                                    zombie.setLocationAndAngles(this.xCoord - r.nextInt(5), this.yCoord, this.zCoord - r.nextInt(5), this.worldObj.rand.nextFloat() * 360.0F, 0.0F);
                                VRMEntityUtil.spawnInWorld(worldObj, zombie);
                            }

                        default:
                            break;

                    }
                }

            } else {
                time = 0;
                worldObj.setBlock(xCoord, yCoord, zCoord, BlockManager.swordStoneInactive);
                worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);

                float f = this.r.nextFloat() * 0.8F + 0.1F;
                float f1 = this.r.nextFloat() * 0.8F + 0.1F;
                float f2 = this.r.nextFloat() * 0.8F + 0.1F;

                EntityItem entityitem = new EntityItem(worldObj, (double) ((float) this.xCoord + f), (double) ((float) this.yCoord + f1), (double) ((float) this.zCoord + f2), new ItemStack(sword, 1));

                float f3 = 0.05F;
                entityitem.motionX = (double) ((float) this.r.nextGaussian() * f3);
                entityitem.motionY = (double) ((float) this.r.nextGaussian() * f3 + 0.2F);
                entityitem.motionZ = (double) ((float) this.r.nextGaussian() * f3);
                VRMEntityUtil.spawnInWorld(worldObj, entityitem);

            }

            if (breakThis) {
                worldObj.setBlock(xCoord, yCoord, zCoord, BlockManager.swordStoneVulcansRevenge);
                worldObj.markBlockForUpdate(xCoord, yCoord, zCoord);
                time = 0;
            }
        }
    }

}
