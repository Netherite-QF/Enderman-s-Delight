package com.netheriteqf.endermansdelight.registry;

import com.netheriteqf.endermansdelight.event.CatchShulkers;
import com.netheriteqf.endermansdelight.event.CatchShulkersBullet;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class EDEvent implements ModInitializer {
	public static void regEvent() {
		UseEntityCallback.EVENT.register(new CatchShulkers());
		UseEntityCallback.EVENT.register(new CatchShulkersBullet());
	}

	@Override
	public void onInitialize(ModContainer mod) {

	}
}
