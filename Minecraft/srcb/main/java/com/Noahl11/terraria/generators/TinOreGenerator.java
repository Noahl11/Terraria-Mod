package com.Noahl11.terraria.generators;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

public class TinOreGenerator implements IWorldGenerator {

	private Block block;
	private int chance;
	private int maxY;
	private int minY;
	private int minVien;
	private int maxVien;
	
	public TinOreGenerator(Block block, int chance, int minY, int maxY, int minVien, int maxVien) {
		this.block = block;
		this.chance = chance;
		this.maxY = maxY;
		this.minY = minY;
		this.minVien = minVien;
		this.maxVien = maxVien;
	}
	
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		if (world.provider.getDimensionId() == 0) {
			chunkX *= 16;
			chunkZ *= 16;
			
			for(int i = 0; i < chance; i++) {
				
				int posX = chunkX + random.nextInt(16);
				int posY = random.nextInt(maxY - minY);
				int posZ = chunkZ + random.nextInt(16);
				
				WorldGenMinable wgen = new WorldGenMinable(block.getDefaultState(), (minVien + random.nextInt(maxVien - minVien)));
				wgen.generate(world, random, new BlockPos(posX, posY, posZ));
			}
		}
	}
}
