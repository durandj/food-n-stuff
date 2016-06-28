package com.durandj.foodnstuff.item;

import com.durandj.foodnstuff.FoodNStuff;
import net.minecraft.item.ItemFood;

public class FoodNStuffItemFood extends ItemFood
{
	FoodNStuffItemFood(String name, int healAmount, float saturation)
	{
		super(healAmount, saturation, false);

		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(FoodNStuff.instance.creativeTab);
	}
}
