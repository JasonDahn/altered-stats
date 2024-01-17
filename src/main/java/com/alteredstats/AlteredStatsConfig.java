package com.alteredstats;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("alteredstats")
public interface AlteredStatsConfig extends Config
{
	public enum AlteredStatsDisplayType {
		DELTAS,
		LEVELS,
		LEVELS_WITH_BASES;
	}

	@ConfigItem(
			keyName = "includeHP",
			name = "Include HP",
			description = "Leave on to include HP. Turn off to ignore HP."
	)
	default boolean includeHP()
	{
		return true;
	}

	@ConfigItem(
			keyName = "includePrayer",
			name = "Include Prayer",
			description = "Leave on to include Prayer. Turn off to ignore Prayer."
	)
	default boolean includePrayer()
	{
		return true;
	}

	@ConfigItem(
			keyName = "displayType",
			name = "Display",
			description = "The type of display to show. Options are: Deltas (+4) | Levels (99) | Levels with bases (99/95)"
	)
	default AlteredStatsDisplayType displayType()
	{
		return AlteredStatsDisplayType.DELTAS;
	}
}
