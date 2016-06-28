package com.durandj.foodnstuff.handler;

import com.durandj.foodnstuff.FoodNStuff;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent.OnConfigChangedEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class Config
{
	private static Configuration configuration;

	public static float mealSaturation = 4.0f;

	public static void init(FMLPreInitializationEvent event)
	{
		configuration = new Configuration(event.getSuggestedConfigurationFile());

		load();
	}

	private static void load()
	{
		mealSaturation = configuration.getFloat(
			"mealSaturation",
			"general",
			1.2000000476837158f,
			0.0f,
			20.0f,
			"Saturation provided by eating a meal"
		);

		if (configuration.hasChanged())
			configuration.save();
	}

	@SuppressWarnings("unused")
	public static void onConfigurationChange(OnConfigChangedEvent event)
	{
		if (event.getModID().equalsIgnoreCase(FoodNStuff.MOD_ID))
			return;

		load();
	}
}
