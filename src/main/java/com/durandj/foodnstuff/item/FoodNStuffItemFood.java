package com.durandj.foodnstuff.item;

import com.durandj.foodnstuff.FoodNStuff;
import com.durandj.foodnstuff.item.effect.IFoodEffect;
import com.sun.istack.internal.NotNull;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.HashSet;
import java.util.Set;

public class FoodNStuffItemFood extends ItemFood
{
	private Set<IFoodEffect> effects = new HashSet<IFoodEffect>();

	FoodNStuffItemFood(String name, int healAmount, float saturation)
	{
		super(healAmount, saturation, false);

		this.setRegistryName(name);
		this.setUnlocalizedName(name);
		this.setCreativeTab(FoodNStuff.instance.creativeTab);
	}

	public FoodNStuffItemFood addFoodEffect(@NotNull IFoodEffect effect)
	{
		effects.add(effect);

		return this;
	}

	@Override
	protected void onFoodEaten(ItemStack itemStack, World world, EntityPlayer player)
	{
		super.onFoodEaten(itemStack, world, player);

		for (IFoodEffect effect : effects)
			effect.apply(player, itemStack);
	}
}
