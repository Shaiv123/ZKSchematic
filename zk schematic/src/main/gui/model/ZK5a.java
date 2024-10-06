package main.gui.model;

import main.gui.images.ImageTable;

public class ZK5a extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK5a() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK5a.getImage();
		
		TypZK.s="ZK5a";
		
		get("Podst1a").setCoord(106,700);
		get("Podst1b").setCoord(140,700);
		  
		get("Podst2a").setCoord(206,700);
		get("Podst2b").setCoord(240,700);
		  
		get("Podst3a").setCoord(306,700);
		get("Podst3b").setCoord(340,700);
		  
		get("Podst4a").setCoord(404,700);
		get("Podst4b").setCoord(438,700);
		  
		get("Podst5a").setCoord(502,700);
		get("Podst5b").setCoord(536,700);
		  
		get("Podst1c").setCoord(146,310);
		get("Podst1d").setCoord(168,310);
		  
		get("Podst2c").setCoord(246,310);
		get("Podst2d").setCoord(269,310);
		  
		get("Podst3c").setCoord(344,310);
		get("Podst3d").setCoord(367,310);
		  
		get("Podst4c").setCoord(444,310);
		get("Podst4d").setCoord(467,310);
		  
		get("Podst5c").setCoord(544,310);
		get("Podst5d").setCoord(567,310);
		  
		get("Ruz").setCoord(600,430);
		  
		get("Podst1").setCoord(102, 206);
		  
		get("Podst2").setCoord(202, 206);
		  
		get("Podst3").setCoord(301, 206);
		  
		get("Podst4").setCoord(400, 206);
		  
		get("Podst5").setCoord(499, 206);
		  
		  
	}

}
