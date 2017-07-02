package io.industrialmagic.runes;

import io.industrialmagic.RegistryUtils;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.IForgeRegistry;
import io.industrialmagic.runes.blocks.BlockRune;
import io.industrialmagic.runes.item.ItemChalk;

public interface IndustrialRunes {

	public static final BlockRune BlockRune = new BlockRune();
	public static final ItemBlock ItemRune = new ItemBlock(BlockRune);

    public static ItemChalk ItemChalk = new ItemChalk();
	
	public static void registerBlocks(Register<Block> event) {
		event.getRegistry().registerAll(BlockRune);
	}

	public static void registerItems(Register<Item> event) {
		IForgeRegistry<Item> reg = event.getRegistry();
		RegistryUtils.registerItemBlock(reg, ItemRune);
	}
}
