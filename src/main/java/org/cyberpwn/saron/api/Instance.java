package org.cyberpwn.saron.api;

import java.util.UUID;
import org.phantomapi.clust.Configurable;

/**
 * Represents a saron instance
 * 
 * @author cyberpwn
 */
public interface Instance extends Configurable
{
	/**
	 * Get the id for this instance
	 * 
	 * @return the id
	 */
	public UUID getId();
	
	/**
	 * Get the type of this instance
	 * 
	 * @return the instance type
	 */
	public String getType();
	
	/**
	 * Called when the instance is ticked
	 */
	public void onTick();
	
	/**
	 * Called when the instance is started
	 */
	public void onStart();
	
	/**
	 * Called when the instance is stopped
	 */
	public void onStop();
	
	/**
	 * Tick this instance
	 */
	public void tick();
	
	/**
	 * Start this instance
	 */
	public void start();
	
	/**
	 * Stop this instance
	 */
	public void stop();
	
	/**
	 * Is this instance enabled?
	 * 
	 * @return returns true if the instance has been started
	 */
	public boolean isEnabled();
}