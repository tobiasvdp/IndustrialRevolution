package io.industrialmagic;
 
import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockAttachment implements IAttachment{
	public BlockAttachment(Block block, EnumFacing side) {
	 this.RequiredBlock = block;
	 this.Side = side;
	}
	public EnumFacing Side;
	public Block RequiredBlock;
	
	@Override
	public boolean isAttached(IBlockAccess world, Block block, BlockPos pos) {
		return block == RequiredBlock;
	}


	@Override
	public EnumFacing getSide() { 
		return Side;
	}
}
