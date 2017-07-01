package io.industrialmagic;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public interface IAttachedBlock {
	AttachmentGroup[] getAttachedSides(IBlockAccess world, BlockPos pos);
}
