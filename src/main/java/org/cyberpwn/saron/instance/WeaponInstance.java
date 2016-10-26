package org.cyberpwn.saron.instance;

import org.phantomapi.clust.Comment;
import org.phantomapi.clust.Keyed;

public abstract class WeaponInstance extends ItemInstance
{
	@Keyed("entity.item.weapon.damage")
	@Comment("Weapon damage")
	public double damage = 0.1;
	
	public WeaponInstance(String type)
	{
		super(type);
	}
}
