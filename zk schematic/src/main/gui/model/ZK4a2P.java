package main.gui.model;

import main.gui.images.ImageTable;

public class ZK4a2P extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public ZK4a2P() {
		super();
	}
	
	
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK4a2P.getImage();
		
		TypZK.s="ZK4a-2P";
		
		get("Podst1a").setCoord(94,890);
		get("Podst1b").setCoord(130,890);
		  
		get("Podst2a").setCoord(374,890);
		get("Podst2b").setCoord(408,890);
		  
		get("Podst3a").setCoord(464,890);
		get("Podst3b").setCoord(500,890);
		  
		get("Podst4a").setCoord(588-33,890);
		get("Podst4b").setCoord(588+3,890);
		  
		get("Podst5a").setCoord(682-33,890);
		get("Podst5b").setCoord(682+3,890);
		  
		get("Podst6a").setCoord(1021-33,890);
		get("Podst6b").setCoord(1021+3,890);
		  
		get("Etimat1").setCoord(60,380);
		  
		get("Rbk1").setCoord(210,470);
		  
		get("Podst1c").setCoord(422,390);
		  
		get("Podst2c").setCoord(512,390);
		  
		get("Podst3c").setCoord(588+15,390);
		  
		get("Podst4c").setCoord(682+15,390);
		  
		get("Etimat2").setCoord(1058,380);
		  
		get("Rbk2").setCoord(856,430);
		  
		  
		get("Ruz").setCoord(750,680);
		  
		get("NrDz1").setCoord(120, 140);
		get("NrDz2").setCoord(950, 140);
		  
		get("Rbk1i").setCoord(235, 350);
		get("Rbk2i").setCoord(915-37, 350);
		  
		get("Podst1").setCoord(370, 290);
		  
		get("Podst2").setCoord(460, 290);
		  
		get("Podst3").setCoord(588-37, 290);
		  
		get("Podst4").setCoord(682-37, 290);
		  
	}

}
