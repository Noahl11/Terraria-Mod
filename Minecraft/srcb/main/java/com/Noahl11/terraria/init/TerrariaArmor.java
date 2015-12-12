package com.Noahl11.terraria.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

import com.Noahl11.terraria.Reference;
import com.Noahl11.terraria.items.armor.MiningArmor;


public class TerrariaArmor {

	public static ItemLoaders load;
	public static ArmorMaterial CustomArmor;
	
	//Prehardcore
	// Name: Armor Strength * 2: Sum: Bonus: Location: Extra:
	// Mining armor, 0.5 1 1 0.5, 3, +30% mining speed, Sold from Merchant for 4 gold or Helmet, Shirt and Pants rare drop from undead miner
	public static Item 	Mining_Helmet;
	public static Item 	Mining_Chainmail;
	public static Item 	Mining_Leggings;
	public static Item 	Mining_Boots;
	// Wooden armor, 0.5 1 0.5 0, 2(3), +1 Defense, 75 wood crafted at workbench
	public static Item Wood_Helmet;
	public static Item Wood_ChestPlate;
	public static Item Wood_Leggings;
	public static Item Wood_Boots;
	//Rich Mahogany armor, 0.5 1 1 0.5, 3(4), +1 Defense, 75 rich mahogany crafted at workbench
	public static Item Rich_Mahogany_Helmet;
	public static Item Rich_Mahogany_Chainmail;
	public static Item Rich_Mahogany_Leggings;
	public static Item Rich_Mahogany_Boots;
	//Boreal Wood armor, 0.5 1 1 0.5, 3(4), +1 Defense, 75 boreal wood crafted at workbench
	public static Item Boreal_Wood_Helmet;
	public static Item Boreal_Wood_Chainmail;
	public static Item Boreal_Wood_Leggings;
	public static Item Boreal_Wood_Boots;
	//Palm Wood armor, 0.5 1 1 0.5, 3(4), +1 Defense, 75 palm wood crafted at workbench
	public static Item Palm_Wood_Helmet;
	public static Item Palm_Wood_Chainmail;
	public static Item Palm_Wood_Leggings;
	public static Item Palm_Wood_Boots;
	//Ebonwood Armor, 0.5 2 1 0.5, 4(5), +1 Defense, 75 ebonwood crafted at workbench
	public static Item Ebonwood_Helmet;
	public static Item Ebonwood_Chainmail;
	public static Item Ebonwood_Leggings;
	public static Item Ebonwood_Boots;
	//Shadewood Armor, 0.5 2 1 0.5, 4(5), +1 Defense, 75 shadewood crafted at workbench
	public static Item Shadewood_Helmet;
	public static Item Shadewood_Chainmail;
	public static Item Shadewood_Leggings;
	public static Item Shadewood_Boots;
	//Rain armor
	public static Item Rain_Helmet;
	public static Item Rain_Chainmail;
	public static Item Rain_Leggings;
	public static Item Rain_Boots;
	//Eskimo armor
	public static Item Eskimo_Helmet;
	public static Item Eskimo_Chainmail;
	public static Item Eskimo_Leggings;
	public static Item Eskimo_Boots;
	//Pink Eskimo armor
	public static Item Pink_Eskimo_Helmet;
	public static Item Pink_Eskimo_Chainmail;
	public static Item Pink_Eskimo_Leggings;
	public static Item Pink_Eskimo_Boots;
	//Angler armor
	public static Item Angler_Helmet;
	public static Item Angler_Chainmail;
	public static Item Angler_Leggings;
	public static Item Angler_Boots;
	//Cactus armor
	public static Item Cactus_Helmet;
	public static Item Cactus_Chainmail;
	public static Item Cactus_Leggings;
	public static Item Cactus_Boots;
	//Copper armor
	public static Item Copper_Helmet;
	public static Item Copper_Chainmail;
	public static Item Copper_Leggings;
	public static Item Copper_Boots;
	//Tin armor
	public static Item Tin_Helmet;
	public static Item Tin_Chainmail;
	public static Item Tin_Leggings;
	public static Item Tin_Boots;
	//Pumpkin armor
	public static Item Pumpkin_Helmet;
	public static Item Pumpkin_Chainmail;
	public static Item Pumpkin_Leggings;
	public static Item Pumpkin_Boots;
	//Gladiator armor
	public static Item Gladiator_Helmet;
	public static Item Gladiator_Chainmail;
	public static Item Gladiator_Leggings;
	public static Item Gladiator_Boots;
	//Iron armor
	public static Item Iron_Helmet;
	public static Item Iron_Chainmail;
	public static Item Iron_Leggings;
	public static Item Iron_Boots;
	//Lead armor
	public static Item Lead_Helmet;
	public static Item Lead_Chainmail;
	public static Item Lead_Leggings;
	public static Item Lead_Boots;
	//Silver armor
	public static Item Silver_Helmet;
	public static Item Silver_Chainmail;
	public static Item Silver_Leggings;
	public static Item Silver_Boots;
	//Tungsten armor
	public static Item Tungsten_Helmet;
	public static Item Tungsten_Chainmail;
	public static Item Tungsten_Leggings;
	public static Item Tungsten_Boots;
	//Gold armor
	public static Item Gold_Helmet;
	public static Item Gold_Chainmail;
	public static Item Gold_Leggings;
	public static Item Gold_Boots;
	//Platinum armor
	public static Item Platinum_Helmet;
	public static Item Platinum_Chainmail;
	public static Item Platinum_Leggings;
	public static Item Platinum_Boots;
	//Ninja armor
	public static Item Ninja_Helmet;
	public static Item Ninja_Chainmail;
	public static Item Ninja_Leggings;
	public static Item Ninja_Boots;
	//Fossil armor
	public static Item Fossil_Helmet;
	public static Item Fossil_Chainmail;
	public static Item Fossil_Leggings;
	public static Item Fossil_Boots;
	//Obsidian armor
	public static Item Obsidian_Helmet;
	public static Item Obsidian_Chainmail;
	public static Item Obsidian_Leggings;
	public static Item Obsidian_Boots;
	//Bee armor
	public static Item Bee_Helmet;
	public static Item Bee_Chainmail;
	public static Item Bee_Leggings;
	public static Item Bee_Boots;
	//Jungle armor
	public static Item Jungle_Helmet;
	public static Item Jungle_Chainmail;
	public static Item Jungle_Leggings;
	public static Item Jungle_Boots;
	//Ancient Cobalt armor
	public static Item Ancient_Cobalt_Helmet;
	public static Item Ancient_Cobalt_Chainmail;
	public static Item Ancient_Cobalt_Leggings;
	public static Item Ancient_Cobalt_Boots;
	//Meteor armor
	public static Item Meteor_Helmet;
	public static Item Meteor_Chainmail;
	public static Item Meteor_Leggings;
	public static Item Meteor_Boots;
	//Necro armor
	public static Item Necro_Helmet;
	public static Item Necro_Chainmail;
	public static Item Necro_Leggings;
	public static Item Necro_Boots;
	//Shadow armor
	public static Item Shadow_Helmet;
	public static Item Shadow_Chainmail;
	public static Item Shadow_Leggings;
	public static Item Shadow_Boots;
	//Ancient Shadow armor
	public static Item Ancient_Shadow_Helmet;
	public static Item Ancient_Shadow_Chainmail;
	public static Item Ancient_Shadow_Leggings;
	public static Item Ancient_Shadow_Boots;
	//Crimson Armor
	public static Item Crimson_Helmet;
	public static Item Crimson_Chainmail;
	public static Item Crimson_Leggings;
	public static Item Crimson_Boots;
	//Molten armor
	public static Item Molten_Helmet;
	public static Item Molten_Chainmail;
	public static Item Molten_Leggings;
	public static Item Molten_Boots;
	//Hardmode
	
