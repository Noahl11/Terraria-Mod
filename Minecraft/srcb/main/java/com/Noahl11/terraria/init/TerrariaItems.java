package com.Noahl11.terraria.init;

import java.util.Random;

import ibxm.Player;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemBow;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemPotion;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemTool;
import net.minecraft.potion.Potion;
import net.minecraft.util.RegistryNamespaced;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

import com.Noahl11.terraria.Reference;
import com.Noahl11.terraria.Terraria;
import com.Noahl11.terraria.blocks.Boreal_Wood_Work_Bench;
import com.Noahl11.terraria.items.potions.BasicPotion;
import com.Noahl11.terraria.items.tools.axe.Copper_Axe;
import com.Noahl11.terraria.items.tools.extra.Inis;
import com.Noahl11.terraria.items.tools.pic.Copper_Pickaxe;
import com.Noahl11.terraria.items.weapons.BasicSword;
import com.Noahl11.terraria.items.weapons.Psycho_Knife;
import com.Noahl11.terraria.items.weapons.Starfury;

public class TerrariaItems{
	
	public static ItemLoaders load;
	public static final int NODAM = 2;
	public EntityPlayer player;
	public float attack = player.getLastAttacker().getHealth();
	public float netdam = (attack - 0.5f);
	public static ToolMaterial Custom;
	public static ArmorMaterial CustomArmor;
	public static String type = "";
	public static int buf = 0;
	
	//items
	public static ItemFood test;
	public static Item terraria;
	public static Item Admin_Potion;
	public static Item Gel;
	
	//armor
	public static Item Admin_Helmet;
	public static Item Admin_Chainmail;
	public static Item Admin_Leggings;
	public static Item Admin_Boots;
	public static Item Wood_Helmet;
	public static Item Wood_ChestPlate;
	public static Item Wood_Leggings;
	public static Item Wood_Boots;
	public static Item Copper_Helmet;
	public static Item Copper_Chainmail;
	public static Item Copper_Leggings;
	public static Item Copper_Boots;
	public static Item Lead_Helmet;
	public static Item Lead_Chainmail;
	public static Item Lead_Leggings;
	public static Item Lead_Boots;
	public static Item Tungsten_Helmet;
	public static Item Tungsten_Chainmail;
	public static Item Tungsten_Leggings;
	public static Item Tungsten_Boots;
	//swords
	//broad
	public static Item Wooden_Sword;
	public static Item Copper_broadsword;
	public static Item Gold_Broadsword;
	public static Item Iron_Broadsword;
	public static Item Lead_Broadsword;
	public static Item Lights_Bane;
	public static Item Platinum_Broadsword;
	public static Item Silver_Broadsword;
	public static Item Tin_Broadsword;
	public static Item Tungsten_Broadsword;
	//short
	public static Item Copper_Shortsword;
	public static Item Gold_Shortsword;
	public static Item Iron_Shortsword;
	public static Item Lead_Shortsword;
	public static Item Platinum_Shortsword;
	public static Item Silver_Shortsword;
	public static Item Tin_Shortsword;
	public static Item Tungsten_Shortsword;
	//basic
	public static Item Adamantite_Sword;
	public static Item Arkhalis;//* Auto Swing blurred anime attack extreamly fast weak knockback
	public static Item Beam_Sword;
	public static Item Bee_Keeper;
	public static Item Blade_of_Grass;
	public static Item Bladed_Glove;
	public static Item Bladetongue;
	public static Item Blood_Butcherer;
	public static Item Bone_Sword;
	public static Item Boreal_Wood_Sword;
	public static Item Breaker_Blade;
	public static Item Cactus_Sword;
	public static Item Candy_Cane_Sword;
	public static Item Chlorophyte_Claymore;
	public static Item Chlorophyte_Saber;
	public static Item Christmas_Tree_Sword;
	public static Item Classy_Cane;
	public static Item Cobalt_Sword;
	public static Item Cutlass;
	public static Item Death_Sickle;
	public static Item Ebonwood_Sword;
	public static Item Enchanted_Sword_item;
	public static Item Excalibur;
	public static Item Exotic_Scimitar;
	public static Item Falcon_Blade;
	public static Item Fetid_Baghnakhs;
	public static Item Fiery_Greatsword;
	public static Item Frostbrand;
	public static Item Ice_Blade;
	public static Item Ice_Sickle;
	public static Item Influx_Waver;
	public static Item Katana;
	public static Item Keybrand;
	public static Item Meowmere;
	public static Item Muramasa;
	public static Item Mythril_Sword;
	public static Item Nights_Edge;
	public static Item Orichalcum_Sword;
	public static Item Palladium_Sword;
	public static Item Palm_Wood_Sword;
	public static Item Pearlwood_Sword;
	public static Item Phaseblade;
	public static Item Phasesaber;
	public static Item Psycho_Knife;//when hit uninvis
	public static Item Purple_Clubberfish;
	public static Item Rich_Mahogany_Sword;
	public static Item Seedler;
	public static Item Shadewood_Sword;
	public static Item Slap_Hand;
	public static Item Star_Wrath;
	public static Item Starfury;
	public static Item Stylish_Scissors;
	public static Item Terra_Blade;
	public static Item The_Horsemans_Blade;
	public static Item Titanium_Sword;
	public static Item True_Excalibur;
	public static Item True_Nights_Edge;
	public static Item Zombie_Arm;
	
