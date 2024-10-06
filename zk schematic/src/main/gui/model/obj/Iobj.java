package main.gui.model.obj;

import java.awt.Color;

import main.gui.model.ZK;

public interface Iobj {
	public Color backcolor = Color.blue;
	public void setCoord(int _x, int _y);
	public boolean isActive();
	public void drawNode(ZK zk);
}
