package main.gui.model;

import main.gui.images.ImageTable;

public class ZK3a1PL extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK3a1PL() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK3a1PL.getImage();
		
		TypZK.s="ZK3a-1PL";
		
		get("Podst1a").setCoord(94,890);
		get("Podst1b").setCoord(130,890);
		  
		get("Podst2a").setCoord(374,890);
		get("Podst2b").setCoord(408,890);
		  
		get("Podst3a").setCoord(464,890);
		get("Podst3b").setCoord(500,890);
		  
		get("Podst4a").setCoord(554,890);
		get("Podst4b").setCoord(590,890);
		  
		get("Etimat1").setCoord(60,380);
		  
		get("Rbk1").setCoord(210,470);
		  
		get("Podst1c").setCoord(422,390);
		  
		get("Podst2c").setCoord(512,390);
		  
		get("Podst3c").setCoord(602,390);
		  
		  
		get("Ruz").setCoord(660,680);
		  
		get("NrDz1").setCoord(120, 140);
		  
		get("Rbk1i").setCoord(235, 350);
		  
		get("Podst1").setCoord(370, 290);
		  
		get("Podst2").setCoord(460, 290);
		  
		get("Podst3").setCoord(551, 290);
		  
		  
	}

}
