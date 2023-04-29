package com.netheriteqf.endermansdelight;

import com.netheriteqf.endermansdelight.registry.EDEvent;
import com.netheriteqf.endermansdelight.registry.EDItem;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class EDMod implements ModInitializer {
	public static String MODID = "endermans_delight";

	@Override
	public void onInitialize(ModContainer mod) {
		EDItem.regItem();
		EDEvent.regEvent();
	}
}