	public static Item Admin_Helmet;
	public static Item Admin_Chainmail;
	public static Item Admin_Leggings;
	public static Item Admin_Boots;
	
	public static CreativeTabs Terraria5 = new CreativeTabs("Terraria5") {
		public Item getTabIconItem() {
				return Wood_Helmet;
		}
	};
	public static void armorCustoms(String textureName, int durability, int i, int i2, int i3, int i4, int enchantability) {
		CustomArmor = EnumHelper.addArmorMaterial("CustomArmor", textureName, durability, new int[] {i, i2, i3, i4}, enchantability);
	}
	
	public static void init() {
		//Mining armor
		armorCustoms("terraria:Copper_Armor", 20, 1, 2, 2, 1, 0);
		Mining_Helmet = new MiningArmor(CustomArmor, 1, 0).setUnlocalizedName("Mining_Helmet").setCreativeTab(Terraria5);
		Mining_Chainmail = new MiningArmor(CustomArmor, 1, 1).setUnlocalizedName("Mining_Chainmail").setCreativeTab(Terraria5);
		Mining_Leggings = new MiningArmor(CustomArmor, 1, 2).setUnlocalizedName("Mining_Leggings").setCreativeTab(Terraria5);
		Mining_Boots = new MiningArmor(CustomArmor, 1, 3).setUnlocalizedName("Mining_Boots").setCreativeTab(Terraria5);
		//Wooden Armor
		armorCustoms("terraria:Copper_Armor", 20, 3, 8, 4, 3, 0);
		Wood_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Wood_Helmet").setCreativeTab(Terraria5);
		Wood_ChestPlate = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Wood_ChestPlate").setCreativeTab(Terraria5);
		Wood_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Wood_Leggings").setCreativeTab(Terraria5);
		Wood_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Wood_Boots").setCreativeTab(Terraria5);
		armorCustoms("terraria:Copper_Armor", 20, 1, 2, (int) 0.5, (int) 0.5, 0);
		Copper_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Copper_Helmet").setCreativeTab(Terraria5);
		Copper_Chainmail = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Copper_Chainmail").setCreativeTab(Terraria5);
		Copper_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Copper_Leggings").setCreativeTab(Terraria5);
		Copper_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Copper_Boots").setCreativeTab(Terraria5);
		armorCustoms("terraria:Lead_Armor", 20, 1, 2, (int) 0.5, (int) 0.5, 0);
		Lead_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Lead_Helmet").setCreativeTab(Terraria5);
		Lead_Chainmail = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Lead_Chainmail").setCreativeTab(Terraria5);
		Lead_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Lead_Leggings").setCreativeTab(Terraria5);
		Lead_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Lead_Boots").setCreativeTab(Terraria5);
		armorCustoms("terraria:Tungsten_Armor", 20, 1, 2, (int) 0.5, (int) 0.5, 0);
		Tungsten_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Tungsten_Helmet").setCreativeTab(Terraria5);
		Tungsten_Chainmail = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Tungsten_Chainmail").setCreativeTab(Terraria5);
		Tungsten_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Tungsten_Leggings").setCreativeTab(Terraria5);
		Tungsten_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Tungsten_Boots").setCreativeTab(Terraria5);
		armorCustoms("terraria:invis", 100000, 1000, 2000, 500, 500, 0);
		Admin_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Admin_Helmet").setCreativeTab(Terraria5);
		Admin_Chainmail = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Admin_Chainmail").setCreativeTab(Terraria5);
		Admin_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Admin_Leggings").setCreativeTab(Terraria5);
		Admin_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Admin_Boots").setCreativeTab(Terraria5);
	}
	
