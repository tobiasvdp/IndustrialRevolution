package io.industrialmagic.alchemy.blocks;

import io.industrialmagic.alchemy.IndustrialAlchemy;
import io.industrialmagic.attachments.AttachmentGroup;
import io.industrialmagic.attachments.BlockAttachment;
import io.industrialmagic.attachments.SolidSideAttachment;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState; 
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockDistillerBasin extends BlockDistillerAttachmentBase
{
	public BlockDistillerBasin()
	{
		super(Material.WOOD);
		setUnlocalizedName("distiller basin");
		setRegistryName("distiller_basin"); 
	}

	@Override
	public AttachmentGroup[] getAttachedSides(IBlockAccess world, BlockPos pos) {
		IBlockState state = world.getBlockState(pos);
		return new AttachmentGroup[]
				{
					new AttachmentGroup(
						new SolidSideAttachment(EnumFacing.DOWN), 
						new BlockAttachment(IndustrialAlchemy.BlockDistiller, getForward(state))
					) 
				};
	}
 
	

}
