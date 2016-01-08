package com.Noahl11.terraria.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

import com.Noahl11.terraria.Reference;
import com.Noahl11.terraria.blocks.BlockLoaders;
import com.Noahl11.terraria.blocks.BlueTorch;
import com.Noahl11.terraria.blocks.Boreal_Wood_Platform;
import com.Noahl11.terraria.blocks.Boreal_Wood_Work_Bench;
import com.Noahl11.terraria.blocks.EbonGrass;
import com.Noahl11.terraria.blocks.Ebonstone_Block;
import com.Noahl11.terraria.blocks.Statue0;
import com.Noahl11.terraria.blocks.TerrariaBaseBlock;

public class TerrariaBlocks {

	public static BlockLoaders load;
	
	//random
	public static Block Statue0;
	public static Block Table;
	public static Block Blue_Torch;
	public static Block Boreal_Wood;
	public static Block Boreal_Wood_Platform;
	public static Block Ebonstone_Block;
	public static Block EbonGrass_Block;
	public static Block Hardened_Sand;
	
	//ore
	public static Block Copper_Ore;
	public static Block Lead_Ore;
	public static Block Platinum_Ore;
	public static Block Silver_Ore;
	public static Block Tin_Ore;
	public static Block Tungsten_Ore;
	public static Block Adamantite_Ore;
	
	public static CreativeTabs Terraria2 = new CreativeTabs("Terraria2") {
		public Item getTabIconItem() {
				return TerrariaItems.terraria;
		}
	};
	
	public static void init() {
		Statue0 = new Statue0(Material.ground).setUnlocalizedName("'0'_Statue").setCreativeTab(Terraria2);
		Table = new TerrariaBaseBlock(Material.wood).setUnlocalizedName("Table").setCreativeTab(Terraria2);
		Blue_Torch = new BlueTorch().setUnlocalizedName("Blue_Torch_on").setCreativeTab(TerrariaItems.Terraria1);
		Boreal_Wood = new Boreal_Wood_Work_Bench(Material.wood).setUnlocalizedName("Boreal_Wood").setCreativeTab(Terraria2);
		Boreal_Wood_Platform = new Boreal_Wood_Platform(Material.wood).setUnlocalizedName("Boreal_Wood_Platform").setCreativeTab(Terraria2);
		Ebonstone_Block = new Ebonstone_Block(Material.iron).setUnlocalizedName("Ebonstone_Block").setCreativeTab(Terraria2);
		EbonGrass_Block = new EbonGrass(Material.grass).setUnlocalizedName("EbonGrass_Block").setCreativeTab(Terraria2);
		Hardened_Sand = new TerrariaBaseBlock(Material.iron).setUnlocalizedName("Hardened_Sand").setCreativeTab(Terraria2);
		
		//ore
		Copper_Ore = new TerrariaBaseBlock(Material.iron).setUnlocalizedName("Copper_Ore").setCreativeTab(Terraria2);
		Lead_Ore = new TerrariaBaseBlock(Material.iron).setUnlocalizedName("Lead_Ore").setCreativeTab(Terraria2);
		Platinum_Ore = new TerrariaBaseBlock(Material.iron).setUnlocalizedName("Platinum_Ore").setCreativeTab(Terraria2);
		Silver_Ore = new TerrariaBaseBlock(Material.iron).setUnlocalizedName("Silver_Ore").setCreativeTab(Terraria2);
		Tin_Ore = new TerrariaBaseBlock(Material.iron).setUnlocalizedName("Tin_Ore").setCreativeTab(Terraria2);
		Tungsten_Ore = new TerrariaBaseBlock(Material.iron).setUnlocalizedName("Tungsten_Ore").setCreativeTab(Terraria2);
		Adamantite_Ore = new TerrariaBaseBlock(Material.iron).setUnlocalizedName("Adamantite_Ore").setCreativeTab(Terraria2);
	}
	
	public static void register() {
		load.reg(Statue0, "0 Statue");
		load.reg(Table, "Table");
		load.reg(Blue_Torch, "Blue Torch");
		load.reg(Boreal_Wood, "Boreal Wood");
		load.reg(Boreal_Wood_Platform, "Boreal Wood Platform");
		load.reg(Ebonstone_Block, "Ebonstone_Block");
		load.reg(EbonGrass_Block, "Ebongrass Block");
		load.reg(Hardened_Sand, "Hardened Sand");
		//ore
		load.reg(Copper_Ore, "Copper Ore");
		load.reg(Lead_Ore, "Lead Ore");
		load.reg(Platinum_Ore, "Platinum Ore");
		load.reg(Silver_Ore, "Silver Ore");
		load.reg(Tin_Ore, "Tin Ore");
		load.reg(Tungsten_Ore, "Tugsten Ore");
		load.reg(Adamantite_Ore, "Adamantite Ore");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.Terraria2", "en_US", "Terraria Blocks");
	}
	
	public static void registerRenders() {
		registerRender(Statue0);
		registerRender(Table);
		registerRender(Blue_Torch);
		registerRender(Boreal_Wood);
		registerRender(Boreal_Wood_Platform);
		registerRender(Ebonstone_Block);
		registerRender(EbonGrass_Block);
		registerRender(Hardened_Sand);
		//ore
		registerRender(Copper_Ore);
		registerRender(Lead_Ore);
		registerRender(Platinum_Ore);
		registerRender(Silver_Ore);
		registerRender(Tin_Ore);
		registerRender(Tungsten_Ore);
		registerRender(Adamantite_Ore);
		
	}
	
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
