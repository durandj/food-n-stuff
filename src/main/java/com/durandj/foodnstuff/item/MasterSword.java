package com.durandj.foodnstuff.item;

import com.durandj.foodnstuff.FoodNStuff;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class MasterSword extends ItemSword
{
	public MasterSword()
	{
		super(ToolMaterial.DIAMOND);

		this.setRegistryName("mastersword");
		this.setUnlocalizedName("mastersword");
		this.setCreativeTab(FoodNStuff.instance.creativeTab);
	}

	@Override
	public boolean hitEntity(ItemStack itemStack, EntityLivingBase target, EntityLivingBase attacker)
	{
		return true;
	}

	@Override
	public boolean onBlockDestroyed(ItemStack itemStack, World world, IBlockState blockState, BlockPos blockPos, EntityLivingBase entity)
	{
		return true;
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return false;
	}
}
