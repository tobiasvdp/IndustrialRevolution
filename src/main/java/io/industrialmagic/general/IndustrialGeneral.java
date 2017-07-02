package io.industrialmagic.general;

import io.industrialmagic.RegistryUtils;
import io.industrialmagic.general.blocks.BlockWorkbench;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.IForgeRegistry;
import io.industrialmagic.general.item.ItemWorkbench;

public interface IndustrialGeneral {

	public static final BlockWorkbench BlockWorkbench = new BlockWorkbench();
	public static final ItemBlock ItemWorkbench = new ItemWorkbench(BlockWorkbench);

	public static void registerBlocks(Register<Block> event) {
		event.getRegistry().registerAll(BlockWorkbench);
	}

	public static void registerItems(Register<Item> event) {
		IForgeRegistry<Item> reg = event.getRegistry();

		RegistryUtils.registerItemBlock(reg, ItemWorkbench);
	}
}
