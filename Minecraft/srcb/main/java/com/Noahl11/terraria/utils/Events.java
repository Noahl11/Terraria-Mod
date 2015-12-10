package com.Noahl11.terraria.utils;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.BlockPos;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.event.entity.player.AchievementEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.BlockEvent.BreakEvent;
import net.minecraftforge.event.world.BlockEvent.NeighborNotifyEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import org.lwjgl.input.Keyboard;

import com.Noahl11.terraria.Terraria;
import com.Noahl11.terraria.init.TerrariaItems;


public class Events {
	
	public static boolean first;
	
	//@SubscribeEvent
	//public void onGuiOpened(GuiOpenEvent event) {
	//	if (event.gui instanceof GuiOptions) {
	//		event.gui = new GuiModInfo();
	//	}
	//}
	
	@SubscribeEvent
	public void bleeding(LivingUpdateEvent e) {
		EntityLivingBase p2 = e.entityLiving;
		if (!p2.isCreatureType(EnumCreatureType.WATER_CREATURE, false) && !p2.isCreatureType(EnumCreatureType.MONSTER, false) && !p2.isCreatureType(EnumCreatureType.CREATURE, false) && !p2.isCreatureType(EnumCreatureType.AMBIENT, false)) {
			p2.addPotionEffect(new PotionEffect(23, 100000, 1, false, false));
			p2.stepHeight = 1.0f;
			if (p2.isInWater()) {
				p2.setVelocity(p2.motionX * 1.1, -0.1, p2.motionZ * 1.1);
			}
			if (p2.isPotionActive(Terraria.bleed)) {
				if (p2.getHealth() > 0.5f) {
					p2.attackEntityFrom(DamageSource.magic, 0.13F);
				}
			}
			if(p2.isPotionActive(Terraria.admin)) {
				p2.addPotionEffect(new PotionEffect(10, 3, 250, false, false));
				p2.addPotionEffect(new PotionEffect(14, 3, 1, false, false));
				p2.addPotionEffect(new PotionEffect(5, 3, 250, false, false));
				p2.addPotionEffect(new PotionEffect(11, 3, 250, false, false));
				p2.addPotionEffect(new PotionEffect(12, 3, 1, false, false));
				p2.addPotionEffect(new PotionEffect(16, 3, 1, false, false));
				p2.canBreatheUnderwater();
				if(Keyboard.isKeyDown(Keyboard.KEY_R)) {
					p2.stepHeight = 100;
				}
				if(p2.isSneaking()) {
					p2.stepHeight = 1;
				}
				if(Keyboard.isKeyDown(Keyboard.KEY_V)) {
					if(p2.isCollidedHorizontally) {
						p2.motionY = .1;
					}
				}
				if(Keyboard.isKeyDown(Keyboard.KEY_C) && Keyboard.isKeyDown(Keyboard.KEY_X)) {
					Keyboard.enableRepeatEvents(false);
					p2.setPositionAndUpdate(p2.rayTrace(100, 1.0f).hitVec.xCoord, p2.rayTrace(64, 1.0f).hitVec.yCoord + 2, p2.rayTrace(100, 1.0f).hitVec.zCoord);
				}
				if(p2.isInWater()) {
					p2.setVelocity(p2.motionX * 1.05, 0.001, p2.motionZ * 1.05);
					if (p2.isCollidedHorizontally) {
						p2.setVelocity(0, 1, 0);
					}
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onStartUp(AchievementEvent e) {	
		EntityPlayer p = e.entityPlayer;
		if (first == true && !p.capabilities.isCreativeMode) {
			p.inventory.setInventorySlotContents(0, new ItemStack(TerrariaItems.Copper_Shortsword, 1));
			p.inventory.setInventorySlotContents(1, new ItemStack(TerrariaItems.Copper_Axe, 1));
			p.inventory.setInventorySlotContents(2, new ItemStack(TerrariaItems.Copper_Pickaxe, 1));
			first = false;
		}
	}
}
