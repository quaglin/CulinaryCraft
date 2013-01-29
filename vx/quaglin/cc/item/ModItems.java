package vx.quaglin.cc.item;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import vx.quaglin.cc.lib.ItemIds;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Mod item instances
	public static Item chefKnife;
	
	public static void init() {
		
		//Initialize each mod item individually.
		chefKnife = new ItemChefKnife(ItemIds.CHEF_KNIFE);
	}
}
