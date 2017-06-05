package vdp.logistics.transduct.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWorkbench;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BlockTransduct extends Block{

	public BlockTransduct() {
		super(Material.IRON);
		setUnlocalizedName("transduct");
		setRegistryName("transduct");
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
		if(playerIn.getActiveItemStack() != null && playerIn.getActiveItemStack().getItem().equals(Items.STICK)){
			if(!worldIn.isRemote){
				 playerIn.displayGui(new BlockWorkbench.InterfaceCraftingTable(worldIn, pos));
		         playerIn.addStat(StatList.CRAFTING_TABLE_INTERACTION);
		         return true;
			}
			return true;
		}
		return super.onBlockActivated(worldIn, pos, state, playerIn, hand, heldItem, side, hitX, hitY, hitZ);
	}
	
}
