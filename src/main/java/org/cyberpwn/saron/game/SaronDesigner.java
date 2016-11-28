package org.cyberpwn.saron.game;

import org.bukkit.entity.Player;
import org.cyberpwn.saron.CFG;
import org.phantomapi.game.CapacityMode;
import org.phantomapi.game.GamePlugin;
import org.phantomapi.game.ResourcePackMode;
import org.phantomapi.sync.Task;

public class SaronDesigner extends SaronGame
{
	private Task task;
	
	public SaronDesigner(GamePlugin plugin)
	{
		super(plugin);
		
		task = null;
		getProfile().getCapacityProfile().setMode(CapacityMode.valueOf(CFG.i.designerCapacityMode));
		getProfile().getCapacityProfile().setAcceptingPlayers(CFG.i.designerEnabled);
		getProfile().getResourceProfile().setMode(ResourcePackMode.NONE);
	}
	
	@Override
	public void onStart(String... lauchParameters)
	{
		task = new Task(0)
		{
			@Override
			public void run()
			{
				
			}
		};
	}
	
	@Override
	public void onStop(String... endParameters)
	{
		task.cancel();
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
