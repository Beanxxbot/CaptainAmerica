package info.beanbot.captainamerica.client.render;

import info.beanbot.captainamerica.CaptainAmerica;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class BlockRenderRegister {

    public static void registerBlockRender() {

    }

    public static void register(Block block)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(CaptainAmerica.MODID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }
}
