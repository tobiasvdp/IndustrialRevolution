package io.industrialmagic.alchemy.blocks;
 
import net.minecraft.block.material.Material; 

public class BlockDistillerTank extends BlockDistillerBase {
	public BlockDistillerTank()
	{
		super(Material.IRON);
		setUnlocalizedName("distiller tank");
		setRegistryName("distiller_tank"); 
	} 
}
