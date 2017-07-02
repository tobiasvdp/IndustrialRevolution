package io.industrialmagic.alchemy;

import io.industrialmagic.alchemy.blocks.BlockDistiller;
import io.industrialmagic.alchemy.blocks.BlockDistillerBoiler;
import io.industrialmagic.alchemy.blocks.BlockDistillerColumn;
import io.industrialmagic.alchemy.blocks.BlockDistillerCooler;
import io.industrialmagic.alchemy.blocks.BlockDistillerFluidInput;
import io.industrialmagic.alchemy.blocks.BlockDistillerItemCollector;
import io.industrialmagic.alchemy.blocks.BlockDistillerPressureValve;
import io.industrialmagic.alchemy.blocks.BlockDistillerPump;
import io.industrialmagic.alchemy.blocks.BlockDistillerTank;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

public class IndustrialAlchemySubMod {

    public static final BlockDistiller BlockDistiller = new BlockDistiller();

    public static final BlockDistillerColumn BlockDistillerColumn = new BlockDistillerColumn();
     
    public static final BlockDistillerBoiler BlockDistillerBoiler = new BlockDistillerBoiler(); // single item multiblock (2 blocks high)
    public static final BlockDistillerCooler BlockDistillerCooler = new BlockDistillerCooler(); // single item multiblock (2 blocks high)
    
    public static final BlockDistillerFluidInput BlockDistillerFluidInput = new BlockDistillerFluidInput();
    public static final BlockDistillerItemCollector BlockDistillerItemCollector = new BlockDistillerItemCollector();
    public static final BlockDistillerPressureValve BlockDistillerPressureValve = new BlockDistillerPressureValve();
    public static final BlockDistillerPump BlockDistillerPump = new BlockDistillerPump(); // 
    public static final BlockDistillerTank BlockDistillerTank = new BlockDistillerTank();
    

    public static final ItemBlock ItemDistiller = new ItemBlock(BlockDistiller);
    public static final ItemBlock ItemDistillerColumn = new ItemBlock(BlockDistillerColumn);
    public static final ItemBlock ItemDistillerBoiler = new ItemBlock(BlockDistillerBoiler);
    public static final ItemBlock ItemDistillerCooler = new ItemBlock(BlockDistillerCooler);
    public static final ItemBlock ItemkDistillerFluidInput = new ItemBlock(BlockDistillerFluidInput);
    public static final ItemBlock ItemkDistillerItemCollector = new ItemBlock(BlockDistillerItemCollector);
    public static final ItemBlock ItemkDistillerPressureValve = new ItemBlock(BlockDistillerPressureValve);
    public static final ItemBlock ItemDistillerPump = new ItemBlock(BlockDistillerPump);
    public static final ItemBlock ItemDistillerTank = new ItemBlock(BlockDistillerTank);
    
	public void registerBlocks(Register<Block> event) {
		event.getRegistry().registerAll(
        		BlockDistiller, 
        		BlockDistillerColumn, 
        		BlockDistillerBoiler, 
        		BlockDistillerCooler, 
        		BlockDistillerFluidInput, 
        		BlockDistillerItemCollector, 
        		BlockDistillerPressureValve, 
        		BlockDistillerPump, 
        		BlockDistillerTank); 
	}

	public void registerItems(Register<Item> event) {
		// TODO Auto-generated method stub
    	IForgeRegistry<Item> reg =  event.getRegistry();

    	registerItemBlock(reg, 
    			ItemDistiller, 
    			ItemDistillerColumn, 
    			ItemDistillerBoiler, 
    			ItemDistillerCooler, 
    			ItemkDistillerFluidInput, 
    			ItemkDistillerItemCollector, 
    			ItemkDistillerPressureValve, 
    			ItemDistillerPump,
    			ItemDistillerTank);
	}

    private static void registerItemBlock(IForgeRegistry<Item> reg, ItemBlock... items)
    {
    	for (ItemBlock itemBlock : items) {
        	reg.register(itemBlock.setRegistryName(itemBlock.block.getRegistryName()));
		}
    }
}
