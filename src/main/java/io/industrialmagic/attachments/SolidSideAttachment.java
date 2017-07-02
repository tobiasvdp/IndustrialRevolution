package io.industrialmagic.attachments;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class SolidSideAttachment implements IAttachment {

	private EnumFacing side;

	public SolidSideAttachment(EnumFacing side)
	{
		this.side = side;
	}
	
	@Override
	public boolean isAttached(IBlockAccess world, Block block, BlockPos pos) { 	 
		
		if(block == Blocks.AIR) return false; // quick exit
		
		IBlockState state = world.getBlockState(pos);
		
		if(block.isAir(state, world, pos)) return false; // treated as air ...
		
		return block.isSideSolid(state, world, pos, side.getOpposite());  // only attach to solid side
	}

	@Override
	public EnumFacing getSide() { 
		return side;
	}

}
