package com.hoopawolf.sword;

import com.hoopawolf.lib.Reference;
import com.hoopawolf.particle.EntityFlameParticleFX;
import com.hoopawolf.vulcansrevenge.VulcansRevenge;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.Random;

public class VulcansRevengeSwordWither extends ItemSword {

    public VulcansRevengeSwordWither(Item.ToolMaterial par2EnumToolMaterial) {
        super(par2EnumToolMaterial);
        setUnlocalizedName("vulcansRevengeSwordWither");
        setCreativeTab(VulcansRevenge.tabVulcansRevenge);
        setTextureName(Reference.MOD_ID + ":" + "vulcansrevengewither");
    }

    @Override
    public boolean hitEntity(ItemStack par1ItemStack, EntityLivingBase par2EntityLivingBase, EntityLivingBase par3EntityLivingBase) {
        par2EntityLivingBase.addPotionEffect(new PotionEffect(Potion.wither.id, 140, 10));
        par1ItemStack.damageItem(2, par3EntityLivingBase);
        return true;
    }

    public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
        int damage;

        if (!p_77659_3_.capabilities.isCreativeMode) {

            damage = p_77659_3_.inventory.getCurrentItem().getItemDamage();
            p_77659_1_.stackSize--;
            ItemStack newSword = new ItemStack(SwordManager.vulcansRevengeSword);
            newSword.setItemDamage(damage);
            p_77659_3_.inventory.addItemStackToInventory(newSword);

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
        }

        return p_77659_1_;
    }

}