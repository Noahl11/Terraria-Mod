package com.Noahl11.terraria.blocks;

import java.util.Random;

import com.Noahl11.terraria.biome.TerrariaCorruptionBiome;
import com.Noahl11.terraria.init.TerrariaBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkPrimer;

public class EbonGrass extends BlockGrass implements IGrowable{
	
	public EbonGrass(Material materialIn) {
		super();
		setStepSound(soundTypeGrass);
		setHardness(5.0f);
		setTickRandomly(true);
	}
	
	  public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
	    {
	        if (!worldIn.isRemote)
	        {
	            if (worldIn.getLightFromNeighbors(pos.up()) < 4 && worldIn.getBlockState(pos.up()).getBlock().getLightOpacity(worldIn, pos.up()) > 2)
	            {
	                worldIn.setBlockState(pos, Blocks.dirt.getDefaultState());
	            }
	            else
	            {
	                if (worldIn.getLightFromNeighbors(pos.up()) >= 9)
	                {
	                    for (int i = 0; i < 4; ++i)
	                    {
	                        BlockPos blockpos1 = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
	                        Block block = worldIn.getBlockState(blockpos1.up()).getBlock();
	                        IBlockState iblockstate1 = worldIn.getBlockState(blockpos1);

	                        if (iblockstate1.getBlock() == Blocks.grass && worldIn.getLightFromNeighbors(blockpos1.up()) >= 4 && block.getLightOpacity(worldIn, blockpos1.up()) <= 2 || iblockstate1.getBlock() == Blocks.dirt && iblockstate1.getValue(BlockDirt.VARIANT) == BlockDirt.DirtType.DIRT && worldIn.getLightFromNeighbors(blockpos1.up()) >= 4 && block.getLightOpacity(worldIn, blockpos1.up()) <= 2)
	                        {
	                            worldIn.setBlockState(blockpos1, TerrariaBlocks.EbonGrass_Block.getDefaultState());
	                        }
	                    }
	                }
	            }
	        }
	    }
	
}