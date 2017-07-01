package vdp.logistics.indcon.item;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStone;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import vdp.logistics.indcon.IndustrialConjuringMod;
import vdp.logistics.indcon.blocks.BlockRune;

public class ItemChalk extends Item {

	public ItemChalk() {
		this.setRegistryName(IndustrialConjuringMod.MODID, "itemChalk");
		this.setUnlocalizedName("Chalk");
		this.setMaxStackSize(1);
		this.setMaxDamage(12);
		this.setCreativeTab(IndustrialConjuringMod.tab);
	}
	
	@Override
	public boolean canItemEditBlocks() {
		return true;
	}
	
	@Override
	public boolean isDamageable() {
		return true;
	}
	
	@Override
	public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos,
			EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		IBlockState blockState = worldIn.getBlockState(pos);
		Block block = worldIn.getChunkFromBlockCoords(pos).getBlockState(pos).getBlock();
		
		if(!block.isSideSolid(blockState, worldIn, pos, facing)){
			return EnumActionResult.FAIL;
		}
		
		BlockPos runePos = pos.offset(facing);
		IBlockState runeBlockState = worldIn.getBlockState(runePos);
		if(!runeBlockState.getBlock().isReplaceable(worldIn, runePos)){
			return EnumActionResult.FAIL;
		}
		
		worldIn.setBlockState(runePos, IndustrialConjuringMod.blockRune.getDefaultState());
		
		stack.damageItem(1, playerIn);
		
		return EnumActionResult.SUCCESS;
	}
	
}
