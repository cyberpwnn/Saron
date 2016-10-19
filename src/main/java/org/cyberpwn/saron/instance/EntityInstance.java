package org.cyberpwn.saron.instance;

import org.phantomapi.clust.Comment;
import org.phantomapi.clust.Keyed;

public abstract class EntityInstance extends BaseInstance
{
	@Comment("Should the entity be rendered visible to players?")
	@Keyed("entity.visible")
	public boolean visible = true;
	
	@Comment("Should the name of this entity be visible")
	@Keyed("entity.name-visible")
	public boolean nameVisible = true;
	
	@Comment("The name of this entity")
	@Keyed("entity.name")
	public String name = "&dEntity";
	
	public EntityInstance(String type)
	{
		super(type);
	}
}
