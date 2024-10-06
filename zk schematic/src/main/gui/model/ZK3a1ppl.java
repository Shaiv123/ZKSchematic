package main.gui.model;

import main.gui.images.ImageTable;

public class ZK3a1ppl extends ZK {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK3a1ppl() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK3a1ppl.getImage();
		
		TypZK.s="ZK3a1ppl";
		
		get("Podst1a").setCoord(392-33,870);
		get("Podst1b").setCoord(392+3,870);
		  
		get("Podst2a").setCoord(797-33,870);
		get("Podst2b").setCoord(797+3,870);
		  
		get("Podst3a").setCoord(897-33,870);
		get("Podst3b").setCoord(897+3,870);
		  
		get("Podst4a").setCoord(997-33,870);
		get("Podst4b").setCoord(997+3,870);
		  
		get("Podst1c").setCoord(392+15,375);
		  
		get("Podst2c").setCoord(641+15,375);
		  
		get("Podst3c").setCoord(797+15,375);
		  
		get("Podst4c").setCoord(897+15,375);
		  
		get("Podst5c").setCoord(997+15,375);
		  
		get("Ruz").setCoord(1010,540);
		  
		get("NrDz1").setCoord(190, 145);
		get("opis1").setCoord(480, 270);
		get("opis2").setCoord(480, 290);
		get("opis3").setCoord(480, 310);
		 
		  
		get("Podst1").setCoord(392-37, 290);
		  
		get("Podst2").setCoord(641-37, 290);
		  
		get("Podst3").setCoord(797-37, 260);
		  
		get("Podst4").setCoord(897-37, 260);
		  
		get("Podst5").setCoord(997-37, 260);
	}

}
