package org.cyberpwn.saron.instance;

import org.cyberpwn.saron.api.SaronInstance;
import org.phantomapi.clust.Comment;
import org.phantomapi.clust.Keyed;

public abstract class BaseInstance extends SaronInstance
{
	@Comment("The level of this instance")
	@Keyed("level")
	public int level = 1;
	
	public BaseInstance(String type)
	{
		super(type);
	}
}
