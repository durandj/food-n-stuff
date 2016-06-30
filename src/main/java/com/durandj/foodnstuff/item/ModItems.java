package com.durandj.foodnstuff.item;

import com.durandj.foodnstuff.FoodNStuff;
import com.durandj.foodnstuff.handler.Config;
import com.durandj.foodnstuff.item.effect.CureAllEffect;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.ShapelessRecipes;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.oredict.ShapelessOreRecipe;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ModItems
{
	private static Item chorizo;
	private static Item donutHoles;
	private static Item grapple;
	private static Item honeyJar;
	private static Item krabbyPatty;
	private static Item macAndCheese;
	private static Item milkJar;
	private static Item miniDonuts;
	private static Item relish;
	private static Item salsa;
	private static Item sauerkraut;

	private static Item masterSword;
	private static Item rupee;

	@SideOnly(Side.CLIENT)
	public static void registerItemModels()
	{
		registerModel(chorizo);
		registerModel(donutHoles);
		registerModel(grapple);
		registerModel(honeyJar);
		registerModel(krabbyPatty);
		registerModel(macAndCheese);
		registerModel(milkJar);
		registerModel(miniDonuts);
		registerModel(relish);
		registerModel(salsa);
		registerModel(sauerkraut);

		registerModel(masterSword);
		registerModel(rupee);
	}

	public static void initItems()
	{
		chorizo = registerFoodItem("chorizo", 5, Config.mealSaturation);
		donutHoles = registerFoodItem("donutholes", 1, Config.snackSaturation);
		grapple = registerFoodItem("grapple", 5, Config.mealSaturation);
		honeyJar = registerFoodItem("honeyjar", 5, Config.mealSaturation);
		krabbyPatty = registerFoodItem("krabbypatty", 7, Config.mealSaturation);
		macAndCheese = registerFoodItem("macandcheese", 9, Config.mealSaturation);
		milkJar = registerFoodItem("milkjar", 5, Config.mealSaturation)
			.addFoodEffect(new CureAllEffect()).setAlwaysEdible().setMaxStackSize(16);
		miniDonuts = registerFoodItem("minidonuts", 1, Config.snackSaturation);
		relish = registerFoodItem("relish", 3, Config.snackSaturation);
		salsa = registerFoodItem("salsa", 5, Config.snackSaturation);
		sauerkraut = registerFoodItem("sauerkraut", 3, Config.snackSaturation);

		masterSword = registerItem(new MasterSword());
		rupee = registerItem(new Rupee());
	}

	public static void initRecipes()
	{
		CraftingManager manager = CraftingManager.getInstance();

		manager.addRecipe(new ShapelessOreRecipe(grapple, Items.APPLE, "foodGrapejuice"));
		manager.addRecipe(new ShapelessOreRecipe(honeyJar, Items.GLASS_BOTTLE, Item.getByNameOrId("harvestcraft:honeyItem")));
		manager.addRecipe(new ShapelessOreRecipe(macAndCheese, Items.BOWL, "foodCheese", "foodPasta"));
		manager.addRecipe(new ShapelessOreRecipe(milkJar, Items.GLASS_BOTTLE, "listAllmilk"));

		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 1, EnumRupeeType.BLUE.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 5, EnumRupeeType.GREEN.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.BLUE.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.BLUE.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.BLUE.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 2, EnumRupeeType.BLUE.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.BLUE.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 1, EnumRupeeType.RED.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 2, EnumRupeeType.YELLOW.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.RED.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 1, EnumRupeeType.RED.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.BLUE.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.BLUE.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 1, EnumRupeeType.RED.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.BLUE.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.GREEN.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 1, EnumRupeeType.PURPLE.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 1, EnumRupeeType.PURPLE.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.RED.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.RED.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.YELLOW.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 5, EnumRupeeType.YELLOW.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.PURPLE.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 1, EnumRupeeType.SILVER.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.PURPLE.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.PURPLE.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 2, EnumRupeeType.PURPLE.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.SILVER.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 1, EnumRupeeType.ORANGE.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.SILVER.getMetadata()),
			new ItemStack(rupee, 1, EnumRupeeType.SILVER.getMetadata())
		));
		manager.addRecipe(createShapelessRecipe(
			new ItemStack(rupee, 2, EnumRupeeType.SILVER.getMetadata()),
		    new ItemStack(rupee, 1, EnumRupeeType.ORANGE.getMetadata())
		));
	}

	private static Item registerItem(Item item)
	{
		return GameRegistry.register(item);
	}

	private static FoodNStuffItemFood registerFoodItem(String name, int healAmount, float saturation)
	{
		FoodNStuffItemFood item = new FoodNStuffItemFood(name, healAmount, saturation);

		return (FoodNStuffItemFood) registerItem(item);
	}

	@SideOnly(Side.CLIENT)
	private static void registerModel(final Item item)
	{
		ItemModelMesher itemModelMesher = Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

		if (!item.getHasSubtypes())
		{
			final String resName = item.getRegistryName().toString();
			final ModelResourceLocation resource = new ModelResourceLocation(resName, "inventory");

			itemModelMesher.register(item, 0, resource);
		}
		else
		{
			List<ItemStack> subTypes = new LinkedList<ItemStack>();
			item.getSubItems(item, FoodNStuff.instance.creativeTab, subTypes);

			ResourceLocation[] subTypeResources = new ResourceLocation[subTypes.size()];
			for (int i = 0; i < subTypes.size(); i++)
			{
				ItemStack subType = subTypes.get(i);
				String itemName = FoodNStuff.MOD_ID + ":" + subType.getUnlocalizedName().replace("item.", "");

				subTypeResources[i] = new ResourceLocation(itemName);

				itemModelMesher.register(item, subType.getMetadata(), new ModelResourceLocation(itemName, "inventory"));
			}

			ModelBakery.registerItemVariants(item, subTypeResources);
		}
	}

	private static IRecipe createShapelessRecipe(ItemStack output, ItemStack ... input)
	{
		return new ShapelessRecipes(output, Arrays.asList(input));
	}
}
