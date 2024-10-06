package main.gui.model;

import main.gui.images.ImageTable;

public class ZK3a1pp extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK3a1pp() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK3a1pp.getImage();
		
		TypZK.s="ZK3a1pp";
		
		get("Podst1a").setCoord(152-33,870);
		get("Podst1b").setCoord(152+3,870);
		  
		get("Podst2a").setCoord(252-33,870);
		get("Podst2b").setCoord(252+3,870);
		  
		get("Podst3a").setCoord(352-33,870);
		get("Podst3b").setCoord(352+3,870);
		  
		get("Podst4a").setCoord(757-33,870);
		get("Podst4b").setCoord(757+3,870);
		  
		get("Podst1c").setCoord(152+15,375);
		  
		get("Podst2c").setCoord(252+15,375);
		  
		get("Podst3c").setCoord(352+15,375);
		  
		get("Podst4c").setCoord(508+15,395);
		  
		get("Podst5c").setCoord(757+15,395);
		  
		get("Ruz").setCoord(50,540);
		  
		get("NrDz1").setCoord(880, 145);
		get("opis1").setCoord(590, 270);
		get("opis2").setCoord(590, 290);
		get("opis3").setCoord(590, 310);
		 
		  
		get("Podst1").setCoord(153-37, 260);
		  
		get("Podst2").setCoord(253-37, 260);
		  
		get("Podst3").setCoord(353-37, 260);
		  
		get("Podst4").setCoord(509-37, 290);
		  
		get("Podst5").setCoord(758-37, 290);
	}

}
