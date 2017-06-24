package vdp.logistics.transduct.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockCoil extends Block{
	
	static final PropertyEnum<EnumFacing> facing = PropertyEnum.create("facing", EnumFacing.class);

	public BlockCoil() {
		super(Material.IRON);
		setUnlocalizedName("coil");
		setRegistryName("coil");
		
		setDefaultState(this.blockState.getBaseState().withProperty(facing, EnumFacing.NORTH));
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		
		BlockStateContainer container = new BlockStateContainer(this, facing);
		return container;
		
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(facing).getIndex();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		// TODO Auto-generated method stub
		IBlockState state = getDefaultState().withProperty(facing, EnumFacing.getFront(meta));
		return state;
	}
	
	@Override
	public IBlockState getActualState(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
		// state additions non meta
		return super.getActualState(state, worldIn, pos);
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		if(playerIn.getHeldItemMainhand() != null && playerIn.getHeldItemMainhand().getItem().equals(Items.STICK)){
			if(!worldIn.isRemote){
				 playerIn.displayGui(new BlockWorkbench.InterfaceCraftingTable(worldIn, pos));
		         playerIn.addStat(StatList.CRAFTING_TABLE_INTERACTION);
			}
			return true;
		}
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
	}
	
}
