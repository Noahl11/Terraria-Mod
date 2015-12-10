package com.Noahl11.terraria.items.weapons;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

import com.Noahl11.terraria.Entity.freindly.Star;
import com.Noahl11.terraria.init.TerrariaItems;

public class Starfury extends ItemSword {
	
	public Starfury(int i, ToolMaterial material) {
		super(material);
		this.setCreativeTab(CreativeTabs.tabAllSearch);
		this.setCreativeTab(TerrariaItems.Terraria3);
	}
	
	@Override
	public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
		this.setDamage(stack, 0);
		World worldIn = entityLiving.getEntityWorld();
		Star lightning = new Star(worldIn);
		worldIn.spawnEntityInWorld(lightning);
		lightning.setPosition(entityLiving.rayTrace(50, 1.0f).hitVec.xCoord, entityLiving.rayTrace(50, 1.0f).hitVec.yCoord, entityLiving.rayTrace(50, 1.0f).hitVec.zCoord);
		return super.onEntitySwing(entityLiving, stack);
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
	public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
		this.setDamage(stack, 0);
		return super.onLeftClickEntity(stack, player, entity);
	}

}
