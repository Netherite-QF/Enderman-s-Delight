package com.netheriteqf.endermansdelight.event;

import com.netheriteqf.endermansdelight.registry.EDItem;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.mob.ShulkerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CatchShulkers implements UseEntityCallback {
	@Override
	public ActionResult interact(PlayerEntity player, World world, Hand hand, Entity entity, @Nullable EntityHitResult hitResult) {
		ItemStack stack = player.getStackInHand(hand);
		if (entity instanceof ShulkerEntity shulkerEntity) {
			if (stack.isOf(EDItem.SHULKERS_CATCH_NET)) {
				shulkerEntity.discard();
				player.getStackInHand(hand).setCooldown(160);
				player.playSound(SoundEvents.BLOCK_SHULKER_BOX_OPEN, 15.0f, 15.0f);
				if (!world.isClient) {
					player.increaseStat(Stats.USED.getOrCreateStat(EDItem.CATCHED_SHULKER),1);
					world.spawnEntity(entity.dropItem(EDItem.CATCHED_SHULKER));
					return ActionResult.SUCCESS;
				}
			}
		}
		return ActionResult.PASS;
	}
}