	//axe
	public static Item Copper_Axe;
	public static Item Gold_Axe;
	public static Item Iron_Axe;
	public static Item Lead_Axe;
	public static Item Platinum_Axe;
	public static Item Silver_Axe;
	public static Item Tungsten_Axe;
	//pickaxe
	public static Item Copper_Pickaxe;
	//slag
	public static Item Copper_Slag;
	//saplings
	public static Item tree;
	//bows
	public static ItemBow Wooden_Bow;
	
	public static CreativeTabs Terraria1 = new CreativeTabs("Terraria") {
		public Item getTabIconItem() {
				return terraria;
		}
	};
	public static CreativeTabs Terraria3 = new CreativeTabs("Terraria3") {
		public Item getTabIconItem() {
				return Platinum_Broadsword;
		}
	};
	public static CreativeTabs Terraria4 = new CreativeTabs("Terraria4") {
		public Item getTabIconItem() {
				return Gold_Axe;
		}
	};
	public static CreativeTabs Terraria5 = new CreativeTabs("Terraria5") {
		public Item getTabIconItem() {
				return Wood_Helmet;
		}
	};
	public static CreativeTabs Terraria6 = new CreativeTabs("Terraria6") {
		public Item getTabIconItem() {
				return Items.command_block_minecart;
		}
	};
	
	public static void toolCustoms(int harvestlevel, int maxuse, float efficiency, float damage, int enchantability) {
		Custom = EnumHelper.addToolMaterial("Custom", harvestlevel, maxuse, efficiency, damage-4, enchantability);
	}
	public static void armorCustoms(String textureName, int durability, int i, int i2, int i3, int i4, int enchantability) {
		CustomArmor = EnumHelper.addArmorMaterial("CustomArmor", textureName, durability, new int[] {i, i2, i3, i4}, enchantability);
	}
	
	public static void type() {
		Random random = new Random(0);
		if(random.nextInt(1) == 1) {
			type = ("Not Broken ");
		}else {
			type = ("Broken ");
		}
		
		if(type == "Broken ") {
			buf = -2;
		}
		if(type == "Not Broken ") {
			buf = 0;
		}
		
	}
	
