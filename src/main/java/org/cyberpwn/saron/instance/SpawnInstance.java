package org.cyberpwn.saron.instance;

import org.phantomapi.clust.Comment;
import org.phantomapi.clust.Keyed;

public abstract class SpawnInstance extends RegionInstance
{
	@Comment("The type of instance to spawn in this region")
	@Keyed("region.spawn.type")
	public String spawnType = "NONE";
	
	@Comment("The max instances to keep spawned in this region")
	@Keyed("region.spawn.max-instances")
	public int maxInstances = 24;
	
	public SpawnInstance(String type)
	{
		super(type);
	}
}
