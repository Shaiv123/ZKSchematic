package main.gui.model;

import main.gui.images.ImageTable;

public class ZK3a4P extends ZK {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK3a4P() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK3a4P.getImage();
		
		TypZK.s="ZK3a-4P";
		
		  get("Podst1a").setCoord(94,890);
		  get("Podst1b").setCoord(130,890);
		  
		  get("Podst2a").setCoord(355,890);
		  get("Podst2b").setCoord(391,890);
		  
		  get("Podst3a").setCoord(639,890);
		  get("Podst3b").setCoord(675,890);
		  
		  get("Podst4a").setCoord(729,890);
		  get("Podst4b").setCoord(765,890);
		  
		  get("Podst5a").setCoord(821,890);
		  get("Podst5b").setCoord(857,890);
		  
		  get("Podst6a").setCoord(1164,890);
		  get("Podst6b").setCoord(1200,890);
		  
		  get("Podst7a").setCoord(1424,890);
		  get("Podst7b").setCoord(1460,890);
		  
		  get("Etimat1").setCoord(60,340);
		  
		  get("Rbk1").setCoord(205,460);
		  
		  get("Etimat2").setCoord(325,340);
		  
		  get("Rbk2").setCoord(465,460);
		  
		  get("Etimat3").setCoord(1230,340);
		  
		  get("Rbk3").setCoord(1030,430);
		  
		  get("Etimat4").setCoord(1490,340);
		  
		  get("Rbk4").setCoord(1295,430);
		  
		  get("Podst1c").setCoord(685,395);
		  
		  get("Podst2c").setCoord(775,395);
		  
		  get("Podst3c").setCoord(867,395);
		  
		  
		  get("Ruz").setCoord(900,680);
		  
		  get("NrDz1").setCoord(130, 140);
		  get("NrDz2").setCoord(375, 140);
		  get("NrDz3").setCoord(1115, 140);
		  get("NrDz4").setCoord(1375, 140);
		  
		  get("Rbk1i").setCoord(235, 350);
		  get("Rbk2i").setCoord(496, 350);
		  get("Rbk3i").setCoord(1055, 350);
		  get("Rbk4i").setCoord(1315, 350);
		  
		  get("Podst1").setCoord(636, 290);
		  
		  get("Podst2").setCoord(726, 290);
		  
		  get("Podst3").setCoord(818, 290);
		  
		  
	}

}
