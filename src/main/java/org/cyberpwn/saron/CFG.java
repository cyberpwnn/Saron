package org.cyberpwn.saron;

import org.phantomapi.clust.ConfigurableObject;
import org.phantomapi.clust.DataCluster;

public class CFG extends ConfigurableObject
{
	public static CFG i;
	
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
