package io.industrialmagic;

import io.industrialmagic.alchemy.IndustrialAlchemy;
import io.industrialmagic.alchemy.blocks.*;
import io.industrialmagic.common.CommonProxy;
import io.industrialmagic.general.IndustrialGeneral;
import io.industrialmagic.runes.IndustrialRunes;
import io.industrialmagic.ui.IndustrialMagicCreativeTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent; 

@Mod(modid = IndustrialMagicMod.MODID, version = IndustrialMagicMod.VERSION)
@Mod.EventBusSubscriber
public class IndustrialMagicMod implements IndustrialAlchemy, IndustrialRunes, IndustrialGeneral {

    public static final String MODID = "indmag";
    public static final String VERSION = "0.1";
     
     
    

    public static CreativeTabs tab = new IndustrialMagicCreativeTab();

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

    	IndustrialAlchemy.registerBlocks(event);
    	IndustrialRunes.registerBlocks(event);
    	IndustrialGeneral.registerBlocks(event);
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) { 
    	IndustrialAlchemy.registerItems(event);
    	IndustrialRunes.registerItems(event);
    	IndustrialGeneral.registerItems(event);
    }
   
}
