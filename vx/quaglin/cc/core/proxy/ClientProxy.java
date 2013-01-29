package vx.quaglin.cc.core.proxy;

import net.minecraftforge.client.MinecraftForgeClient;

import vx.quaglin.cc.lib.Sprites;

public class ClientProxy extends CommonProxy {

	@Override
	public void initRenderingAndTextures() {
		
		MinecraftForgeClient.preloadTexture(Sprites.SPRITE_SHEET_LOCATION + Sprites.BLOCK_SPRITE_SHEET);
		MinecraftForgeClient.preloadTexture(Sprites.SPRITE_SHEET_LOCATION + Sprites.ITEM_SPRTIE_SHEET);		
	}
}
