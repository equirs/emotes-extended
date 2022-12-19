package dev.yequi.emotes;

import java.awt.Color;
import net.runelite.client.config.Alpha;
import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup(EmotesConfig.GROUP)
public interface EmotesConfig extends Config
{
	String GROUP = "emotes";
	String KEY_SAVED = "savedHighlightInfo";

	@Alpha
	@ConfigItem(
		position = 1,
		keyName = "borderColor",
		name = "Border color",
		description = "Color of border around the emote"
	)
	default Color borderColor()
	{
		return Color.ORANGE;
	}

	@Alpha
	@ConfigItem(
		position = 2,
		keyName = "fillColor",
		name = "Fill color",
		description = "Color of fill highlight on emote"
	)
	default Color fillColor()
	{
		return new Color(0, 255, 0, 20);
	}

	@ConfigItem(
		position = 3,
		keyName = "labelColor",
		name = "Label color",
		description = "Color of label on emote"
	)
	default Color labelColor()
	{
		return Color.WHITE;
	}

	@ConfigItem(
		position = 4,
		keyName = "rememberEmoteColors",
		name = "Remember color per emote",
		description = "Uses the colors from time of placement on each emote"
	)
	default boolean rememberEmoteColors()
	{
		return false;
	}

	@ConfigItem(
		position = 5,
		keyName = "displayLabels",
		name = "Display labels",
		description = "Shows/hides labels for all emotes"
	)
	default boolean displayLabels()
	{
		return true;
	}

	@ConfigItem(
		keyName = "savedHighlightInfo",
		name = "Highlighted emote info",
		description = "Map of sprite ids to highlight",
		hidden = true
	)
	default String savedHighlightInfo()
	{
		return "";
	}

	@ConfigItem(
		keyName = "savedHighlightInfo",
		name = "Highlighted emote info",
		description = "Map of sprite ids to highlight",
		hidden = true
	)
	void setSavedHighlightInfo(String serializedInfo);
}
