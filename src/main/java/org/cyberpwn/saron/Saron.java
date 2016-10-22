package org.cyberpwn.saron;

import java.io.File;
import org.cyberpwn.saron.instance.CharacterInstance;
import org.phantomapi.clust.ConfigurationHandler;
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
		
		CharacterInstance chara = new CharacterInstance("character")
		{
			@Override
			public void onTick()
			{
				
			}
			
			@Override
			public void onStop()
			{
				
			}
			
			@Override
			public void onStart()
			{
				
			}
		};
		
		try
		{
			getDataFolder().mkdirs();
			ConfigurationHandler.read(new File(getDataFolder(), "file.yml"), chara);
		}
		
		catch(Exception e)
		{
			
		}
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
