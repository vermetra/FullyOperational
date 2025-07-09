package net.skullix.fullyoperational.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.skullix.fullyoperational.block.model.ZyphronPlushDisplayModel;
import net.skullix.fullyoperational.block.display.ZyphronPlushDisplayItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

public class ZyphronPlushDisplayItemRenderer extends GeoItemRenderer<ZyphronPlushDisplayItem> {
	public ZyphronPlushDisplayItemRenderer() {
		super(new ZyphronPlushDisplayModel());
	}

	@Override
	public RenderType getRenderType(ZyphronPlushDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
