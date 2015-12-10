package com.Noahl11.terraria.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

public class ItemLoaders {

	public static ToolMaterial Custom;
	
	public static void reg(Item item, String Name) {
		GameRegistry.registerItem(item, item.getUnlocalizedName().substring(5));
		LanguageRegistry.addName(item, Name);
	}
	
	public static void sword(int maxuse, float damage, int enchantability, Item item, String name, CreativeTabs tab) {
		Custom = EnumHelper.addToolMaterial(name, 0, maxuse, 0, damage-4, enchantability);
		item = (ItemSword) new ItemSword(Custom).setUnlocalizedName(name).setCreativeTab(tab);
	}
	
	public static void bitem(Item item, String name, CreativeTabs tab) {
		item = new Item().setUnlocalizedName(name).setCreativeTab(tab);
	}
	public static void bitem(Item item, String name) {
		item = new Item().setUnlocalizedName(name);
	}
	public static void food(Item item, int amount, float saturation, boolean wolffood, String name) {
		item = (ItemFood) new ItemFood(amount, saturation, wolffood).setUnlocalizedName(name);
	}
	public static void food(Item item, int amount, float saturation, boolean wolffood, String name, CreativeTabs tab) {
		item = (ItemFood) new ItemFood(amount, saturation, wolffood).setUnlocalizedName(name).setCreativeTab(tab);
	}
	
}
