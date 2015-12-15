package com.Noahl11.terraria.Entity.render;

import com.Noahl11.terraria.Entity.hostile.Models.BlueJellyFish;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderEntityLight extends RenderLiving{

	public RenderEntityLight() {
		super(Minecraft.getMinecraft().getRenderManager(), new BlueJellyFish(), 0);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("terraria", "textures/models/armor/invis_layer_1.png");
	}

}
