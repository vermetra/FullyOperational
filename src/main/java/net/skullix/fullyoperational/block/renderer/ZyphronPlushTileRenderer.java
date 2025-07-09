package net.skullix.fullyoperational.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.skullix.fullyoperational.block.model.ZyphronPlushBlockModel;
import net.skullix.fullyoperational.block.entity.ZyphronPlushTileEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class ZyphronPlushTileRenderer extends GeoBlockRenderer<ZyphronPlushTileEntity> {
	public ZyphronPlushTileRenderer() {
		super(new ZyphronPlushBlockModel());
	}

	@Override
	public RenderType getRenderType(ZyphronPlushTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
