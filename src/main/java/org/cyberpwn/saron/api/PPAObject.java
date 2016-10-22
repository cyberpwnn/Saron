package org.cyberpwn.saron.api;

import java.io.IOException;
import org.bukkit.Material;
import org.phantomapi.clust.DataCluster;
import org.phantomapi.clust.DataEntity;
import org.phantomapi.lang.GList;
import org.phantomapi.world.MaterialBlock;
import org.phantomapi.world.VariableBlock;
import org.phantomapi.world.W;

public class PPAObject implements DataEntity
{
	private VariableBlock block;
	private DataCluster data;
	
	public PPAObject(VariableBlock block, DataCluster data)
	{
		this.block = block;
		this.data = data;
	}
	
	public VariableBlock getBlock()
	{
		return block;
	}
	
	public void setBlock(VariableBlock block)
	{
		this.block = block;
	}
	
	public DataCluster getData()
	{
		return data;
	}
	
	public void setData(DataCluster data)
	{
		this.data = data;
	}
	
	@Override
	public void fromData(byte[] d) throws IOException
	{
		VariableBlock vb = new VariableBlock(Material.AIR);
		vb.getBlocks().clear();
		DataCluster cc = new DataCluster(d);
		GList<String> da = new GList<String>(cc.getStringList("block"));
		cc.remove("block");
		
		for(String i : da)
		{
			vb.addBlock(W.getMaterialBlock(i));
		}
		
		block = vb;
		data = cc;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public byte[] toData() throws IOException
	{
		GList<String> gls = new GList<String>();
		
		for(MaterialBlock i : block.getBlocks())
		{
			gls.add(i.getMaterial().getId() + ":" + i.getData().intValue());
		}
		
		data.set("block", gls);
		
		return data.compress();
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((block == null) ? 0 : block.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(this == obj)
		{
			return true;
		}
		
		if(obj == null)
		{
			return false;
		}
		
		if(getClass() != obj.getClass())
		{
			return false;
		}
		
		PPAObject other = (PPAObject) obj;
		
		if(block == null)
		{
			if(other.block != null)
			{
				return false;
			}
		}
		
		else if(!block.equals(other.block))
		{
			return false;
		}
		
		if(data == null)
		{
			if(other.data != null)
			{
				return false;
			}
		}
		
		else if(!data.equals(other.data))
		{
			return false;
		}
		
		return true;
	}
}
