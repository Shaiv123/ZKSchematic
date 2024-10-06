package main.gui.model;

import main.gui.images.ImageTable;

public class ZK2a1pp extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK2a1pp() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK2a1pp.getImage();
		
		TypZK.s="ZK2a1pp";
		
		get("Podst1a").setCoord(152-33,870);
		get("Podst1b").setCoord(152+3,870);
		  
		get("Podst2a").setCoord(252-33,870);
		get("Podst2b").setCoord(252+3,870);
		  
		get("Podst3a").setCoord(622-33,870);
		get("Podst3b").setCoord(622+3,870);
		  
		get("Podst1c").setCoord(152+15,375);
		  
		get("Podst2c").setCoord(252+15,375);
		  
		get("Podst3c").setCoord(373+15,395);
		  
		get("Podst4c").setCoord(622+15,395);
		  
		  
		get("Ruz").setCoord(50,540);
		  
		get("NrDz1").setCoord(745, 145);
		get("opis1").setCoord(457, 270);
		get("opis2").setCoord(457, 290);
		get("opis3").setCoord(457, 310);
		 
		  
		get("Podst1").setCoord(152-37, 260);
		  
		get("Podst2").setCoord(252-37, 260);
		  
		get("Podst3").setCoord(373-37, 290);
		  
		get("Podst4").setCoord(622-37, 290);
		  
	}

}
