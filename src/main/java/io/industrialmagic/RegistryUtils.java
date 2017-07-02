package io.industrialmagic;

import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

public final class RegistryUtils {
   public static void registerItemBlock(IForgeRegistry<Item> reg, ItemBlock... items)
    {
    	for (ItemBlock itemBlock : items) {
        	reg.register(itemBlock.setRegistryName(itemBlock.block.getRegistryName())); 
		}
    }
}
