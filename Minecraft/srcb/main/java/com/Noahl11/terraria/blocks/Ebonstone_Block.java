package com.Noahl11.terraria.blocks;

import java.util.Random;

import com.Noahl11.terraria.init.TerrariaBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockDirt;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class Ebonstone_Block extends Block {

	public Ebonstone_Block(Material materialIn) {
		super(materialIn);
		setStepSound(soundTypeStone);
		setHardness(7.0f);
		setTickRandomly(true);
	}
	
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
        if (!worldIn.isRemote)
        {
          for (int i = 0; i < 4; ++i)
          {
        	  BlockPos blockpos1 = pos.add(rand.nextInt(3) - 1, rand.nextInt(5) - 3, rand.nextInt(3) - 1);
              Block block = worldIn.getBlockState(blockpos1.up()).getBlock();
              IBlockState iblockstate1 = worldIn.getBlockState(blockpos1);

              if (iblockstate1.getBlock() == Blocks.stone)
              {
            	  worldIn.setBlockState(blockpos1, TerrariaBlocks.Ebonstone_Block.getDefaultState());
              }
            }
        }
	}
	
}
