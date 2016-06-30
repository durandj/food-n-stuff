package com.durandj.foodnstuff.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.List;

public class Rupee extends FoodNStuffItem
{
	public Rupee()
	{
		super("rupee");

		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack)
	{
		int metadata = itemStack.getMetadata();

		return super.getUnlocalizedName() + "_" + EnumRupeeType.getByMetadata(metadata).getName();
	}

	public String getItemStackDisplayName(ItemStack itemStack)
	{
		EnumRupeeType rupeeType = EnumRupeeType.getByMetadata(itemStack.getMetadata());

		return rupeeType.getChatColor().toString() + super.getItemStackDisplayName(itemStack);
	}

	@SideOnly(Side.CLIENT)
	public void getSubItems(Item item, CreativeTabs tab, List<ItemStack> subItems)
	{
		for (int i = 0; i < EnumRupeeType.values().length; i++)
			subItems.add(new ItemStack(item, 1, i));
	}
}
