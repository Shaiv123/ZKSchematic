package main.gui.model;

import main.gui.images.ImageTable;

public class ZK1b1ppl extends ZK {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK1b1ppl() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK1b1ppl.getImage();
		
		TypZK.s="ZK1b1ppl";
		
		  get("Podst1a").setCoord(312-33,870);
		  get("Podst1b").setCoord(312+3,870);
		  
		  get("Podst2a").setCoord(689-33,870);
	   	  get("Podst2b").setCoord(689+3,870);
		  
		  get("Podst3a").setCoord(768-33,870);
		  get("Podst3b").setCoord(768+3,870);
		
		  get("Podst1c").setCoord(312+15,395);
		  get("Podst2c").setCoord(728+15,375);
		  
		  
		  get("Ruz").setCoord(780,540);
		  
		  get("NrDz1").setCoord(100, 145);
		  get("opis1").setCoord(420, 270);
		  get("opis2").setCoord(420, 290);
		  get("opis3").setCoord(420, 310);
		 
		  
		  get("Podst1").setCoord(313-37, 290);
		  
		  get("Podst2").setCoord(729-37, 290);
		  
	}

}
