package org.cyberpwn.saron.meta;

import org.bukkit.Location;
import org.phantomapi.clust.MetaObject;

public interface Meta extends MetaObject
{
	public void doTick(Location location);
	
	public int getNextTick(Location location);
	
	public int getTickRate();
	
	public String getType();
}
