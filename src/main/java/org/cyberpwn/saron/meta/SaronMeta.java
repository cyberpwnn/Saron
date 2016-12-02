package org.cyberpwn.saron.meta;

import org.bukkit.Location;
import org.phantomapi.clust.DataCluster;

public abstract class SaronMeta implements Meta
{
	private String type;
	private int tickrate;
	
	public SaronMeta(String type, int tickrate)
	{
		this.type = type;
		this.tickrate = tickrate;
	}
	
	public SaronMeta()
	{
		type = "?";
		tickrate = -1;
	}
	
	@Override
	public void write(DataCluster cc, String key)
	{
		cc.set(key + ".meta.type", type);
		cc.set(key + ".meta.tickrate", tickrate);
	}
	
	@Override
	public void read(DataCluster cc, String key)
	{
		type = cc.getString(key + ".meta.type");
		tickrate = cc.getInt(key + ".meta.tickrate");
	}
	
	@Override
	public void doTick(Location location)
	{
		onTick(location);
	}
	
	public abstract void onTick(Location location);
	
	public abstract boolean shouldTick(Location location);
	
	@Override
	public int getNextTick(Location location)
	{
		if(getTickRate() < 0)
		{
			return -1;
		}
		
		if(shouldTick(location))
		{
			return getTickRate();
		}
		
		else
		{
			return 100;
		}
	}
	
	@Override
	public int getTickRate()
	{
		return tickrate;
	}
	
	@Override
	public String getType()
	{
		return type;
	}
	
}
