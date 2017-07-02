package io.industrialmagic.alchemy;

import io.industrialmagic.alchemy.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import vdp.logistics.transduct.IndustrialRevolutionMod;
import vdp.logistics.transduct.common.CommonProxy;

@Mod(modid = IndustrialRevolutionMod.MODID, version = IndustrialRevolutionMod.VERSION)
@Mod.EventBusSubscriber
public class IndustrialAlchemyMod {

    public static final String MODID = "ialch";
    public static final String VERSION = "0.1";
     
    public static final BlockDistiller BlockDistiller = new BlockDistiller();

    public static final BlockDistillerColumn BlockDistillerColumn = new BlockDistillerColumn();
     
    public static final BlockDistillerBoiler BlockDistillerBoiler = new BlockDistillerBoiler(); // single item multiblock (2 blocks high)
    public static final BlockDistillerCooler BlockDistillerCooler = new BlockDistillerCooler(); // single item multiblock (2 blocks high)
    
    public static final BlockDistillerFluidInput BlockDistillerFluidInput = new BlockDistillerFluidInput();
    public static final BlockDistillerItemCollector BlockDistillerItemCollector = new BlockDistillerItemCollector();
    public static final BlockDistillerPressureValve BlockDistillerPressureValve = new BlockDistillerPressureValve();
    public static final BlockDistillerPump BlockDistillerPump = new BlockDistillerPump(); // 
    public static final BlockDistillerTank BlockDistillerTank = new BlockDistillerTank();

    @SidedProxy(clientSide="io.industrialmagic.alchemy.ClientProxy", serverSide="io.industrialmagic.alchemy.CommonProxy")
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
        event.getRegistry().registerAll(BlockDistiller);
        event.getRegistry().registerAll(BlockDistillerColumn);
        event.getRegistry().registerAll(BlockDistillerBoiler);
        event.getRegistry().registerAll(BlockDistillerCooler);
        event.getRegistry().registerAll(BlockDistillerFluidInput);
        event.getRegistry().registerAll(BlockDistillerItemCollector);
        event.getRegistry().registerAll(BlockDistillerPressureValve);
        event.getRegistry().registerAll(BlockDistillerPump);
        event.getRegistry().registerAll(BlockDistillerTank); 
    }
    
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        //event.getRegistry().registerAll(coilItem.setRegistryName(coil.getRegistryName()));
        //event.getRegistry().registerAll(transductItem.setRegistryName(transduct.getRegistryName()));
    }
}
