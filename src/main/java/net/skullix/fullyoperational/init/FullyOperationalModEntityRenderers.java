
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.skullix.fullyoperational.init;

import net.skullix.fullyoperational.client.renderer.FreddyFazbearStatueRenderer;
import net.skullix.fullyoperational.client.renderer.FreddyFazbearRenderer;
import net.skullix.fullyoperational.client.renderer.FreddyFazbearNightRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class FullyOperationalModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(FullyOperationalModEntities.FREDDY_FAZBEAR.get(), FreddyFazbearRenderer::new);
		event.registerEntityRenderer(FullyOperationalModEntities.FREDDY_FAZBEAR_STATUE.get(), FreddyFazbearStatueRenderer::new);
		event.registerEntityRenderer(FullyOperationalModEntities.FREDDY_FAZBEAR_NIGHT.get(), FreddyFazbearNightRenderer::new);
	}
}
