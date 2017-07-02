package io.industrialmagic.general.item;

import io.industrialmagic.IndustrialMagicMod;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemWorkbench extends ItemBlock {

	public ItemWorkbench(Block block) {
		super(block); 
		this.setCreativeTab(IndustrialMagicMod.tab);
	}

	
	
}
