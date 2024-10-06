package main.gui.model;

import main.gui.images.ImageTable;

public class ZK2a4P extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK2a4P() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK2a4P.getImage();
		
		TypZK.s="ZK2a-4P";
		
		get("Podst1a").setCoord(78,890);
		get("Podst1b").setCoord(114,890);
		  
		get("Podst2a").setCoord(339,890);
		get("Podst2b").setCoord(375,890);
		  
		get("Podst3a").setCoord(619,890);
		get("Podst3b").setCoord(655,890);
		  
		get("Podst4a").setCoord(708,890);
		get("Podst4b").setCoord(744,890);
		  
		get("Podst5a").setCoord(1058,890);
		get("Podst5b").setCoord(1091,890);
		  
		get("Podst6a").setCoord(1317,890);
		get("Podst6b").setCoord(1353,890);
		  
		get("Etimat1").setCoord(40,340);
		  
		get("Rbk1").setCoord(180,470);
		  
		get("Etimat2").setCoord(308,340);
		  
		get("Rbk2").setCoord(450,470);
		  
		get("Etimat3").setCoord(1130,340);
		  
		get("Rbk3").setCoord(926,430);
		  
		get("Etimat4").setCoord(1380,340);
		  
		get("Rbk4").setCoord(1186,430);
		  
		get("Podst1c").setCoord(665,395);
		  
		get("Podst2c").setCoord(755,395);
		  
		  
		get("Ruz").setCoord(800,680);
		  
		get("NrDz1").setCoord(120, 140);
		get("NrDz2").setCoord(365, 140);
		get("NrDz3").setCoord(1007, 140);
		get("NrDz4").setCoord(1265, 140);
		  
		get("Rbk1i").setCoord(219, 350);
		get("Rbk2i").setCoord(480, 350);
		get("Rbk3i").setCoord(948, 350);
		get("Rbk4i").setCoord(1208, 350);
		  
		get("Podst1").setCoord(615, 290);
		  
		get("Podst2").setCoord(705, 290);
		  
		  
	}

}
