package info.beanbot.captainamerica.proxy;

import info.beanbot.captainamerica.blocks.ModBlocks;
import info.beanbot.captainamerica.crafting.ModCraftingVanilla;
import info.beanbot.captainamerica.items.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.createItems();
        ModBlocks.createBlocks();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModCraftingVanilla.createRecipes();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
