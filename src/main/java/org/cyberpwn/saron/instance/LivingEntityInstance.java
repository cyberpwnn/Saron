package org.cyberpwn.saron.instance;

import org.phantomapi.clust.Comment;
import org.phantomapi.clust.Keyed;

public abstract class LivingEntityInstance extends EntityInstance
{
	@Comment("The max health this entity can have")
	@Keyed("entity.living.max-health")
	public double maxHealth = 20;
	
	@Comment("The amount of health to generate per second")
	@Keyed("entity.living.regen.rate")
	public double regenPerSecond = 2;
	
	@Comment("The regeneration delay after getting damaged")
	@Keyed("entity.living.regen.delay")
	public double regenDelaySecond = 8.5;
	
	@Comment("The entity type noted in documentation")
	@Keyed("entity.living.entity-type")
	public String entityType = "ZOMBIE";
	
	@Comment("If set to true, the entity will not take damage or die")
	@Keyed("entity.living.invincible")
	public boolean invincible = false;
	
	public LivingEntityInstance(String type)
	{
		super(type);
	}
}
