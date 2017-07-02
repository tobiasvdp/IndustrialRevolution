package io.industrialmagic.alchemy.blocks;

import io.industrialmagic.AttachmentGroup;
import io.industrialmagic.IAttachedBlock;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public abstract class BlockDistillerAttachmentBase extends BlockDistillerBase implements IAttachedBlock  {

    public static final PropertyEnum<EnumFacing> ATTACHED_SIDE = PropertyEnum.<EnumFacing>create("axis", EnumFacing.class);

	protected BlockDistillerAttachmentBase(Material materialIn) {
		super(materialIn); 
	}

	public abstract AttachmentGroup[] getAttachedSides(IBlockAccess world, BlockPos pos);

	
	
	
	 
	@Override
	public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {   
		
		
		
		return this.getDefaultState().withProperty(ATTACHED_SIDE,  facing); 
		//return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer).
	}

	protected EnumFacing getForward(IBlockState state)
	{ 
		return state.getValue(ATTACHED_SIDE);
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		
		EnumFacing facing = EnumFacing.getFront(meta);
		
		return this.getDefaultState().withProperty(ATTACHED_SIDE,  facing); 
	}

	@Override
	public int getMetaFromState(IBlockState state) { 
		EnumFacing side = state.getValue(ATTACHED_SIDE);
		return side.getIndex();
	}
	
	
}
