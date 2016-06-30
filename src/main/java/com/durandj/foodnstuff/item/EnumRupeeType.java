package com.durandj.foodnstuff.item;

import net.minecraft.util.IStringSerializable;
import net.minecraft.util.text.TextFormatting;

public enum EnumRupeeType implements IStringSerializable
{
	GREEN(0, "green", TextFormatting.GREEN),
	BLUE(1, "blue", TextFormatting.BLUE),
	YELLOW(2, "yellow", TextFormatting.YELLOW),
	RED(3, "red", TextFormatting.RED),
	PURPLE(4, "purple", TextFormatting.DARK_PURPLE),
	SILVER(5, "silver", TextFormatting.GRAY),
	ORANGE(6, "orange", TextFormatting.GOLD);

	private final int metadata;
	private final String name;
	private TextFormatting chatColor;

	EnumRupeeType(int metadata, String name, TextFormatting chatColor)
	{
		this.metadata = metadata;
		this.name = name;
		this.chatColor = chatColor;
	}

	public int getMetadata()
	{
		return metadata;
	}

	public TextFormatting getChatColor() // TODO(durandj): use text color in some way
	{
		return chatColor;
	}

	@Override
	public String getName()
	{
		return name;
	}

	public static EnumRupeeType getByMetadata(int metadata)
	{
		if (metadata < 0 || metadata >= values().length)
			metadata = 0;

		return values()[metadata];
	}
}
