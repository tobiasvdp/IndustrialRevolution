package vdp.logistics.indcon;

import io.industrialmagic.runes.blocks.BlockRune;
import io.industrialmagic.runes.item.ItemChalk;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import vdp.logistics.indcon.blocks.BlockCoil;
import vdp.logistics.indcon.blocks.BlockTransduct;
//import vdp.logistics.indcon.common.CommonProxy;
//import vdp.logistics.indcon.creativetab.IndustrialConjuringTab;

//@Mod(modid = IndustrialConjuringMod.MODID, version = IndustrialConjuringMod.VERSION)
//@Mod.EventBusSubscriber
//public class IndustrialConjuringMod
//{
//    public static final String MODID = "indcon";
//    public static final String VERSION = "0.1";
//    
//    public static CreativeTabs tab = new IndustrialConjuringTab();
//    
//    public static BlockCoil coil = new BlockCoil();
//    public static Item coilItem = new ItemBlock(coil);
//   
//    public static BlockTransduct transduct = new BlockTransduct();
//    public static Item transductItem = new ItemBlock(transduct);
//    
//    public static BlockRune blockRune = new BlockRune();
//    public static Item itemRune = new ItemBlock(blockRune);
//    
//    public static Item itemChalk = new ItemChalk();
//    
//    
//    @SidedProxy(clientSide="vdp.logistics.indcon.client.ClientProxy", serverSide="vdp.logistics.indcon.common.CommonProxy")
//	public static CommonProxy proxy;
//
//    @EventHandler
//    public void preInit(FMLPreInitializationEvent event)
//    {
//    	OBJLoader.INSTANCE.addDomain(MODID);
//    	proxy.registerTESRs();
//    }
//    
//    @EventHandler
//    public void init(FMLInitializationEvent event)
//    {
//    	proxy.registerItemModels();
//    }
//    
//    @SubscribeEvent
//    public static void registerBlocks(RegistryEvent.Register<Block> event) {
//        event.getRegistry().registerAll(coil,transduct,blockRune);
//    }
//    
//    @SubscribeEvent
//    public static void registerItems(RegistryEvent.Register<Item> event) {
//    	//items
//    	event.getRegistry().register(itemChalk);
//    	
//    	//blockitems
//    	coilItem.setRegistryName(coil.getRegistryName());
//    	transductItem.setRegistryName(transduct.getRegistryName());
//    	itemRune.setRegistryName(blockRune.getRegistryName());
//    	
//        event.getRegistry().registerAll(coilItem,transductItem,itemRune);
//        
//    }
//}
