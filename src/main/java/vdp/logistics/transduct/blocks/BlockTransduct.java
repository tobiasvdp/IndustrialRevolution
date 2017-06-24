package vdp.logistics.transduct.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.world.World;
import vdp.logistics.transduct.tile.TransductTile;

public class BlockTransduct extends BlockContainer{

	public BlockTransduct() {
		super(Material.IRON);
		
		setUnlocalizedName("transduct");
		setRegistryName("transduct");
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TransductTile();
	}

	@Override

    public EnumBlockRenderType getRenderType(IBlockState state) 

	{

        return EnumBlockRenderType.MODEL;

    }
	
    @Override

    public boolean isOpaqueCube(IBlockState state) {

        return false;

    }
    
    @Override
    public boolean isFullCube(IBlockState state) {
    	return false;
    }
	
}
