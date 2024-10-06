package main.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class gui implements ActionListener{
	
	private JTabbedPane _tabPane = new JTabbedPane();
	private static gui _instance;
	private Container content;
	private final JFrame frame = new JFrame("Schematic by Antoni Labisz v0.1");
	private JPanel panel = new JPanel();
	
	public static gui getInstance() {
		if (_instance == null)
			_instance = new gui();
		return _instance;
	}

	public gui() {
		show();
	}
	
	public void show() throws NullPointerException {
	    frame.setLayout(new FlowLayout());
	    content = frame.getContentPane();
	    // set layout on content pane
	    content.setLayout(new BorderLayout());
	    JMenuBar mb = new menubar().getMenu();
	    JToolBar tb = new toolbar().gettoolbar();
	    frame.setJMenuBar(mb);
	    frame.setSize(800, 1000);
	    // can close frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // show the swing paint result
	    frame.setVisible(true);
	    
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public JTabbedPane getTabbedPane() {
		return _tabPane;
	}
	
	public JFrame getJFrame() {
		return frame;
	}
	
	public Container getContainer() {
		return content;
	}
	
	public JPanel getJPanel() {
		return panel;
	}
	

}
