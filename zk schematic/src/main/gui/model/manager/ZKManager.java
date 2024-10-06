package main.gui.model.manager;

import javolution.util.FastMap;
import main.gui.model.*;

public class ZKManager {

	private static ZKManager instance;
	private static FastMap<String,ZK> map = new FastMap<String,ZK>();
	
	
	
	public static ZKManager getInstance() {
		if (instance == null)
			instance = new ZKManager();
		
		return instance;
	}
	
	
	public ZKManager() {
		ZK zk;
		
		zk = new ZK1a();
		map.put(zk.getType(), zk);
		
		zk = new ZK1b();
		map.put(zk.getType(), zk);
		
		zk = new ZK1e1P();
		map.put(zk.getType(), zk);
		
		zk = new ZK1e1PS();
		map.put(zk.getType(), zk);
		
		zk = new ZK2a();
		map.put(zk.getType(), zk);
		
		zk = new ZK2aa();
		map.put(zk.getType(), zk);
		
		zk = new ZK2a2a();
		map.put(zk.getType(), zk);
		
		zk = new ZK3a();
		map.put(zk.getType(), zk);
		
		zk = new ZK3b();
		map.put(zk.getType(), zk);
		
		zk = new ZK3c();
		map.put(zk.getType(), zk);
		
		zk = new ZK4a();
		map.put(zk.getType(), zk);
		
		zk = new ZK5a();
		map.put(zk.getType(), zk);
		
		zk = new ZK6a();
		map.put(zk.getType(), zk);
		
		
		zk = new ZK2a1PL();
		map.put(zk.getType(), zk);
		zk = new ZK2a1PR();
		map.put(zk.getType(), zk);
		
		zk = new ZK3a1PL();
		map.put(zk.getType(), zk);
		zk = new ZK3a1PR();
		map.put(zk.getType(), zk);
		
		zk = new ZK4a1PL();
		map.put(zk.getType(), zk);
		zk = new ZK4a1PR();
		map.put(zk.getType(), zk);
		
		zk = new ZK5a1PL();
		map.put(zk.getType(), zk);
		zk = new ZK5a1PR();
		map.put(zk.getType(), zk);
		
		zk = new ZK1e2P();
		map.put(zk.getType(), zk);
		zk = new ZK2a2P();
		map.put(zk.getType(), zk);
		zk = new ZK3a2P();
		map.put(zk.getType(), zk);
		zk = new ZK4a2P();
	    map.put(zk.getType(), zk);
		zk = new ZK5a2P();
		map.put(zk.getType(), zk);
		
		zk = new ZK2a4P();
		map.put(zk.getType(), zk);
		zk = new ZK3a4P();
		map.put(zk.getType(), zk);
		
		zk = new ZK1pp();
		map.put(zk.getType(), zk);
		zk = new ZK1ppl();
		map.put(zk.getType(), zk);
		zk = new ZK1b1pp();
		map.put(zk.getType(), zk);
		zk = new ZK1b1ppl();
		map.put(zk.getType(), zk);
		zk = new ZK2a1pp();
		map.put(zk.getType(), zk);
		zk = new ZK2a1ppl();
		map.put(zk.getType(), zk);
		zk = new ZK3a1pp();
		map.put(zk.getType(), zk);
		zk = new ZK3a1ppl();
		map.put(zk.getType(), zk);
		zk = new ZK4a1pp();
		map.put(zk.getType(), zk);
		zk = new ZK4a1ppl();
		map.put(zk.getType(), zk);
		zk = new ZK2a2a1pp();
		map.put(zk.getType(), zk);
		zk = new ZK2a2a1ppl();
		map.put(zk.getType(), zk);
	}
	
	
	public static FastMap<String, ZK> getMap(){
		return map;
	}

}
