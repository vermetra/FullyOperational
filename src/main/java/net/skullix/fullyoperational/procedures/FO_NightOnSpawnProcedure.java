package net.skullix.fullyoperational.procedures;

import net.minecraftforge.eventbus.api.Event;

public class FO_NightOnSpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("dayX", (entity.getX()));
		entity.getPersistentData().putDouble("dayY", (entity.getY()));
		entity.getPersistentData().putDouble("dayZ", (entity.getZ()));
		{
			Entity _ent = entity;
			_ent.setYRot((float) entity.getPersistentData().getDouble("dayRot"));
			_ent.setXRot(0);
			_ent.setYBodyRot(_ent.getYRot());
			_ent.setYHeadRot(_ent.getYRot());
			_ent.yRotO = _ent.getYRot();
			_ent.xRotO = _ent.getXRot();
			if (_ent instanceof LivingEntity _entity) {
				_entity.yBodyRotO = _entity.getYRot();
				_entity.yHeadRotO = _entity.getYRot();
			}
		}
	}
}
