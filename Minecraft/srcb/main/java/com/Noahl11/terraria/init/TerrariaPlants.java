package com.Noahl11.terraria.init;

import com.Noahl11.terraria.Reference;
import com.Noahl11.terraria.blocks.BlockLoaders;
import com.Noahl11.terraria.blocks.TerrariaBaseBlock;
import com.Noahl11.terraria.plants.Acorn;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

public class TerrariaPlants {
	
	public static ItemLoaders loaditem;
	public static BlockLoaders loadblock;
	
	//Finished Items
	public static Block acorn;
	
	public static CreativeTabs Plants = new CreativeTabs("Terraria Plants") {
		public Item getTabIconItem() {
				return TerrariaItems.terraria;
		}
	};
	
	public static void init() {
		
		acorn = new Acorn().setUnlocalizedName("Acorn");
		
	}
	
	public static void register() {
		loadblock.reg(acorn, "Acorn");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.Terraria Plants", "en_US", "Terraria Plants");
	}
	
	public static void registerRenders() {
		registerRenderBLOCK(acorn);
	}
	
	public static void registerRenderITEM(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
	public static void registerRenderBLOCK(Block block) {
		Item item = Item.getItemFromBlock(block);
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

}
