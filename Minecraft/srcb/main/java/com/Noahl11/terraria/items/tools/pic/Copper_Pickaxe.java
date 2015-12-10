package com.Noahl11.terraria.items.tools.pic;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class Copper_Pickaxe extends ItemPickaxe{

	public Copper_Pickaxe(ToolMaterial material) {
		super(material);
		
	}
	
	@Override
	public boolean onBlockStartBreak(ItemStack itemstack, BlockPos pos, EntityPlayer player) {
		this.setDamage(itemstack, 0);
		return super.onBlockStartBreak(itemstack, pos, player);
	}
	
	@Override
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, BlockPos pos, EntityLivingBase playerIn) {
		this.setDamage(stack, 0);
		return super.onBlockDestroyed(stack, worldIn, blockIn, pos, playerIn);
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
		this.setDamage(stack, 0);
		return super.onEntitySwing(entityLiving, stack);
	}
	
	@Override
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		this.setDamage(stack, 0);
		return super.onLeftClickEntity(stack, player, entity);
	}

}
