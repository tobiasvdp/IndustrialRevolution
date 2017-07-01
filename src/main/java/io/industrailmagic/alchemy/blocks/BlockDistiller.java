package io.industrailmagic.alchemy.blocks;  
import net.minecraft.block.material.Material; 
import net.minecraft.init.Blocks;
import net.minecraft.tileentity.TileEntity; 
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import io.industrialmagic.AttachmentGroup;
import io.industrialmagic.BlockAttachment;
import io.industrialmagic.IAttachedBlock;
import io.industrialmagick.alchemy.tile.TileDistiller;

public class BlockDistiller extends BlockDistillerContainerBase implements IAttachedBlock
{ 
	
	public BlockDistiller()
	{
		super(Material.IRON);
		setUnlocalizedName("distiller");
		setRegistryName("distiller"); 
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileDistiller();
	}

	@Override
	public AttachmentGroup[] getAttachedSides(IBlockAccess world, BlockPos pos) { // the distiller can only exist on top of
		return new AttachmentGroup[]
			{ 
				new AttachmentGroup(new BlockAttachment(Blocks.CAULDRON, EnumFacing.DOWN))
			};
	}

	 
}
