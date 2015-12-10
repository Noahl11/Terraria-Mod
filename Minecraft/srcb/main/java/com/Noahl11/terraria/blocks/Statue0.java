package com.Noahl11.terraria.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;

public class Statue0 extends Block{

	public Statue0(Material materialIn) {
		super(materialIn);
		this.setHardness(3.0f);
		this.setResistance(4.0f);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 0);
		this.setBlockBounds(0f, 0f, 0f, 1f, 2f, 1f);
	}
	
}
