package io.industrialmagic.runes.client.render.item;

import io.industrialmagic.IndustrialMagicMod;
import io.industrialmagic.runes.IndustrialRunes;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation; 

public class ItemRenderRegister {
	public static void registerItemRenderer() {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
	    .register(IndustrialRunes.ItemChalk, 0, new ModelResourceLocation(IndustrialMagicMod.MODID+":itemChalk", "inventory"));
	}
}
