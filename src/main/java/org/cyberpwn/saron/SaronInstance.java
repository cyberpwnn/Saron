package org.cyberpwn.saron;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.cyberpwn.saron.game.SaronDesigner;
import org.phantomapi.Phantom;
import org.phantomapi.command.CommandController;
import org.phantomapi.command.CommandListener;
import org.phantomapi.command.PhantomCommand;
import org.phantomapi.command.PhantomCommandSender;
import org.phantomapi.command.PhantomSender;
import org.phantomapi.construct.Controllable;
import org.phantomapi.lang.GList;
import org.phantomapi.text.MessageBuilder;
import org.phantomapi.util.C;

public class SaronInstance extends CommandController
{
	private SaronDesigner designer;
	
	public SaronInstance(Controllable parentController)
	{
		super(parentController, "saron");
		
		designer = null;
		
		Phantom.instance().getCommandRegistryController().register((CommandListener) this);
	}
	
	@EventHandler
	public void on(PlayerCommandPreprocessEvent e)
	{
		if(e.getPlayer().hasPermission("saron.developer"))
		{
			MessageBuilder mb = new MessageBuilder(this);
			PhantomSender sender = new PhantomSender(e.getPlayer());
			sender.setMessageBuilder(mb);
			String message = e.getMessage();
			String roots = message;
			GList<String> rtz = new GList<String>(roots.split(" "));
			String command = rtz.pop();
			String[] args = rtz.toArray(new String[rtz.size()]);
			PhantomCommand cmd = new PhantomCommand("saron", args);
			
			if(command.equalsIgnoreCase("/saron"))
			{
				e.setCancelled(true);
				
				if(designer != null)
				{
					if(cmd.getArgs().length > 0)
					{
						if(cmd.getArgs()[0].equalsIgnoreCase("join") || cmd.getArgs()[0].equalsIgnoreCase("j"))
						{
							if(sender.isPlayer())
							{
								if(designer.contains(sender.getPlayer()))
								{
									sender.sendMessage("Already in designer mode.");
								}
								
								else
								{
									designer.joinGame(sender.getPlayer());
									sender.sendMessage("Designer mode enabled");
								}
							}
						}
						
						else if(cmd.getArgs()[0].equalsIgnoreCase("quit") || cmd.getArgs()[0].equalsIgnoreCase("q"))
						{
							if(sender.isPlayer())
							{
								if(!designer.contains(sender.getPlayer()))
								{
									sender.sendMessage("Not in designer mode.");
								}
								
								else
								{
									designer.quitGame(sender.getPlayer());
									sender.sendMessage("Designer mode disabled");
								}
							}
						}
						
						else
						{
							sender.sendMessage("/saron j,join - Join designer");
							sender.sendMessage("/saron q,quit - Quit designer");
						}
					}
					
					else
					{
						sender.sendMessage("/saron j,join - Join designer");
						sender.sendMessage("/saron q,quit - Quit designer");
					}
				}
				
				else
				{
					sender.sendMessage("Designer mode is not enabled.");
				}
			}
		}
	}
	
	@Override
	public void onStart()
	{
		if(CFG.i.designerEnabled)
		{
			s("Starting Saron Designer");
			designer = new SaronDesigner(Saron.instance);
			designer.startGame();
		}
		
		else
		{
			f("Saron Game Not started. PRODUCTION UNSUPPORTED.");
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
	
	@Override
	public String getChatTag()
	{
		return C.DARK_GRAY + "[" + C.LIGHT_PURPLE + "Saron" + C.DARK_GRAY + "]: " + C.GRAY;
	}
	
	@Override
	public String getChatTagHover()
	{
		return C.LIGHT_PURPLE + "Saron Engine";
	}
	
	@Override
	public GList<String> getCommandAliases()
	{
		return new GList<String>().qadd("sar").qadd("sarons").qadd("sa");
	}
	
	@Override
	public boolean onCommand(PhantomCommandSender sender, PhantomCommand command)
	{
		return false;
	}
}
