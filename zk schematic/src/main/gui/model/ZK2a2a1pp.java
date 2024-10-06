package main.gui.model;

import main.gui.images.ImageTable;

public class ZK2a2a1pp  extends ZK {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK2a2a1pp() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK2a2a1pp.getImage();
		
		TypZK.s="ZK2a2a1pp";
		
		get("Podst1a").setCoord(152-33,870);
		get("Podst1b").setCoord(152+3,870);
		  
		get("Podst2a").setCoord(252-33,870);
		get("Podst2b").setCoord(252+3,870);
		  
		  
		get("Podst4a").setCoord(509-33,870);
		get("Podst4b").setCoord(509+3,870);
		  
		get("Podst5a").setCoord(608-33,870);
		get("Podst5b").setCoord(608+3,870);
		  
		get("Podst6a").setCoord(986-33,870);
		get("Podst6b").setCoord(986+3,870);
		  
		get("Podst1c").setCoord(152+15,375);
		  
		get("Podst2c").setCoord(252+15,375);
		  
		get("Podst3c").setCoord(344+15,375);
		  
		get("Podst4c").setCoord(509+15,375);
		  
		get("Podst5c").setCoord(608+15,375);
		  
		get("Podst6c").setCoord(737+15,395);
		  
		get("Podst1d").setCoord(987+15,395);
		  
		get("Ruz").setCoord(50,540);
		  
		get("NrDz1").setCoord(1100, 145);
		get("opis1").setCoord(810, 270);
		get("opis2").setCoord(810, 290);
		get("opis3").setCoord(810, 310);
		 
		  
		get("Podst1").setCoord(153-37, 260);
		  
		get("Podst2").setCoord(253-37, 260);
		  
		get("Podst3").setCoord(345-37, 260);
		  
		get("Podst4").setCoord(510-37, 260);
		  
		get("Podst5").setCoord(609-37, 260);
		  
		get("Podst6").setCoord(738-37, 290);
		  
		get("Podst7").setCoord(987-37, 290);
		  
	}
}
