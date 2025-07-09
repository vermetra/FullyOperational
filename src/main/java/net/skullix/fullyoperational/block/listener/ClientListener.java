package net.skullix.fullyoperational.block.listener;

import net.skullix.fullyoperational.init.FullyOperationalModBlockEntities;
import net.skullix.fullyoperational.block.renderer.ZyphronPlushTileRenderer;
import net.skullix.fullyoperational.block.renderer.VermetraPlushTileRenderer;
import net.skullix.fullyoperational.FullyOperationalMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(modid = FullyOperationalMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FullyOperationalModBlockEntities.VERMETRA_PLUSH.get(), context -> new VermetraPlushTileRenderer());
		event.registerBlockEntityRenderer(FullyOperationalModBlockEntities.ZYPHRON_PLUSH.get(), context -> new ZyphronPlushTileRenderer());
	}
}
