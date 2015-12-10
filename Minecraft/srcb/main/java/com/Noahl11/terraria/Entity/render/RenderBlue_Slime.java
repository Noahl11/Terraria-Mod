package com.Noahl11.terraria.Entity.render;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.Noahl11.terraria.Entity.hostile.Models.Blue_Slime;

public class RenderBlue_Slime extends RenderLiving{
	
	public RenderBlue_Slime() {
		super(Minecraft.getMinecraft().getRenderManager(), new Blue_Slime(), 0);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("terraria", "textures/entity/Blue_Slime.png");
	}


}
