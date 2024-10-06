package main.gui.model;

import main.gui.images.ImageTable;

public class ZK3a1PR extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK3a1PR() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK3a1PR.getImage();
		
		TypZK.s="ZK3a-1PR";
		
		get("Podst1a").setCoord(145,890);
		get("Podst1b").setCoord(181,890);
		  
		get("Podst2a").setCoord(236,890);
		get("Podst2b").setCoord(272,890);
		  
		get("Podst3a").setCoord(327,890);
		get("Podst3b").setCoord(363,890);
		  
		get("Podst4a").setCoord(607,890);
		get("Podst4b").setCoord(643,890);
		  
		get("Podst1c").setCoord(191,390);
		  
		get("Podst2c").setCoord(278,390);
		  
		get("Podst3c").setCoord(373,390);
		  
		get("Rbk1").setCoord(475,420);
		  
		get("Etimat1").setCoord(677,390);
		  
		  
		get("Ruz").setCoord(32,680);
		  
		get("NrDz1").setCoord(560, 140);
		  
		get("Rbk1i").setCoord(497, 350);
		  
		get("Podst1").setCoord(142, 290);
		  
		get("Podst2").setCoord(233, 290);
		  
		get("Podst3").setCoord(323, 290);
		  
		  
	}

}
