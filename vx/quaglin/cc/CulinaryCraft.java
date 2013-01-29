package vx.quaglin.cc;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import vx.quaglin.cc.core.configuration.ConfigHandler;
import vx.quaglin.cc.core.creativetab.CreativeTabCC;
import vx.quaglin.cc.core.localization.LocalizationHandler;
import vx.quaglin.cc.core.proxy.CommonProxy;
import vx.quaglin.cc.item.ItemCC;
import vx.quaglin.cc.item.ModItems;
import vx.quaglin.cc.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid=Reference.MOD_ID, name=Reference.MOD_NAME, version=Reference.VERSION)
@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class CulinaryCraft {
	
	@Instance(Reference.MOD_ID)
	public static CulinaryCraft instance;
		
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static CreativeTabs tabsCC = new CreativeTabCC(CreativeTabs.getNextID(), Reference.MOD_ID);
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event) {
		
		//Load the localization files into the LanguageRegistry
		LocalizationHandler.loadLanguages();
		
		//Initialize the configuration
		ConfigHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		//Initialize mod items
		ModItems.init();
		
		//Initialize custom rendering and pre-load textures (Client only)
		proxy.initRenderingAndTextures();
	}
	
	@PostInit
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
