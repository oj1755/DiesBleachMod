package net.mcreator.diesbleach.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.advancements.Advancement;

import net.mcreator.diesbleach.DiesbleachMod;

import java.util.Map;

public class IoiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesbleachMod.LOGGER.warn("Failed to load dependency world for procedure Ioi!");
			return;
		}
		if (dependencies.get("advancement") == null) {
			if (!dependencies.containsKey("advancement"))
				DiesbleachMod.LOGGER.warn("Failed to load dependency advancement for procedure Ioi!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				DiesbleachMod.LOGGER.warn("Failed to load dependency entity for procedure Ioi!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		Advancement advancement = (Advancement) dependencies.get("advancement");
		Entity entity = (Entity) dependencies.get("entity");
		if (world instanceof World && ((World) world).getServer() != null
				? ((World) world).getServer().getAdvancementManager().getAdvancement(new ResourceLocation("none")).equals(advancement)
				: false) {
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.isFlying = (true);
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		}
	}
}
