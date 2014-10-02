package com.hoopawolf.swordstone;

import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import org.lwjgl.opengl.GL11;

public class ItemSwordStoneInactiveRenderer implements IItemRenderer {
    private SwordStoneInactiveModel model;

    public ItemSwordStoneInactiveRenderer() {
        model = new SwordStoneInactiveModel();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        switch (type) {
            case EQUIPPED:
                return true;

            default:
                return false;
        }
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
        switch (type) {


            case EQUIPPED: {
                GL11.glPushMatrix();

                GL11.glRotatef(180F, 0F, 0F, 0F);

                GL11.glTranslatef(-.2F, -2.5F, -.3F);

                float scale = 1.6F;
                GL11.glScalef(scale, scale, scale);

                Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("/textures/swordstoneinactive.png"));
                model.render((Entity) data[1], 0F, 0F, 0F, 0F, 0F, 0.0625F);

                GL11.glPopMatrix();

            }


            default:
                break;
        }
    }


}