package com.durandj.foodnstuff.proxy;

import com.durandj.foodnstuff.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void init(FMLInitializationEvent event)
	{
		super.init(event);

		ModItems.registerItemModels();
	}
}
