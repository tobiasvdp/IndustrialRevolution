package io.industrialmagic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;

public abstract class BlockMagicBase extends Block {

	protected BlockMagicBase(Material materialIn) {
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
