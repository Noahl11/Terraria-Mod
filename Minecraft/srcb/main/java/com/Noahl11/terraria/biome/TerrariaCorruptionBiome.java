package com.Noahl11.terraria.biome;

import java.util.Random;

import com.Noahl11.terraria.init.TerrariaBlocks;

import net.minecraft.block.BlockSand;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.ChunkPrimer;

public class TerrariaCorruptionBiome extends BiomeGenBase{

	public TerrariaCorruptionBiome() {
		super(25);
		fillerBlock = TerrariaBlocks.Ebonstone_Block.getDefaultState();
		topBlock = TerrariaBlocks.EbonGrass_Block.getDefaultState();
		biomeName = "Corruption";
		waterColorMultiplier = 9502770;
		maxHeight = 0.4f;
		minHeight = 0.1f;
		spawnableCreatureList.clear();
		spawnableCreatureList.add(new SpawnListEntry(EntityBlaze.class, 10, 2, 5));
	}
	
	public int getSkyColorByTemp(float p_76731_1_) {
		return 0x000000;
	}
	
}