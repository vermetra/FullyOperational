package net.skullix.fullyoperational.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class FreddyFazbearModel extends GeoModel<FreddyFazbearEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearEntity entity) {
		return new ResourceLocation("fully_operational", "animations/fnaf1_fazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearEntity entity) {
		return new ResourceLocation("fully_operational", "geo/fnaf1_fazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearEntity entity) {
		return new ResourceLocation("fully_operational", "textures/entities/" + entity.getTexture() + ".png");
	}

}