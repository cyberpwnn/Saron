package org.cyberpwn.saron;

import org.cyberpwn.saron.game.SaronServer;
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
	private SaronServer s;
	
	@Override
	public void preStart()
	{
		instance = this;
		cfg = new CFG();
		loadCluster(cfg);
		
		s = new SaronServer(this);
		
		register(s);
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
}
