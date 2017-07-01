package vdp.logistics.indcon.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import vdp.logistics.indcon.tile.TransductTile;

public class BlockTransduct extends BlockContainer{

	public BlockTransduct() {
		super(Material.IRON);
		
		setUnlocalizedName("transduct");
		setRegistryName("transduct");
	}
	
	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
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
    
    @Override
    public boolean canRenderInLayer(BlockRenderLayer layer) {
    	if(layer.equals(BlockRenderLayer.SOLID) || layer.equals(BlockRenderLayer.TRANSLUCENT))
    		return true;    	
    	return false;
    }
    
    
    
    
}
