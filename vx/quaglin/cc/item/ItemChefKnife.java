package vx.quaglin.cc.item;

import vx.quaglin.cc.CulinaryCraft;
import vx.quaglin.cc.lib.Strings;

public class ItemChefKnife extends ItemCC {
	
	public ItemChefKnife(int id) {
		
		super(id);
		this.setIconCoord(0, 0);
		this.setItemName(Strings.CHEF_KNIFE_NAME);
		this.setCreativeTab(CulinaryCraft.tabsCC);
		maxStackSize = 1;
	}

}
