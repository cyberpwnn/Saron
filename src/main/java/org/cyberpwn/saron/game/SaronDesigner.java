package org.cyberpwn.saron.game;

import org.bukkit.entity.Player;
import org.cyberpwn.saron.CFG;
import org.phantomapi.game.CapacityMode;
import org.phantomapi.game.GamePlugin;
import org.phantomapi.game.ResourcePackMode;

public class SaronDesigner extends SaronGame
{
	public SaronDesigner(GamePlugin plugin)
	{
		super(plugin);
		
		getProfile().getCapacityProfile().setMode(CapacityMode.valueOf(CFG.i.designerCapacityMode));
		getProfile().getCapacityProfile().setAcceptingPlayers(CFG.i.designerEnabled);
		getProfile().getResourceProfile().setMode(ResourcePackMode.NONE);
	}
	
	@Override
	public void onStart(String... lauchParameters)
	{
		
	}
	
	@Override
	public void onStop(String... endParameters)
	{
		
	}
	
	@Override
	public void onJoin(Player p)
	{
		
	}
	
	@Override
	public void onQuit(Player p)
	{
		
	}
}
