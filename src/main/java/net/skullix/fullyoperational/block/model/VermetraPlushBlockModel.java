package net.skullix.fullyoperational.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.skullix.fullyoperational.block.entity.VermetraPlushTileEntity;

import net.minecraft.resources.ResourceLocation;

public class VermetraPlushBlockModel extends GeoModel<VermetraPlushTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(VermetraPlushTileEntity animatable) {
		return new ResourceLocation("fully_operational", "animations/vermetraplush.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(VermetraPlushTileEntity animatable) {
		return new ResourceLocation("fully_operational", "geo/vermetraplush.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(VermetraPlushTileEntity animatable) {
		return new ResourceLocation("fully_operational", "textures/block/vermetra_plushie.png");
	}
}
