package org.cyberpwn.saron.api;

import java.io.IOException;
import org.bukkit.util.Vector;
import org.phantomapi.clust.DataEntity;
import org.phantomapi.lang.GMap;

public class PPA implements DataEntity
{
	private final GMap<Vector, PPAObject> schematic;
	
	public PPA()
	{
		schematic = new GMap<Vector, PPAObject>();
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((schematic == null) ? 0 : schematic.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		
		if(obj == null)
		{
			return false;
		}
		
		if(getClass() != obj.getClass())
		{
			return false;
		}
		
		PPA other = (PPA) obj;
		
		if(schematic == null)
		{
			if(other.schematic != null)
			{
				return false;
			}
		}
		
		else if(!schematic.equals(other.schematic))
		{
			return false;
		}
		
		return true;
	}
	
	@Override
	public void fromData(byte[] arg0) throws IOException
	{
		// TODO data
	}
	
	@Override
	public byte[] toData() throws IOException
	{
		// TODO data
		return null;
	}
}
