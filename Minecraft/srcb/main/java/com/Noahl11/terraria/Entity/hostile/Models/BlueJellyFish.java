package com.Noahl11.terraria.Entity.hostile.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class BlueJellyFish extends ModelBase{
	
	ModelRenderer legs;
	ModelRenderer body;
	
	//model
	int Height = 5;
	int Width1 = 1;
	int Width2 = 1;
	//location
	float height = 5;
	float width1 = 1;
	float width2 = 1;
	
	public BlueJellyFish() {
		textureHeight = 26;
		textureWidth = 28;
		
		legs = new ModelRenderer(this, 28, 26);
		legs.addBox(-1f, 0f, -2f, Width1, Height, Width2);
		legs.setRotationPoint(3f, 10f, 1f);
		legs.setTextureSize(textureWidth, textureHeight);
		legs.mirror = true;
		setRotation(legs, 0f, 0f, 0f);
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		legs.render(f5);
	}
	
	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
	
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.legs.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
        this.legs.rotateAngleY = 0.0F;
	}

}
