package com.Noahl11.terraria.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;

public class Boreal_Wood_Platform extends Block{
	public Boreal_Wood_Platform(Material materialIn) {
		super(materialIn);
	}
	@Override
	public EnumWorldBlockLayer getBlockLayer() {
		return EnumWorldBlockLayer.CUTOUT;
	}

}
