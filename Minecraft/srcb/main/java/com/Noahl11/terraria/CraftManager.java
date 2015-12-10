package com.Noahl11.terraria;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CraftManager {

	//items
	public static void shapless(Item item, Item item2, Item item3) {
		GameRegistry.addShapelessRecipe(new ItemStack(item), new Object[] {item2, item3});
	}
	
	public static void shapless(Item item, Item item2, Item item3, Item item4) {
		GameRegistry.addShapelessRecipe(new ItemStack(item), new Object[] {item2, item3, item4});
	}
	
	public static void shapless(Item item, Item item2, Item item3, Item item4, Item item5) {
		GameRegistry.addShapelessRecipe(new ItemStack(item), new Object[] {item2, item3, item4, item5});
	}
	
	public static void shapless(Item item, Item item2) {
		GameRegistry.addShapelessRecipe(new ItemStack(item), item2);
	}
	
	public static void shapless(Item item, int i, Item item2, int i2) {
		GameRegistry.addShapelessRecipe(new ItemStack(item, i), new ItemStack(item2, i2));
	}
	//blocks
	public static void shapless(Block item, Block item2, Block item3) {
		GameRegistry.addShapelessRecipe(new ItemStack(item), new Object[] {item2, item3});
	}
	
	public static void shapless(Block item, Block item2, Block item3, Block item4) {
		GameRegistry.addShapelessRecipe(new ItemStack(item), new Object[] {item2, item3, item4});
	}
	
	public static void shapless(Block item, Block item2, Block item3, Block item4, Block item5) {
		GameRegistry.addShapelessRecipe(new ItemStack(item), new Object[] {item2, item3, item4, item5});
	}
	
	public static void shapless(Block item, Block item2) {
		GameRegistry.addShapelessRecipe(new ItemStack(item), item2);
	}
	
	public static void shapless(Block item, int i, Block item2, int i2) {
		GameRegistry.addShapelessRecipe(new ItemStack(item, i), new ItemStack(item2, i2));
	}
	
}
