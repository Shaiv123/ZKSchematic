package main.gui;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;

import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;

import main.gui.file.FileTypeFilter;
import main.gui.model.*;
import main.gui.model.manager.ZKManager;
import main.gui.tools.Tools;

public class menubar implements ActionListener{
	
	final JFrame f = new JFrame("Wybierz typ ZK");
	
	public menubar() {
	}
	
	
	public JMenuBar getMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
	    JMenu edit = new JMenu("Edit");
	    JMenu about = new JMenu("About");
	    mb.add(file);
	   // mb.add(edit);
	   // mb.add(about);
	    JMenuItem neww =new JMenuItem("New");
	    JMenuItem open =new JMenuItem("Open");
	    JMenuItem save =new JMenuItem("Save");
	    JMenuItem saveas =new JMenuItem("Save As");
	    JMenuItem print =new JMenuItem("Print");
	    JMenuItem close =new JMenuItem("Close");
	    JMenuItem copy =new JMenuItem("Copy");
	    JMenuItem paste =new JMenuItem("Paste");
	    JMenuItem delete =new JMenuItem("Delete");
	    file.add(neww);
	    file.add(open);
	    //file.add(save);
	    //file.add(saveas);
	    //file.add(print);
	    //file.add(close);
	   // edit.add(copy);
	   // edit.add(paste);
	    //edit.add(delete);
	    
	    neww.addActionListener(this);
	    neww.setActionCommand("neww");
	  
	    
	    
