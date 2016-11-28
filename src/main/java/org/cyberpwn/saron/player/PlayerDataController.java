package org.cyberpwn.saron.player;

import org.bukkit.entity.Player;
import org.phantomapi.clust.PlayerDataHandler;
import org.phantomapi.construct.Controllable;

public class PlayerDataController extends PlayerDataHandler<SaronPlayer>
{
	public PlayerDataController(Controllable parentController)
	{
		super(parentController);
	}
	
	@Override
	public SaronPlayer onLoad(Player identifier)
	{
		SaronPlayer p = new SaronPlayer(identifier);
		loadCluster(p, "playerdata");
		return p;
	}
	
	@Override
	public void onSave(Player identifier)
	{
		saveCluster(get(identifier), "playerdata");
	}
	
	@Override
	public void onStart()
	{
		for(Player i : onlinePlayers())
		{
			load(i);
		}
	}
	
	@Override
	public void onStop()
	{
		saveAll();
	}
}