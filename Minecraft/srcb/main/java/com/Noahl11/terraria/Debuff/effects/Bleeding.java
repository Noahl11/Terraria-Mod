package com.Noahl11.terraria.Debuff.effects;

import com.Noahl11.terraria.Terraria;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class Bleeding extends Potion{

	public Bleeding() {
		super(24, new ResourceLocation(""), false, 0xE32020);	
		this.setEffectiveness(0.05D);
	}
	
	@Override
	public String getName() {
		return "Bleeding";
	}

}
