package com.hoopawolf.sword;

import com.hoopawolf.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class VulcansRevengeSwordWither extends ItemSword {

    public VulcansRevengeSwordWither(Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        setUnlocalizedName("vulcansRevengeSwordWither");
        setTextureName(Reference.MOD_ID + ":" + "vulcansrevengewither");
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
        par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.wither.id, 140, 10));
        par1ItemStack.damageItem(2, par3EntityLivingBase);
        return true;
    }

    @SideOnly(Side.CLIENT)
    public boolean isFull3D() {
        return true;
    }

    /**
     * returns the action that specifies what animation to play when the items is being used
     */
    public EnumAction getItemUseAction(ItemStack p_77661_1_) {
        return EnumAction.block;
    }

    /**
     * How long it takes to use or consume an item
     */
    public int getMaxItemUseDuration(ItemStack p_77626_1_) {
        return 72000;
    }


    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {

        p_77659_3_.setItemInUse(p_77659_1_, this.getMaxItemUseDuration(p_77659_1_));

        int damage;

        if (!p_77659_3_.capabilities.isCreativeMode && p_77659_3_.isSneaking()) {

            damage = p_77659_3_.inventory.getCurrentItem().getItemDamage();
            p_77659_1_.stackSize--;
            ItemStack newSword = new ItemStack(SwordManager.vulcansRevengeSword);
            newSword.setItemDamage(damage);
            p_77659_3_.inventory.addItemStackToInventory(newSword);

        /*PARTICLES CRASHES THE SERVER!!/*    if (p_77659_2_.isRemote) {
                Random rand = new Random();
                double d = rand.nextGaussian() * 0.004D;
                for (double i = 0; i <= 2; i++) {
                    Minecraft.getMinecraft().effectRenderer.addEffect(new EntityFlameParticleFX(p_77659_2_, p_77659_3_.posX,
                            p_77659_3_.posY + i - 0.5,
                            p_77659_3_.posZ, d, 0.5D));
                    Minecraft.getMinecraft().effectRenderer.addEffect(new EntityFlameParticleFX(p_77659_2_, p_77659_3_.posX,
                            p_77659_3_.posY + i - 0.5,
                            p_77659_3_.posZ, d, 0.5D));
                    Minecraft.getMinecraft().effectRenderer.addEffect(new EntityFlameParticleFX(p_77659_2_, p_77659_3_.posX,
                            p_77659_3_.posY + i - 0.5,
                            p_77659_3_.posZ, d, 0.5D));
                    Minecraft.getMinecraft().effectRenderer.addEffect(new EntityFlameParticleFX(p_77659_2_, p_77659_3_.posX,
                            p_77659_3_.posY + i - 0.5,
                            p_77659_3_.posZ, d, 0.5D));
                }
            }*/
        }

        return p_77659_1_;
    }

}
