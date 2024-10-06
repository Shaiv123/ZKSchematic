package main.gui.model;

import main.gui.images.ImageTable;

public class ZK2aa extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK2aa() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK2aa.getImage();
		
		TypZK.s="ZK2aa";
		
		get("Podst1a").setCoord(130,700);
		get("Podst1b").setCoord(163,700);
		  
		get("Podst2a").setCoord(250,700);
		get("Podst2b").setCoord(285,700);
		  
		get("Podst3a").setCoord(358,700);
		get("Podst3b").setCoord(394,700);
		  
		get("Podst4a").setCoord(480,700);
		get("Podst4b").setCoord(517,700);
		  
		get("Podst1c").setCoord(293,310);
		get("Podst1d").setCoord(314,310);
		  
		get("Podst2c").setCoord(403,310);
		get("Podst2d").setCoord(424,310);
		  
		get("Ruz").setCoord(580,460);
		  
		  
		get("Podst1").setCoord(246, 206);
		  
		get("Podst2").setCoord(355, 206);
		  
		  
		  
	}

}
