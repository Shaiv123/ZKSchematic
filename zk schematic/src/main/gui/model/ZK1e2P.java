package main.gui.model;

import main.gui.images.ImageTable;

public class ZK1e2P extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK1e2P() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK1e2P.getImage();
		
		TypZK.s="ZK1e-2P";
		
		get("Podst1a").setCoord(217-33,890);
		get("Podst1b").setCoord(217+3,890);
		  
		get("Podst2a").setCoord(497-33,890);
		get("Podst2b").setCoord(497+3,890);
		  
		get("Podst3a").setCoord(785-33,890);
		get("Podst3b").setCoord(785+3,890);
		  
		get("Etimat1").setCoord(150,380);
		  
		get("Rbk1").setCoord(295,470);
		  
		get("Etimat2").setCoord(820,380);
		  
		get("Rbk2").setCoord(620,430);
		  
		  
		get("Ruz").setCoord(560,680);
		  
		get("NrDz1").setCoord(210, 140);
		get("NrDz2").setCoord(710, 140);
		  
		get("Rbk1i").setCoord(361-37, 350);
		get("Rbk2i").setCoord(680-37, 350);
		  
		  
	}

}
