package main.gui.model;

import main.gui.images.ImageTable;

public class ZK4a1PR extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK4a1PR() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK4a1PR.getImage();
		
		TypZK.s="ZK4a-1PR";
		
		get("Podst1a").setCoord(148,890);
		get("Podst1b").setCoord(184,890);
		  
		get("Podst2a").setCoord(242,890);
		get("Podst2b").setCoord(278,890);
		  
		get("Podst3a").setCoord(334,890);
		get("Podst3b").setCoord(370,890);
		  
		get("Podst4a").setCoord(424,890);
		get("Podst4b").setCoord(460,890);
		  
		get("Podst5a").setCoord(702,890);
		get("Podst5b").setCoord(738,890);
		  
		get("Podst1c").setCoord(194,390);
		  
		get("Podst2c").setCoord(284,390);
		  
		get("Podst3c").setCoord(380,390);
		  
		get("Podst4c").setCoord(471,390);
		  
		get("Rbk1").setCoord(570,420);
		  
		get("Etimat1").setCoord(775,390);
		  
		  
		get("Ruz").setCoord(32,680);
		  
		get("NrDz1").setCoord(655, 140);
		  
		get("Rbk1i").setCoord(593, 350);
		  
		get("Podst1").setCoord(145, 290);
		  
		get("Podst2").setCoord(239, 290);
		  
		get("Podst3").setCoord(330, 290);
		  
		get("Podst4").setCoord(420, 290);
		  
		  
	}

}
