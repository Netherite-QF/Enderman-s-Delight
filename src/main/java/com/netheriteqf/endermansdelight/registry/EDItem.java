package com.netheriteqf.endermansdelight.registry;

import com.netheriteqf.endermansdelight.EDMod;
import com.netheriteqf.endermansdelight.items.ShadowBerryJamItem;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.quiltmc.qsl.item.group.api.QuiltItemGroup;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;


public class EDItem implements ModInitializer {
	public static final ItemGroup EDGROUP = QuiltItemGroup.builder(new Identifier(EDMod.MODID, "endermans_delight"))
			.icon(() -> new ItemStack(EDItem.END_FISH_SASHIMI))
			.build();
	public static Item END_FISH_SASHIMI;
	public static Item BLOSSOM_BERRY_JELLY;
	public static Item FRIED_GLOWING_BULB;
	public static Item SHADOW_BERRY_JAM;
	public static Item UMBRELLA_CLUSTER_JELLY;
	public static Item SHULKERS_CATCH_NET;
	public static Item CATCHED_SHULKER;
	public static Item Ender_Pearl_Grain;
	public static Item SHULKER_BULLET;
	public static Item SHULKER_SLICE;
	public static void regItem() {
		END_FISH_SASHIMI = Registry.register(Registry.ITEM,
				new Identifier(EDMod.MODID, "end_fish_sashimi"),
				new Item(new QuiltItemSettings().food(new FoodComponent.Builder().hunger(3).saturationModifier(3).build()).group(EDGROUP))
		);
		BLOSSOM_BERRY_JELLY = Registry.register(Registry.ITEM,
				new Identifier(EDMod.MODID, "blossom_berry_jelly"),
				new Item(new QuiltItemSettings().food(new FoodComponent.Builder().hunger(6).saturationModifier(4).build()).group(EDGROUP))
		);
		FRIED_GLOWING_BULB = Registry.register(Registry.ITEM,
				new Identifier(EDMod.MODID, "fried_glowing_bulb"),
				new Item(new QuiltItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(6).build()).group(EDGROUP))
		);
		SHADOW_BERRY_JAM = Registry.register(Registry.ITEM,
				new Identifier(EDMod.MODID, "shadow_berry_jam"),
				new ShadowBerryJamItem(new QuiltItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(6).build()).maxCount(16).group(EDGROUP))
		);
		UMBRELLA_CLUSTER_JELLY  = Registry.register(Registry.ITEM,
				new Identifier(EDMod.MODID, "umbrella_cluster_jelly"),
				new Item(new QuiltItemSettings().food(new FoodComponent.Builder().hunger(4).saturationModifier(6).build()).group(EDGROUP))
		);
		SHULKERS_CATCH_NET  = Registry.register(Registry.ITEM,
				new Identifier(EDMod.MODID, "shulkers_catch_net"),
				new Item(new QuiltItemSettings().maxCount(1).group(EDGROUP))
		);
		CATCHED_SHULKER  = Registry.register(Registry.ITEM,
				new Identifier(EDMod.MODID, "catched_shulker"),
				new Item(new QuiltItemSettings().maxCount(1).group(EDGROUP))
		);
		SHULKER_SLICE  = Registry.register(Registry.ITEM,
				new Identifier(EDMod.MODID, "shulker_slice"),
				new Item(new QuiltItemSettings().group(EDGROUP))
		);
		Ender_Pearl_Grain = Registry.register(Registry.ITEM,
				new Identifier(EDMod.MODID, "ender_pearl_grain"),
				new Item(new QuiltItemSettings().group(EDGROUP))
		);
		SHULKER_BULLET = Registry.register(Registry.ITEM,
				new Identifier(EDMod.MODID, "shulker_bullet"),
				new Item(new QuiltItemSettings().food(new FoodComponent.Builder().hunger(2).saturationModifier(1).statusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 80 ,2), 1).build()).group(EDGROUP))
		);
	}

	@Override
	public void onInitialize(ModContainer mod) {

	}
}
