package org.cyberpwn.saron;

import java.util.UUID;
import org.cyberpwn.saron.api.Instance;
import org.phantomapi.command.Command;
import org.phantomapi.command.CommandAlias;
import org.phantomapi.command.PhantomCommand;
import org.phantomapi.command.PhantomSender;
import org.phantomapi.construct.Controllable;
import org.phantomapi.construct.Controller;
import org.phantomapi.lang.GList;
import org.phantomapi.lang.GMap;

/**
 * Manages all instances
 * 
 * @author cyberpwn
 */
public class InstanceManager extends Controller
{
	private GMap<UUID, Instance> instances;
	
	public InstanceManager(Controllable parentController)
	{
		super(parentController);
		
		instances = new GMap<UUID, Instance>();
	}
	
	@Override
	public void onStart()
	{
		
	}
	
	@Override
	public void onStop()
	{
		
	}
	
	@Command("saron")
	@CommandAlias("hrb")
	public void onHRB(PhantomSender sender, PhantomCommand cmd)
	{
		if(cmd.getArgs().length > 0)
		{
			if(cmd.getArgs()[0].equalsIgnoreCase("hud"))
			{
				
			}
		}
	}
	
	/**
	 * Add an instance
	 * 
	 * @param instance
	 *            the instance
	 */
	public void addInstance(Instance instance)
	{
		instances.put(instance.getId(), instance);
	}
	
	/**
	 * Remove an instance
	 * 
	 * @param instance
	 *            the instance
	 */
	public void removeInstance(Instance instance)
	{
		instances.remove(instance.getId());
	}
	
	/**
	 * Remove an instance
	 * 
	 * @param id
	 *            the instance id
	 */
	public void removeInstance(UUID id)
	{
		instances.remove(id);
	}
	
	/**
	 * Get the instance by id
	 * 
	 * @param id
	 *            the instance
	 * @return the instance or null
	 */
	public Instance getInstance(UUID id)
	{
		return instances.get(id);
	}
	
	/**
	 * Get all instancees
	 * 
	 * @return the instances
	 */
	public GList<Instance> getInstances()
	{
		return instances.v();
	}
	
	/**
	 * Get all instances of the given type
	 * 
	 * @param type
	 *            the instance type
	 * @return the instances of the given type
	 */
	public GList<Instance> getInstances(String type)
	{
		GList<Instance> inst = getInstances();
		
		for(Instance i : inst.copy())
		{
			if(!i.getType().equals(type))
			{
				inst.remove(i);
			}
		}
		
		return inst;
	}
}
