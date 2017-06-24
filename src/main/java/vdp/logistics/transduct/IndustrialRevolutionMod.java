package vdp.logistics.transduct;

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
import vdp.logistics.transduct.blocks.BlockCoil;
import vdp.logistics.transduct.blocks.BlockTransduct;
import vdp.logistics.transduct.common.CommonProxy;
import vdp.logistics.transduct.creativetab.IndustrialRevolutionTab;

@Mod(modid = IndustrialRevolutionMod.MODID, version = IndustrialRevolutionMod.VERSION)
@Mod.EventBusSubscriber
public class IndustrialRevolutionMod
{
    public static final String MODID = "irev";
    public static final String VERSION = "0.1";
    
    public static CreativeTabs tab = new IndustrialRevolutionTab();
    
    public static BlockCoil coil = new BlockCoil();
    public static Item coilItem = new ItemBlock(coil);
   
    public static BlockTransduct transduct = new BlockTransduct();
    public static Item transductItem = new ItemBlock(transduct);
    
    
    @SidedProxy(clientSide="vdp.logistics.transduct.client.ClientProxy", serverSide="vdp.logistics.transduct.common.CommonProxy")
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
        event.getRegistry().registerAll(coil);
        event.getRegistry().registerAll(transduct);
        
        coil.setCreativeTab(tab);
        transduct.setCreativeTab(tab);
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(coilItem.setRegistryName(coil.getRegistryName()));
        event.getRegistry().registerAll(transductItem.setRegistryName(transduct.getRegistryName()));
    }
}
