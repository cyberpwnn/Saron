package org.cyberpwn.saron.player;

import org.bukkit.entity.Player;
import org.phantomapi.clust.ConfigurableObject;

public class SaronPlayer extends ConfigurableObject
{
	public Player player;
	
	public SaronPlayer(Player player)
	{
		super(player.getUniqueId().toString());
	}
}
