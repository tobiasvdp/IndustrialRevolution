package vdp.logistics.transduct.client;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import vdp.logistics.transduct.client.render.TESRTransduct;
import vdp.logistics.transduct.common.CommonProxy;
import vdp.logistics.transduct.tile.TransductTile;

public class ClientProxy  extends CommonProxy {
	@Override
	public void registerTESRs() {
		super.registerTESRs();
		//ClientRegistry.bindTileEntitySpecialRenderer(TransductTile.class, new TESRTransduct());
	}
}
