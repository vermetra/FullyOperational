
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skullix.fullyoperational.init;

import net.skullix.fullyoperational.FullyOperationalMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class FullyOperationalModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, FullyOperationalMod.MODID);
	public static final RegistryObject<SoundEvent> FULLYOPERATIONAL_PLUSHHONK = REGISTRY.register("fullyoperational.plushhonk", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("fully_operational", "fullyoperational.plushhonk")));
}
