package io.industrialmagic;

import io.industrialmagic.alchemy.IndustrialAlchemySubMod;
import io.industrialmagic.alchemy.blocks.*;
import io.industrialmagic.blocks.BlockWorkbench;
import io.industrialmagic.common.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.IForgeRegistry;

@Mod(modid = IndustrialMagicMod.MODID, version = IndustrialMagicMod.VERSION)
@Mod.EventBusSubscriber
public class IndustrialMagicMod {

    public static final String MODID = "indmag";
    public static final String VERSION = "0.1";
     
    
    public static final IndustrialAlchemySubMod Alchemy = new IndustrialAlchemySubMod();
    
    
    public static final BlockWorkbench Workbench = new BlockWorkbench();
    public static final ItemBlock ItemWorkbench = new ItemBlock(Workbench);
	
    

    @SidedProxy(clientSide="io.industrialmagic.client.ClientProxy", serverSide="io.industrialmagic.common.CommonProxy")
	public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	OBJLoader.INSTANCE.addDomain(MODID);
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    { 
	}
    
    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
    	event.getRegistry().registerAll(Workbench);
        Alchemy.registerBlocks(event);
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
    	Alchemy.registerItems(event);
    	IForgeRegistry<Item> reg =  event.getRegistry();

    	registerItemBlock(reg, ItemWorkbench);
    }
    
    private static void registerItemBlock(IForgeRegistry<Item> reg, ItemBlock... items)
    {
    	for (ItemBlock itemBlock : items) {
        	reg.register(itemBlock.setRegistryName(itemBlock.block.getRegistryName()));
		}
    }
}
