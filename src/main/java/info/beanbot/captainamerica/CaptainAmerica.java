package info.beanbot.captainamerica;

import info.beanbot.captainamerica.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = CaptainAmerica.MODID, name = CaptainAmerica.MODNAME, version = CaptainAmerica.VERSION)
public class CaptainAmerica
{
    public static final String MODID = "captainamerica";
    public static final String MODNAME = "Captain America";
    public static final String VERSION = "0.1";

    @SidedProxy(clientSide = "info.beanbot.captainamerica.proxy.ClientProxy", serverSide = "info.beanbot.captainamerica.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static CaptainAmerica instance = new CaptainAmerica();

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
