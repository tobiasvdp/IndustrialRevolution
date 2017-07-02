package io.industrialmagic.alchemy.blocks;

import io.industrialmagic.AttachmentGroup;
import io.industrialmagic.BlockAttachment;
import io.industrialmagic.IAttachedBlock;
import io.industrialmagic.alchemy.IndustrialAlchemyMod;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockDistillerColumn extends BlockDistillerBase implements IAttachedBlock {
	public BlockDistillerColumn()
	{
		super(Material.IRON);
		setUnlocalizedName("distiller column");
		setRegistryName("distiller_colmun"); 
	}

	@Override
	public AttachmentGroup[] getAttachedSides(IBlockAccess world, BlockPos pos) { 
		// stay only if there is a distiller, or another column below
		return new AttachmentGroup[]{
			new AttachmentGroup(new BlockAttachment(IndustrialAlchemyMod.BlockDistiller, EnumFacing.DOWN)), 
			new AttachmentGroup(new BlockAttachment(IndustrialAlchemyMod.BlockDistillerColumn, EnumFacing.DOWN))
		};
	} 
}
