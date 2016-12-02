package org.cyberpwn.saron.meta;

import org.bukkit.Location;
import org.bukkit.Sound;
import org.phantomapi.clust.DataCluster;
import org.phantomapi.lang.GSound;
import org.phantomapi.world.Area;

public class SFXMeta extends SaronMeta
{
	private double pitch;
	private double range;
	private Sound sound;
	
	public SFXMeta(int tickrate, Sound sound, double pitch, double range)
	{
		super("sfx", tickrate);
		
		this.pitch = pitch;
		this.range = range;
		this.sound = sound;
	}
	
	public SFXMeta()
	{
		super();
	}
	
	@Override
	public void onTick(Location location)
	{
		new GSound(sound, (float) range, (float) pitch).play(location);
	}
	
	@Override
	public boolean shouldTick(Location location)
	{
		Area a = new Area(location, 16 * range);
		
		if(a.getNearbyPlayers().length == 0)
		{
			return false;
		}
		
		return true;
	}
	
	@Override
	public void write(DataCluster cc, String key)
	{
		super.write(cc, key);
		
		cc.set(key + ".sfx.p", pitch);
		cc.set(key + ".sfx.v", range);
		cc.set(key + ".sfx.s", sound.name());
	}
	
	@Override
	public void read(DataCluster cc, String key)
	{
		super.read(cc, key);
		
		pitch = cc.getDouble(key + ".sfx.p");
		range = cc.getDouble(key + ".sfx.v");
		sound = Sound.valueOf(cc.getString(key + ".sfx.s"));
	}
	
	public double getPitch()
	{
		return pitch;
	}
	
	public double getRange()
	{
		return range;
	}
	
	public Sound getSound()
	{
		return sound;
	}
}
