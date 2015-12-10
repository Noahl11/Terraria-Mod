package com.Noahl11.terraria.blocks;

import com.Noahl11.terraria.init.TerrariaBlocks;
import com.Noahl11.terraria.init.TerrariaItems;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class Boreal_Wood_Work_Bench extends Block{

	public Boreal_Wood_Work_Bench(Material materialIn) {
		super(materialIn);
		
		this.setStepSound(soundTypeWood);
		this.setHardness(4.0f);
		this.setCreativeTab(TerrariaBlocks.Terraria2);
		this.setResistance(4.0f);
	}

}
