package org.cyberpwn.saron.api;

import java.util.UUID;
import org.phantomapi.clust.ConfigurableObject;

/**
 * Base saron instance
 * 
 * @author cyberpwn
 */
public abstract class SaronInstance extends ConfigurableObject implements Instance
{
	private String type;
	private UUID id;
	private boolean enabled;
	
	/**
	 * Saron instance
	 * 
	 * @param type
	 *            the type of this instance
	 */
	public SaronInstance(String type)
	{
		super(type);
		
		this.type = type;
		id = UUID.randomUUID();
		enabled = false;
	}
	
	@Override
	public UUID getId()
	{
		return id;
	}
	
	@Override
	public String getType()
	{
		return type;
	}
	
	@Override
	public abstract void onTick();
	
	@Override
	public abstract void onStart();
	
	@Override
	public abstract void onStop();
	
	@Override
	public void tick()
	{
		onTick();
	}
	
	@Override
	public void start()
	{
		onStart();
		enabled = true;
	}
	
	@Override
	public void stop()
	{
		enabled = false;
		onStop();
	}
	
	@Override
	public boolean isEnabled()
	{
		return enabled;
	}
	
	public void setId(UUID id)
	{
		this.id = id;
	}
}
