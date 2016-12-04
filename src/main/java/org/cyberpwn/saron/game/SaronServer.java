package org.cyberpwn.saron.game;

import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.phantomapi.command.CommandController;
import org.phantomapi.command.PhantomCommand;
import org.phantomapi.command.PhantomCommandSender;
import org.phantomapi.construct.Controllable;
import org.phantomapi.construct.Ticked;
import org.phantomapi.lang.GList;
import org.phantomapi.lang.GSet;
import org.phantomapi.lang.GSound;
import org.phantomapi.text.SYM;
import org.phantomapi.util.C;

@Ticked(0)
public class SaronServer extends CommandController
{
	private GSet<SaronGame> games;
	
	public SaronServer(Controllable parentController)
	{
		super(parentController, ".");
		
		games = new GSet<SaronGame>();
	}
	
	@Override
	public boolean onCommand(PhantomCommandSender sender, PhantomCommand command)
	{
		String[] a = command.getArgs();
		Player p = sender.getPlayer();
		Boolean response = true;
		
		if(a.length > 0)
		{
			
		}
		
		else
		{
			sender.sendMessage("Hi there.");
		}
		
		if(p != null)
		{
			if(response)
			{
				new GSound(Sound.CLICK, 1f, 1.8f).play(p);
			}
		}
		
		return true;
	}
	
	@Override
	public void onTick()
	{
		for(SaronGame i : games)
		{
			i.tick();
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
	public String getChatTag()
	{
		return C.RED + "" + SYM.SYMBOL_DIAMOND + C.DARK_GRAY + " " + C.GRAY;
	}
	
	@Override
	public String getChatTagHover()
	{
		return C.RED + "Saron";
	}
	
	@Override
	public GList<String> getCommandAliases()
	{
		return new GList<String>().qadd("saron").qadd("sar");
	}
}
