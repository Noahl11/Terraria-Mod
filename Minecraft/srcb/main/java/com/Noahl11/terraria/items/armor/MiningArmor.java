package com.Noahl11.terraria.items.armor;

import com.Noahl11.terraria.proxy.ClientProxy;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MiningArmor extends ItemArmor{

	public MiningArmor(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
	}
	
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack item, int armorSlot) {
		
		ModelBiped armorModel = ClientProxy.armorModels.get(this);
		
		return armorModel;
	}
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		if(player.getCurrentArmor(0) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(3) != null) {
			player.addPotionEffect(new PotionEffect(3, 10, 1, false, false));
			player.addPotionEffect(new PotionEffect(22, 10, 1, false, false));
		}
		super.onArmorTick(world, player, itemStack);
		//EntityFlameFX
	}
	
}
