package org.cyberpwn.saron;

import org.phantomapi.command.CommandController;
import org.phantomapi.command.PhantomCommand;
import org.phantomapi.command.PhantomCommandSender;
import org.phantomapi.construct.Controllable;

public class SaronInstance extends CommandController
{
	public SaronInstance(Controllable parentController)
	{
		super(parentController, "saron");
	}
	
	@Override
	public boolean onCommand(PhantomCommandSender arg0, PhantomCommand arg1)
	{
		return false;
	}
	
	@Override
	public void onStart()
	{
		
	}
	
	@Override
	public void onStop()
	{
		
	}
}