	public static void init() {
		test = (ItemFood) new Inis().setPotionEffect(25, 10, 5, 5.0f).setAlwaysEdible().setUnlocalizedName("test").setCreativeTab(Terraria6);
		terraria = new Item().setUnlocalizedName("terraria");
		Admin_Potion = new BasicPotion(4400, 1).setUnlocalizedName("Admin_Potion").setCreativeTab(Terraria6);
		Gel = new Item().setUnlocalizedName("Gel").setCreativeTab(Terraria1);
		//armor
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
		Admin_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Admin_Helmet").setCreativeTab(Terraria6);
		Admin_Chainmail = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Admin_Chainmail").setCreativeTab(Terraria6);
		Admin_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Admin_Leggings").setCreativeTab(Terraria6);
		Admin_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Admin_Boots").setCreativeTab(Terraria6);
		
		//swords
		//broad
		toolCustoms(0, NODAM, 0, 7 + buf, 0);
		Wooden_Sword = new BasicSword(4175, Custom).setUnlocalizedName("Wooden_Sword");
		toolCustoms(0, NODAM, 0, 8, 0);
		Copper_broadsword = new BasicSword(4119, Custom).setUnlocalizedName("Copper_broadsword");
		toolCustoms(0, NODAM, 0, 13, 0);
		Gold_Broadsword = new BasicSword(4131, Custom).setUnlocalizedName("Gold_Broadsword");
		toolCustoms(0, NODAM, 0, 10, 0);
		Iron_Broadsword = new BasicSword(4136, Custom).setUnlocalizedName("Iron_Broadsword");
		toolCustoms(0, NODAM, 0, 11, 0);
		Lead_Broadsword = new BasicSword(4140, Custom).setUnlocalizedName("Lead_Broadsword");
		toolCustoms(0, NODAM, 0, 17, 0);
		Lights_Bane = new BasicSword(4142, Custom).setUnlocalizedName("Lights_Bane");
		toolCustoms(0, NODAM, 0, 15, 0);
		Platinum_Broadsword = new BasicSword(4153, Custom).setUnlocalizedName("Platinum_Broadsword");
		toolCustoms(0, NODAM, 0, 11, 0);
		Silver_Broadsword = new BasicSword(4160, Custom).setUnlocalizedName("Silver_Broadsword");
		toolCustoms(0, NODAM, 0, 9, 0);
		Tin_Broadsword = new BasicSword(4168, Custom).setUnlocalizedName("Tin_Broadsword");
		toolCustoms(0, NODAM, 0, 12, 0);
		Tungsten_Broadsword = new BasicSword(4173, Custom).setUnlocalizedName("Tungsten_Broadsword");
		//short
		toolCustoms(0, NODAM, 0, 5, 0);
		Copper_Shortsword = new BasicSword(4120, Custom).setUnlocalizedName("Copper_Shortsword");
		toolCustoms(0, NODAM, 0, 11, 0);
		Gold_Shortsword = new BasicSword(4132, Custom).setUnlocalizedName("Gold_Shortsword");
		toolCustoms(0, NODAM, 0, 8, 0);
		Iron_Shortsword = new BasicSword(4137, Custom).setUnlocalizedName("Iron_Shortsword");
		toolCustoms(0, NODAM, 0, 9, 0);
		Lead_Shortsword = new BasicSword(4141, Custom).setUnlocalizedName("Lead_Shortsword");
		toolCustoms(0, NODAM, 0, 13, 0);
		Platinum_Shortsword = new BasicSword(4154, Custom).setUnlocalizedName("Platinum_Shortsword");
		toolCustoms(0, NODAM, 0, 9, 0);
		Silver_Shortsword = new BasicSword(4161, Custom).setUnlocalizedName("Silver_Shortsword");
		toolCustoms(0, NODAM, 0, 7, 0);
		Tin_Shortsword = new BasicSword(2069, Custom).setUnlocalizedName("Tin_Shortsword");
		toolCustoms(0, NODAM, 0, 10, 0);
		Tungsten_Shortsword = new BasicSword(4174, Custom).setUnlocalizedName("Tungsten_Shortsword");
		//basic
		toolCustoms(0, NODAM, 0, 50, 0);
		Adamantite_Sword = new BasicSword(4100, Custom).setUnlocalizedName("Adamantite_Sword");
		toolCustoms(0, NODAM, 0, 20, 0);
		Arkhalis = new BasicSword(4101, Custom).setUnlocalizedName("Arkhalis");
		toolCustoms(0, NODAM, 0, 52, 0);
		Beam_Sword = new BasicSword(4103, Custom).setUnlocalizedName("Beam_Sword");
		toolCustoms(0, NODAM, 0, 52, 0);
		Bee_Keeper = new BasicSword(4104, Custom).setUnlocalizedName("Bee_Keeper");
		toolCustoms(0, NODAM, 0, 28, 0);
		Blade_of_Grass = new BasicSword(4105, Custom).setUnlocalizedName("Blade_of_Grass");
		toolCustoms(0, NODAM, 0, 12, 0);
		Bladed_Glove = new BasicSword(4106, Custom).setUnlocalizedName("Bladed_Glove");
		toolCustoms(0, NODAM, 0, 55, 0);
		Bladetongue = new BasicSword(4107, Custom).setUnlocalizedName("Bladetongue");
		toolCustoms(0, NODAM, 0, 22, 0);
		Blood_Butcherer = new BasicSword(4108, Custom).setUnlocalizedName("Blood_Butcherer");
		toolCustoms(0, NODAM, 0, 16, 0);
		Bone_Sword = new BasicSword(4109, Custom).setUnlocalizedName("Bone_Sword");
		toolCustoms(0, NODAM, 0, 8, 0);
		Boreal_Wood_Sword = new BasicSword(4110, Custom).setUnlocalizedName("Boreal_Wood_Sword");
		toolCustoms(0, NODAM, 0, 39, 0);
		Breaker_Blade = new BasicSword(4111, Custom).setUnlocalizedName("Breaker_Blade");
		toolCustoms(0, NODAM, 0, 9, 0);
		Cactus_Sword = new BasicSword(4112, Custom).setUnlocalizedName("Cactus_Sword");
		toolCustoms(0, NODAM, 0, 16, 0);
		Candy_Cane_Sword = new BasicSword(4113, Custom).setUnlocalizedName("Candy_Cane_Sword");
		toolCustoms(0, NODAM, 0, 75, 0);
		Chlorophyte_Claymore = new BasicSword(4114, Custom).setUnlocalizedName("Chlorophyte_Claymore");
		toolCustoms(0, NODAM, 0, 48, 0);
		Chlorophyte_Saber = new BasicSword(4115, Custom).setUnlocalizedName("Chlorophyte_Saber");
		toolCustoms(0, NODAM, 0, 86, 0);
		Christmas_Tree_Sword = new BasicSword(4116, Custom).setUnlocalizedName("Christmas_Tree_Sword");
		toolCustoms(0, NODAM, 0, 16, 0);
		Classy_Cane = new BasicSword(4117, Custom).setUnlocalizedName("Classy_Cane");
		toolCustoms(0, NODAM, 0, 39, 0);
		Cobalt_Sword = new BasicSword(4118, Custom).setUnlocalizedName("Cobalt_Sword");
		toolCustoms(0, NODAM, 0, 49, 0);
		Cutlass = new BasicSword(4121, Custom).setUnlocalizedName("Cutlass");
		toolCustoms(0, NODAM, 0, 57, 0);
		Death_Sickle = new BasicSword(4122, Custom).setUnlocalizedName("Death_Sickle");
		toolCustoms(0, NODAM, 0, 10, 0);
		Ebonwood_Sword = new BasicSword(4123, Custom).setUnlocalizedName("Ebonwood_Sword");
		toolCustoms(0, NODAM, 0, 25, 0);
		Enchanted_Sword_item = new BasicSword(4124, Custom).setUnlocalizedName("Enchanted_Sword_item");
		toolCustoms(0, NODAM, 0, 57, 0);
		Excalibur = new BasicSword(4125, Custom).setUnlocalizedName("Excalibur");
		toolCustoms(0, NODAM, 0, 20, 0);
		Exotic_Scimitar = new BasicSword(4126, Custom).setUnlocalizedName("Exotic_Scimitar");
		toolCustoms(0, NODAM, 0, 30, 0);
		Falcon_Blade = new BasicSword(4127, Custom).setUnlocalizedName("Falcon_Blade");
		toolCustoms(0, NODAM, 0, 70, 0);
		Fetid_Baghnakhs = new BasicSword(4128, Custom).setUnlocalizedName("Fetid_Baghnakhs");
		toolCustoms(0, NODAM, 0, 36, 0);
		Fiery_Greatsword = new BasicSword(4129, Custom).setUnlocalizedName("Fiery_Greatsword");
		toolCustoms(0, NODAM, 0, 49, 0);
		Frostbrand = new BasicSword(4130, Custom).setUnlocalizedName("Frostbrand");
		toolCustoms(0, NODAM, 0, 17, 0);
		Ice_Blade = new BasicSword(4133, Custom).setUnlocalizedName("Ice_Blade");
		toolCustoms(0, NODAM, 0, 42, 0);
		Ice_Sickle = new BasicSword(4134, Custom).setUnlocalizedName("Ice_Sickle");
		toolCustoms(0, NODAM, 0, 110, 0);
		Influx_Waver = new BasicSword(4135, Custom).setUnlocalizedName("Influx_Waver");
		toolCustoms(0, NODAM, 0, 16, 0);
		Katana = new BasicSword(4138, Custom).setUnlocalizedName("Katana");
		toolCustoms(0, NODAM, 0, 70, 0);
		Keybrand = new BasicSword(4139, Custom).setUnlocalizedName("Keybrand");
		toolCustoms(0, NODAM, 0, 200, 0);
		Meowmere = new BasicSword(4143, Custom).setUnlocalizedName("Meowmere");
		toolCustoms(0, NODAM, 0, 19, 0);
		Muramasa = new BasicSword(4144, Custom).setUnlocalizedName("Muramasa");
		toolCustoms(0, NODAM, 0, 44, 0);
		Mythril_Sword = new BasicSword(4145, Custom).setUnlocalizedName("Mythril_Sword");
		toolCustoms(0, NODAM, 0, 42, 0);
		Nights_Edge = new BasicSword(4146, Custom).setUnlocalizedName("Nights_Edge");
		toolCustoms(0, NODAM, 0, 47, 0);
		Orichalcum_Sword = new BasicSword(4147, Custom).setUnlocalizedName("Orichalcum_Sword");
		toolCustoms(0, NODAM, 0, 41, 0);
		Palladium_Sword = new BasicSword(4148, Custom).setUnlocalizedName("Palladium_Sword");
		toolCustoms(0, NODAM, 0, 8, 0);
		Palm_Wood_Sword = new BasicSword(4149, Custom).setUnlocalizedName("Palm_Wood_Sword");
		toolCustoms(0, NODAM, 0, 11, 0);
		Pearlwood_Sword = new BasicSword(4150, Custom).setUnlocalizedName("Pearlwood_Sword");
		toolCustoms(0, NODAM, 0, 21, 0);
		Phaseblade = new BasicSword(4151, Custom).setUnlocalizedName("Phaseblade");
		toolCustoms(0, NODAM, 0, 41, 0);
		Phasesaber = new BasicSword(4152, Custom).setUnlocalizedName("Phasesaber");
		toolCustoms(0, NODAM, 0, 70, 0);
		Psycho_Knife = new Psycho_Knife(4155, Custom).setUnlocalizedName("Psycho_Knife");
		toolCustoms(0, NODAM, 0, 24, 0);
		Purple_Clubberfish = new BasicSword(4156, Custom).setUnlocalizedName("Purple_Clubberfish");
		toolCustoms(0, NODAM, 0, 8, 0);
		Rich_Mahogany_Sword = new BasicSword(4157, Custom).setUnlocalizedName("Rich_Mahogany_Sword");
		toolCustoms(0, NODAM, 0, 50, 0);
		Seedler = new BasicSword(4158, Custom).setUnlocalizedName("Seedler");
		toolCustoms(0, NODAM, 0, 10, 0);
		Shadewood_Sword = new BasicSword(4159, Custom).setUnlocalizedName("Shadewood_Sword");
		toolCustoms(0, NODAM, 0, 35, 0);
		Slap_Hand = new BasicSword(4162, Custom).setUnlocalizedName("Slap_Hand");
		toolCustoms(0, NODAM, 0, 110, 0);
		Star_Wrath = new BasicSword(4163, Custom).setUnlocalizedName("Star_Wrath");
		toolCustoms(0, NODAM, 0, 21, 0);
		Starfury = new Starfury(4164, Custom).setUnlocalizedName("Starfury");
		toolCustoms(0, NODAM, 0, 14, 0);
		Stylish_Scissors = new BasicSword(4165, Custom).setUnlocalizedName("Stylish_Scissors");
		toolCustoms(0, NODAM, 0, 95, 0);
		Terra_Blade = new BasicSword(4166, Custom).setUnlocalizedName("Terra_Blade");
		toolCustoms(0, NODAM, 0, 75, 0);
		The_Horsemans_Blade = new BasicSword(4167, Custom).setUnlocalizedName("The_Horsemans_Blade");
		toolCustoms(0, NODAM, 0, 52, 0);
		Titanium_Sword = new BasicSword(4170, Custom).setUnlocalizedName("Titanium_Sword");
		toolCustoms(0, NODAM, 0, 66, 0);
		True_Excalibur = new BasicSword(4171, Custom).setUnlocalizedName("True_Excalibur");
		toolCustoms(0, NODAM, 0, 90, 0);
		True_Nights_Edge = new BasicSword(4172, Custom).setUnlocalizedName("True_Nights_Edge");
		toolCustoms(0, NODAM, 0, 12, 0);
		Zombie_Arm = new BasicSword(4176, Custom).setUnlocalizedName("Zombie_Arm");
		
		//axe
		toolCustoms(0, NODAM, 0.2f, 3, 0);
		Copper_Axe = new Copper_Axe(Custom).setUnlocalizedName("Copper_Axe").setCreativeTab(Terraria4);
		toolCustoms(0, NODAM, 0.2f, 3, 0);
		Gold_Axe = new Copper_Axe(Custom).setUnlocalizedName("Gold_Axe").setCreativeTab(Terraria4);
		toolCustoms(0, NODAM, 0.2f, 3, 0);
		Iron_Axe = new Copper_Axe(Custom).setUnlocalizedName("Iron_Axe").setCreativeTab(Terraria4);
		toolCustoms(0, NODAM, 0.2f, 3, 0);
		Lead_Axe = new Copper_Axe(Custom).setUnlocalizedName("Lead_Axe").setCreativeTab(Terraria4);
		toolCustoms(0, NODAM, 0.2f, 3, 0);
		Platinum_Axe = new Copper_Axe(Custom).setUnlocalizedName("Platinum_Axe").setCreativeTab(Terraria4);
		toolCustoms(0, NODAM, 0.2f, 3, 0);
		Silver_Axe = new Copper_Axe(Custom).setUnlocalizedName("Silver_Axe").setCreativeTab(Terraria4);
		toolCustoms(0, NODAM, 0.2f, 3, 0);
		Tungsten_Axe = new Copper_Axe(Custom).setUnlocalizedName("Tungsten_Axe").setCreativeTab(Terraria4);
		
		//pickaxe
		toolCustoms(0, NODAM, 1, 4, 0);
		Copper_Pickaxe = new Copper_Pickaxe(Custom).setUnlocalizedName("Copper_Pickaxe").setCreativeTab(Terraria4);
		
		//bows
		Wooden_Bow = (ItemBow) new ItemBow().setUnlocalizedName("Wooden_Bow").setCreativeTab(Terraria3);
		
		//slag
		Copper_Slag = new Item().setUnlocalizedName("Copper_Slag").setCreativeTab(Terraria1);
		
		//Saplings
	}
	
