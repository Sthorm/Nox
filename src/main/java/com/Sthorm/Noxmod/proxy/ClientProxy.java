package com.Sthorm.Noxmod.proxy;

import com.Sthorm.Noxmod.Noxmod;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.SidedProxy;

/**
 * Created by Nick on 19-May-17.
 */
public class ClientProxy extends CommonProxy
{
    @Override
    public void registerItemRenderer (Item item, int meta, String id)
    {
        ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(Noxmod.modId + ":" + id, "inventory"));
    }
}
