
package net.skullix.fullyoperational.client.renderer;

public class FreddyFazbearNightRenderer extends GeoEntityRenderer<FreddyFazbearNightEntity> {
	public FreddyFazbearNightRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new FreddyFazbearNightModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(FreddyFazbearNightEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, FreddyFazbearNightEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

}