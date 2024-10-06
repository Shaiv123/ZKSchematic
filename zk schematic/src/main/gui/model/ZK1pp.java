package main.gui.model;

import main.gui.images.ImageTable;

public class ZK1pp extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ZK1pp() {
		super();
	}
	
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK1pp.getImage();
		
		TypZK.s="ZK1pp";
		
		get("Podst1a").setCoord(137-33,870);
		get("Podst1b").setCoord(137+3,870);
		  
		get("Podst2a").setCoord(386-33,870);
		get("Podst2b").setCoord(386+3,870);
		  
		get("Podst1c").setCoord(137+15,395);
		  
		get("Podst2c").setCoord(386+15,395);
		  
		  
		get("Ruz").setCoord(30,510);
		  
		get("NrDz1").setCoord(510, 145);
		get("opis1").setCoord(220, 270);
		get("opis2").setCoord(220, 290);
		get("opis3").setCoord(220, 310);
		 
		  
		get("Podst1").setCoord(138-37, 290);
		  
		get("Podst2").setCoord(387-37, 290);
		  
	}

}
