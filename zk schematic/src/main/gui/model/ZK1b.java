package main.gui.model;


import javax.swing.JInternalFrame;

import main.gui.images.ImageTable;

public class ZK1b extends ZK {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK1b() {
		  super();
	  }
	
	public ZK1b(JInternalFrame in) {
		  super(in);
	  }
	
	
	
	@Override
	  protected void Initialize() {
		  zk = ImageTable.ZK1b.getImage();
		  TypZK.s="ZK1b";
		  
		  get("Podst1a").setCoord(110,850);
		  get("Podst1b").setCoord(144,850);
		  get("Podst2a").setCoord(237,850);
		  get("Podst2b").setCoord(272,850);
		  get("Podst3a").setCoord(316,850);
		  get("Podst3b").setCoord(351,850);
		  get("Podst1c").setCoord(320,360);
		  get("Podst1d").setCoord(340,360);
		  get("Ruz").setCoord(285,500);
		  get("Podst1").setCoord(273,275);
		  
		  /*Podst1a.setCoord(110,850);
		  Podst1b.setCoord(144,850);
		  Podst2a.setCoord(237,850);
		  Podst2b.setCoord(272,850);
		  Podst3a.setCoord(316,850);
		  Podst3b.setCoord(351,850);
		  Podst1c.setCoord(320,360);
		  Podst1d.setCoord(340,360);
		  Ruz.setCoord(285,500);
		  Podst1.setCoord(273, 275);*/
	  }
	/*@Override
	  public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		  int x =e.getX();
		  int y = e.getY();
		  
		  if (isInFieldRNode(Ruz,x,y)) {
			  write(Ruz);
			  clear();
		  }else if(isInFieldSNode(Podst1c,x,y)) {
			  write(Podst1c);
			  clear();
		  }else if(isInFieldSNode(Podst1d,x,y)) {
			  write(Podst1d);
			  clear();
		  }else if(isInFieldNode(Podst1a,x,y)) {
			  write(Podst1a);
			  clear();
		  }else if(isInFieldNode(Podst1b,x,y)) {
			  write(Podst1b);
			  clear();
		  }else if(isInFieldNode(Podst2a,x,y)) {
			  write(Podst2a);
			  clear();
		  }else if(isInFieldNode(Podst2b,x,y)) {
			  write(Podst2b);
			  clear();
		  }else if(isInFieldNode(Podst3a,x,y)) {
			  write(Podst3a);
			  clear();
		  }else if(isInFieldNode(Podst3b,x,y)) {
			  write(Podst3b);
			  clear();
		  }else if(isInFieldImNode(Podst1,x,y)) {
			  setIm(Podst1);
			  clear();
		  }else if(isInFieldNrNode(x,y)) {
			  write(NrZK);
			  clear();
		  }
			
		}*/

}
