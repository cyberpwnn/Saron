package org.cyberpwn.saron.game;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.cyberpwn.saron.object.SaronRegion;
import org.phantomapi.Phantom;
import org.phantomapi.event.PlayerMoveBlockEvent;
import org.phantomapi.game.CapacityMode;
import org.phantomapi.game.GamePlugin;
import org.phantomapi.game.PhantomGame;
import org.phantomapi.game.ResourcePackMode;

public class SaronGame extends PhantomGame implements Listener
{
	private SaronRegion region;
	
	public SaronGame(GamePlugin plugin, SaronRegion region)
	{
		super(plugin);
		
		this.region = region;
		getProfile().getCapacityProfile().setMode(CapacityMode.UNLIMITED);
		getProfile().getCapacityProfile().setAcceptingPlayers(false);
		getProfile().getResourceProfile().setMode(ResourcePackMode.NONE);
	}
	
	@Override
	public void onStart(String... lauchParameters)
	{
		Phantom.instance().registerListener(this);
		getProfile().getCapacityProfile().setAcceptingPlayers(true);
	}
	
	@Override
	public void onStop(String... endParameters)
	{
		Phantom.instance().unRegisterListener(this);
		getProfile().getCapacityProfile().setAcceptingPlayers(false);
	}
	
	public void tick()
	{
		onTick();
	}
	
	public void onTick()
	{
		
	}
	
	@EventHandler
	public void on(PlayerMoveBlockEvent e)
	{
		if(!region.contains(e.getTo()))
		{
			e.setCancelled(true);
		}
	}
	
	@Override
	public void onJoin(Player p)
	{
		region.enter(p);
	}
	
	@Override
	public void onQuit(Player p)
	{
		region.exit(p);
	}
	
	public SaronRegion getRegion()
	{
		return region;
	}
}
