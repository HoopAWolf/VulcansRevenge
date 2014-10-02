package com.hoopawolf.swordstone;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SwordStoneVulcansRevengeModel extends ModelBase {
    //fields
    ModelRenderer Base_1;
    ModelRenderer Base_2;
    ModelRenderer Top_1;
    ModelRenderer Top_2;
    ModelRenderer Top_4;
    ModelRenderer Top_3;
    ModelRenderer SwordTip;
    ModelRenderer SwordTip2;
    ModelRenderer SwordTip1;
    ModelRenderer SwordTip3;
    ModelRenderer SwordTip4;
    ModelRenderer SwordCore1;
    ModelRenderer SwordCoreL1;
    ModelRenderer SwordCoreR1;
    ModelRenderer SwordCore2;
    ModelRenderer SwordCore3;
    ModelRenderer SwordCore4;
    ModelRenderer SwordCore5;
    ModelRenderer SwordCoreR2;
    ModelRenderer SwordCoreR3;
    ModelRenderer SwordCoreR4;
    ModelRenderer SwordCoreL2;
    ModelRenderer SwordCoreL3;
    ModelRenderer SwordCoreL4;
    ModelRenderer SwordCoreL5;
    ModelRenderer SwordSideL1;
    ModelRenderer SwordSideL2;
    ModelRenderer SwordSideL3;
    ModelRenderer SwordSideL4;
    ModelRenderer SwordSideR1;
    ModelRenderer SwordSideR2;
    ModelRenderer SwordSideR3;
    ModelRenderer SwordSideR4;
    ModelRenderer SwordCore6;
    ModelRenderer SwordCore7;
    ModelRenderer SwordCore8;
    ModelRenderer SwordCore9;
    ModelRenderer SwordCoreR5;
    ModelRenderer SwordCoreR6;
    ModelRenderer SwordCoreR7;
    ModelRenderer SwordCoreR8;
    ModelRenderer SwordCoreL6;
    ModelRenderer SwordCoreL7;
    ModelRenderer SwordCoreL8;
    ModelRenderer SwordSideR5;
    ModelRenderer SwordSideR6;
    ModelRenderer SwordSideR7;
    ModelRenderer SwordSideL5;
    ModelRenderer SwordSideL6;
    ModelRenderer SwordSideL7;
    ModelRenderer SwordHilt1;
    ModelRenderer SwordHilt2;
    ModelRenderer SwordHilt3;
    ModelRenderer SwordHilt4;
    ModelRenderer SwordHilt5;
    ModelRenderer SwordHilt6;
    ModelRenderer SwordHilt7;
    ModelRenderer SwordHilt8;
    ModelRenderer SwordHilt9;
    ModelRenderer SwordHilt10;
    ModelRenderer SwordHilt11;
    ModelRenderer SwordHilt12;
    ModelRenderer SwordHilt13;
    ModelRenderer SwordHilt14;
    ModelRenderer SwordHilt15;
    ModelRenderer SwordHilt16;
    ModelRenderer SwordHilt17;
    ModelRenderer SwordHilt18;
    ModelRenderer SwordHiltI1;
    ModelRenderer SwordHiltI2;
    ModelRenderer SwordHiltI3;
    ModelRenderer SwordHiltI4;
    ModelRenderer SwordHiltI5;
    ModelRenderer SwordHiltI6;
    ModelRenderer SwordHiltI7;
    ModelRenderer SwordHandle1;
    ModelRenderer SwordHandle2;
    ModelRenderer SwordHandle3;
    ModelRenderer SwordHandle4;
    ModelRenderer SwordCoreHandle1;
    ModelRenderer SwordCoreLHangle2;
    ModelRenderer SwordCoreHandle3;
    ModelRenderer SwordBall1;
    ModelRenderer SwordBall2;
    ModelRenderer SwordBall3;
    ModelRenderer SwordBall4;
    ModelRenderer SwordBall5;
    ModelRenderer SwordBall6;
    ModelRenderer SwordBall7;
    ModelRenderer SwordBallCore;

    public SwordStoneVulcansRevengeModel() {
        textureWidth = 32;
        textureHeight = 32;

        Base_1 = new ModelRenderer(this, 0, 0);
        Base_1.addBox(-3F, 23F, -4F, 5, 1, 8);
        Base_1.setRotationPoint(0F, 0F, 0F);
        Base_1.setTextureSize(32, 32);
        Base_1.mirror = true;
        setRotation(Base_1, 0F, 0F, 0F);
        Base_2 = new ModelRenderer(this, 0, 9);
        Base_2.addBox(-3F, 22F, -3F, 5, 1, 6);
        Base_2.setRotationPoint(0F, 0F, 0F);
        Base_2.setTextureSize(32, 32);
        Base_2.mirror = true;
        setRotation(Base_2, 0F, 0F, 0F);
        Top_1 = new ModelRenderer(this, 0, 16);
        Top_1.addBox(0F, 21F, -2F, 2, 1, 4);
        Top_1.setRotationPoint(0F, 0F, 0F);
        Top_1.setTextureSize(32, 32);
        Top_1.mirror = true;
        setRotation(Top_1, 0F, 0F, 0F);
        Top_2 = new ModelRenderer(this, 0, 16);
        Top_2.addBox(-3F, 21F, -2F, 2, 1, 4);
        Top_2.setRotationPoint(0F, 0F, 0F);
        Top_2.setTextureSize(32, 32);
        Top_2.mirror = true;
        setRotation(Top_2, 0F, 0F, 0F);
        Top_4 = new ModelRenderer(this, 0, 21);
        Top_4.addBox(-1F, 21F, 1F, 1, 1, 1);
        Top_4.setRotationPoint(0F, 0F, 0F);
        Top_4.setTextureSize(32, 32);
        Top_4.mirror = true;
        setRotation(Top_4, 0F, 0F, 0F);
        Top_3 = new ModelRenderer(this, 0, 21);
        Top_3.addBox(-1F, 21F, -2F, 1, 1, 1);
        Top_3.setRotationPoint(0F, 0F, 0F);
        Top_3.setTextureSize(32, 32);
        Top_3.mirror = true;
        setRotation(Top_3, 0F, 0F, 0F);
        SwordTip = new ModelRenderer(this, 0, 23);
        SwordTip.addBox(-1F, 14.5F, 14.5F, 1, 1, 1);
        SwordTip.setRotationPoint(0F, 0F, 0F);
        SwordTip.setTextureSize(32, 32);
        SwordTip.mirror = true;
        setRotation(SwordTip, -0.7853982F, 0F, 0F);
        SwordTip2 = new ModelRenderer(this, 0, 23);
        SwordTip2.addBox(-1F, 13.5F, 14.5F, 1, 1, 1);
        SwordTip2.setRotationPoint(0F, 0F, 0F);
        SwordTip2.setTextureSize(32, 32);
        SwordTip2.mirror = true;
        setRotation(SwordTip2, -0.7853982F, 0F, 0F);
        SwordTip1 = new ModelRenderer(this, 0, 23);
        SwordTip1.addBox(-1F, 14.5F, 13.5F, 1, 1, 1);
        SwordTip1.setRotationPoint(0F, 0F, 0F);
        SwordTip1.setTextureSize(32, 32);
        SwordTip1.mirror = true;
        setRotation(SwordTip1, -0.7853982F, 0F, 0F);
        SwordTip3 = new ModelRenderer(this, 0, 23);
        SwordTip3.addBox(-1F, 14.5F, 12.5F, 1, 1, 1);
        SwordTip3.setRotationPoint(0F, 0F, 0F);
        SwordTip3.setTextureSize(32, 32);
        SwordTip3.mirror = true;
        setRotation(SwordTip3, -0.7853982F, 0F, 0F);
        SwordTip4 = new ModelRenderer(this, 0, 23);
        SwordTip4.addBox(-1F, 12.5F, 14.5F, 1, 1, 1);
        SwordTip4.setRotationPoint(0F, 0F, 0F);
        SwordTip4.setTextureSize(32, 32);
        SwordTip4.mirror = true;
        setRotation(SwordTip4, -0.7853982F, 0F, 0F);
        SwordCore1 = new ModelRenderer(this, 12, 25);
        SwordCore1.addBox(-1F, 13.5F, 13.5F, 1, 1, 1);
        SwordCore1.setRotationPoint(0F, 0F, 0F);
        SwordCore1.setTextureSize(32, 32);
        SwordCore1.mirror = true;
        setRotation(SwordCore1, -0.7853982F, 0F, 0F);
        SwordCoreL1 = new ModelRenderer(this, 16, 23);
        SwordCoreL1.addBox(-1F, 13.5F, 12.5F, 1, 1, 1);
        SwordCoreL1.setRotationPoint(0F, 0F, 0F);
        SwordCoreL1.setTextureSize(32, 32);
        SwordCoreL1.mirror = true;
        setRotation(SwordCoreL1, -0.7853982F, 0F, 0F);
        SwordCoreR1 = new ModelRenderer(this, 16, 23);
        SwordCoreR1.addBox(-1F, 12.5F, 13.5F, 1, 1, 1);
        SwordCoreR1.setRotationPoint(0F, 0F, 0F);
        SwordCoreR1.setTextureSize(32, 32);
        SwordCoreR1.mirror = true;
        setRotation(SwordCoreR1, -0.7853982F, 0F, 0F);
        SwordCore2 = new ModelRenderer(this, 12, 25);
        SwordCore2.addBox(-1F, 12.5F, 12.5F, 1, 1, 1);
        SwordCore2.setRotationPoint(0F, 0F, 0F);
        SwordCore2.setTextureSize(32, 32);
        SwordCore2.mirror = true;
        setRotation(SwordCore2, -0.7853982F, 0F, 0F);
        SwordCore3 = new ModelRenderer(this, 12, 25);
        SwordCore3.addBox(-1F, 11.5F, 11.5F, 1, 1, 1);
        SwordCore3.setRotationPoint(0F, 0F, 0F);
        SwordCore3.setTextureSize(32, 32);
        SwordCore3.mirror = true;
        setRotation(SwordCore3, -0.7853982F, 0F, 0F);
        SwordCore4 = new ModelRenderer(this, 12, 25);
        SwordCore4.addBox(-1F, 10.5F, 10.5F, 1, 1, 1);
        SwordCore4.setRotationPoint(0F, 0F, 0F);
        SwordCore4.setTextureSize(32, 32);
        SwordCore4.mirror = true;
        setRotation(SwordCore4, -0.7853982F, 0F, 0F);
        SwordCore5 = new ModelRenderer(this, 12, 25);
        SwordCore5.addBox(-1F, 9.5F, 9.5F, 1, 1, 1);
        SwordCore5.setRotationPoint(0F, 0F, 0F);
        SwordCore5.setTextureSize(32, 32);
        SwordCore5.mirror = true;
        setRotation(SwordCore5, -0.7853982F, 0F, 0F);
        SwordCoreR2 = new ModelRenderer(this, 16, 23);
        SwordCoreR2.addBox(-1F, 11.5F, 12.5F, 1, 1, 1);
        SwordCoreR2.setRotationPoint(0F, 0F, 0F);
        SwordCoreR2.setTextureSize(32, 32);
        SwordCoreR2.mirror = true;
        setRotation(SwordCoreR2, -0.7853982F, 0F, 0F);
        SwordCoreR3 = new ModelRenderer(this, 16, 23);
        SwordCoreR3.addBox(-1F, 10.5F, 11.5F, 1, 1, 1);
        SwordCoreR3.setRotationPoint(0F, 0F, 0F);
        SwordCoreR3.setTextureSize(32, 32);
        SwordCoreR3.mirror = true;
        setRotation(SwordCoreR3, -0.7853982F, 0F, 0F);
        SwordCoreR4 = new ModelRenderer(this, 16, 23);
        SwordCoreR4.addBox(-1F, 9.5F, 10.5F, 1, 1, 1);
        SwordCoreR4.setRotationPoint(0F, 0F, 0F);
        SwordCoreR4.setTextureSize(32, 32);
        SwordCoreR4.mirror = true;
        setRotation(SwordCoreR4, -0.7853982F, 0F, 0F);
        SwordCoreL2 = new ModelRenderer(this, 16, 23);
        SwordCoreL2.addBox(-1F, 12.5F, 11.5F, 1, 1, 1);
        SwordCoreL2.setRotationPoint(0F, 0F, 0F);
        SwordCoreL2.setTextureSize(32, 32);
        SwordCoreL2.mirror = true;
        setRotation(SwordCoreL2, -0.7853982F, 0F, 0F);
        SwordCoreL3 = new ModelRenderer(this, 16, 23);
        SwordCoreL3.addBox(-1F, 11.5F, 10.5F, 1, 1, 1);
        SwordCoreL3.setRotationPoint(0F, 0F, 0F);
        SwordCoreL3.setTextureSize(32, 32);
        SwordCoreL3.mirror = true;
        setRotation(SwordCoreL3, -0.7853982F, 0F, 0F);
        SwordCoreL4 = new ModelRenderer(this, 16, 23);
        SwordCoreL4.addBox(-1F, 10.5F, 9.5F, 1, 1, 1);
        SwordCoreL4.setRotationPoint(0F, 0F, 0F);
        SwordCoreL4.setTextureSize(32, 32);
        SwordCoreL4.mirror = true;
        setRotation(SwordCoreL4, -0.7853982F, 0F, 0F);
        SwordCoreL5 = new ModelRenderer(this, 16, 23);
        SwordCoreL5.addBox(-1F, 9.5F, 8.5F, 1, 1, 1);
        SwordCoreL5.setRotationPoint(0F, 0F, 0F);
        SwordCoreL5.setTextureSize(32, 32);
        SwordCoreL5.mirror = true;
        setRotation(SwordCoreL5, -0.7853982F, 0F, 0F);
        SwordSideL1 = new ModelRenderer(this, 0, 25);
        SwordSideL1.addBox(-1F, 13.5F, 11.5F, 1, 1, 1);
        SwordSideL1.setRotationPoint(0F, 0F, 0F);
        SwordSideL1.setTextureSize(32, 32);
        SwordSideL1.mirror = true;
        setRotation(SwordSideL1, -0.7853982F, 0F, 0F);
        SwordSideL2 = new ModelRenderer(this, 0, 25);
        SwordSideL2.addBox(-1F, 12.5F, 10.5F, 1, 1, 1);
        SwordSideL2.setRotationPoint(0F, 0F, 0F);
        SwordSideL2.setTextureSize(32, 32);
        SwordSideL2.mirror = true;
        setRotation(SwordSideL2, -0.7853982F, 0F, 0F);
        SwordSideL3 = new ModelRenderer(this, 4, 23);
        SwordSideL3.addBox(-1F, 11.5F, 9.5F, 1, 1, 1);
        SwordSideL3.setRotationPoint(0F, 0F, 0F);
        SwordSideL3.setTextureSize(32, 32);
        SwordSideL3.mirror = true;
        setRotation(SwordSideL3, -0.7853982F, 0F, 0F);
        SwordSideL4 = new ModelRenderer(this, 4, 23);
        SwordSideL4.addBox(-1F, 10.5F, 8.5F, 1, 1, 1);
        SwordSideL4.setRotationPoint(0F, 0F, 0F);
        SwordSideL4.setTextureSize(32, 32);
        SwordSideL4.mirror = true;
        setRotation(SwordSideL4, -0.7853982F, 0F, 0F);
        SwordSideR1 = new ModelRenderer(this, 0, 25);
        SwordSideR1.addBox(-1F, 11.5F, 13.5F, 1, 1, 1);
        SwordSideR1.setRotationPoint(0F, 0F, 0F);
        SwordSideR1.setTextureSize(32, 32);
        SwordSideR1.mirror = true;
        setRotation(SwordSideR1, -0.7853982F, 0F, 0F);
        SwordSideR2 = new ModelRenderer(this, 0, 25);
        SwordSideR2.addBox(-1F, 10.5F, 12.5F, 1, 1, 1);
        SwordSideR2.setRotationPoint(0F, 0F, 0F);
        SwordSideR2.setTextureSize(32, 32);
        SwordSideR2.mirror = true;
        setRotation(SwordSideR2, -0.7853982F, 0F, 0F);
        SwordSideR3 = new ModelRenderer(this, 4, 23);
        SwordSideR3.addBox(-1F, 9.5F, 11.5F, 1, 1, 1);
        SwordSideR3.setRotationPoint(0F, 0F, 0F);
        SwordSideR3.setTextureSize(32, 32);
        SwordSideR3.mirror = true;
        setRotation(SwordSideR3, -0.7853982F, 0F, 0F);
        SwordSideR4 = new ModelRenderer(this, 4, 23);
        SwordSideR4.addBox(-1F, 8.5F, 10.5F, 1, 1, 1);
        SwordSideR4.setRotationPoint(0F, 0F, 0F);
        SwordSideR4.setTextureSize(32, 32);
        SwordSideR4.mirror = true;
        setRotation(SwordSideR4, -0.7853982F, 0F, 0F);
        SwordCore6 = new ModelRenderer(this, 12, 25);
        SwordCore6.addBox(-1F, 8.5F, 8.5F, 1, 1, 1);
        SwordCore6.setRotationPoint(0F, 0F, 0F);
        SwordCore6.setTextureSize(32, 32);
        SwordCore6.mirror = true;
        setRotation(SwordCore6, -0.7853982F, 0F, 0F);
        SwordCore7 = new ModelRenderer(this, 12, 25);
        SwordCore7.addBox(-1F, 7.5F, 7.52F, 1, 1, 1);
        SwordCore7.setRotationPoint(0F, 0F, 0F);
        SwordCore7.setTextureSize(32, 32);
        SwordCore7.mirror = true;
        setRotation(SwordCore7, -0.7853982F, 0F, 0F);
        SwordCore8 = new ModelRenderer(this, 12, 25);
        SwordCore8.addBox(-1F, 6.5F, 6.5F, 1, 1, 1);
        SwordCore8.setRotationPoint(0F, 0F, 0F);
        SwordCore8.setTextureSize(32, 32);
        SwordCore8.mirror = true;
        setRotation(SwordCore8, -0.7853982F, 0F, 0F);
        SwordCore9 = new ModelRenderer(this, 12, 25);
        SwordCore9.addBox(-1F, 5.5F, 5.5F, 1, 1, 1);
        SwordCore9.setRotationPoint(0F, 0F, 0F);
        SwordCore9.setTextureSize(32, 32);
        SwordCore9.mirror = true;
        setRotation(SwordCore9, -0.7853982F, 0F, 0F);
        SwordCoreR5 = new ModelRenderer(this, 16, 23);
        SwordCoreR5.addBox(-1F, 8.5F, 9.5F, 1, 1, 1);
        SwordCoreR5.setRotationPoint(0F, 0F, 0F);
        SwordCoreR5.setTextureSize(32, 32);
        SwordCoreR5.mirror = true;
        setRotation(SwordCoreR5, -0.7853982F, 0F, 0F);
        SwordCoreR6 = new ModelRenderer(this, 16, 23);
        SwordCoreR6.addBox(-1F, 7.5F, 8.5F, 1, 1, 1);
        SwordCoreR6.setRotationPoint(0F, 0F, 0F);
        SwordCoreR6.setTextureSize(32, 32);
        SwordCoreR6.mirror = true;
        setRotation(SwordCoreR6, -0.7853982F, 0F, 0F);
        SwordCoreR7 = new ModelRenderer(this, 16, 23);
        SwordCoreR7.addBox(-1F, 6.5F, 7.5F, 1, 1, 1);
        SwordCoreR7.setRotationPoint(0F, 0F, 0F);
        SwordCoreR7.setTextureSize(32, 32);
        SwordCoreR7.mirror = true;
        setRotation(SwordCoreR7, -0.7853982F, 0F, 0F);
        SwordCoreR8 = new ModelRenderer(this, 16, 23);
        SwordCoreR8.addBox(-1F, 5.5F, 6.5F, 1, 1, 1);
        SwordCoreR8.setRotationPoint(0F, 0F, 0F);
        SwordCoreR8.setTextureSize(32, 32);
        SwordCoreR8.mirror = true;
        setRotation(SwordCoreR8, -0.7853982F, 0F, 0F);
        SwordCoreL6 = new ModelRenderer(this, 16, 23);
        SwordCoreL6.addBox(-1F, 8.5F, 7.5F, 1, 1, 1);
        SwordCoreL6.setRotationPoint(0F, 0F, 0F);
        SwordCoreL6.setTextureSize(32, 32);
        SwordCoreL6.mirror = true;
        setRotation(SwordCoreL6, -0.7853982F, 0F, 0F);
        SwordCoreL7 = new ModelRenderer(this, 16, 23);
        SwordCoreL7.addBox(-1F, 7.5F, 6.5F, 1, 1, 1);
        SwordCoreL7.setRotationPoint(0F, 0F, 0F);
        SwordCoreL7.setTextureSize(32, 32);
        SwordCoreL7.mirror = true;
        setRotation(SwordCoreL7, -0.7853982F, 0F, 0F);
        SwordCoreL8 = new ModelRenderer(this, 16, 23);
        SwordCoreL8.addBox(-1F, 6.5F, 5.5F, 1, 1, 1);
        SwordCoreL8.setRotationPoint(0F, 0F, 0F);
        SwordCoreL8.setTextureSize(32, 32);
        SwordCoreL8.mirror = true;
        setRotation(SwordCoreL8, -0.7853982F, 0F, 0F);
        SwordSideR5 = new ModelRenderer(this, 4, 25);
        SwordSideR5.addBox(-1F, 7.5F, 9.5F, 1, 1, 1);
        SwordSideR5.setRotationPoint(0F, 0F, 0F);
        SwordSideR5.setTextureSize(32, 32);
        SwordSideR5.mirror = true;
        setRotation(SwordSideR5, -0.7853982F, 0F, 0F);
        SwordSideR6 = new ModelRenderer(this, 4, 25);
        SwordSideR6.addBox(-1F, 6.5F, 8.5F, 1, 1, 1);
        SwordSideR6.setRotationPoint(0F, 0F, 0F);
        SwordSideR6.setTextureSize(32, 32);
        SwordSideR6.mirror = true;
        setRotation(SwordSideR6, -0.7853982F, 0F, 0F);
        SwordSideR7 = new ModelRenderer(this, 8, 23);
        SwordSideR7.addBox(-1F, 5.5F, 7.5F, 1, 1, 1);
        SwordSideR7.setRotationPoint(0F, 0F, 0F);
        SwordSideR7.setTextureSize(32, 32);
        SwordSideR7.mirror = true;
        setRotation(SwordSideR7, -0.7853982F, 0F, 0F);
        SwordSideL5 = new ModelRenderer(this, 4, 25);
        SwordSideL5.addBox(-1F, 9.5F, 7.5F, 1, 1, 1);
        SwordSideL5.setRotationPoint(0F, 0F, 0F);
        SwordSideL5.setTextureSize(32, 32);
        SwordSideL5.mirror = true;
        setRotation(SwordSideL5, -0.7853982F, 0F, 0F);
        SwordSideL6 = new ModelRenderer(this, 4, 25);
        SwordSideL6.addBox(-1F, 8.5F, 6.5F, 1, 1, 1);
        SwordSideL6.setRotationPoint(0F, 0F, 0F);
        SwordSideL6.setTextureSize(32, 32);
        SwordSideL6.mirror = true;
        setRotation(SwordSideL6, -0.7853982F, 0F, 0F);
        SwordSideL7 = new ModelRenderer(this, 8, 23);
        SwordSideL7.addBox(-1F, 7.5F, 5.5F, 1, 1, 1);
        SwordSideL7.setRotationPoint(0F, 0F, 0F);
        SwordSideL7.setTextureSize(32, 32);
        SwordSideL7.mirror = true;
        setRotation(SwordSideL7, -0.7853982F, 0F, 0F);
        SwordHilt1 = new ModelRenderer(this, 8, 25);
        SwordHilt1.addBox(-1F, 4.5F, 6.5F, 1, 1, 1);
        SwordHilt1.setRotationPoint(0F, 0F, 0F);
        SwordHilt1.setTextureSize(32, 32);
        SwordHilt1.mirror = true;
        setRotation(SwordHilt1, -0.7853982F, 0F, 0F);
        SwordHilt2 = new ModelRenderer(this, 8, 25);
        SwordHilt2.addBox(-1F, 4.5F, 5.5F, 1, 1, 1);
        SwordHilt2.setRotationPoint(0F, 0F, 0F);
        SwordHilt2.setTextureSize(32, 32);
        SwordHilt2.mirror = true;
        setRotation(SwordHilt2, -0.7853982F, 0F, 0F);
        SwordHilt3 = new ModelRenderer(this, 8, 25);
        SwordHilt3.addBox(-1F, 5.5F, 4.5F, 1, 1, 1);
        SwordHilt3.setRotationPoint(0F, 0F, 0F);
        SwordHilt3.setTextureSize(32, 32);
        SwordHilt3.mirror = true;
        setRotation(SwordHilt3, -0.7853982F, 0F, 0F);
        SwordHilt4 = new ModelRenderer(this, 8, 25);
        SwordHilt4.addBox(-1F, 6.5F, 4.5F, 1, 1, 1);
        SwordHilt4.setRotationPoint(0F, 0F, 0F);
        SwordHilt4.setTextureSize(32, 32);
        SwordHilt4.mirror = true;
        setRotation(SwordHilt4, -0.7853982F, 0F, 0F);
        SwordHilt5 = new ModelRenderer(this, 8, 25);
        SwordHilt5.addBox(-1F, 3.5F, 7.5F, 1, 1, 1);
        SwordHilt5.setRotationPoint(0F, 0F, 0F);
        SwordHilt5.setTextureSize(32, 32);
        SwordHilt5.mirror = true;
        setRotation(SwordHilt5, -0.7853982F, 0F, 0F);
        SwordHilt6 = new ModelRenderer(this, 8, 25);
        SwordHilt6.addBox(-1F, 7.5F, 3.5F, 1, 1, 1);
        SwordHilt6.setRotationPoint(0F, 0F, 0F);
        SwordHilt6.setTextureSize(32, 32);
        SwordHilt6.mirror = true;
        setRotation(SwordHilt6, -0.7853982F, 0F, 0F);
        SwordHilt7 = new ModelRenderer(this, 8, 25);
        SwordHilt7.addBox(-1F, 8.5F, 2.5F, 1, 1, 1);
        SwordHilt7.setRotationPoint(0F, 0F, 0F);
        SwordHilt7.setTextureSize(32, 32);
        SwordHilt7.mirror = true;
        setRotation(SwordHilt7, -0.7853982F, 0F, 0F);
        SwordHilt8 = new ModelRenderer(this, 8, 25);
        SwordHilt8.addBox(-1F, 2.5F, 8.5F, 1, 1, 1);
        SwordHilt8.setRotationPoint(0F, 0F, 0F);
        SwordHilt8.setTextureSize(32, 32);
        SwordHilt8.mirror = true;
        setRotation(SwordHilt8, -0.7853982F, 0F, 0F);
        SwordHilt9 = new ModelRenderer(this, 8, 25);
        SwordHilt9.addBox(-1F, 8.5F, 1.5F, 1, 1, 1);
        SwordHilt9.setRotationPoint(0F, 0F, 0F);
        SwordHilt9.setTextureSize(32, 32);
        SwordHilt9.mirror = true;
        setRotation(SwordHilt9, -0.7853982F, 0F, 0F);
        SwordHilt10 = new ModelRenderer(this, 8, 25);
        SwordHilt10.addBox(-1F, 1.5F, 8.5F, 1, 1, 1);
        SwordHilt10.setRotationPoint(0F, 0F, 0F);
        SwordHilt10.setTextureSize(32, 32);
        SwordHilt10.mirror = true;
        setRotation(SwordHilt10, -0.7853982F, 0F, 0F);
        SwordHilt11 = new ModelRenderer(this, 8, 25);
        SwordHilt11.addBox(-1F, 1.5F, 7.5F, 1, 1, 1);
        SwordHilt11.setRotationPoint(0F, 0F, 0F);
        SwordHilt11.setTextureSize(32, 32);
        SwordHilt11.mirror = true;
        setRotation(SwordHilt11, -0.7853982F, 0F, 0F);
        SwordHilt12 = new ModelRenderer(this, 8, 25);
        SwordHilt12.addBox(-1F, 7.5F, 1.5F, 1, 1, 1);
        SwordHilt12.setRotationPoint(0F, 0F, 0F);
        SwordHilt12.setTextureSize(32, 32);
        SwordHilt12.mirror = true;
        setRotation(SwordHilt12, -0.7853982F, 0F, 0F);
        SwordHilt13 = new ModelRenderer(this, 8, 25);
        SwordHilt13.addBox(-1F, 6.5F, 2.5F, 1, 1, 1);
        SwordHilt13.setRotationPoint(0F, 0F, 0F);
        SwordHilt13.setTextureSize(32, 32);
        SwordHilt13.mirror = true;
        setRotation(SwordHilt13, -0.7853982F, 0F, 0F);
        SwordHilt14 = new ModelRenderer(this, 8, 25);
        SwordHilt14.addBox(-1F, 2.5F, 6.5F, 1, 1, 1);
        SwordHilt14.setRotationPoint(0F, 0F, 0F);
        SwordHilt14.setTextureSize(32, 32);
        SwordHilt14.mirror = true;
        setRotation(SwordHilt14, -0.7853982F, 0F, 0F);
        SwordHilt15 = new ModelRenderer(this, 8, 25);
        SwordHilt15.addBox(-1F, 5.5F, 2.5F, 1, 1, 1);
        SwordHilt15.setRotationPoint(0F, 0F, 0F);
        SwordHilt15.setTextureSize(32, 32);
        SwordHilt15.mirror = true;
        setRotation(SwordHilt15, -0.7853982F, 0F, 0F);
        SwordHilt16 = new ModelRenderer(this, 8, 25);
        SwordHilt16.addBox(-1F, 2.5F, 5.5F, 1, 1, 1);
        SwordHilt16.setRotationPoint(0F, 0F, 0F);
        SwordHilt16.setTextureSize(32, 32);
        SwordHilt16.mirror = true;
        setRotation(SwordHilt16, -0.7853982F, 0F, 0F);
        SwordHilt17 = new ModelRenderer(this, 8, 25);
        SwordHilt17.addBox(-1F, 4.5F, 3.5F, 1, 1, 1);
        SwordHilt17.setRotationPoint(0F, 0F, 0F);
        SwordHilt17.setTextureSize(32, 32);
        SwordHilt17.mirror = true;
        setRotation(SwordHilt17, -0.7853982F, 0F, 0F);
        SwordHilt18 = new ModelRenderer(this, 8, 25);
        SwordHilt18.addBox(-1F, 3.5F, 4.5F, 1, 1, 1);
        SwordHilt18.setRotationPoint(0F, 0F, 0F);
        SwordHilt18.setTextureSize(32, 32);
        SwordHilt18.mirror = true;
        setRotation(SwordHilt18, -0.7853982F, 0F, 0F);
        SwordHiltI1 = new ModelRenderer(this, 12, 23);
        SwordHiltI1.addBox(-1F, 6.5F, 3.5F, 1, 1, 1);
        SwordHiltI1.setRotationPoint(0F, 0F, 0F);
        SwordHiltI1.setTextureSize(32, 32);
        SwordHiltI1.mirror = true;
        setRotation(SwordHiltI1, -0.7853982F, 0F, 0F);
        SwordHiltI2 = new ModelRenderer(this, 12, 23);
        SwordHiltI2.addBox(-1F, 7.5F, 2.5F, 1, 1, 1);
        SwordHiltI2.setRotationPoint(0F, 0F, 0F);
        SwordHiltI2.setTextureSize(32, 32);
        SwordHiltI2.mirror = true;
        setRotation(SwordHiltI2, -0.7853982F, 0F, 0F);
        SwordHiltI3 = new ModelRenderer(this, 12, 23);
        SwordHiltI3.addBox(-1F, 2.5F, 7.5F, 1, 1, 1);
        SwordHiltI3.setRotationPoint(0F, 0F, 0F);
        SwordHiltI3.setTextureSize(32, 32);
        SwordHiltI3.mirror = true;
        setRotation(SwordHiltI3, -0.7853982F, 0F, 0F);
        SwordHiltI4 = new ModelRenderer(this, 12, 23);
        SwordHiltI4.addBox(-1F, 3.5F, 6.5F, 1, 1, 1);
        SwordHiltI4.setRotationPoint(0F, 0F, 0F);
        SwordHiltI4.setTextureSize(32, 32);
        SwordHiltI4.mirror = true;
        setRotation(SwordHiltI4, -0.7853982F, 0F, 0F);
        SwordHiltI5 = new ModelRenderer(this, 12, 23);
        SwordHiltI5.addBox(-1F, 5.5F, 3.5F, 1, 1, 1);
        SwordHiltI5.setRotationPoint(0F, 0F, 0F);
        SwordHiltI5.setTextureSize(32, 32);
        SwordHiltI5.mirror = true;
        setRotation(SwordHiltI5, -0.7853982F, 0F, 0F);
        SwordHiltI6 = new ModelRenderer(this, 12, 23);
        SwordHiltI6.addBox(-1F, 3.5F, 5.5F, 1, 1, 1);
        SwordHiltI6.setRotationPoint(0F, 0F, 0F);
        SwordHiltI6.setTextureSize(32, 32);
        SwordHiltI6.mirror = true;
        setRotation(SwordHiltI6, -0.7853982F, 0F, 0F);
        SwordHiltI7 = new ModelRenderer(this, 12, 23);
        SwordHiltI7.addBox(-1F, 4.5F, 4.5F, 1, 1, 1);
        SwordHiltI7.setRotationPoint(0F, 0F, 0F);
        SwordHiltI7.setTextureSize(32, 32);
        SwordHiltI7.mirror = true;
        setRotation(SwordHiltI7, -0.7853982F, 0F, 0F);
        SwordHandle1 = new ModelRenderer(this, 24, 23);
        SwordHandle1.addBox(-1F, 3.5F, 2.5F, 1, 1, 1);
        SwordHandle1.setRotationPoint(0F, 0F, 0F);
        SwordHandle1.setTextureSize(32, 32);
        SwordHandle1.mirror = true;
        setRotation(SwordHandle1, -0.7853982F, 0F, 0F);
        SwordHandle2 = new ModelRenderer(this, 16, 25);
        SwordHandle2.addBox(-1F, 2.5F, 3.5F, 1, 1, 1);
        SwordHandle2.setRotationPoint(0F, 0F, 0F);
        SwordHandle2.setTextureSize(32, 32);
        SwordHandle2.mirror = true;
        setRotation(SwordHandle2, -0.7853982F, 0F, 0F);
        SwordHandle3 = new ModelRenderer(this, 24, 23);
        SwordHandle3.addBox(-1F, 2.5F, 1.5F, 1, 1, 1);
        SwordHandle3.setRotationPoint(0F, 0F, 0F);
        SwordHandle3.setTextureSize(32, 32);
        SwordHandle3.mirror = true;
        setRotation(SwordHandle3, -0.7853982F, 0F, 0F);
        SwordHandle4 = new ModelRenderer(this, 16, 25);
        SwordHandle4.addBox(-1F, 1.5F, 2.5F, 1, 1, 1);
        SwordHandle4.setRotationPoint(0F, 0F, 0F);
        SwordHandle4.setTextureSize(32, 32);
        SwordHandle4.mirror = true;
        setRotation(SwordHandle4, -0.7853982F, 0F, 0F);
        SwordCoreHandle1 = new ModelRenderer(this, 20, 25);
        SwordCoreHandle1.addBox(-1F, 3.5F, 3.5F, 1, 1, 1);
        SwordCoreHandle1.setRotationPoint(0F, 0F, 0F);
        SwordCoreHandle1.setTextureSize(32, 32);
        SwordCoreHandle1.mirror = true;
        setRotation(SwordCoreHandle1, -0.7853982F, 0F, 0F);
        SwordCoreLHangle2 = new ModelRenderer(this, 20, 23);
        SwordCoreLHangle2.addBox(-1F, 2.5F, 2.5F, 1, 1, 1);
        SwordCoreLHangle2.setRotationPoint(0F, 0F, 0F);
        SwordCoreLHangle2.setTextureSize(32, 32);
        SwordCoreLHangle2.mirror = true;
        setRotation(SwordCoreLHangle2, -0.7853982F, 0F, 0F);
        SwordCoreHandle3 = new ModelRenderer(this, 20, 25);
        SwordCoreHandle3.addBox(-1F, 1.5F, 1.5F, 1, 1, 1);
        SwordCoreHandle3.setRotationPoint(0F, 0F, 0F);
        SwordCoreHandle3.setTextureSize(32, 32);
        SwordCoreHandle3.mirror = true;
        setRotation(SwordCoreHandle3, -0.7853982F, 0F, 0F);
        SwordBall1 = new ModelRenderer(this, 8, 25);
        SwordBall1.addBox(-1F, 1.5F, 0.5F, 1, 1, 1);
        SwordBall1.setRotationPoint(0F, 0F, 0F);
        SwordBall1.setTextureSize(32, 32);
        SwordBall1.mirror = true;
        setRotation(SwordBall1, -0.7853982F, 0F, 0F);
        SwordBall2 = new ModelRenderer(this, 8, 25);
        SwordBall2.addBox(-1F, 1.5F, -0.5F, 1, 1, 1);
        SwordBall2.setRotationPoint(0F, 0F, 0F);
        SwordBall2.setTextureSize(32, 32);
        SwordBall2.mirror = true;
        setRotation(SwordBall2, -0.7853982F, 0F, 0F);
        SwordBall3 = new ModelRenderer(this, 8, 25);
        SwordBall3.addBox(-1F, 0.5F, -0.5F, 1, 1, 1);
        SwordBall3.setRotationPoint(0F, 0F, 0F);
        SwordBall3.setTextureSize(32, 32);
        SwordBall3.mirror = true;
        setRotation(SwordBall3, -0.7853982F, 0F, 0F);
        SwordBall4 = new ModelRenderer(this, 8, 25);
        SwordBall4.addBox(-1F, -0.5F, -0.5F, 1, 1, 1);
        SwordBall4.setRotationPoint(0F, 0F, 0F);
        SwordBall4.setTextureSize(32, 32);
        SwordBall4.mirror = true;
        setRotation(SwordBall4, -0.7853982F, 0F, 0F);
        SwordBall5 = new ModelRenderer(this, 8, 25);
        SwordBall5.addBox(-1F, -0.5F, 0.5F, 1, 1, 1);
        SwordBall5.setRotationPoint(0F, 0F, 0F);
        SwordBall5.setTextureSize(32, 32);
        SwordBall5.mirror = true;
        setRotation(SwordBall5, -0.7853982F, 0F, 0F);
        SwordBall6 = new ModelRenderer(this, 8, 25);
        SwordBall6.addBox(-1F, -0.5F, 1.5F, 1, 1, 1);
        SwordBall6.setRotationPoint(0F, 0F, 0F);
        SwordBall6.setTextureSize(32, 32);
        SwordBall6.mirror = true;
        setRotation(SwordBall6, -0.7853982F, 0F, 0F);
        SwordBall7 = new ModelRenderer(this, 8, 25);
        SwordBall7.addBox(-1F, 0.5F, 1.5F, 1, 1, 1);
        SwordBall7.setRotationPoint(0F, 0F, 0F);
        SwordBall7.setTextureSize(32, 32);
        SwordBall7.mirror = true;
        setRotation(SwordBall7, -0.7853982F, 0F, 0F);
        SwordBallCore = new ModelRenderer(this, 12, 23);
        SwordBallCore.addBox(-1F, 0.5F, 0.5F, 1, 1, 1);
        SwordBallCore.setRotationPoint(0F, 0F, 0F);
        SwordBallCore.setTextureSize(32, 32);
        SwordBallCore.mirror = true;
        setRotation(SwordBallCore, -0.7853982F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Base_1.render(f5);
        Base_2.render(f5);
        Top_1.render(f5);
        Top_2.render(f5);
        Top_4.render(f5);
        Top_3.render(f5);
        SwordTip.render(f5);
        SwordTip2.render(f5);
        SwordTip1.render(f5);
        SwordTip3.render(f5);
        SwordTip4.render(f5);
        SwordCore1.render(f5);
        SwordCoreL1.render(f5);
        SwordCoreR1.render(f5);
        SwordCore2.render(f5);
        SwordCore3.render(f5);
        SwordCore4.render(f5);
        SwordCore5.render(f5);
        SwordCoreR2.render(f5);
        SwordCoreR3.render(f5);
        SwordCoreR4.render(f5);
        SwordCoreL2.render(f5);
        SwordCoreL3.render(f5);
        SwordCoreL4.render(f5);
        SwordCoreL5.render(f5);
        SwordSideL1.render(f5);
        SwordSideL2.render(f5);
        SwordSideL3.render(f5);
        SwordSideL4.render(f5);
        SwordSideR1.render(f5);
        SwordSideR2.render(f5);
        SwordSideR3.render(f5);
        SwordSideR4.render(f5);
        SwordCore6.render(f5);
        SwordCore7.render(f5);
        SwordCore8.render(f5);
        SwordCore9.render(f5);
        SwordCoreR5.render(f5);
        SwordCoreR6.render(f5);
        SwordCoreR7.render(f5);
        SwordCoreR8.render(f5);
        SwordCoreL6.render(f5);
        SwordCoreL7.render(f5);
        SwordCoreL8.render(f5);
        SwordSideR5.render(f5);
        SwordSideR6.render(f5);
        SwordSideR7.render(f5);
        SwordSideL5.render(f5);
        SwordSideL6.render(f5);
        SwordSideL7.render(f5);
        SwordHilt1.render(f5);
        SwordHilt2.render(f5);
        SwordHilt3.render(f5);
        SwordHilt4.render(f5);
        SwordHilt5.render(f5);
        SwordHilt6.render(f5);
        SwordHilt7.render(f5);
        SwordHilt8.render(f5);
        SwordHilt9.render(f5);
        SwordHilt10.render(f5);
        SwordHilt11.render(f5);
        SwordHilt12.render(f5);
        SwordHilt13.render(f5);
        SwordHilt14.render(f5);
        SwordHilt15.render(f5);
        SwordHilt16.render(f5);
        SwordHilt17.render(f5);
        SwordHilt18.render(f5);
        SwordHiltI1.render(f5);
        SwordHiltI2.render(f5);
        SwordHiltI3.render(f5);
        SwordHiltI4.render(f5);
        SwordHiltI5.render(f5);
        SwordHiltI6.render(f5);
        SwordHiltI7.render(f5);
        SwordHandle1.render(f5);
        SwordHandle2.render(f5);
        SwordHandle3.render(f5);
        SwordHandle4.render(f5);
        SwordCoreHandle1.render(f5);
        SwordCoreLHangle2.render(f5);
        SwordCoreHandle3.render(f5);
        SwordBall1.render(f5);
        SwordBall2.render(f5);
        SwordBall3.render(f5);
        SwordBall4.render(f5);
        SwordBall5.render(f5);
        SwordBall6.render(f5);
        SwordBall7.render(f5);
        SwordBallCore.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}