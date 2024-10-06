package main.gui;

import javax.swing.*;

public class toolbar {
	
	public toolbar() {
		
	}
	
	public JToolBar gettoolbar() {
		JToolBar toolBar = new JToolBar("Still draggable");
		toolBar.setFloatable(false);
        toolBar.setRollover(true);
        JButton button = new JButton("Another button");
        button.setActionCommand("Other");
        button.setToolTipText("Something else");
        toolBar.add(button);
		return toolBar;
	}

}
