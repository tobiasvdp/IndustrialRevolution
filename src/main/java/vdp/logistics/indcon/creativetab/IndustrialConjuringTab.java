package vdp.logistics.indcon.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import vdp.logistics.indcon.IndustrialConjuringMod;

public class IndustrialConjuringTab extends CreativeTabs{

	public IndustrialConjuringTab() {
		super("Transduct");

	}

	@Override
	public Item getTabIconItem() {
		return IndustrialConjuringMod.coilItem;
	}

}
