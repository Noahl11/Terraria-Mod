package com.Noahl11.terraria.items.tools.extra;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

import com.Noahl11.terraria.init.TerrariaItems;

public class Inis extends ItemFood{
	
	public Inis() {
		super(20, 5.0f, false);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setMaxStackSize(999);
		super.maxStackSize = 999;
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
		entityIn.setInvisible(true);
		entityIn.setSilent(true);
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
	
}

