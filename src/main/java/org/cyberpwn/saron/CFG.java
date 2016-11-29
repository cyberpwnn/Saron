package org.cyberpwn.saron;

import org.bukkit.entity.Player;
import org.phantomapi.clust.ConfigurableObject;
import org.phantomapi.clust.DataCluster;
import org.phantomapi.clust.Keyed;
import org.phantomapi.text.MessageBuilder;

public class CFG extends ConfigurableObject
{
	public static CFG i;
	
	@Keyed("designer.enabled")
	public boolean designerEnabled = true;
	
	@Keyed("designer.capacity-mode")
	public String designerCapacityMode = "UNLIMITED";
	
	public CFG()
	{
		super("configuration");
		
		i = this;
	}
	
	public static void msg(Player p, String msg)
	{
		new MessageBuilder(Saron.instance.getSaronInstance()).message(p, msg);
	}
	
	public static DataCluster get()
	{
		return i.getConfiguration();
	}
}
