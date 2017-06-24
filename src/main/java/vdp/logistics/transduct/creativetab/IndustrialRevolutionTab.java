package vdp.logistics.transduct.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import vdp.logistics.transduct.IndustrialRevolutionMod;

public class IndustrialRevolutionTab extends CreativeTabs{

	public IndustrialRevolutionTab() {
		super("Transduct");

	}

	@Override
	public Item getTabIconItem() {
		return IndustrialRevolutionMod.coilItem;
	}

}
