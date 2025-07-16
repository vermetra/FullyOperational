
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skullix.fullyoperational.init;

import net.skullix.fullyoperational.FullyOperationalMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

public class FullyOperationalModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, FullyOperationalMod.MODID);
	public static final RegistryObject<CreativeModeTab> FO_ENTITYS = REGISTRY.register("fo_entitys",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fully_operational.fo_entitys")).icon(() -> new ItemStack(FullyOperationalModItems.FREDDY_FAZBEAR_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FullyOperationalModItems.FREDDY_FAZBEAR_SPAWN_EGG.get());
				tabData.accept(FullyOperationalModItems.FREDDY_FAZBEAR_STATUE_SPAWN_EGG.get());
			}).build());
	public static final RegistryObject<CreativeModeTab> FO_BLOCKS = REGISTRY.register("fo_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.fully_operational.fo_blocks")).icon(() -> new ItemStack(FullyOperationalModBlocks.VERMETRA_PLUSH.get())).displayItems((parameters, tabData) -> {
				tabData.accept(FullyOperationalModBlocks.VERMETRA_PLUSH.get().asItem());
				tabData.accept(FullyOperationalModBlocks.ZYPHRON_PLUSH.get().asItem());
			}).withTabsBefore(FO_ENTITYS.getId()).build());
}
