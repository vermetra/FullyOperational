package net.skullix.fullyoperational.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class RotateEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (!sourceentity.isShiftKeyDown()) {
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
			entity.getPersistentData().putDouble("dayRot", (entity.getPersistentData().getDouble("dayRot") + 15));
		} else {
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
			entity.getPersistentData().putDouble("dayRot", (entity.getPersistentData().getDouble("dayRot") - 15));
		}
	}
}
