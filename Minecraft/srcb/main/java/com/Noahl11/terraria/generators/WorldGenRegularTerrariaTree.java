package com.Noahl11.terraria.generators;

import com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenCactus;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenRegularTerrariaTree extends WorldGenAbstractTree{
    private boolean field_150531_a;
    private static final String __OBFID = "CL_00000401";
    public static int stage = 0;

    //BlockCactus
    
    public WorldGenRegularTerrariaTree(boolean p_i45449_1_, boolean p_i45449_2_, int Stage)
    {
        super(p_i45449_1_);
        this.stage = Stage;
        this.field_150531_a = p_i45449_2_;
    }
    
    public boolean generate(World worldIn, Random random, BlockPos blockPos)
    {
        int height = random.nextInt(60) + 3;

        if (this.field_150531_a)
        {
        	height += random.nextInt(7);
        }
        
        if (stage == 1) {
        	height += random.nextInt(60) + 3;
        }
        if (stage == 2) {
        	height += random.nextInt(5);
        }
        if (stage == 3) {
        	height += random.nextInt(9);
        }
        
        boolean flag = true;

        if (blockPos.getY() >= 1 && blockPos.getY() + height + 1 <= 256)
        {
            int k;
            int l;

            for (int j = blockPos.getY(); j <= blockPos.getY() + 1 + height; ++j)
            {
                byte b0 = 1;

                if (j == blockPos.getY())
                {
                    b0 = 0;
                }

                if (j >= blockPos.getY() + 1 + height - 2)
                {
                    b0 = 2;
                }

                for (k = blockPos.getX() - b0; k <= blockPos.getX() + b0 && flag; ++k)
                {
                    for (l = blockPos.getZ() - b0; l <= blockPos.getZ() + b0 && flag; ++l)
                    {
                        if (j >= 0 && j < 256)
                        {
                            if (!this.isReplaceable(worldIn, new BlockPos(k, j, l)))
                            {
                                flag = false;
                            }
                        }
                        else
                        {
                            flag = false;
                        }
                    }
                }
            }

            if (!flag)
            {
                return false;
            }
            else
            {
                BlockPos down = blockPos.down();
                Block block1 = worldIn.getBlockState(down).getBlock();
                boolean isSoil = block1.canSustainPlant(worldIn, down, net.minecraft.util.EnumFacing.UP, ((net.minecraft.block.BlockSapling)Blocks.sapling));

                if (isSoil && blockPos.getY() < 256 - height - 1)
                {
                    block1.onPlantGrow(worldIn, down, blockPos);
                    int i2;

                    for (i2 = blockPos.getY() - 3 + height; i2 <= blockPos.getY() + height; ++i2)
                    {
                        k = i2 - (blockPos.getY() + height);
                        l = 1 - k / 2;

                        for (int i1 = blockPos.getX() - l; i1 <= blockPos.getX() + l; ++i1)
                        {
                            int j1 = i1 - blockPos.getX();

                            for (int k1 = blockPos.getZ() - l; k1 <= blockPos.getZ() + l; ++k1)
                            {
                                int l1 = k1 - blockPos.getZ();

                                if (Math.abs(j1) != l || Math.abs(l1) != l || random.nextInt(2) != 0 && k != 0)
                                {
                                    BlockPos blockpos1 = new BlockPos(i1, i2, k1);
                                    Block block = worldIn.getBlockState(blockpos1).getBlock();

                                    if (block.isAir(worldIn, blockpos1) || block.isLeaves(worldIn, blockpos1))
                                    {
                                        this.func_175905_a(worldIn, blockpos1, Blocks.leaves, BlockPlanks.EnumType.OAK.getMetadata());
                                    }
                                }
                            }
                        }
                    }

                    for (i2 = 0; i2 < height; ++i2)
                    {
                        BlockPos upN = blockPos.up(i2);
                        Block block2 = worldIn.getBlockState(upN).getBlock();

                        if (block2.isAir(worldIn, upN) || block2.isLeaves(worldIn, upN))
                        {
                            this.func_175905_a(worldIn, blockPos.up(i2), Blocks.log, BlockPlanks.EnumType.OAK.getMetadata());
                        }
                    }

                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else
        {
            return false;
        }
    }
}
