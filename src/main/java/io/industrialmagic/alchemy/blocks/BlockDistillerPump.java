package io.industrialmagic.alchemy.blocks;

import net.minecraft.block.material.Material;

public class BlockDistillerPump extends BlockDistillerBase {

	public BlockDistillerPump()
	{
		super(Material.IRON);
		setUnlocalizedName("distiller pressure pump");
		setRegistryName("distiller_pressure_pump"); 
	}
  
}
