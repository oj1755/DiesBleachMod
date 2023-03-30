package net.mcreator.diesbleach.procedures;

import net.minecraft.world.IWorld;

import net.mcreator.diesbleach.particle.MahoujinredParticle;
import net.mcreator.diesbleach.DiesbleachMod;

import java.util.Map;

public class BakuhamahouposiyonnoXiaoGuogaKaiShiShiYongsaretatokiProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				DiesbleachMod.LOGGER.warn("Failed to load dependency world for procedure BakuhamahouposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				DiesbleachMod.LOGGER.warn("Failed to load dependency x for procedure BakuhamahouposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				DiesbleachMod.LOGGER.warn("Failed to load dependency y for procedure BakuhamahouposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				DiesbleachMod.LOGGER.warn("Failed to load dependency z for procedure BakuhamahouposiyonnoXiaoGuogaKaiShiShiYongsaretatoki!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		world.addParticle(MahoujinredParticle.particle, x, y, z, 0, 0, 0);
	}
}
