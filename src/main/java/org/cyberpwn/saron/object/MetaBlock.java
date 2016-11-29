package org.cyberpwn.saron.object;

import org.phantomapi.clust.DataCluster;
import org.phantomapi.lang.GList;

public class MetaBlock extends SaronObject
{
	private GList<String> properties;
	
	public MetaBlock()
	{
		properties = new GList<String>();
	}
	
	@Override
	public void write(DataCluster cc, String key)
	{
		cc.set(key, properties);
	}
	
	@Override
	public void read(DataCluster cc, String key)
	{
		properties = new GList<String>(cc.getStringList(key));
	}
}
