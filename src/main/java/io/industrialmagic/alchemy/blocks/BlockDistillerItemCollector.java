package io.industrialmagic.alchemy.blocks;

import io.industrialmagick.alchemy.tile.TileDistillerItemCollector;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockDistillerItemCollector extends BlockDistillerContainerBase {


	public BlockDistillerItemCollector()
	{
		super(Material.IRON);
		setUnlocalizedName("distiller item collector");
		setRegistryName("distiller_item_collector"); 
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileDistillerItemCollector();
	}

	 
}
