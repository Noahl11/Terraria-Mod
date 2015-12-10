package com.Noahl11.terraria.Entity;

import com.Noahl11.terraria.Terraria;

import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderCow;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.Chunk.EnumCreateEntityType;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityCreator {
	
	public static final void createEntity(Class entityClass, Render render, String entityName, EnumCreatureType type, int probability, int minSpawn, int maxSpawn, BiomeGenBase[] biomes, int solidColor, int spotColor, boolean hasSpawnEgg, int trackingRange, int updateFrequency_1isSugested, boolean sendsVelocityUpdates) {
		int id = EntityRegistry.findGlobalUniqueEntityId();
		
		EntityRegistry.registerGlobalEntityID(entityClass, entityName, id);
		EntityRegistry.registerModEntity(entityClass, entityName, id, Terraria.instance, trackingRange, updateFrequency_1isSugested, sendsVelocityUpdates);
		EntityRegistry.addSpawn(entityName, probability, minSpawn, maxSpawn, type, biomes);
		RenderingRegistry.registerEntityRenderingHandler(entityClass, render);
		
		if(hasSpawnEgg) {
			EntityList.entityEggs.put(Integer.valueOf(id), new EntityList.EntityEggInfo(id, solidColor, spotColor));
		}
	}
	
}
