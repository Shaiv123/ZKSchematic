package main.gui.model;

import main.gui.images.ImageTable;

public class ZK5a1PR extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public ZK5a1PR() {
		super();
	}
	
	
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK5a1PR.getImage();
		
		TypZK.s="ZK5a-1PR";
		
		get("Podst1a").setCoord(189-33,890);
		get("Podst1b").setCoord(189+3,890);
		  
		get("Podst2a").setCoord(289-33,890);
		get("Podst2b").setCoord(289+3,890);
		  
		get("Podst3a").setCoord(383-33,890);
		get("Podst3b").setCoord(383+3,890);
		  
		get("Podst4a").setCoord(474-33,890);
		get("Podst4b").setCoord(474+3,890);
		  
		get("Podst5a").setCoord(565-33,890);
		get("Podst5b").setCoord(565+3,890);
		  
		get("Podst6a").setCoord(845-33,890);
		get("Podst6b").setCoord(845+3,890);
		  
		get("Podst1c").setCoord(189+15,390);
		  
		get("Podst2c").setCoord(289+15,390);
		  
		get("Podst3c").setCoord(383+15,390);
		  
		get("Podst4c").setCoord(474+15,390);
		  
		get("Podst5c").setCoord(565+15,390);
		  
		get("Rbk1").setCoord(680,420);
		  
		get("Etimat1").setCoord(880,390);
		  
		  
		get("Ruz").setCoord(32,680);
		  
		get("NrDz1").setCoord(770, 140);
		  
		get("Rbk1i").setCoord(701, 350);
		  
		get("Podst1").setCoord(189-37, 290);
		  
		get("Podst2").setCoord(289-37, 290);
		  
		get("Podst3").setCoord(383-37, 290);
		  
		get("Podst4").setCoord(474-37, 290);
		  
		get("Podst5").setCoord(565-37, 290);
		  
		  
	}

}
