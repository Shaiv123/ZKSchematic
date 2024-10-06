package main.gui.model;

import main.gui.images.ImageTable;

public class ZK2a1PR extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ZK2a1PR() {
		super();
	}
	
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK2a1PR.getImage();
		
		TypZK.s="ZK2a-1PR";
		
		get("Podst1a").setCoord(145,890);
		get("Podst1b").setCoord(181,890);
		  
		get("Podst2a").setCoord(236,890);
		get("Podst2b").setCoord(272,890);
		  
		get("Podst3a").setCoord(515,890);
		get("Podst3b").setCoord(551,890);
		  
		get("Podst1c").setCoord(191,390);
		  
		get("Podst2c").setCoord(278,390);
		  
		get("Rbk1").setCoord(382,420);
		  
		get("Etimat1").setCoord(582,390);
		  
		  
		get("Ruz").setCoord(32,680);
		  
		get("NrDz1").setCoord(470, 140);
		  
		get("Rbk1i").setCoord(406, 350);
		  
		get("Podst1").setCoord(142, 290);
		  
		get("Podst2").setCoord(233, 290);
		  
		  
	}

}
