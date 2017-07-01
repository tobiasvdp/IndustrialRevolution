package vdp.logistics.indcon.client;

import net.minecraftforge.fml.client.registry.ClientRegistry;
import vdp.logistics.indcon.client.render.TESRTransduct;
import vdp.logistics.indcon.client.render.item.ItemRenderRegister;
import vdp.logistics.indcon.common.CommonProxy;
import vdp.logistics.indcon.tile.TransductTile;

public class ClientProxy  extends CommonProxy {
	@Override
	public void registerTESRs() {
		super.registerTESRs();
		ClientRegistry.bindTileEntitySpecialRenderer(TransductTile.class, new TESRTransduct());
	}
	
	@Override
	public void registerItemModels(){
		ItemRenderRegister.registerItemRenderer();
	}
}
