package org.cyberpwn.saron;

import org.phantomapi.clust.ConfigurableObject;
import org.phantomapi.clust.DataCluster;
import org.phantomapi.clust.Keyed;

public class CFG extends ConfigurableObject
{
	public static CFG i;
	
	@Keyed("game.enabled")
	public boolean game = false;
	
	public CFG()
	{
		super("configuration");
		
		i = this;
	}
	
	public static DataCluster get()
	{
		return i.getConfiguration();
	}
}
