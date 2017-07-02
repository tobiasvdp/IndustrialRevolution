package io.industrialmagic.client;

import io.industrialmagic.common.CommonProxy;
import io.industrialmagic.common.IProxy;
import io.industrialmagic.runes.client.RunesClientProxy;
 

public class ClientProxy extends CommonProxy  {
	
	 
	@Override
	protected IProxy[] setupProxies() 
	{
		return new IProxy[]
		{
			new RunesClientProxy()
		};
	}
	
}
