package com.durandj.foodnstuff.item.effect;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CureAllEffect implements IFoodEffect
{
	@Override
	public void apply(EntityLivingBase entity, ItemStack itemStack)
	{
		entity.curePotionEffects(new ItemStack(Items.MILK_BUCKET));
	}
}
