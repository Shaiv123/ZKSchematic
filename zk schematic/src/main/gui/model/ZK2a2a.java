package main.gui.model;

import main.gui.images.ImageTable;

public class ZK2a2a extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK2a2a() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK2a2a.getImage();
		
		TypZK.s="ZK2a-2a";
		
		get("Podst1a").setCoord(106,700);
		get("Podst1b").setCoord(140,700);
		  
		get("Podst2a").setCoord(206,700);
		get("Podst2b").setCoord(240,700);
		  
		get("Podst3a").setCoord(500-33,700);
		get("Podst3b").setCoord(500+3,700);
		  
		get("Podst4a").setCoord(606-33,700);
		get("Podst4b").setCoord(606+3,700);
		  
		get("Podst1c").setCoord(149,320);
		  
		get("Podst2c").setCoord(249,320);
		  
		get("Podst3c").setCoord(347,320);
		  
		get("Podst4c").setCoord(500+15,320);
		  
		get("Podst5c").setCoord(606+15,320);
		  
		get("Ruz").setCoord(675,430);
		  
		get("Podst1").setCoord(102, 206);
		  
		get("Podst2").setCoord(202, 206);
		  
		get("Podst3").setCoord(301, 206);
		  
		get("Podst4").setCoord(500-37, 206);
		  
		get("Podst5").setCoord(606-37, 206);
		  
		  
	}

}
