package main.gui.model.obj;

import java.awt.Image;

import main.gui.images.ImageTable;
import main.gui.model.ZK;

public class img implements Iobj{
	public Image im;
	private int x,y;
	private boolean isActive = false;
	public String id = "";
	public String name = "";
	
	public img(String _id,String _name) {
		id = _id;
		name = _name;
		im = (Image) ImageTable.getMap().get(id);
	}
	
	public img(String _id) {
		id = _id;
		im = (Image) ImageTable.getMap().get(id);
	}
	
	public void setImg(String s) {
		id = s;
		im = (Image) ImageTable.getMap().get(s);
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
		// TODO Auto-generated method stub
		
	}
	
}
