package io.industrialmagic.alchemy.blocks;

import io.industrialmagick.alchemy.tile.TileDistillerFluidInput; 
import net.minecraft.block.material.Material; 
import net.minecraft.tileentity.TileEntity; 
import net.minecraft.world.World;

public class BlockDistillerFluidInput extends BlockDistillerContainerBase {

	public BlockDistillerFluidInput()
	{
		super(Material.IRON);
		setUnlocalizedName("distiller fluid input");
		setRegistryName("distiller_fluid_input"); 
	}
  
	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) { 
		return new TileDistillerFluidInput();
	}

}
