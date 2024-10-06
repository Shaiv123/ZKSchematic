package main.gui.model;

import main.gui.images.ImageTable;

public class ZK2a2a1ppl  extends ZK {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK2a2a1ppl() {
		super();
	}
	
	@Override
	protected void Initialize() {
		zk = ImageTable.ZK2a2a1ppl.getImage();
		
		TypZK.s="ZK2a2a1ppl";
		
		get("Podst1a").setCoord(327-33,870);
		get("Podst1b").setCoord(327+3,870);
		  
		get("Podst2a").setCoord(705-33,870);
		get("Podst2b").setCoord(705+3,870);
		  
		  
		get("Podst4a").setCoord(804-33,870);
		get("Podst4b").setCoord(804+3,870);
		  
		get("Podst5a").setCoord(1061-33,870);
		get("Podst5b").setCoord(1061+3,870);
		  
		get("Podst6a").setCoord(1161-33,870);
		get("Podst6b").setCoord(1161+3,870);
		  
		get("Podst1c").setCoord(327+15,375);
		  
		get("Podst2c").setCoord(576+15,375);
		  
		get("Podst3c").setCoord(705+15,375);
		  
		get("Podst4c").setCoord(804+15,375);
		  
		get("Podst5c").setCoord(905+15,375);
		  
		get("Podst6c").setCoord(1061+15,375);
		  
		get("Podst1d").setCoord(1161+15,375);
		  
		get("Ruz").setCoord(1180,540);
		  
		get("NrDz1").setCoord(100, 145);
		get("opis1").setCoord(430, 270);
		get("opis2").setCoord(430, 290);
		get("opis3").setCoord(430, 310);
		 
		  
		get("Podst1").setCoord(328-37, 290);
		  
		get("Podst2").setCoord(577-37, 290);
		  
		get("Podst3").setCoord(706-37, 260);
		  
		get("Podst4").setCoord(805-37, 260);
		  
		get("Podst5").setCoord(906-37, 260);
		  
		get("Podst6").setCoord(1062-37, 260);
		  
		  get("Podst7").setCoord(1162-37, 260);
	}
}