	    open.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JFileChooser openFile = new JFileChooser();
                openFile.setFileFilter(new FileTypeFilter(".xml","xml file"));
                int fs = openFile.showOpenDialog(null);
                if (fs == JFileChooser.APPROVE_OPTION) {
                	SAXBuilder builder = new SAXBuilder();
                	
                	try {
						org.jdom2.Document readDoc = builder.build(new File(openFile.getSelectedFile().getPath()));
						org.jdom2.Element elem = readDoc.getRootElement().getChild("data");
						String type = elem.getAttributeValue("TypZK");
						if(type.equals("ZK1a")) {
							gui.getInstance().getJFrame().setVisible(false);
							JInternalFrame in = new JInternalFrame();
							ZK1a z = new ZK1a(in);
							z.setData(elem);
							in.add(z);
							in.setClosable(true);
							in.setResizable(true);
							in.setMaximizable(true);
							in.setPreferredSize(new Dimension(400,800));
							gui.getInstance().getJFrame().add(in);
							in.show();
							gui.getInstance().getJFrame().setVisible(true);
						}else if(type.equals("ZK1b")) {
							gui.getInstance().getJFrame().setVisible(false);
							JInternalFrame in = new JInternalFrame();
							ZK1b z = new ZK1b(in);
							z.setData(elem);
							in.add(z);
							in.setClosable(true);
							in.setResizable(true);
							in.setMaximizable(true);
							in.setPreferredSize(new Dimension(400,800));
							gui.getInstance().getJFrame().add(in);
							in.show();
							gui.getInstance().getJFrame().setVisible(true);
						}else if(type.equals("ZK2a")) {
							gui.getInstance().getJFrame().setVisible(false);
							JInternalFrame in = new JInternalFrame();
							ZK2a z = new ZK2a(in);
							z.setData(elem);
							in.add(z);
							in.setClosable(true);
							in.setResizable(true);
							in.setMaximizable(true);
							in.setPreferredSize(new Dimension(400,800));
							gui.getInstance().getJFrame().add(in);
							in.show();
							gui.getInstance().getJFrame().setVisible(true);
						}else if(type.equals("ZK3a")) {
							gui.getInstance().getJFrame().setVisible(false);
							JInternalFrame in = new JInternalFrame();
							ZK3a z = new ZK3a(in);
							z.setData(elem);
							in.add(z);
							in.setClosable(true);
							in.setResizable(true);
							in.setMaximizable(true);
							in.setPreferredSize(new Dimension(400,800));
							gui.getInstance().getJFrame().add(in);
							in.show();
							gui.getInstance().getJFrame().setVisible(true);
						}else if(type.equals("ZK4a")) {
							gui.getInstance().getJFrame().setVisible(false);
							JInternalFrame in = new JInternalFrame();
							ZK4a z = new ZK4a(in);
							z.setData(elem);
							in.add(z);
							in.setClosable(true);
							in.setResizable(true);
							in.setMaximizable(true);
							in.setPreferredSize(new Dimension(400,800));
							gui.getInstance().getJFrame().add(in);
							in.show();
							gui.getInstance().getJFrame().setVisible(true);
						}
					} catch (JDOMException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
                };
            }
        });
	    
	    saveas.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JFileChooser saveFile = new JFileChooser();
                saveFile.setFileFilter(new FileTypeFilter(".pdf","pdf file"));
                saveFile.setFileFilter(new FileTypeFilter(".txt","txt file"));
                int fs = saveFile.showSaveDialog(null);
                if (fs == JFileChooser.APPROVE_OPTION) {
                	File f = saveFile.getSelectedFile();
                	if (saveFile.getFileFilter().getDescription().endsWith("(*.txt)")/*f.getName().endsWith(".txt")*/) {
                		try {
							FileWriter fw = new FileWriter(f.getPath()+".txt") ;
							fw.write("Hello World");
							fw.write(saveFile.getFileFilter().getDescription());
							fw.close();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
                		
                	}else if(saveFile.getFileFilter().getDescription().endsWith("(*.pdf)")/*f.getName().endsWith(".pdf")*/) {
                		Document doc = new Document();
                		//try {
							try {
								PdfWriter.getInstance(doc, new FileOutputStream(f.getPath()+".pdf"));
								doc.open();
								Paragraph pr = new Paragraph();
								pr.add("Hello World");
								doc.add(pr);
								doc.close();
							} catch (FileNotFoundException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							} catch (DocumentException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						//} catch (FileNotFoundException | DocumentException e) {
							// TODO Auto-generated catch block
						//	e.printStackTrace();
						//}
                	}
                }
            }
        });
	    return mb;
	}
	
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		if (cmd.equals("neww")) {
			//final JFrame f = new JFrame("Wybierz typ ZK");
            JPanel p = new JPanel();
            //p.setLayout(new FlowLayout());
            p.setLayout(new GridLayout(15, 3, 1, 1));
            JScrollPane s = new JScrollPane(p,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
           // f.setLayout(new FlowLayout());
            f.setSize(1400,1000);
    	    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	    f.setVisible(true);
    	    
    	    for (ZK zk : ZKManager.getMap().values()) {
    	    	 JButton b = new JButton(zk.getType(),new ImageIcon(Tools.ScaledImage(zk.getImage(), 
    	    			 zk.getImage().getWidth(null)/2, zk.getImage().getHeight(null)/2)));
    	    	    p.add(b);
    	    	    b.addActionListener(this);
    	    	    b.setActionCommand(zk.getType());
    	    }
    	    
    	   /* JButton b1 = new JButton("ZK1a",new ImageIcon(Tools.ScaledImage(ImageTable.ZK1a.getImage(), 217, 411)));
    	    p.add(b1);
    	    b1.addActionListener(this);
    	    b1.setActionCommand("ZK1a");
    	    
    	    JButton b2 = new JButton("ZK1b",new ImageIcon(Tools.ScaledImage(ImageTable.ZK1b.getImage(), 263, 446)));
    	    p.add(b2);
    	    b2.addActionListener(this);
    	    b2.setActionCommand("ZK1b");
    	    
    	    JButton b3 = new JButton("ZK2a",new ImageIcon(Tools.ScaledImage(ImageTable.ZK2a.getImage(), 207, 351)));
    	    p.add(b3);
    	    b3.addActionListener(this);
    	    b3.setActionCommand("ZK2a");
    	    
    	    JButton b4 = new JButton("ZK3a",new ImageIcon(Tools.ScaledImage(ImageTable.ZK3a.getImage(), 347, 449)));
    	    p.add(b4);
    	    b4.addActionListener(this);
    	    b4.setActionCommand("ZK3a");
    	    
    	    JButton b5 = new JButton("ZK4a",new ImageIcon(Tools.ScaledImage(ImageTable.ZK4a.getImage(), 348, 365)));
    	    p.add(b5);
    	    b5.addActionListener(this);
    	    b5.setActionCommand("ZK4a");*/
    	    f.add(s);
			
		}else if(cmd.startsWith("ZK")) {
			if(ZKManager.getMap().containsKey(cmd)) {
				ZK zk = ZKManager.getMap().get(cmd);
				gui.getInstance().getJFrame().setVisible(false);
				JInternalFrame in = new JInternalFrame();
				
				in.add(zk);
				in.setClosable(true);
				in.setResizable(true);
				in.setMaximizable(true);
				in.setJMenuBar(zk.InternalMenu());
				in.setPreferredSize(new Dimension(600,800));
				gui.getInstance().getJFrame().add(in);
				in.show();
				gui.getInstance().getJFrame().setVisible(true);
				f.dispose();
			}
		}
		
		/*else if (cmd.equals("ZK1a")) {
			
			gui.getInstance().getJFrame().setVisible(false);
			JInternalFrame in = new JInternalFrame();
			in.add(new ZK1a(in));
			in.setClosable(true);
			in.setResizable(true);
			in.setMaximizable(true);
			//in.setJMenuBar(InternalMenu());
			in.setPreferredSize(new Dimension(400,800));
			gui.getInstance().getJFrame().add(in);
			in.show();
			gui.getInstance().getJFrame().setVisible(true);
			f.dispose();
		}else if (cmd.equals("ZK1b")) {
			gui.getInstance().getJFrame().setVisible(false);
			JInternalFrame in = new JInternalFrame();
			in.add(new ZK1b(in));
			in.setClosable(true);
			in.setMaximizable(true);
			//in.setJMenuBar(InternalMenu());
			in.setResizable(true);
			in.setPreferredSize(new Dimension(400,800));
			gui.getInstance().getJFrame().add(in);
			in.show();
			gui.getInstance().getJFrame().setVisible(true);
			f.dispose();
		}else if (cmd.equals("ZK2a")) {
			gui.getInstance().getJFrame().setVisible(false);
			JInternalFrame in = new JInternalFrame();
			in.add(new ZK2a(in));
			in.setClosable(true);
			in.setMaximizable(true);
			//in.setJMenuBar(InternalMenu());
			in.setResizable(true);
			in.setPreferredSize(new Dimension(400,800));
			gui.getInstance().getJFrame().add(in);
			in.show();
			gui.getInstance().getJFrame().setVisible(true);
			f.dispose();
		}else if (cmd.equals("ZK3a")) {
			gui.getInstance().getJFrame().setVisible(false);
			JInternalFrame in = new JInternalFrame();
			in.add(new ZK3a(in));
			in.setClosable(true);
			in.setMaximizable(true);
			//in.setJMenuBar(InternalMenu());
			in.setResizable(true);
			in.setPreferredSize(new Dimension(400,800));
			gui.getInstance().getJFrame().add(in);
			in.show();
			gui.getInstance().getJFrame().setVisible(true);
			f.dispose();
		}else if (cmd.equals("ZK4a")) {
			gui.getInstance().getJFrame().setVisible(false);
			JInternalFrame in = new JInternalFrame();
			in.add(new ZK4a(in));
			in.setClosable(true);
			in.setMaximizable(true);
			//in.setJMenuBar(InternalMenu());
			in.setResizable(true);
			in.setPreferredSize(new Dimension(400,800));
			gui.getInstance().getJFrame().add(in);
			in.show();
			gui.getInstance().getJFrame().setVisible(true);
			f.dispose();
		}*/
	}
	

}
