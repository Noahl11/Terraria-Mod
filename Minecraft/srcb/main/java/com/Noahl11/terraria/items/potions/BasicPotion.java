package com.Noahl11.terraria.items.potions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemGlassBottle;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fluids.ItemFluidContainer;

public class BasicPotion extends ItemFluidContainer{

	public BasicPotion(int itemID, int capacity) {
		super(itemID, capacity);
	}

	@Override
	public ItemStack onItemUseFinish(ItemStack stack, World worldIn, EntityPlayer playerIn) {
		playerIn.addPotionEffect(new PotionEffect(25, 10000, 2, false, false));
		return super.onItemUseFinish(stack, worldIn, playerIn);
	}
	
}
