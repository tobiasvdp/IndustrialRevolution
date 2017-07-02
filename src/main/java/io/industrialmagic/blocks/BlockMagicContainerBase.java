package io.industrialmagic.blocks;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType; 

public abstract class BlockMagicContainerBase extends BlockContainer {

	protected BlockMagicContainerBase(Material materialIn) {
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
    
}
