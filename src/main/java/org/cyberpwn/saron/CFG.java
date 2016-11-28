package org.cyberpwn.saron;

import org.phantomapi.clust.ConfigurableObject;
import org.phantomapi.clust.DataCluster;
import org.phantomapi.clust.Keyed;

public class CFG extends ConfigurableObject
{
	public static CFG instance;
	
	@Keyed("core.production")
	public boolean production = false;
	
	public CFG()
	{
		super("configuration");
	}
	
	public static DataCluster get()
	{
		return instance.getConfiguration();
	}
}
