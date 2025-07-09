package net.skullix.fullyoperational.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.skullix.fullyoperational.block.model.VermetraPlushDisplayModel;
import net.skullix.fullyoperational.block.display.VermetraPlushDisplayItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class VermetraPlushDisplayItemRenderer extends GeoItemRenderer<VermetraPlushDisplayItem> {
	public VermetraPlushDisplayItemRenderer() {
		super(new VermetraPlushDisplayModel());
	}

	@Override
	public RenderType getRenderType(VermetraPlushDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
