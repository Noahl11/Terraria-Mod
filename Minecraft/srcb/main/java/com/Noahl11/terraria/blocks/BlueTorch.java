package com.Noahl11.terraria.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.World;

public class BlueTorch extends BlockTorch {

	public BlueTorch() {
		this.setLightLevel(0.9f);
		this.setBlockBounds(0.4f, 0f, 0.4f, 0.6f, 0.7f, 0.6f);
	}
	
}
