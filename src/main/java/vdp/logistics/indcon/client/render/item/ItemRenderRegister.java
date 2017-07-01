package vdp.logistics.indcon.client.render.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import vdp.logistics.indcon.IndustrialConjuringMod;

public class ItemRenderRegister {
	public static void registerItemRenderer() {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(IndustrialConjuringMod.itemChalk, 0, new ModelResourceLocation(IndustrialConjuringMod.MODID+":itemChalk", "inventory"));
	}
}
