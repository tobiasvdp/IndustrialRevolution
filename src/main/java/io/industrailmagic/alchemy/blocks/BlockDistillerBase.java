package io.industrailmagic.alchemy.blocks;

import io.industrialmagic.AttachmentManager;
import io.industrialmagic.IAttachedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class BlockDistillerBase extends Block {

	protected BlockDistillerBase(Material materialIn) {
		super(materialIn);
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



    protected void checkAndDropBlock(World worldIn, BlockPos pos, IBlockState state)
    {
        if (!this.canBlockStay(worldIn, pos))
        {
            this.dropBlockAsItem(worldIn, pos, state, 0);
            worldIn.setBlockState(pos, Blocks.AIR.getDefaultState(), 3);
        }
    }
    public boolean canBlockStay(World worldIn, BlockPos pos)
    {
    	if(this instanceof IAttachedBlock)
			return AttachmentManager.isAttached((IAttachedBlock)this, (IBlockAccess)worldIn, pos);
    	return true;
    }
    
	@SuppressWarnings("deprecation")
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn) {
		// TODO Auto-generated method stub
		super.neighborChanged(state, worldIn, pos, blockIn);
		this.checkAndDropBlock(worldIn, pos, state);
	}
 

	@Override
	public boolean canPlaceBlockAt(World worldIn, BlockPos pos) { 
		return canBlockStay(worldIn, pos) &&  super.canPlaceBlockAt(worldIn, pos);
	}
    
    
	
	
    
}
