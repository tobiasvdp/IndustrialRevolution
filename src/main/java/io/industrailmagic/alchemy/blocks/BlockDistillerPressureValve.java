package io.industrailmagic.alchemy.blocks;

import net.minecraft.block.material.Material;

public class BlockDistillerPressureValve extends BlockDistillerBase {

	public BlockDistillerPressureValve()
	{
		super(Material.IRON);
		setUnlocalizedName("distiller pressure valve");
		setRegistryName("distiller_pressure_valve"); 
	} 
}
