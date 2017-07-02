package io.industrialmagic.general.blocks;

import io.industrialmagic.blocks.BlockMagicContainerBase;
import io.industrialmagic.tile.TileWorkbench; 
import net.minecraft.block.material.Material; 
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockWorkbench extends BlockMagicContainerBase {

	public BlockWorkbench() {
		super(Material.IRON); 
		setUnlocalizedName("magic workbench");
		setRegistryName("magic_workbench"); 	 
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) { 
		return new TileWorkbench();
	}

}
