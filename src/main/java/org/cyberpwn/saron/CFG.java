package org.cyberpwn.saron;

import org.phantomapi.clust.ConfigurableObject;
import org.phantomapi.clust.DataCluster;
import org.phantomapi.clust.Keyed;

public class CFG extends ConfigurableObject
{
	public static CFG i;
	
	@Keyed("designer.enabled")
	public boolean designerEnabled = true;
	
	@Keyed("designer.capacity-mode")
	public String designerCapacityMode = "UNLIMITED";
	
	public CFG()
	{
		super("configuration");
	}
	
	public static DataCluster get()
	{
		return i.getConfiguration();
	}
}
