package net.skullix.fullyoperational.procedures;

import net.skullix.fullyoperational.init.FullyOperationalModEntities;
import net.skullix.fullyoperational.entity.FreddyFazbearNightEntity;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class FO_NightWalk2SpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		double yaw = 0;
		yaw = 360;
		if (world.dayTime() >= 0) {
			if (world.dayTime() < 18000) {
				if (entity instanceof FreddyFazbearNightEntity) {
					if (entity instanceof Mob _entity)
						_entity.getNavigation().moveTo((entity.getPersistentData().getDouble("dayX")), (entity.getPersistentData().getDouble("dayY")), (entity.getPersistentData().getDouble("dayZ")), 0.3);
					if (entity.getDeltaMovement().x() == 0 && (entity.getX() == entity.getPersistentData().getDouble("dayX")) == (entity.getZ() == entity.getPersistentData().getDouble("dayZ"))) {
						if (!entity.level().isClientSide())
							entity.discard();
						if (world instanceof ServerLevel _level) {
							Entity entityToSpawn = FullyOperationalModEntities.FREDDY_FAZBEAR.get().spawn(_level,
									BlockPos.containing(entity.getPersistentData().getDouble("dayX"), entity.getPersistentData().getDouble("dayY"), entity.getPersistentData().getDouble("dayZ")), MobSpawnType.MOB_SUMMONED);
							if (entityToSpawn != null) {
								entityToSpawn.setYRot((float) entity.getPersistentData().getDouble("dayRot"));
								entityToSpawn.setYBodyRot((float) entity.getPersistentData().getDouble("dayRot"));
								entityToSpawn.setYHeadRot((float) entity.getPersistentData().getDouble("dayRot"));
								entityToSpawn.setDeltaMovement(0, 0, 0);
							}
						}
					}
				}
			}
		}
	}
}
