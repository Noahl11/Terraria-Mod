package com.Noahl11.terraria.items.weapons;

import com.Noahl11.terraria.init.TerrariaItems;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.world.World;

public class BasicSword extends ItemSword{

	public BasicSword(int i, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(TerrariaItems.Terraria3);
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
	
	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		return super.onItemRightClick(itemStackIn, worldIn, playerIn);
	}

}
