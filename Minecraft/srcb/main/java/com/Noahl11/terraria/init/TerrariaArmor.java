import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.LanguageRegistry;

import com.Noahl11.terraria.Reference;


public class TerrariaArmor {

	public static ItemLoaders load;
	public static ArmorMaterial CustomArmor;
	
	public static Item Admin_Helmet;
	public static Item Admin_Chainmail;
	public static Item Admin_Leggings;
	public static Item Admin_Boots;
	public static Item Wood_Helmet;
	public static Item Wood_ChestPlate;
	public static Item Wood_Leggings;
	public static Item Wood_Boots;
	public static Item Copper_Helmet;
	public static Item Copper_Chainmail;
	public static Item Copper_Leggings;
	public static Item Copper_Boots;
	public static Item Lead_Helmet;
	public static Item Lead_Chainmail;
	public static Item Lead_Leggings;
	public static Item Lead_Boots;
	public static Item Tungsten_Helmet;
	public static Item Tungsten_Chainmail;
	public static Item Tungsten_Leggings;
	public static Item Tungsten_Boots;
	
	public static CreativeTabs Terraria5 = new CreativeTabs("Terraria5") {
		public Item getTabIconItem() {
				return Wood_Helmet;
		}
	};
	public static void armorCustoms(String textureName, int durability, int i, int i2, int i3, int i4, int enchantability) {
		CustomArmor = EnumHelper.addArmorMaterial("CustomArmor", textureName, durability, new int[] {i, i2, i3, i4}, enchantability);
	}
	
	public static void armorCustoms(String textureName, int durability, int i, int i2, int i3, int i4, int enchantability) {
		CustomArmor = EnumHelper.addArmorMaterial("CustomArmor", textureName, durability, new int[] {i, i2, i3, i4}, enchantability);
	}
	
	public static void init() {
		armorCustoms("terraria:Copper_Armor", 20, 3, 8, 4, 3, 0);
		Wood_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Wood_Helmet").setCreativeTab(Terraria5);
		Wood_ChestPlate = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Wood_ChestPlate").setCreativeTab(Terraria5);
		Wood_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Wood_Leggings").setCreativeTab(Terraria5);
		Wood_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Wood_Boots").setCreativeTab(Terraria5);
		armorCustoms("terraria:Copper_Armor", 20, 1, 2, (int) 0.5, (int) 0.5, 0);
		Copper_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Copper_Helmet").setCreativeTab(Terraria5);
		Copper_Chainmail = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Copper_Chainmail").setCreativeTab(Terraria5);
		Copper_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Copper_Leggings").setCreativeTab(Terraria5);
		Copper_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Copper_Boots").setCreativeTab(Terraria5);
		armorCustoms("terraria:Lead_Armor", 20, 1, 2, (int) 0.5, (int) 0.5, 0);
		Lead_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Lead_Helmet").setCreativeTab(Terraria5);
		Lead_Chainmail = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Lead_Chainmail").setCreativeTab(Terraria5);
		Lead_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Lead_Leggings").setCreativeTab(Terraria5);
		Lead_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Lead_Boots").setCreativeTab(Terraria5);
		armorCustoms("terraria:Tungsten_Armor", 20, 1, 2, (int) 0.5, (int) 0.5, 0);
		Tungsten_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Tungsten_Helmet").setCreativeTab(Terraria5);
		Tungsten_Chainmail = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Tungsten_Chainmail").setCreativeTab(Terraria5);
		Tungsten_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Tungsten_Leggings").setCreativeTab(Terraria5);
		Tungsten_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Tungsten_Boots").setCreativeTab(Terraria5);
		armorCustoms("terraria:invis", 100000, 1000, 2000, 500, 500, 0);
		Admin_Helmet = new ItemArmor(CustomArmor, 1, 0).setUnlocalizedName("Admin_Helmet").setCreativeTab(Terraria6);
		Admin_Chainmail = new ItemArmor(CustomArmor, 1, 1).setUnlocalizedName("Admin_Chainmail").setCreativeTab(Terraria6);
		Admin_Leggings = new ItemArmor(CustomArmor, 2, 2).setUnlocalizedName("Admin_Leggings").setCreativeTab(Terraria6);
		Admin_Boots = new ItemArmor(CustomArmor, 1, 3).setUnlocalizedName("Admin_Boots").setCreativeTab(Terraria6);
	}
	
	public static void register() {
		load.reg(Wood_Helmet, "Wood Helmet");
		load.reg(Wood_ChestPlate, "Wood Chestplate");
		load.reg(Wood_Leggings, "Wood Leggings");
		load.reg(Wood_Boots, "Wood Boots");
		load.reg(Copper_Helmet, "Copper Helmet");
		load.reg(Copper_Chainmail, "Copper Chainmail");
		load.reg(Copper_Leggings, "Copper Leggings");
		load.reg(Copper_Boots, "Copper Boots");
		load.reg(Lead_Helmet, "Lead Helmet");
		load.reg(Lead_Chainmail, "Lead Chainmail");
		load.reg(Lead_Leggings, "Lead_Leggings");
		load.reg(Lead_Boots, "Lead Boots");
		load.reg(Tungsten_Helmet, "Tungsten Helmet");
		load.reg(Tungsten_Chainmail, "Tungsten Chainmail");
		load.reg(Tungsten_Leggings, "Tungsten Leggings");
		load.reg(Tungsten_Boots, "Tungsten Boots");
		load.reg(Admin_Helmet, "Admin Helmet");
		load.reg(Admin_Chainmail, "Admin Chainmail");
		load.reg(Admin_Leggings, "Admin Leggings");
		load.reg(Admin_Boots, "Admin Boots");
		
		LanguageRegistry.instance().addStringLocalization("itemGroup.Terraria5", "en_US", "Terraria Armor");
	}
	
	public static void registerRenders() {
		registerRender(Wood_Helmet);
		registerRender(Wood_ChestPlate);
		registerRender(Wood_Leggings);
		registerRender(Wood_Boots);
		registerRender(Copper_Helmet);
		registerRender(Copper_Chainmail);
		registerRender(Copper_Leggings);
		registerRender(Copper_Boots);
		registerRender(Lead_Helmet);
		registerRender(Lead_Chainmail);
		registerRender(Lead_Leggings);
		registerRender(Lead_Boots);
		registerRender(Tungsten_Helmet);
		registerRender(Tungsten_Chainmail);
		registerRender(Tungsten_Leggings);
		registerRender(Tungsten_Boots);
		registerRender(Admin_Helmet);
		registerRender(Admin_Chainmail);
		registerRender(Admin_Leggings);
		registerRender(Admin_Boots);
	}
	
	public static void registerRender(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
	
}
