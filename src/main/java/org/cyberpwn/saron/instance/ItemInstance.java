package org.cyberpwn.saron.instance;

import org.phantomapi.clust.Comment;
import org.phantomapi.clust.Keyed;

public abstract class ItemInstance extends EntityInstance
{
	@Comment("The type of this item")
	@Keyed("entity.item.type")
	public String itemType = "NONE";
	
	public ItemInstance(String type)
	{
		super(type);
	}
}
