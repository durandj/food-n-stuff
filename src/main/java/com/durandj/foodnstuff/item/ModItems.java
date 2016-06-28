package com.durandj.foodnstuff.item;

import com.durandj.foodnstuff.FoodNStuff;
import com.durandj.foodnstuff.handler.Config;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModItems
{
	private static Item grapple;
	private static Item honeyJar;
	private static Item macAndCheese;
	private static Item milkJar;

	public static void registerItemModels()
	{
		registerModel(grapple);
		registerModel(honeyJar);
		registerModel(macAndCheese);
		registerModel(milkJar);
	}

	public static void initItems()
	{
		grapple = registerFoodItem("grapple", 5, Config.mealSaturation);
		honeyJar = registerFoodItem("honeyjar", 5, Config.mealSaturation);
		macAndCheese = registerFoodItem("macandcheese", 9, Config.mealSaturation);
		milkJar = registerFoodItem("milkjar", 5, Config.mealSaturation);
	}

	public static void initRecipes()
	{
		CraftingManager manager = CraftingManager.getInstance();

		manager.addRecipe(new ShapelessOreRecipe(grapple, Items.APPLE, "foodGrapejuice"));
		manager.addRecipe(new ShapelessOreRecipe(honeyJar, Items.GLASS_BOTTLE, Item.getByNameOrId("harvestcraft:honeyItem")));
		manager.addRecipe(new ShapelessOreRecipe(macAndCheese, Items.BOWL, "foodCheese", "foodPasta"));
		manager.addRecipe(new ShapelessOreRecipe(milkJar, Items.GLASS_BOTTLE, "listAllmilk"));
	}

	private static Item registerItem(String name, Item item)
	{
		item.setCreativeTab(FoodNStuff.instance.creativeTab);
		item.setRegistryName(name);
		item.setUnlocalizedName(name);

		return GameRegistry.register(item);
	}

	private static Item registerFoodItem(String name, int healAmount, float saturation)
	{
		Item item = new ItemFood(healAmount, saturation, false);

		return registerItem(name, item);
	}

	private static void registerModel(final Item item)
	{
		final String resName = item.getRegistryName().toString();

		final ModelResourceLocation resource = new ModelResourceLocation(resName, "inventory");
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, resource);
	}
}
