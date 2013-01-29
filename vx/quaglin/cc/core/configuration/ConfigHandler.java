package vx.quaglin.cc.core.configuration;

import java.io.File;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;

import net.minecraftforge.common.Configuration;

import vx.quaglin.cc.lib.ItemIds;
import vx.quaglin.cc.lib.BlockIds;
import vx.quaglin.cc.lib.Reference;
import vx.quaglin.cc.lib.Strings;

public class ConfigHandler {
	
	public static Configuration configuration;
	
	public static void init(File configFile) {
		
		configuration = new Configuration(configFile);
		
		try {
			configuration.load();
			
			//Item configs
			ItemIds.CHEF_KNIFE = configuration.getItem(Strings.CHEF_KNIFE_NAME, ItemIds.CHEF_KNIFE_DEFAULT).getInt(ItemIds.CHEF_KNIFE_DEFAULT);
		}
		catch (Exception e) {
			FMLLog.log(Level.SEVERE, e, Reference.MOD_NAME + " has had a problem loading its configuration");
		}
		finally {
			configuration.save();
		}
	}

}
