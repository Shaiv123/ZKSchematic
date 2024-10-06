package main.gui.model;

import javax.swing.JInternalFrame;

import main.gui.images.ImageTable;

public class ZK3a extends ZK {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK3a() {
		  super();
	}
	public ZK3a(JInternalFrame in) {
		super(in);
	}
	
	
	
	@Override
	  protected void Initialize() {
		  zk = ImageTable.ZK3a.getImage();
		  TypZK.s="ZK3a";
		  
		  get("Podst1a").setCoord(162,890);
		  get("Podst1b").setCoord(195,890);
		  get("Podst2a").setCoord(301,890);
		  get("Podst2b").setCoord(335,890);
		  get("Podst3a").setCoord(446,890);
		  get("Podst3b").setCoord(479,890);
		  get("Podst1c").setCoord(210,410);
		  get("Podst1d").setCoord(231,410);
		  get("Podst2c").setCoord(350,410);
		  get("Podst2d").setCoord(371,410);
		  get("Podst3c").setCoord(495,410);
		  get("Podst3d").setCoord(516,410);
		  get("Ruz").setCoord(550,582);
		  get("Podst1").setCoord(157,325);
		  get("Podst2").setCoord(297,325);
		  get("Podst3").setCoord(441,325);
		  
		 /* Podst1a.setCoord(162,890);
		  Podst1b.setCoord(195,890);
		  
		  Podst2a.setCoord(301,890);
		  Podst2b.setCoord(335,890);
		  
		  Podst3a.setCoord(446,890);
		  Podst3b.setCoord(479,890);
		  
		  Podst1c.setCoord(210,410);
		  Podst1d.setCoord(231,410);
		  
		  Podst2c.setCoord(350,410);
		  Podst2d.setCoord(371,410);
		  
		  Podst3c.setCoord(495,410);
		  Podst3d.setCoord(516,410);
		  
		  
		  Ruz.setCoord(550,582);
		  
		  Podst1.setCoord(157, 325);
		  
		  Podst2.setCoord(297, 325);
		  
		  Podst3.setCoord(441, 325);*/
		  
	  }

}
