package com.Noahl11.terraria.Debuff.effects;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;

public class Admin extends Potion{

	public Admin() {
		super(25, new ResourceLocation("mining_fatigue"), false, 0x0011FF);	
		this.setEffectiveness(0.05D);
		this.setIconIndex(2, 2);
	}
	
	@Override
	public String getName() {
		return "Admin";
	}
	
}
