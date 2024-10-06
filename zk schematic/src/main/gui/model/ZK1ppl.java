package main.gui.model;

import main.gui.images.ImageTable;

public class ZK1ppl extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK1ppl() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK1ppl.getImage();
		
		TypZK.s="ZK1ppl";
		
		get("Podst1a").setCoord(306-33,870);
		get("Podst1b").setCoord(306+3,870);
		  
		get("Podst2a").setCoord(555-33,870);
		get("Podst2b").setCoord(555+3,870);
		  
		get("Podst1c").setCoord(306+15,395);
		  
		get("Podst2c").setCoord(555+15,395);
		  
		  
		get("Ruz").setCoord(570,510);
		  
		get("NrDz1").setCoord(100, 145);
		get("opis1").setCoord(400, 270);
		get("opis2").setCoord(400, 290);
		get("opis3").setCoord(400, 310);
		 
		  
		get("Podst1").setCoord(307-37, 290);
		  
		get("Podst2").setCoord(556-37, 290);
		  
	}

}
