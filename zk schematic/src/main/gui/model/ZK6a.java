package main.gui.model;

import main.gui.images.ImageTable;

public class ZK6a extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ZK6a() {
		super();
	}
	
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK6a.getImage();
		
		TypZK.s="ZK6a";
		
		get("Podst1a").setCoord(113,690);
		get("Podst1b").setCoord(147,690);
		  
		get("Podst2a").setCoord(194,690);
		get("Podst2b").setCoord(228,690);
		  
		get("Podst3a").setCoord(275,690);
		get("Podst3b").setCoord(309,690);
		  
		get("Podst4a").setCoord(355,690);
		get("Podst4b").setCoord(389,690);
		  
		get("Podst5a").setCoord(436,690);
		get("Podst5b").setCoord(470,690);
		  
		get("Podst6a").setCoord(517,690);
		get("Podst6b").setCoord(551,690);
		  
		get("Podst1c").setCoord(159,310);
		  //Podst1d.setCoord(168,310);
		  
		get("Podst2c").setCoord(240,310);
		  //Podst2d.setCoord(269,310);
		  
		get("Podst3c").setCoord(321,310);
		  //Podst3d.setCoord(367,310);
		  
		get("Podst4c").setCoord(401,310);
		  //Podst4d.setCoord(467,310);
		  
		get("Podst5c").setCoord(482,310);
		  //Podst5d.setCoord(567,310);
		  
		get("Podst6c").setCoord(563,310);
		  //Podst6d.setCoord(667,310);
		  
		get("Ruz").setCoord(600,420);
		  
		get("Podst1").setCoord(109, 206);
		  
		get("Podst2").setCoord(190, 206);
		  
		get("Podst3").setCoord(271, 206);
		  
		get("Podst4").setCoord(351, 206);
		  
		get("Podst5").setCoord(432, 206);
		  
		get("Podst6").setCoord(513, 206);
		  
		  
	}

}
