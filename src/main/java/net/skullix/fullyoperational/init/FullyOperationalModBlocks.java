
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skullix.fullyoperational.init;

import net.skullix.fullyoperational.block.ZyphronPlushBlock;
import net.skullix.fullyoperational.block.VermetraPlushBlock;
import net.skullix.fullyoperational.FullyOperationalMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class FullyOperationalModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, FullyOperationalMod.MODID);
	public static final RegistryObject<Block> VERMETRA_PLUSH = REGISTRY.register("vermetra_plush", () -> new VermetraPlushBlock());
	public static final RegistryObject<Block> ZYPHRON_PLUSH = REGISTRY.register("zyphron_plush", () -> new ZyphronPlushBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
