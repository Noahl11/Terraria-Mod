package com.Noahl11.terraria.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

public class BlockLoaders {
	public static ToolMaterial Custom;
		
	public static void reg(Block block, String Name) {
		GameRegistry.registerBlock(block, block.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(block, Name);
	}
}
