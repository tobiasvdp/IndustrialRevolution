package io.industrialmagic.runes.client;

import io.industrialmagic.common.IProxy;
import io.industrialmagic.runes.client.render.TESRRune;
import io.industrialmagic.runes.client.render.item.ItemRenderRegister;
import io.industrialmagic.runes.tile.TileRune;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class RunesClientProxy implements IProxy {

	public void registerTESRs() {
		ClientRegistry.bindTileEntitySpecialRenderer(TileRune.class, new TESRRune());
	}

	public void registerItemModels() {
		ItemRenderRegister.registerItemRenderer();
	}
}
