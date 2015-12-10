package com.Noahl11.terraria.Entity.hostile.Entity;

import com.Noahl11.terraria.init.TerrariaItems;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

public class EntitySlime3 extends EntitySlime{

	public EntitySlime3(World worldIn) {
		super(worldIn);
	}
	
	public void setDead() {
		isDead = true;
	}
	
	protected Item getDropItem() {
		return TerrariaItems.Gel;
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
	}

}
