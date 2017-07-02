package io.industrialmagic.attachments;

import net.minecraft.block.Block;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public interface IAttachment {
  boolean isAttached(IBlockAccess world, Block block, BlockPos pos);
  EnumFacing getSide();
}
