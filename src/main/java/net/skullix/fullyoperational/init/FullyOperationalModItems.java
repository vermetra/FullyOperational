
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skullix.fullyoperational.init;

import net.skullix.fullyoperational.block.display.ZyphronPlushDisplayItem;
import net.skullix.fullyoperational.block.display.VermetraPlushDisplayItem;
import net.skullix.fullyoperational.FullyOperationalMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.item.Item;

public class FullyOperationalModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, FullyOperationalMod.MODID);
	public static final RegistryObject<Item> VERMETRA_PLUSH = REGISTRY.register(FullyOperationalModBlocks.VERMETRA_PLUSH.getId().getPath(), () -> new VermetraPlushDisplayItem(FullyOperationalModBlocks.VERMETRA_PLUSH.get(), new Item.Properties()));
	public static final RegistryObject<Item> ZYPHRON_PLUSH = REGISTRY.register(FullyOperationalModBlocks.ZYPHRON_PLUSH.getId().getPath(), () -> new ZyphronPlushDisplayItem(FullyOperationalModBlocks.ZYPHRON_PLUSH.get(), new Item.Properties()));
	public static final RegistryObject<Item> FREDDY_FAZBEAR_SPAWN_EGG = REGISTRY.register("freddy_fazbear_spawn_egg", () -> new ForgeSpawnEggItem(FullyOperationalModEntities.FREDDY_FAZBEAR, -10079488, -13210, new Item.Properties()));
	public static final RegistryObject<Item> FREDDY_FAZBEAR_STATUE_SPAWN_EGG = REGISTRY.register("freddy_fazbear_statue_spawn_egg",
			() -> new ForgeSpawnEggItem(FullyOperationalModEntities.FREDDY_FAZBEAR_STATUE, -14478592, -2907842, new Item.Properties()));
	public static final RegistryObject<Item> FREDDY_FAZBEAR_NIGHT_SPAWN_EGG = REGISTRY.register("freddy_fazbear_night_spawn_egg",
			() -> new ForgeSpawnEggItem(FullyOperationalModEntities.FREDDY_FAZBEAR_NIGHT, -10079488, -13210, new Item.Properties()));
	// Start of user code block custom items
	// End of user code block custom items
}
