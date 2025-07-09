package net.skullix.fullyoperational.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.skullix.fullyoperational.block.display.VermetraPlushDisplayItem;

import net.minecraft.resources.ResourceLocation;

public class VermetraPlushDisplayModel extends GeoModel<VermetraPlushDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(VermetraPlushDisplayItem animatable) {
		return new ResourceLocation("fully_operational", "animations/vermetraplush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VermetraPlushDisplayItem animatable) {
		return new ResourceLocation("fully_operational", "geo/vermetraplush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VermetraPlushDisplayItem entity) {
		return new ResourceLocation("fully_operational", "textures/block/vermetra_plushie.png");
	}
}
