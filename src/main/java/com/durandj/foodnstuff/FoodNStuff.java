package com.durandj.foodnstuff;

import com.durandj.foodnstuff.proxy.IProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

// TODO(durandj): add harvestcraft dependency
@Mod(modid = FoodNStuff.MOD_ID, name = FoodNStuff.NAME, version = FoodNStuff.VERSION, dependencies = "")
public class FoodNStuff
{
	public static final String MOD_ID = "foodnstuff";
	public static final String NAME = "Food N Stuff";
	public static final String VERSION = "0.0.0";

	@Instance(MOD_ID)
	public static FoodNStuff instance;

	@SidedProxy(
		clientSide = "com.durandj.foodnstuff.proxy.ClientProxy",
		serverSide = "com.durandj.foodnstuff.proxy.CommonProxy")
	public static IProxy proxy;

	public final CreativeTabs creativeTab = new CreativeTabs(MOD_ID) {
		@Override
		public Item getTabIconItem()
		{
			// TODO(durandj): set this to an actual item
			return Items.DIAMOND;
		}
	};

	@SuppressWarnings("unused")
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}

	@SuppressWarnings("unused")
	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init(event);
	}

	@SuppressWarnings("unused")
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}
