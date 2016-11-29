package org.cyberpwn.saron.game;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.cyberpwn.saron.CFG;
import org.phantomapi.Phantom;
import org.phantomapi.game.CapacityMode;
import org.phantomapi.game.GamePlugin;
import org.phantomapi.game.ResourcePackMode;
import org.phantomapi.gui.PhantomWindow;
import org.phantomapi.gui.Window;
import org.phantomapi.sync.Task;
import org.phantomapi.util.C;

public class SaronDesigner extends SaronGame implements Listener
{
	private Task task;
	
	public SaronDesigner(GamePlugin plugin)
	{
		super(plugin);
		
		task = null;
		getProfile().getCapacityProfile().setMode(CapacityMode.valueOf(CFG.i.designerCapacityMode));
		getProfile().getCapacityProfile().setAcceptingPlayers(CFG.i.designerEnabled);
		getProfile().getResourceProfile().setMode(ResourcePackMode.NONE);
	}
	
	@Override
	public void onStart(String... lauchParameters)
	{
		Phantom.instance().registerListener(this);
		
		task = new Task(0)
		{
			@Override
			public void run()
			{
				for(Player i : getPlayers())
				{
					verifyPlayer(i);
				}
			}
		};
	}
	
	public void verifyPlayer(Player p)
	{
		if(!p.getGameMode().equals(GameMode.CREATIVE))
		{
			p.setGameMode(GameMode.CREATIVE);
		}
		
		ItemStack ce = p.getInventory().getItem(0);
		ItemStack ex = p.getInventory().getItem(8);
		
		if(ce == null || !ce.equals(getCreator()))
		{
			p.getInventory().setItem(0, getCreator());
		}
		
		if(ex == null || !ex.equals(getExit()))
		{
			p.getInventory().setItem(8, getExit());
		}
	}
	
	@EventHandler
	public void on(PlayerDropItemEvent e)
	{
		if(contains(e.getPlayer()))
		{
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void on(PlayerInteractEvent e)
	{
		if(contains(e.getPlayer()))
		{
			if(e.getPlayer().getInventory().getHeldItemSlot() == 0)
			{
				launchDesignerGUI(e.getPlayer());
			}
			
			if(e.getPlayer().getInventory().getHeldItemSlot() == 8)
			{
				quitGame(e.getPlayer());
				CFG.msg(e.getPlayer(), "Designer mode disabled.");
				e.getPlayer().getInventory().setItem(0, new ItemStack(Material.AIR));
				e.getPlayer().getInventory().setItem(8, new ItemStack(Material.AIR));
			}
		}
	}
	
	public void launchDesignerGUI(Player player)
	{
		Window w = new PhantomWindow("?", player);
		
		w.open();
	}
	
	public ItemStack getCreator()
	{
		ItemStack is = new ItemStack(Material.SLIME_BALL);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(C.GREEN + "Create Object");
		is.setItemMeta(im);
		
		return is;
	}
	
	public ItemStack getExit()
	{
		ItemStack is = new ItemStack(Material.BARRIER);
		ItemMeta im = is.getItemMeta();
		im.setDisplayName(C.RED + "Exit Designer");
		is.setItemMeta(im);
		
		return is;
	}
	
	@Override
	public void onStop(String... endParameters)
	{
		task.cancel();
		Phantom.instance().unRegisterListener(this);
	}
	
	@Override
	public void onJoin(Player p)
	{
		
	}
	
	@Override
	public void onQuit(Player p)
	{
		
	}
}