	public static void register() {
		load.reg(terraria, "Terraria");
		load.reg(test, "Ruby Apple");
		load.reg(Admin_Potion, "Admin Potion");
		load.reg(Gel, "Gel");
		//armor
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
		//swords
		//broad
		load.reg(Wooden_Sword, "Wooden Sword");
		load.reg(Copper_broadsword, "Copper Broadsword");
		load.reg(Gold_Broadsword, "Gold Broadsword");
		load.reg(Iron_Broadsword, "Iron Broadsword");
		load.reg(Lead_Broadsword, "Lead Broadsword");
		load.reg(Lights_Bane, "Light's Bane");
		load.reg(Platinum_Broadsword, "Platinum Broadsword");
		load.reg(Silver_Broadsword, "Silver Broadsword");
		load.reg(Tin_Broadsword, "Tin Broadsword");
		load.reg(Tungsten_Broadsword, "Tugsten Broadsword");
		//short
		load.reg(Copper_Shortsword, "Copper Shortsword");
		load.reg(Gold_Shortsword, "Gold Shortsword");
		load.reg(Iron_Shortsword, "Iron Shortsword");
		load.reg(Lead_Shortsword, "Lead_Shortsword");
		load.reg(Platinum_Shortsword, "Platinum Shortsword");
		load.reg(Silver_Shortsword, "Silver Shortsword");
		load.reg(Tin_Shortsword, "Tin Shortsword");
		load.reg(Tungsten_Shortsword, "Tungsten Shortsword");
		//basic
		load.reg(Adamantite_Sword, "Adamantite Sword");
		load.reg(Arkhalis, "Arkhalis");
		load.reg(Beam_Sword, "Beam_Sowrd");
		load.reg(Bee_Keeper, "Bee_Keeper");
		load.reg(Blade_of_Grass, "Blade of Grass");
		load.reg(Bladed_Glove, "Bladed Glove");
		load.reg(Bladetongue, "Bladetongue");
		load.reg(Blood_Butcherer, "Blood Butcherer");
		load.reg(Bone_Sword, "Bone Sword");
		load.reg(Boreal_Wood_Sword, "Boreal Wood Sword");
		load.reg(Breaker_Blade, "Breaker Blade");
		load.reg(Cactus_Sword, "Cactus Sword");
		load.reg(Candy_Cane_Sword, "Candy Cane Sword");
		load.reg(Chlorophyte_Claymore, "Chlorophyte Claymore");
		load.reg(Chlorophyte_Saber, "Chlorophyte Saber");
		load.reg(Christmas_Tree_Sword, "Christmas Tree Sword");
		load.reg(Classy_Cane, "Classy Cane");
		load.reg(Cobalt_Sword, "Cobalt Sword");
		load.reg(Cutlass, "Cutlass");
		load.reg(Death_Sickle, "Death Sickle");
		load.reg(Ebonwood_Sword, "Ebonwood Sword");
		load.reg(Excalibur, "Excalibur");
		load.reg(Exotic_Scimitar, "Exotic Scimitar");
		load.reg(Falcon_Blade, "Falcon Blade");
		load.reg(Fetid_Baghnakhs, "Fetid Baghnakhs");
		load.reg(Fiery_Greatsword, "Fiery Greatsword");
		load.reg(Frostbrand, "Frostbrand");
		load.reg(Ice_Blade, "Ice Blade");
		load.reg(Ice_Sickle, "Ice Sickle");
		load.reg(Influx_Waver, "Influx Waver");
		load.reg(Katana, "Katana");
		load.reg(Keybrand, "Keybrand");
		load.reg(Meowmere, "Meowmere");
		load.reg(Muramasa, "Muramasa");
		load.reg(Mythril_Sword, "Mythril Sword");
		load.reg(Nights_Edge, "Night's Edge");
		load.reg(Orichalcum_Sword, "Orichalcum");
		load.reg(Palladium_Sword, "Palladium Sword");
		load.reg(Palm_Wood_Sword, "Palm Wood Sword");
		load.reg(Pearlwood_Sword, "Pearlwood Sword");
		load.reg(Phaseblade, "Phaseblade");
		load.reg(Phasesaber, "Phasesaber");
		load.reg(Psycho_Knife, "Psycho Knife");
		load.reg(Purple_Clubberfish, "Purple Clubberfish");
		load.reg(Rich_Mahogany_Sword, "Rich Mahogany Sword");
		load.reg(Seedler, "Seedler");
		load.reg(Shadewood_Sword, "Shadewood Sword");
		load.reg(Slap_Hand, "Slap Hand");
		load.reg(Star_Wrath, "Star Wrath");
		load.reg(Starfury, "Starfury");
		load.reg(Stylish_Scissors, "Stylish Scissors");
		load.reg(Terra_Blade, "Terra Blade");
		load.reg(The_Horsemans_Blade, "The Horseman's Blade");
		load.reg(Titanium_Sword, "Titanium Sword");
		load.reg(True_Excalibur, "True Excalibur");
		load.reg(True_Nights_Edge, "True Night's Edge");
		load.reg(Zombie_Arm, "Zombie Arm");
		//axe
		load.reg(Copper_Axe, "Copper Axe");
		load.reg(Gold_Axe, "Gold Axe");
		load.reg(Iron_Axe, "Iron Axe");
		load.reg(Lead_Axe, "Lead Axe");
		load.reg(Platinum_Axe, "Platinum Axe");
		load.reg(Silver_Axe, "Silver Axe");
		load.reg(Tungsten_Axe, "Tungsten Axe");
		//pickaxe
		load.reg(Copper_Pickaxe, "Copper Pickaxe");
		//bows
		load.reg(Wooden_Bow, "Wooden Bow");
		//slag
		load.reg(Copper_Slag, "Copper");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.Terraria", "en_US", "Terraria Items");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Terraria3", "en_US", "Terraria Weapons");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Terraria4", "en_US", "Terraria Tools");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Terraria5", "en_US", "Terraria Armor");
		LanguageRegistry.instance().addStringLocalization("itemGroup.Terraria6", "en_US", "Admin Tools");
	}
	
	public static void registerRenders() {
		registerRender(test);
		registerRender(terraria);
		registerRender(Admin_Potion);
		registerRender(Gel);
		//armor
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
		//swords
		//broad
		registerRender(Wooden_Sword);
		registerRender(Copper_broadsword);
		registerRender(Gold_Broadsword);
		registerRender(Iron_Broadsword);
		registerRender(Lead_Broadsword);
		registerRender(Lights_Bane);
		registerRender(Platinum_Broadsword);
		registerRender(Silver_Broadsword);
		registerRender(Tin_Broadsword);
		registerRender(Tungsten_Broadsword);
		//short
		registerRender(Copper_Shortsword);
		registerRender(Gold_Shortsword);
		registerRender(Iron_Shortsword);
		registerRender(Lead_Shortsword);
		registerRender(Platinum_Shortsword);
		registerRender(Silver_Shortsword);
		registerRender(Tin_Shortsword);
		registerRender(Tungsten_Shortsword);
		//basic
		registerRender(Adamantite_Sword);
		registerRender(Arkhalis);
		registerRender(Beam_Sword);
		registerRender(Bee_Keeper);
		registerRender(Blade_of_Grass);
		registerRender(Bladed_Glove);
		registerRender(Bladetongue);
		registerRender(Blood_Butcherer);
		registerRender(Bone_Sword);
		registerRender(Boreal_Wood_Sword);
		registerRender(Breaker_Blade);
		registerRender(Cactus_Sword);
		registerRender(Candy_Cane_Sword);
		registerRender(Chlorophyte_Claymore);
		registerRender(Chlorophyte_Saber);
		registerRender(Christmas_Tree_Sword);
		registerRender(Classy_Cane);
		registerRender(Cobalt_Sword);
		registerRender(Cutlass);
		registerRender(Death_Sickle);
		registerRender(Ebonwood_Sword);
		registerRender(Enchanted_Sword_item);
		registerRender(Excalibur);
		registerRender(Exotic_Scimitar);
		registerRender(Falcon_Blade);
		registerRender(Fetid_Baghnakhs);
		registerRender(Fiery_Greatsword);
		registerRender(Frostbrand);
		registerRender(Ice_Blade);
		registerRender(Ice_Sickle);
		registerRender(Influx_Waver);
		registerRender(Katana);
		registerRender(Keybrand);
		registerRender(Meowmere);
		registerRender(Muramasa);
		registerRender(Mythril_Sword);
		registerRender(Nights_Edge);
		registerRender(Orichalcum_Sword);
		registerRender(Palladium_Sword);
		registerRender(Palm_Wood_Sword);
		registerRender(Pearlwood_Sword);
		registerRender(Phaseblade);
		registerRender(Phasesaber);
		registerRender(Psycho_Knife);
		registerRender(Purple_Clubberfish);
		registerRender(Rich_Mahogany_Sword);
		registerRender(Seedler);
		registerRender(Shadewood_Sword);
		registerRender(Slap_Hand);
		registerRender(Star_Wrath);
		registerRender(Starfury);
		registerRender(Stylish_Scissors);
		registerRender(Terra_Blade);
		registerRender(The_Horsemans_Blade);
		registerRender(Titanium_Sword);
		registerRender(True_Excalibur);
		registerRender(True_Nights_Edge);
		registerRender(Zombie_Arm);
		//axe
		registerRender(Copper_Axe);
		registerRender(Gold_Axe);
		registerRender(Iron_Axe);
		registerRender(Lead_Axe);
		registerRender(Platinum_Axe);
		registerRender(Silver_Axe);
		registerRender(Tungsten_Axe);
		//pickaxe
		registerRender(Copper_Pickaxe);
		//bows
		registerRender(Wooden_Bow);
		//slag
		registerRender(Copper_Slag);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
