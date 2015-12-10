package com.Noahl11.terraria.Entity.render;

import com.Noahl11.terraria.Entity.hostile.Models.BlueJellyFish;
import com.Noahl11.terraria.Entity.hostile.Models.Slime;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSlime extends RenderLiving{
	
	public RenderSlime() {
		super(Minecraft.getMinecraft().getRenderManager(), new Slime(), 0);
	}

	protected ResourceLocation getEntityTexture(Entity entity) {
		return new ResourceLocation("terraria", "textures/entity/Green_Slime.png");
	}


}
