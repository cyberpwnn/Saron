package org.cyberpwn.saron;

import org.phantomapi.construct.Ghost;
import org.phantomapi.game.GamePlugin;

/**
 * Base saron object
 * 
 * @author cyberpwn
 */
public class Saron extends Ghost implements GamePlugin
{
	public static Saron instance;
	private CFG cfg;
	private SaronInstance saronInstance;
	
	@Override
	public void preStart()
	{
		instance = this;
		cfg = new CFG();
		loadCluster(cfg);
		saronInstance = new SaronInstance(this);
		
		register(saronInstance);
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
	
	public static Saron getInstance()
	{
		return instance;
	}
	
	public CFG getCfg()
	{
		return cfg;
	}
	
	public SaronInstance getSaronInstance()
	{
		return saronInstance;
	}
}
