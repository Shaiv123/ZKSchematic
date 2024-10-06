package main.gui.model;


import javax.swing.JInternalFrame;

import main.gui.images.ImageTable;

public class ZK2a extends ZK{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ZK2a() {
		  super();
	}
	
	public ZK2a(JInternalFrame in) {
		  super(in);
	  }
	
	
	
	@Override
	  protected void Initialize() {
		  zk = ImageTable.ZK2a.getImage();
		  TypZK.s="ZK2a";
		  
		  get("Podst1a").setCoord(188,723);
		  get("Podst1b").setCoord(153,723);
		  get("Podst2a").setCoord(222,723);
		  get("Podst2b").setCoord(255,723);
		  get("Podst1c").setCoord(102,310);
		  get("Podst1d").setCoord(123,310);
		  get("Podst2c").setCoord(262,310);
		  get("Podst2d").setCoord(284,310);
		  get("Ruz").setCoord(70,500);
		  get("Podst1").setCoord(148,200);
		  get("Podst2").setCoord(217,200);
		  
		  
		 /* Podst1a.setCoord(188,723);
		  Podst1b.setCoord(153,723);
		  
		  Podst2a.setCoord(222,723);
		  Podst2b.setCoord(255,723);
		  
		  Podst1c.setCoord(102,310);
		  Podst1d.setCoord(123,310);
		  
		  Podst2c.setCoord(262,310);
		  Podst2d.setCoord(284,310);
		  Ruz.setCoord(70,500);
		  
		  Podst1.setCoord(148, 200);
		  Podst2.setCoord(217, 200);*/
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
		  }else if(isInFieldSNode(Podst2c,x,y)) {
			  write(Podst2c);
			  clear();
		  }else if(isInFieldSNode(Podst2d,x,y)) {
			  write(Podst2d);
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
		  }else if(isInFieldImNode(Podst1,x,y)) {
			  setIm(Podst1);
			  clear();
		  }else if(isInFieldImNode(Podst2,x,y)) {
			  setIm(Podst2);
			  clear();
		  }else if(isInFieldNrNode(x,y)) {
			  write(NrZK);
			  clear();
		  }
			
		}*/
}
