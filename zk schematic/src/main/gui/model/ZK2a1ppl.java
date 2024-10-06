package main.gui.model;

import main.gui.images.ImageTable;

public class ZK2a1ppl extends ZK {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK2a1ppl() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK2a1ppl.getImage();
		
		TypZK.s="ZK2a1ppl";
		
		get("Podst1a").setCoord(313-33,870);
		get("Podst1b").setCoord(313+3,870);
		  
		get("Podst2a").setCoord(683-33,870);
		get("Podst2b").setCoord(683+3,870);
		  
		get("Podst3a").setCoord(783-33,870);
		get("Podst3b").setCoord(783+3,870);
		  
		get("Podst1c").setCoord(313+15,375);
		  
		get("Podst2c").setCoord(562+15,375);
		  
		get("Podst3c").setCoord(683+15,395);
		  
		get("Podst4c").setCoord(783+15,395);
		  
		  
		get("Ruz").setCoord(790,540);
		  
		get("NrDz1").setCoord(110, 145);
		get("opis1").setCoord(400, 270);
		get("opis2").setCoord(400, 290);
		get("opis3").setCoord(400, 310);
		 
		  
		get("Podst1").setCoord(313-37, 260);
		  
		get("Podst2").setCoord(562-37, 260);
		  
		get("Podst3").setCoord(683-37, 290);
		  
		get("Podst4").setCoord(783-37, 290);
		  
	}

}
