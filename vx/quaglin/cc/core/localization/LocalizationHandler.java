package vx.quaglin.cc.core.localization;

import vx.quaglin.cc.core.localization.LocalizationHelper;
import vx.quaglin.cc.lib.Localizations;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationHandler {
	
	public static void loadLanguages() {
		
		for (String localizationFile : Localizations.localeFiles) {
			LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationHelper.getLocaleFromFileName(localizationFile), LocalizationHelper.isXMLLanguageFile(localizationFile));
		}
	}

}
