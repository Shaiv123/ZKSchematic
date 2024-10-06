package main.gui.model;

import main.gui.images.ImageTable;

public class ZK4a1ppl extends ZK {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK4a1ppl() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK4a1ppl.getImage();
		
		TypZK.s="ZK4a1ppl";
		
		  get("Podst1a").setCoord(320-33,870);
		  get("Podst1b").setCoord(320+3,870);
		  
		  get("Podst2a").setCoord(698-33,870);
		  get("Podst2b").setCoord(698+3,870);
		  
		  get("Podst3a").setCoord(797-33,870);
		  get("Podst3b").setCoord(797+3,870);
		  
		  get("Podst4a").setCoord(897-33,870);
		  get("Podst4b").setCoord(897+3,870);
		  
		  get("Podst5a").setCoord(997-33,870);
		  get("Podst5b").setCoord(997+3,870);
		  
		  get("Podst1c").setCoord(320+15,375);
		  
		  get("Podst2c").setCoord(569+15,375);
		  
		  get("Podst3c").setCoord(698+15,375);
		  
		  get("Podst4c").setCoord(797+15,375);
		  
		  get("Podst5c").setCoord(897+15,375);
		  
		  get("Podst6c").setCoord(997+15,375);
		  
		  get("Ruz").setCoord(1010,540);
		  
		  get("NrDz1").setCoord(110, 145);
		  get("opis1").setCoord(410, 270);
		  get("opis2").setCoord(410, 290);
		  get("opis3").setCoord(410, 310);
		 
		  
		  get("Podst1").setCoord(320-37, 290);
		  
		  get("Podst2").setCoord(569-37, 290);
		  
		  get("Podst3").setCoord(698-37, 260);
		  
		  get("Podst4").setCoord(797-37, 260);
		  
		  get("Podst5").setCoord(897-37, 260);
		  
		  get("Podst6").setCoord(997-37, 260);
	}

}
