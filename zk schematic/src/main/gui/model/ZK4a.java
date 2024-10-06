package main.gui.model;


import javax.swing.JInternalFrame;

import main.gui.images.ImageTable;

public class ZK4a extends ZK {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK4a() {
		  super();
	}
	
	public ZK4a(JInternalFrame in) {
		  super(in);
	  }
	
	
	
	@Override
	  protected void Initialize() {
		  zk = ImageTable.ZK4a.getImage();
		  TypZK.s="ZK4a";
		  
		  
		  get("Podst1a").setCoord(130,700);
		  get("Podst1b").setCoord(163,700);
		  get("Podst2a").setCoord(250,700);
		  get("Podst2b").setCoord(285,700);
		  get("Podst3a").setCoord(358,700);
		  get("Podst3b").setCoord(394,700);
		  get("Podst3a").setCoord(780,700);
		  get("Podst3b").setCoord(517,700);
		  
		  get("Podst1c").setCoord(170,310);
		  get("Podst1d").setCoord(191,310);
		  get("Podst2c").setCoord(290,310);
		  get("Podst2d").setCoord(311,310);
		  get("Podst3c").setCoord(400,310);
		  get("Podst3d").setCoord(421,310);
		  get("Podst4c").setCoord(522,310);
		  get("Podst4d").setCoord(543,310);
		  
		  get("Ruz").setCoord(600,460);
		  
		  get("Podst1").setCoord(125,206);
		  get("Podst2").setCoord(246,206);
		  get("Podst3").setCoord(355,206);
		  get("Podst4").setCoord(477,206);
		  
		  /*Podst1a.setCoord(130,700);
		  Podst1b.setCoord(163,700);
		  
		  Podst2a.setCoord(250,700);
		  Podst2b.setCoord(285,700);
		  
		  Podst3a.setCoord(358,700);
		  Podst3b.setCoord(394,700);
		  
		  Podst4a.setCoord(480,700);
		  Podst4b.setCoord(517,700);
		  
		  Podst1c.setCoord(170,310);
		  Podst1d.setCoord(191,310);
		  
		  Podst2c.setCoord(290,310);
		  Podst2d.setCoord(311,310);
		  
		  Podst3c.setCoord(400,310);
		  Podst3d.setCoord(421,310);
		  
		  Podst4c.setCoord(522,310);
		  Podst4d.setCoord(543,310);
		  
		  Ruz.setCoord(600,460);
		  
		  Podst1.setCoord(125, 206);
		  
		  Podst2.setCoord(246, 206);
		  
		  Podst3.setCoord(355, 206);
		  
		  Podst4.setCoord(477, 206);*/
	  }
}
