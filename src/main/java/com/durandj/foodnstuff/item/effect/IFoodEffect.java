package com.durandj.foodnstuff.item.effect;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;

public interface IFoodEffect
{
	void apply(EntityLivingBase entity, ItemStack itemStack);
}
