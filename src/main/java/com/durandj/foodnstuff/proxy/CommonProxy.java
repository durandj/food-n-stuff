package com.durandj.foodnstuff.proxy;

import com.durandj.foodnstuff.handler.Config;
import com.durandj.foodnstuff.item.ModItems;
import com.durandj.foodnstuff.util.LogHelper;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy implements IProxy
{
	@Override
	public void preInit(FMLPreInitializationEvent event)
	{
		LogHelper.info("Doing pre-initialization...");

		Config.init(event);

		registerHandlers();

		ModItems.initItems();
	}

	@Override
	public void init(FMLInitializationEvent event)
	{
		LogHelper.info("Doing initialization...");

		ModItems.initRecipes();
	}

	@Override
	public void postInit(FMLPostInitializationEvent event)
	{
		LogHelper.info("Doing post-initialization...");
	}

	private void registerHandlers()
	{
		MinecraftForge.EVENT_BUS.register(new Config());
	}
}
