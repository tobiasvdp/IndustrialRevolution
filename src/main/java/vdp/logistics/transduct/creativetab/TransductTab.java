package vdp.logistics.transduct.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import vdp.logistics.transduct.TransductMod;

public class TransductTab extends CreativeTabs{

	public TransductTab() {
		super("Transduct");

	}

	@Override
	public Item getTabIconItem() {
		return TransductMod.transductItem;
	}

}
