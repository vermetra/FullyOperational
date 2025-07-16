package net.skullix.fullyoperational.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.skullix.fullyoperational.entity.FreddyFazbearStatueEntity;

import net.minecraft.resources.ResourceLocation;

public class FreddyFazbearStatueModel extends GeoModel<FreddyFazbearStatueEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearStatueEntity entity) {
		return new ResourceLocation("fully_operational", "animations/fnaf1_fazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearStatueEntity entity) {
		return new ResourceLocation("fully_operational", "geo/fnaf1_fazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearStatueEntity entity) {
		return new ResourceLocation("fully_operational", "textures/entities/" + entity.getTexture() + ".png");
	}

}
