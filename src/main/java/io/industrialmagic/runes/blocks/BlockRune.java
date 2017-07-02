package io.industrialmagic.runes.blocks;

import io.industrialmagic.IndustrialMagicMod;
import io.industrialmagic.runes.tile.TileRune;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World; 

public class BlockRune extends BlockContainer {
	
	static final PropertyEnum<EnumFacing> facing = PropertyEnum.create("facing", EnumFacing.class);

	public BlockRune() {
		super(Material.CLAY);
		setRegistryName("rune");
		setUnlocalizedName("rune");

		setCreativeTab(IndustrialMagicMod.tab);
		
		setDefaultState(this.blockState.getBaseState().withProperty(facing, EnumFacing.NORTH));
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileRune();
	}

	public EnumBlockRenderType getRenderType(IBlockState state)

	{
		return EnumBlockRenderType.INVISIBLE;
	}
	
    @Override

    public boolean isOpaqueCube(IBlockState state) {
        return false;

    }
    
    @Override
    public boolean isFullCube(IBlockState state) {
    	return false;
    }
    
	@Override
	protected BlockStateContainer createBlockState() {
		
		BlockStateContainer container = new BlockStateContainer(this, facing);
		return container;
		
	}
    
    @Override
    public IBlockState onBlockPlaced(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ,
    		int meta, EntityLivingBase placer) {
    	System.out.println(facing);
    	return super.onBlockPlaced(worldIn, pos, facing, hitX, hitY, hitZ, meta, placer);
    }
    
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(facing).getIndex();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		IBlockState state = getDefaultState().withProperty(facing, EnumFacing.getFront(meta));
		return state;
	}
	
	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		return super.getActualState(state, worldIn, pos);
	}
	
	
}
