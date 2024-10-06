package main.gui.model;

import main.gui.images.ImageTable;

public class ZK1e1PS extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK1e1PS() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK1e1P.getImage();
		
		TypZK.s="ZK1e-1P-S";
		
		get("Ruz").setCoord(177,450);
		  
		get("Rbk1i").setCoord(47, 285);
		
		get("Rbk1").setCoord(50,290);
		get("Etimat1").setCoord(210,290);
		
		get("Podst1a").setCoord(50,766);
		get("Podst1b").setCoord(85,766);
		  
		get("Podst2a").setCoord(136,766);
		get("Podst2b").setCoord(170,766);
	}

}
