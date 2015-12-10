package com.Noahl11.terraria.Entity.freindly;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.world.World;

public class Star extends EntityLightningBolt{

	public Star(World worldIn) {
		super(worldIn, 0, 0, 0);
		this.setVelocity(0, -5, 0);
	}
	
}
