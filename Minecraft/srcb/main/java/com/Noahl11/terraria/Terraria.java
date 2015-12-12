package com.Noahl11.terraria;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.item.ItemStack;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

import com.Noahl11.terraria.Debuff.effects.Admin;
import com.Noahl11.terraria.Debuff.effects.Bleeding;
import com.Noahl11.terraria.Entity.EntityCreator;
import com.Noahl11.terraria.Entity.hostile.Entity.EntityBlue_Jellyfish;
import com.Noahl11.terraria.Entity.hostile.Entity.EntitySlime2;
import com.Noahl11.terraria.Entity.hostile.Entity.EntitySlime3;
import com.Noahl11.terraria.Entity.render.RenderBlue_Jellyfish;
import com.Noahl11.terraria.Entity.render.RenderBlue_Slime;
import com.Noahl11.terraria.Entity.render.RenderSlime;
import com.Noahl11.terraria.biome.TerrariaCorruptionBiome;
import com.Noahl11.terraria.generators.CopperOreGenerator;
import com.Noahl11.terraria.generators.LeadOreGenerator;
import com.Noahl11.terraria.generators.PlatinumOreGenerator;
import com.Noahl11.terraria.generators.SilverOreGenerator;
import com.Noahl11.terraria.generators.TinOreGenerator;
import com.Noahl11.terraria.generators.TungstenOreGenerator;
import com.Noahl11.terraria.init.TerrariaArmor;
import com.Noahl11.terraria.init.TerrariaBlocks;
import com.Noahl11.terraria.init.TerrariaItems;
import com.Noahl11.terraria.init.TerrariaPlants;
import com.Noahl11.terraria.proxy.CommonProxy;
import com.Noahl11.terraria.utils.Events;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Terraria {
	
	CraftManager craft;

	@Instance
	public static Terraria instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static Bleeding bleed = new Bleeding();
	public static Admin admin = new Admin();
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		TerrariaItems.type();
		TerrariaItems.init();
		TerrariaItems.register();
		TerrariaBlocks.init();
		TerrariaBlocks.register();
		TerrariaPlants.init();
		TerrariaPlants.register();
		TerrariaArmor.init();
		TerrariaArmor.register();
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerRenders();
		craft.shapless(TerrariaBlocks.Boreal_Wood_Platform, TerrariaBlocks.Boreal_Wood);
		GameRegistry.registerWorldGenerator(new CopperOreGenerator(TerrariaBlocks.Copper_Ore, 20, 10, 90, 6, 60), 0);
		GameRegistry.registerWorldGenerator(new LeadOreGenerator(TerrariaBlocks.Lead_Ore, 10, 10, 90, 6, 60), 0); // = iron
		GameRegistry.registerWorldGenerator(new PlatinumOreGenerator(TerrariaBlocks.Platinum_Ore, 25, 10, 20, 6, 60), 0); //Add in depth tester = gold
		GameRegistry.registerWorldGenerator(new SilverOreGenerator(TerrariaBlocks.Silver_Ore, 5, 10, 90, 6, 60), 0);
		GameRegistry.registerWorldGenerator(new TinOreGenerator(TerrariaBlocks.Tin_Ore, 20, 10, 90, 6, 60), 0);
		GameRegistry.registerWorldGenerator(new TungstenOreGenerator(TerrariaBlocks.Tungsten_Ore, 5, 10, 90, 6, 60), 0);
		//GameRegistry.registerWorldGenerator(new AdamantiteOreGenerator(TerrariaBlocks.Adamantite_Ore, 1, 5, 10, 6, 30), 0);
		
		GameRegistry.addSmelting(new ItemStack(TerrariaBlocks.Copper_Ore), new ItemStack(TerrariaItems.Copper_Slag), 20);
		
		BiomeManager.addBiome(BiomeType.WARM, new BiomeEntry(new TerrariaCorruptionBiome(), 100));
		
		Events.first = true;
		MinecraftForge.EVENT_BUS.register(new Events());
		
		EntityCreator.createEntity(EntityBlue_Jellyfish.class, new RenderBlue_Jellyfish(), "Blue Jellyfish", EnumCreatureType.MONSTER, 10, 0, 7, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.desert}, 0x17C2CF, 0x2C757A, true, 64, 1, true);
		EntityCreator.createEntity(EntitySlime2.class, new RenderSlime(), "Terraria Slime", EnumCreatureType.MONSTER, 50, 0, 10, new BiomeGenBase[] {BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.swampland, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau}, 0x248214, 0x43E327, true, 64, 1, true);
		EntityCreator.createEntity(EntitySlime3.class, new RenderBlue_Slime(), "Terraria Blue Slime", EnumCreatureType.MONSTER, 50, 0, 10, new BiomeGenBase[] {BiomeGenBase.birchForest, BiomeGenBase.birchForestHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.swampland, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau}, 0x0004FF, 0x90C3D4, true, 64, 1, true);
		LanguageRegistry.instance().addStringLocalization("entity.Blue Jellyfish.name", "en_US", "Blue Jellyfish");
		LanguageRegistry.instance().addStringLocalization("entity.Terraria Slime.name", "en_US", "Terraria Slime");
		LanguageRegistry.instance().addStringLocalization("entity.Terraria Blue Slime.name", "en_US", "Terraria Slime");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
}
