package com.Noahl11.terraria.Entity.hostile.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class Blue_Slime extends ModelBase{
	
	ModelRenderer slice;
	ModelRenderer slice1;
	ModelRenderer slice2;
	ModelRenderer slice3;
	ModelRenderer slice4;
	ModelRenderer slice5;
	ModelRenderer slice6;
	
	
	//model
	int Height = 2;
	int Width1 = 15;
	int Width2 = 15;
	//location
	float height = 5;
	float width1 = 1;
	float width2 = 1;
	
	public Blue_Slime() {
		textureHeight = 32;
		textureWidth = 64;
		
		slice = new ModelRenderer(this, 0, 0);
		slice.addBox(0f, 0f, 0f, 11, 1, 11); // location relative to entity x y z size width height width
		slice.setRotationPoint(0f, 22f, 0f);
		slice.setTextureSize(textureWidth, textureHeight);
		slice.mirror = true;
		setRotation(slice, 0f, 0f, 0f);
		
		slice1 = new ModelRenderer(this, 0, 0);
		slice1.addBox(-1f, -1f, -1f, 13, 1, 13);
		slice1.setRotationPoint(0f, 22f, 0f);
		slice1.setTextureSize(textureWidth, textureHeight);
		slice1.mirror = true;
		setRotation(slice1, 0f, 0f, 0f);
		
		slice2 = new ModelRenderer(this, 0, 0);
		slice2.addBox(-2f, -5f, -2f, 15, 4, 15);
		slice2.setRotationPoint(0f, 22f, 0f);
		slice2.setTextureSize(textureWidth, textureHeight);
		slice2.mirror = true;
		setRotation(slice2, 0f, 0f, 0f);
		
		slice3 = new ModelRenderer(this, 0, 0);
		slice3.addBox(-1f, -7f, -1f, 13, 2, 13);
		slice3.setRotationPoint(0f, 22f, 0f);
		slice3.setTextureSize(textureWidth, textureHeight);
		slice3.mirror = true;
		setRotation(slice3, 0f, 0f, 0f);
		
		slice4 = new ModelRenderer(this, 0, 0);
		slice4.addBox(0f, -8f, 0f, 11, 1, 11);
		slice4.setRotationPoint(0f, 22f, 0f);
		slice4.setTextureSize(textureWidth, textureHeight);
		slice4.mirror = true;
		setRotation(slice4, 0f, 0f, 0f);
		
		slice5 = new ModelRenderer(this, 0, 0);
		slice5.addBox(1f, -9f, 1f, 9, 1, 9);
		slice5.setRotationPoint(0f, 22f, 0f);
		slice5.setTextureSize(textureWidth, textureHeight);
		slice5.mirror = true;
		setRotation(slice5, 0f, 0f, 0f);
		
		slice6 = new ModelRenderer(this, 0, 0);
		slice6.addBox(3f, -10f, 3f, 5, 1, 5);
		slice6.setRotationPoint(0f, 22f, 0f);
		slice6.setTextureSize(textureWidth, textureHeight);
		slice6.mirror = true;
		setRotation(slice6, 0f, 0f, 0f);
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		slice.render(f5);
		slice1.render(f5);
		slice2.render(f5);
		slice3.render(f5);
		slice4.render(f5);
		slice5.render(f5);
		slice6.render(f5);
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
