package net.skullix.fullyoperational.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.skullix.fullyoperational.block.display.ZyphronPlushDisplayItem;

import net.minecraft.resources.ResourceLocation;

public class ZyphronPlushDisplayModel extends GeoModel<ZyphronPlushDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(ZyphronPlushDisplayItem animatable) {
		return new ResourceLocation("fully_operational", "animations/vermetraplush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZyphronPlushDisplayItem animatable) {
		return new ResourceLocation("fully_operational", "geo/vermetraplush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZyphronPlushDisplayItem entity) {
		return new ResourceLocation("fully_operational", "textures/block/livingzyphron.png");
	}
}
