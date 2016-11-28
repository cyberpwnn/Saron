package org.cyberpwn.saron;

import org.cyberpwn.saron.game.SaronDesigner;
import org.phantomapi.command.CommandController;
import org.phantomapi.command.PhantomCommand;
import org.phantomapi.command.PhantomCommandSender;
import org.phantomapi.construct.Controllable;

public class SaronInstance extends CommandController
{
	private SaronDesigner designer;
	
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
		if(CFG.i.designerEnabled)
		{
			designer = new SaronDesigner(Saron.instance);
			designer.startGame();
		}
		
		else
		{
			
		}
	}
	
	@Override
	public void onStop()
	{
		if(CFG.i.designerEnabled)
		{
			designer.stopGame();
		}
	}
}
