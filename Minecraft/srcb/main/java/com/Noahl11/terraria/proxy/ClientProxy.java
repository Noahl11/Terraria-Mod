package com.Noahl11.terraria.proxy;

import com.Noahl11.terraria.init.TerrariaBlocks;
import com.Noahl11.terraria.init.TerrariaItems;
import com.Noahl11.terraria.init.TerrariaPlants;

public class ClientProxy extends CommonProxy {
	
	@Override
	public void registerRenders() {
		TerrariaItems.registerRenders();
		TerrariaBlocks.registerRenders();
		TerrariaPlants.registerRenders();
	}
}
