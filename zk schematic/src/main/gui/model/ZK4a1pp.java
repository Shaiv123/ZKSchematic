package main.gui.model;

import main.gui.images.ImageTable;

public class ZK4a1pp extends ZK {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK4a1pp() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK4a1pp.getImage();
		
		TypZK.s="ZK4a1pp";
		
		  get("Podst1a").setCoord(152-33,870);
		  get("Podst1b").setCoord(152+3,870);
		  
		  get("Podst2a").setCoord(252-33,870);
		  get("Podst2b").setCoord(252+3,870);
		  
		  get("Podst3a").setCoord(352-33,870);
		  get("Podst3b").setCoord(352+3,870);
		  
		  get("Podst4a").setCoord(451-33,870);
		  get("Podst4b").setCoord(451+3,870);
		  
		  get("Podst5a").setCoord(829-33,870);
		  get("Podst5b").setCoord(829+3,870);
		  
		  get("Podst1c").setCoord(152+15,375);
		  
		  get("Podst2c").setCoord(252+15,375);
		  
		  get("Podst3c").setCoord(352+15,375);
		  
		  get("Podst4c").setCoord(451+15,375);
		  
		  get("Podst5c").setCoord(580+15,395);
		  
		  get("Podst6c").setCoord(829+15,395);
		  
		  get("Ruz").setCoord(50,540);
		  
		  get("NrDz1").setCoord(960, 145);
		  get("opis1").setCoord(660, 270);
		  get("opis2").setCoord(660, 290);
		  get("opis3").setCoord(660, 310);
		 
		  
		  get("Podst1").setCoord(153-37, 260);
		  
		  get("Podst2").setCoord(253-37, 260);
		  
		  get("Podst3").setCoord(353-37, 260);
		  
		  get("Podst4").setCoord(452-37, 260);
		  
		  get("Podst5").setCoord(581-37, 290);
		  
		  get("Podst6").setCoord(830-37, 290);
	}

}
