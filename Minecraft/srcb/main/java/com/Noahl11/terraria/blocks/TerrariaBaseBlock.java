package com.Noahl11.terraria.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TerrariaBaseBlock extends Block{
	public TerrariaBaseBlock(Material materialIn) {
		super(materialIn);
		this.setHardness(3.0f);
		this.setResistance(4.0f);
		this.setStepSound(soundTypeStone);
		this.setHarvestLevel("pickaxe", 0);
	}

}
