package org.cyberpwn.saron.instance;

import org.phantomapi.clust.Comment;
import org.phantomapi.clust.Keyed;
import org.phantomapi.lang.GList;

public abstract class RegionInstance extends BaseInstance
{
	@Comment("The point locations for this region")
	@Keyed("region.points")
	public GList<String> points = new GList<String>();
	
	@Comment("The name of this region")
	@Keyed("region.name")
	public String name = "&aRegion";
	
	public RegionInstance(String type)
	{
		super(type);
	}
}
