package net.skullix.fullyoperational.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.skullix.fullyoperational.block.model.VermetraPlushBlockModel;
import net.skullix.fullyoperational.block.entity.VermetraPlushTileEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class VermetraPlushTileRenderer extends GeoBlockRenderer<VermetraPlushTileEntity> {
	public VermetraPlushTileRenderer() {
		super(new VermetraPlushBlockModel());
	}

	@Override
	public RenderType getRenderType(VermetraPlushTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
