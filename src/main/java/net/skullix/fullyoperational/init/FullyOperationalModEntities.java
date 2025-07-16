
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skullix.fullyoperational.init;

import net.skullix.fullyoperational.entity.FreddyFazbearStatueEntity;
import net.skullix.fullyoperational.entity.FreddyFazbearNightEntity;
import net.skullix.fullyoperational.entity.FreddyFazbearEntity;
import net.skullix.fullyoperational.FullyOperationalMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FullyOperationalModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, FullyOperationalMod.MODID);
	public static final RegistryObject<EntityType<FreddyFazbearEntity>> FREDDY_FAZBEAR = register("freddy_fazbear",
			EntityType.Builder.<FreddyFazbearEntity>of(FreddyFazbearEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FreddyFazbearEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FreddyFazbearNightEntity>> FREDDY_FAZBEAR_NIGHT = register("freddy_fazbear_night",
			EntityType.Builder.<FreddyFazbearNightEntity>of(FreddyFazbearNightEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FreddyFazbearNightEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FreddyFazbearStatueEntity>> FREDDY_FAZBEAR_STATUE = register("freddy_fazbear_statue",
			EntityType.Builder.<FreddyFazbearStatueEntity>of(FreddyFazbearStatueEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FreddyFazbearStatueEntity::new)

					.sized(0.6f, 1.8f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			FreddyFazbearEntity.init();
			FreddyFazbearNightEntity.init();
			FreddyFazbearStatueEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FREDDY_FAZBEAR.get(), FreddyFazbearEntity.createAttributes().build());
		event.put(FREDDY_FAZBEAR_NIGHT.get(), FreddyFazbearNightEntity.createAttributes().build());
		event.put(FREDDY_FAZBEAR_STATUE.get(), FreddyFazbearStatueEntity.createAttributes().build());
	}
}