	public static void register() {
		//Mining Armor
		load.reg(Mining_Helmet, "Mining Helmet");
		load.reg(Mining_Chainmail, "Mining Chainmail");
		load.reg(Mining_Leggings, "Mining Leggings");
		load.reg(Mining_Boots, "Mining Boots");
		//Wooden Armor
		load.reg(Wood_Helmet, "Wood Helmet");
		load.reg(Wood_ChestPlate, "Wood Chestplate");
		load.reg(Wood_Leggings, "Wood Leggings");
		load.reg(Wood_Boots, "Wood Boots");
		load.reg(Copper_Helmet, "Copper Helmet");
		load.reg(Copper_Chainmail, "Copper Chainmail");
		load.reg(Copper_Leggings, "Copper Leggings");
		load.reg(Copper_Boots, "Copper Boots");
		load.reg(Lead_Helmet, "Lead Helmet");
		load.reg(Lead_Chainmail, "Lead Chainmail");
		load.reg(Lead_Leggings, "Lead_Leggings");
		load.reg(Lead_Boots, "Lead Boots");
		load.reg(Tungsten_Helmet, "Tungsten Helmet");
		load.reg(Tungsten_Chainmail, "Tungsten Chainmail");
		load.reg(Tungsten_Leggings, "Tungsten Leggings");
		load.reg(Tungsten_Boots, "Tungsten Boots");
		load.reg(Admin_Helmet, "Admin Helmet");
		load.reg(Admin_Chainmail, "Admin Chainmail");
		load.reg(Admin_Leggings, "Admin Leggings");
		load.reg(Admin_Boots, "Admin Boots");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.Terraria5", "en_US", "Terraria Armor");
	}
	
	public static void registerRenders() {
		//Mining Armor
		registerRender(Mining_Helmet);
		registerRender(Mining_Chainmail);
		registerRender(Mining_Leggings);
		registerRender(Mining_Boots);
		//Wooden Armor
		registerRender(Wood_Helmet);
		registerRender(Wood_ChestPlate);
		registerRender(Wood_Leggings);
		registerRender(Wood_Boots);
		registerRender(Copper_Helmet);
		registerRender(Copper_Chainmail);
		registerRender(Copper_Leggings);
		registerRender(Copper_Boots);
		registerRender(Lead_Helmet);
		registerRender(Lead_Chainmail);
		registerRender(Lead_Leggings);
		registerRender(Lead_Boots);
		registerRender(Tungsten_Helmet);
		registerRender(Tungsten_Chainmail);
		registerRender(Tungsten_Leggings);
		registerRender(Tungsten_Boots);
		registerRender(Admin_Helmet);
		registerRender(Admin_Chainmail);
		registerRender(Admin_Leggings);
		registerRender(Admin_Boots);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
