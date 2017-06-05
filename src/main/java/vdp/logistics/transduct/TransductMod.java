package vdp.logistics.transduct;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import vdp.logistics.transduct.blocks.BlockTransduct;
import vdp.logistics.transduct.creativetab.TransductTab;

@Mod(modid = TransductMod.MODID, version = TransductMod.VERSION)
@Mod.EventBusSubscriber
public class TransductMod
{
    public static final String MODID = "TRANSDUCT";
    public static final String VERSION = "0.1";
    
    public static CreativeTabs tab = new TransductTab();
    
    public static BlockTransduct transduct = new BlockTransduct();
    public static Item transductItem = new ItemBlock(transduct).setRegistryName(transduct.getRegistryName());
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    }
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	System.out.println("Subscribing blocks");
        event.getRegistry().registerAll(transduct);
        transduct.setCreativeTab(tab);
        
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	System.out.println("Subscribing items");
        event.getRegistry().registerAll(transductItem);
    }
}
