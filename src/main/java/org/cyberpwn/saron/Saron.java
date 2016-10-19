package org.cyberpwn.saron;

import org.phantomapi.construct.Ghost;

/**
 * Base saron object
 * 
 * @author cyberpwn
 */
public class Saron extends Ghost
{
	private InstanceManager instanceManager;
	
	@Override
	public void preStart()
	{
		instanceManager = new InstanceManager(this);
		
		register(instanceManager);
	}
	
	@Override
	public void onStart()
	{
		
	}
	
	@Override
	public void onStop()
	{
		
	}
	
	@Override
	public void postStop()
	{
		
	}
}
