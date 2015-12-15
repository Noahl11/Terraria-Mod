package com.Noahl11.terraria.proxy;

import java.util.HashMap;
import java.util.Map;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;

import com.Noahl11.terraria.Entity.armor.Mining_helmet;
import com.Noahl11.terraria.init.TerrariaArmor;
import com.Noahl11.terraria.init.TerrariaBlocks;
import com.Noahl11.terraria.init.TerrariaItems;
import com.Noahl11.terraria.init.TerrariaPlants;

public class ClientProxy extends CommonProxy {
	
	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	
	@Override
	public void registerRenders() {
		Mining_helmet Mining_Helm = new Mining_helmet();
		armorModels.put(TerrariaArmor.Mining_Helmet, Mining_Helm);
		
		TerrariaItems.registerRenders();
		TerrariaBlocks.registerRenders();
		TerrariaPlants.registerRenders();
		TerrariaArmor.registerRenders();
	}
}
