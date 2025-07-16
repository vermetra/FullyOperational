package net.skullix.fullyoperational.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

public class FreddyFazbearNightModel extends GeoModel<FreddyFazbearNightEntity> {
	@Override
	public ResourceLocation getAnimationResource(FreddyFazbearNightEntity entity) {
		return new ResourceLocation("fully_operational", "animations/fnaf1_fazbear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(FreddyFazbearNightEntity entity) {
		return new ResourceLocation("fully_operational", "geo/fnaf1_fazbear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(FreddyFazbearNightEntity entity) {
		return new ResourceLocation("fully_operational", "textures/entities/" + entity.getTexture() + ".png");
	}

}