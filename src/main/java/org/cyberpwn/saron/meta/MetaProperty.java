package org.cyberpwn.saron.meta;

public interface MetaProperty
{
	public void write(String key, Object object);
	
	public Object read(String key);
}
