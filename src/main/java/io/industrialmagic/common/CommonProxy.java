package io.industrialmagic.common;
 

public class CommonProxy {
	
	public IProxy[] proxies;
	
	public CommonProxy()
	{ 
		proxies =  setupProxies();
	}
	
	
	protected IProxy[] setupProxies() {
		return  new IProxy[0];
	}


	public void registerTESRs(){
		for (IProxy iProxy : proxies) {
			iProxy.registerTESRs();
		}
	}
	
	public void registerItemModels(){
		for (IProxy iProxy : proxies) {
			iProxy.registerItemModels();
		}
	}
}
