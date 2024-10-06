package main.gui.model;

import javax.swing.JInternalFrame;

import main.gui.images.ImageTable;

public class ZK1b1pp extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK1b1pp() {
		super();
	}
	
	public ZK1b1pp(JInternalFrame in) {
		  super(in);
	  }
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK1b1pp.getImage();
		
		TypZK.s="ZK1b1pp";
		
		
		
		  get("Podst1a").setCoord(166-33,870);
		  get("Podst1b").setCoord(166+3,870);
		  
		  get("Podst2a").setCoord(245-33,870);
		  get("Podst2b").setCoord(245+3,870);
		  
		  get("Podst3a").setCoord(622-33,870);
		  get("Podst3b").setCoord(622+3,870);
		  
		  get("Podst1c").setCoord(206+15,375);
		  
		  get("Podst2c").setCoord(622+15,395);
		  
		  
		  get("Ruz").setCoord(50,540);
		  
		  get("NrDz1").setCoord(740, 145);
		  get("opis1").setCoord(436, 270);
		  get("opis2").setCoord(436, 290);
		  get("opis3").setCoord(436, 310);
		 
		  
		  get("Podst1").setCoord(206-37, 290);
		  
		  get("Podst2").setCoord(622-37, 290);
		  
	}

}
