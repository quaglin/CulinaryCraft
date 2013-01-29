package vx.quaglin.cc.item;

import net.minecraft.item.Item;

import vx.quaglin.cc.lib.Reference;
import vx.quaglin.cc.lib.Sprites;

public class ItemCC extends Item {

	public ItemCC(int id) {
		
		super(id - Reference.SHIFTED_ID_RANGE_CORRECTION);
		maxStackSize = 1;
		setTextureFile(Sprites.SPRITE_SHEET_LOCATION + Sprites.ITEM_SPRTIE_SHEET);
		setNoRepair();

	}

}
