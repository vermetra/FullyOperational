package net.skullix.fullyoperational.entity.model;

import software.bernie.geckolib.core.animation.AnimationState;

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