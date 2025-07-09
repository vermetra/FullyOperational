
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skullix.fullyoperational.init;

import net.skullix.fullyoperational.FullyOperationalMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class FullyOperationalModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FullyOperationalMod.MODID);
	public static final RegistryObject<CreativeModeTab> FO_BLOCKS = REGISTRY.register("fo_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fully_operational.fo_blocks")).icon(() -> new ItemStack(Blocks.DRIPSTONE_BLOCK)).displayItems((parameters, tabData) -> {
				tabData.accept(FullyOperationalModBlocks.VERMETRA_PLUSH.get().asItem());
				tabData.accept(FullyOperationalModBlocks.ZYPHRON_PLUSH.get().asItem());
			}).build());
}
