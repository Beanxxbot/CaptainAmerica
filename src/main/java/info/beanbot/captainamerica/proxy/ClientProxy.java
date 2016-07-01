package info.beanbot.captainamerica.proxy;

import info.beanbot.captainamerica.client.render.BlockRenderRegister;
import info.beanbot.captainamerica.client.render.ItemRenderRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        super.init(event);

        BlockRenderRegister.registerBlockRender();
        ItemRenderRegister.registerItemRender();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
