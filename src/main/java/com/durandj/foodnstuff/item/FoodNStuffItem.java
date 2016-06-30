package com.durandj.foodnstuff.item;

import com.durandj.foodnstuff.FoodNStuff;
import net.minecraft.item.Item;

public class FoodNStuffItem extends Item
{
	FoodNStuffItem(String name)
	{
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(FoodNStuff.instance.creativeTab);
	}
}
