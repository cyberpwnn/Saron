package org.cyberpwn.saron.object;

import org.bukkit.Chunk;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.phantomapi.game.PlayerContainer;
import org.phantomapi.lang.GList;
import org.phantomapi.lang.GSet;

public class SaronRegion implements PlayerContainer
{
	private GSet<Chunk> chunks;
	private GSet<Player> players;
	
	public SaronRegion()
	{
		chunks = new GSet<Chunk>();
	}
	
	public boolean contains(Chunk chunk)
	{
		return chunks.contains(chunk);
	}
	
	public boolean contains(Location location)
	{
		return contains(location.getChunk());
	}
	
	public void addChunk(Chunk chunk)
	{
		chunks.add(chunk);
	}
	
	public void removeChunk(Chunk chunk)
	{
		chunks.remove(chunk);
	}
	
	public void enter(Player p)
	{
		players.add(p);
	}
	
	public void exit(Player p)
	{
		players.remove(p);
	}
	
	public GSet<Chunk> getChunks()
	{
		return chunks;
	}
	
	@Override
	public GList<Player> getPlayers()
	{
		return new GList<Player>(players);
	}
	
	@Override
	public boolean contains(Player p)
	{
		return players.contains(p);
	}
}
