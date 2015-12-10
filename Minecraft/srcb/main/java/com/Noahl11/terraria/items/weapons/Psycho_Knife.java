package com.Noahl11.terraria.items.weapons;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.Noahl11.terraria.init.ItemLoaders;
import com.Noahl11.terraria.init.TerrariaItems;

public class Psycho_Knife extends ItemSword{
	
	public Psycho_Knife(int i, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(TerrariaItems.Terraria3);
	}
	
	@Override
	public void onUpdate(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {	
		if (isSelected == true) {
				if (entityIn.isSprinting()) {
					entityIn.setInvisible(false);
					entityIn.setSilent(false);
				}else {
					if (!entityIn.isInvisible()) {
						entityIn.setInvisible(true);
						entityIn.setSilent(true);
					}
				}
			}else {
				entityIn.setInvisible(false);
				entityIn.setSilent(false);
			}
		super.onUpdate(stack, worldIn, entityIn, itemSlot, isSelected);
	}
	
	@Override
	public boolean onDroppedByPlayer(ItemStack item, EntityPlayer player) {
		player.setInvisible(false);
		player.setSilent(false);
		return super.onDroppedByPlayer(item, player);
	}
	
	private class Sleep {
		private Sleep() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
			}
		}
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
