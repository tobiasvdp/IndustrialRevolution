package io.industrialmagic.ui;

import io.industrialmagic.IndustrialMagicMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item; 

public class IndustrialMagicCreativeTab extends CreativeTabs {


	public IndustrialMagicCreativeTab() {
		super("Magic");

	}

	@Override
	public Item getTabIconItem() {
		return IndustrialMagicMod.ItemWorkbench;
	}
}
