package net.skullix.fullyoperational.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.skullix.fullyoperational.block.entity.ZyphronPlushTileEntity;

import net.minecraft.resources.ResourceLocation;

public class ZyphronPlushBlockModel extends GeoModel<ZyphronPlushTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(ZyphronPlushTileEntity animatable) {
		return new ResourceLocation("fully_operational", "animations/vermetraplush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ZyphronPlushTileEntity animatable) {
		return new ResourceLocation("fully_operational", "geo/vermetraplush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ZyphronPlushTileEntity animatable) {
		return new ResourceLocation("fully_operational", "textures/block/livingzyphron.png");
	}
}
