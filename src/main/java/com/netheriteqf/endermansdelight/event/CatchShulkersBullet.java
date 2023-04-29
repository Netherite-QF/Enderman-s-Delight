package com.netheriteqf.endermansdelight.event;

import com.netheriteqf.endermansdelight.registry.EDItem;
import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ShulkerBulletEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CatchShulkersBullet implements UseEntityCallback {
	@Override
	public ActionResult interact(PlayerEntity player, World world, Hand hand, Entity entity, @Nullable EntityHitResult hitResult) {
		ItemStack stack = player.getStackInHand(hand);
		if (entity instanceof ShulkerBulletEntity shulkerBulletEntity) {
			if (stack.isOf(EDItem.SHULKERS_CATCH_NET)) {
				shulkerBulletEntity.discard();
				player.getStackInHand(hand).setCooldown(16);
				if (!world.isClient) {
					player.increaseStat(Stats.USED.getOrCreateStat(EDItem.SHULKER_BULLET),1);
					world.spawnEntity(entity.dropItem(EDItem.SHULKER_BULLET));
					return ActionResult.SUCCESS;
				}
			}
		}
		return ActionResult.PASS;
	}
}
