package main.gui.model;


import javax.swing.JInternalFrame;

import main.gui.images.ImageTable;

public class ZK1a extends ZK{
	  
	  
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public ZK1a() {
		super();
	  }
	public ZK1a(JInternalFrame in) {
		super(in);
	  }
	  
	  
	 
	  
	  @Override
	  protected void Initialize() {
		  zk = ImageTable.ZK1a.getImage();
		  TypZK.s="ZK1a";
		  get("Podst1a").setCoord(118,815);
		  get("Podst1b").setCoord(150,815);
		  get("Podst2a").setCoord(226,815);
		  get("Podst2b").setCoord(258,815);
		  get("Podst1c").setCoord(270,350);
		  get("Podst1d").setCoord(290,350);
		  get("Ruz").setCoord(285,500);
		  get("Podst1").setCoord(220,275);
		 /* Podst1a.setCoord(118,815);
		  Podst1b.setCoord(150,815);
		  Podst2a.setCoord(226,815);
		  Podst2b.setCoord(258,815);
		  Podst1c.setCoord(270,350);
		  Podst1d.setCoord(290,350);
		  Ruz.setCoord(285,500);
		  Podst1.setCoord(220, 275);*/
	  }
	  
	 /* @Override
	  public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		  int x =e.getX();
		  int y = e.getY();
		  
		  if (isInFieldRNode(285,500,x,y)) {
			  write(Ruz);
			  clear();
		  }else if(isInFieldSNode(270,350,x,y)) {
			  write(Podst1c);
			  clear();
		  }else if(isInFieldSNode(290,350,x,y)) {
			  write(Podst1d);
			  clear();
		  }else if(isInFieldNode(118,850,x,y)) {
			  write(Podst1a);
			  clear();
		  }else if(isInFieldNode(150,850,x,y)) {
			  write(Podst1b);
			  clear();
		  }else if(isInFieldNode(226,850,x,y)) {
			  write(Podst2a);
			  clear();
		  }else if(isInFieldNode(258,850,x,y)) {
			  write(Podst2b);
			  clear();
		  }else if(isInFieldImNode(220,275,x,y)) {
			  setIm(Podst1);
			  clear();
		  }else if(isInFieldNrNode(x,y)) {
			  write(NrZK);
			  clear();
		  }
			
		}*/
	  
}
