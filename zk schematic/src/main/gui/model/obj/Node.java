package main.gui.model.obj;

import main.gui.model.ZK;

public class Node extends desc {
	/**
	 * 
	 */
	public String s = "";
	public String name = "";
	private int x,y;
	private boolean isActive = false;
	
	public Node() {}
	public Node(String _name) { name = _name; }
	public Node(String _name, String _s) {
		name = _name;
		s = _s;
	}

	@Override
	public void setCoord(int _x, int _y){
		x = _x;
		y = _y;
		isActive = true;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public boolean isActive() {
		return isActive;
	}
	@Override
	public void drawNode(ZK zk) {
		
	}

}
