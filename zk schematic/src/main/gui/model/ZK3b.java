package main.gui.model;

import main.gui.images.ImageTable;

public class ZK3b extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK3b() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK3b.getImage();
		
		TypZK.s="ZK3b";
		
		get("Podst1a").setCoord(137,890);
		get("Podst1b").setCoord(172,890);
		  
		get("Podst2a").setCoord(203,890);
		get("Podst2b").setCoord(237,890);
		  
		get("Podst3a").setCoord(446,890);
		get("Podst3b").setCoord(480,890);
		  
		get("Podst4a").setCoord(520,890);
		get("Podst4b").setCoord(554,890);
		  
		get("Podst1c").setCoord(245,360);
		  
		get("Podst2c").setCoord(375,360);
		  
		get("Podst3c").setCoord(490,360);
		  
		  
		get("Ruz").setCoord(70,496);
		  
		get("Podst1").setCoord(199, 260);
		  
		get("Podst2").setCoord(329, 260);
		  
		get("Podst3").setCoord(442, 260);
		  
	}

}
