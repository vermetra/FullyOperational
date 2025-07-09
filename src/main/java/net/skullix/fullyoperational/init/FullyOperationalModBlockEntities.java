
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skullix.fullyoperational.init;

import net.skullix.fullyoperational.block.entity.ZyphronPlushTileEntity;
import net.skullix.fullyoperational.block.entity.VermetraPlushTileEntity;
import net.skullix.fullyoperational.FullyOperationalMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class FullyOperationalModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, FullyOperationalMod.MODID);
	public static final RegistryObject<BlockEntityType<VermetraPlushTileEntity>> VERMETRA_PLUSH = REGISTRY.register("vermetra_plush",
			() -> BlockEntityType.Builder.of(VermetraPlushTileEntity::new, FullyOperationalModBlocks.VERMETRA_PLUSH.get()).build(null));
	public static final RegistryObject<BlockEntityType<ZyphronPlushTileEntity>> ZYPHRON_PLUSH = REGISTRY.register("zyphron_plush",
			() -> BlockEntityType.Builder.of(ZyphronPlushTileEntity::new, FullyOperationalModBlocks.ZYPHRON_PLUSH.get()).build(null));

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
