package info.beanbot.captainamerica.client.render;

import info.beanbot.captainamerica.CaptainAmerica;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

    public static void registerItemRender() {

    }

    public static void register(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(CaptainAmerica.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
