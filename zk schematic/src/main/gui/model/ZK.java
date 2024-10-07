package main.gui.model;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.AffineTransform;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

import javolution.util.FastMap;
import main.gui.gui;
import main.gui.file.FileTypeFilter;
import main.gui.images.ImageTable;
import main.gui.tools.PdfWrite;
import main.gui.model.obj.*;


public class ZK extends JComponent implements MouseListener, ActionListener, Printable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// Image in which we're going to draw
	  protected Image image;
	  protected Image zk;
	  // Graphics2D object ==> used to draw on
	  protected Graphics2D g2;
	// Mouse coordinates
	  protected int mX, mY;
	  protected Color backcolor = Color.blue;
	  static Logger _log = Logger.getLogger("Log");
	  protected FastMap<String,desc> node = new FastMap<String,desc>();
	  protected FastMap<String,desc> smallnode = new FastMap<String,desc>();
	  protected FastMap<String,desc> rnode = new FastMap<String,desc>();
	  protected FastMap<String,img> imgnode = new FastMap<String,img>();
	  
	  
	  protected desc NrZK=new desc(), TypZK=new desc();
	  
	 protected Iobj get(String name) {
		 if(node.containsKey(name))
			 return node.get(name);
		 else if(smallnode.containsKey(name))
			 return smallnode.get(name);
		 else if(rnode.containsKey(name))
			 return rnode.get(name);
		 else if(imgnode.containsKey(name))
			 return imgnode.get(name);
		 else 
			 return null;
	 }
	 
	 
	  private void setMaps() {
		  node.put("Podst1a", new desc("Podst1a"));
		  node.put("Podst1b", new desc("Podst1b"));
		  node.put("Podst2a", new desc("Podst2a"));
		  node.put("Podst2b", new desc("Podst2b"));
		  node.put("Podst3a", new desc("Podst3a"));
		  node.put("Podst3b", new desc("Podst3b"));
		  node.put("Podst4a", new desc("Podst4a"));
		  node.put("Podst4b", new desc("Podst4b"));
		  node.put("Podst5a", new desc("Podst5a"));
		  node.put("Podst5b", new desc("Podst5b"));
		  node.put("Podst6a", new desc("Podst6a"));
		  node.put("Podst6b", new desc("Podst6b"));
		  node.put("Podst7a", new desc("Podst7a"));
		  node.put("Podst7b", new desc("Podst7b"));
		  
		  smallnode.put("Podst1c", new desc("Podst1c"));
		  smallnode.put("Podst1d", new desc("Podst1d"));
		  smallnode.put("Podst2c", new desc("Podst2c"));
		  smallnode.put("Podst2d", new desc("Podst2d"));
		  smallnode.put("Podst3c", new desc("Podst3c"));
		  smallnode.put("Podst3d", new desc("Podst3d"));
		  smallnode.put("Podst4c", new desc("Podst4c"));
		  smallnode.put("Podst4d", new desc("Podst4d"));
		  smallnode.put("Podst5c", new desc("Podst5c"));
		  smallnode.put("Podst5d", new desc("Podst5d"));
		  smallnode.put("Podst6c", new desc("Podst6c"));
		  smallnode.put("Podst6d", new desc("Podst6d"));
		  smallnode.put("Podst7c", new desc("Podst7c"));
		  smallnode.put("Podst7d", new desc("Podst7d"));
		  smallnode.put("Rbk1", new desc("Rbk1","RBK-00 50A/gG"));
		  smallnode.put("Rbk2", new desc("Rbk2","RBK-00 50A/gG"));
		  smallnode.put("Rbk3", new desc("Rbk3","RBK-00 50A/gG"));
		  smallnode.put("Rbk4", new desc("Rbk4","RBK-00 50A/gG"));
		  smallnode.put("Etimat1", new desc("Etimat1","ETIMAT T 3p 25A"));
		  smallnode.put("Etimat2", new desc("Etimat2","ETIMAT T 3p 25A"));
		  smallnode.put("Etimat3", new desc("Etimat3","ETIMAT T 3p 25A"));
		  smallnode.put("Etimat4", new desc("Etimat4","ETIMAT T 3p 25A"));
		  
		  rnode.put("NrDz1", new desc("NrDz1","Dz. nr"));
		  rnode.put("NrDz2", new desc("NrDz2","Dz. nr"));
		  rnode.put("NrDz3", new desc("NrDz3","Dz. nr"));
		  rnode.put("NrDz4", new desc("NrDz4","Dz. nr"));
		  rnode.put("Ruz", new desc("Ruz","30"));
		  rnode.put("opis1", new desc("opis1","1000/5A"));
		  rnode.put("opis2", new desc("opis2","Kl. 5"));
		  rnode.put("opis3", new desc("opis3"));
		  
		  imgnode.put("Podst1", new img("FlBp0","Podst1"));
		  imgnode.put("Podst2", new img("FlBp0","Podst2"));
		  imgnode.put("Podst3", new img("FlBp0","Podst3"));
		  imgnode.put("Podst4", new img("FlBp0","Podst4"));
		  imgnode.put("Podst5", new img("FlBp0","Podst5"));
		  imgnode.put("Podst6", new img("FlBp0","Podst6"));
		  imgnode.put("Podst7", new img("FlBp0","Podst7"));
		  imgnode.put("Rbk1i", new img("FlBp0","Rbk1i"));
		  imgnode.put("Rbk2i", new img("FlBp0","Rbk2i"));
		  imgnode.put("Rbk3i", new img("FlBp0","Rbk3i"));
		  imgnode.put("Rbk4i", new img("FlBp0","Rbk4i"));
		  
	  }
	 
	  
	  public ZK() {
		  setMaps();
		  setDoubleBuffered(false);
		  addMouseListener(this);
		  Initialize();
	  }
	  
	  public ZK(JInternalFrame in) {
		  setMaps();
		  in.setJMenuBar(InternalMenu());
		  setDoubleBuffered(false);
		  addMouseListener(this);
		  Initialize();
		  
	  }
	  
	  protected void paintComponent(Graphics g) {
		    if (image == null) {
		      // image to draw null ==> we create
		      image = createImage(zk.getWidth(null), zk.getHeight(null));
		      g2 = (Graphics2D) image.getGraphics();
		      // enable antialiasing
		      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		      // clear draw area
		      clear();
		    }
		 
		    g.drawImage(image, 0, 0, null);
		  }
	  
	  public void clear() {
		  drawmain();
		  repaint();
	  }
	  /**
	   * Rysuje schemat z wszystkimi jego elementami.
	   */
	  public void drawmain() {
		  g2.drawImage(zk, 0, 0, null);
			DrawNrZk(NrZK);
			DrawType(TypZK);
			
			for(img i : imgnode.values()) {
				if(i.isActive()) {
					if(i.im.getWidth(null)<44)
						  DrawFx(i);
					  else
						  DrawFl(i);
				}
			}
			
			  
			for(desc c : node.values()) {
				if(c.isActive())
					DrawNode(c);
			}
			
			for(desc c : smallnode.values()) {
				if(c.isActive())
					DrawSmallNode(c);
			}
			
			for(desc c : rnode.values()) {
				if(c.isActive())
					DrawRNode(c);
			}
			
			  
	  }
	  
	  /**
	   * Rysuje Nr ZK nad schematem
	   * @param s - nr ZK, np. "ZK-3245"
	   */
	  protected void DrawNrZk(desc s) {
		  Image im = createImage(250, 40);
		  Graphics2D g = (Graphics2D) im.getGraphics();
		  g.setPaint(backcolor);
		  g.fillRect(0, 0, im.getWidth(null), im.getHeight(null));
		  g.setPaint(Color.black);
		  g.setFont(new Font("serif",Font.BOLD,36));
		  g.drawString(s.s, im.getWidth(null)/2-s.s.length()*11, im.getHeight(null)/2+10);
		  g2.drawImage(im, (zk.getWidth(null)/2)-125, 20, null);
		  
	  }
	  
	  /**
	   * Rysuje Typ ZK pod nr ZK
	   * @param s - typ ZK, np. "ZK1a"
	   */
	  protected void DrawType(desc s) {
		  Image im = createImage(230, 40);
		  Graphics2D g = (Graphics2D) im.getGraphics();
		  g.setPaint(Color.white);
		  g.fillRect(0, 0, im.getWidth(null), im.getHeight(null));
		  g.setPaint(Color.black);
		  g.setFont(new Font("serif",Font.BOLD,24));
		  //g.drawString(s.s, im.getWidth(null)/3, im.getHeight(null)/2+10);
		  g.drawString(s.s, im.getWidth(null)/2-s.s.length()*10, im.getHeight(null)/2+10);
		  g2.drawImage(im, (zk.getWidth(null)/2)-115, 60, null);
		  
	  }
	  
	  /**
	   * Rysuje kierunki odejsciowe z ZK
	   * @param s - nazwa kier. np. "Kier. ZK-32455" lub typ kabla "YAKXS 4x120mm2"
	   * @param x - wspolzedna x poczatku tekstu
	   * @param y - wspolzedna y poczatku tekstu
	   */
	  protected void DrawNode(desc s) {
		  Image im = createImage(280, 30);
		  Graphics2D g = (Graphics2D) im.getGraphics();
		  g.setPaint(backcolor);
		  g.fillRect(0, 0, im.getWidth(null), im.getHeight(null));
		  g.setPaint(Color.black);
		  g.setFont(new Font("serif",Font.BOLD,24));
		  g.drawString(s.s, 5, im.getHeight(null)/2+10);
		  AffineTransform at = AffineTransform.getTranslateInstance(s.getX(), s.getY());
		  at.rotate(Math.toRadians(270), 0, 0);
		  g2.drawImage(im, at, null);
	  }
	  
	  
	  /**
	   * Opis rozlacznika lub wartosc zabezpieczenia
	   * @param s - nazwa lub zab. np. ars-2, gG 125A
	   * @param x
	   * @param y
	   */
	  protected void DrawSmallNode(desc s) {
		  Image im = createImage(120, 20);
		  Graphics2D g = (Graphics2D) im.getGraphics();
		  g.setPaint(backcolor);
		  g.fillRect(0, 0, im.getWidth(null), im.getHeight(null));
		  g.setPaint(Color.black);
		  g.setFont(new Font("serif",Font.BOLD,18));
		  g.drawString(s.s, 5, im.getHeight(null)/2+5);
		  AffineTransform at = AffineTransform.getTranslateInstance(s.getX(), s.getY());
		  at.rotate(Math.toRadians(270), 0, 0);
		  g2.drawImage(im, at, null);
	  }
	  
	  /**
	   * opis uziemienia
	   * @param s - wartosc uziemienia "R≤"+s+"Ω"
	   * @param x
	   * @param y
	   */
	  public void DrawRNode(desc s) {
		  Image im = createImage(80, 20);
		  Graphics2D g = (Graphics2D) im.getGraphics();
		  g.setPaint(backcolor);
		  g.fillRect(0, 0, im.getWidth(null), im.getHeight(null));
		  g.setPaint(Color.black);
		  g.setFont(new Font("Arial",Font.BOLD,18));
		  if(s.name.equals("Ruz")){
			  g.drawString("R≤"+s.s+"Ω", 5, im.getHeight(null)/2+5);
		  }else {
			  g.drawString(s.s, 5, im.getHeight(null)/2+5);
		  }
		  
		  g2.drawImage(im, s.getX(), s.getY(), null);
	  }
	  
	  
	  /**
	   * Podstawa bezpiecznikowa z rozlacznikiem
	   * @param t - icona rozlacznika
	   * @param x
	   * @param y
	   */
	  protected void DrawFl(img t){
		  g2.drawImage(t.im, t.getX(), t.getY(), null);
		  
	  }
	  
	  /**
	   * Podstawa bezpiecznikowa
	   * @param t - icona podstawy
	   * @param x
	   * @param y
	   */
	  protected void DrawFx(img t){
		  g2.drawImage(t.im, t.getX()+23, t.getY(), null);  
	  }
	  
	  
	  
	  protected void Initialize() {
		  
	  }
	  
	  protected boolean isInFieldNrNode(int mx, int my){
		  if (mx >= zk.getWidth(null)/2-125 && mx <= zk.getWidth(null)/2+125 && my >= 20 && my <= 60)
			  return true;
		  return false;
		  
	  }
	  
	  protected boolean isInFieldNode(desc c, int mx, int my){
		  if (mx >= c.getX() && mx <= c.getX()+30 && my >= c.getY()-280 && my <= c.getY())
			  return true;
		  return false;
		  
	  }
	  
	  protected boolean isInFieldSNode(desc c, int mx, int my){
		  if (mx >= c.getX() && mx <= c.getX()+20 && my >= c.getY()-120 && my <= c.getY())
			  return true;
		  return false;
		  
	  }
	  
	  protected boolean isInFieldRNode(desc c, int mx, int my){
		  if (mx >= c.getX() && mx <= c.getX()+80 && my >= c.getY() && my <= c.getY()+20)
			  return true;
		  return false;
		  
	  }
	  
	  protected boolean isInFieldImNode(img c, int mx, int my){
		  if (mx >= c.getX() && mx <= c.getX()+44 && my >= c.getY() && my <= c.getY()+77)
			  return true;
		  return false;
		  
	  }

	public void mouseClicked(MouseEvent arg0) {
		  int x = arg0.getX();
		  int y = arg0.getY();
		  
		  for(desc c : node.values()) {
				if(c.isActive() && isInFieldNode(c,x,y)) {
					write(c);
					clear();
				}
			}
			
			for(desc c : smallnode.values()) {
				if(c.isActive() && isInFieldSNode(c,x,y)) {
					write(c);
					clear();
				}
			}
			
			for(desc c : rnode.values()) {
				if(c.isActive() && isInFieldRNode(c,x,y)) {
					write(c);
					clear();
				}
			}
			
			for(img i : imgnode.values()) {
				if(i.isActive() && isInFieldImNode(i,x,y)) {
					  setIm(i);
					  clear();
				  }
			}
		  
		  if(isInFieldNrNode(x,y)) {
			  write(NrZK);
			  clear();
		  }
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0) {
		String cmd = arg0.getActionCommand();
		if (cmd.equals("saveas")) {
			JFileChooser saveFile = new JFileChooser();
            saveFile.setFileFilter(new FileTypeFilter(".pdf","pdf file"));
            //saveFile.setFileFilter(new FileTypeFilter(".xml","xml file"));
            int fs = saveFile.showSaveDialog(null);
            if (fs == JFileChooser.APPROVE_OPTION) {
            	File f = saveFile.getSelectedFile();
            	if (saveFile.getFileFilter().getDescription().endsWith("(*.xml)")) {
            		saveSCH(f.getPath()+".xml");
            		
            	}else if(saveFile.getFileFilter().getDescription().endsWith("(*.pdf)")) {
            		String path = f.getPath()+".pdf";
            		backcolor = Color.white;
            		clear();
            		PdfWrite.PdfWriter(path, image);
            		backcolor = Color.blue;
            		clear();
            	}
            }
		}else if (cmd.equals("print")) {
			PrinterJob printJob = PrinterJob.getPrinterJob();
			
			PageFormat documentPageFormat = new PageFormat();
		    documentPageFormat.setOrientation(PageFormat.PORTRAIT);
		    printJob.setPrintable(this);
		    printJob.defaultPage(documentPageFormat);
		    if (printJob.printDialog()) {
		        try {
		        	backcolor = Color.white;
		        	clear();
		          printJob.print();
		          backcolor = Color.blue;
		          clear();
		        } catch (Exception PrintException) {
		          PrintException.printStackTrace();
		        }
		      }
		}
		
	}
	protected static String edited ="";
	public void setEdS(String s) {
		edited = s;
	}
	protected void write(desc c) {
		final JFrame f = new JFrame("Wpisz parametr");
		final desc s = c;
		Point p = new Point();
		gui.getInstance().getJFrame().getLocation(p);
		f.setSize(290, 120);
		f.setBounds(p.x, p.y, 290, 120);
		
		f.setLayout(new FlowLayout());
		JButton _Button = new JButton("Ok");
		final JTextField _Field = new JTextField();
		_Field.setText(s.s);
		_Button.setActionCommand("ok");
		_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("ok")) {
					s.s =_Field.getText().toString();
					clear();
					f.dispose();
				}
			}
		});
		_Field.addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode() == KeyEvent.VK_ENTER) {
					s.s =_Field.getText().toString();
					clear();
					f.dispose();
				}else if(arg0.getKeyCode() == KeyEvent.VK_ESCAPE) {
					f.dispose();
				}
				
			}

			public void keyReleased(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			public void keyTyped(KeyEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
		});
	    _Field.setPreferredSize(new Dimension(200, 30));
	    f.add(_Field);
	    f.add(_Button);
	    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setVisible(true);
	    clear();
	}
	
	protected void setIm(img im) {
		final JFrame f = new JFrame("Wybierz parametr");
		final img s = im;
		f.setSize(500, 350);
		f.setLayout(new FlowLayout());
		JButton _B1 = new JButton("FlBp0",ImageTable.FlBp0);
		_B1.setActionCommand("FlBp0");
		_B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FlBp0")) {
					s.im = ImageTable.FlBp0.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B2 = new JButton("FlBp1",ImageTable.FlBp1);
		_B2.setActionCommand("FlBp1");
		_B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FlBp1")) {
					s.im = ImageTable.FlBp1.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B3 = new JButton("FlBp3",ImageTable.FlBp3);
		_B3.setActionCommand("FlBp3");
		_B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FlBp3")) {
					s.im = ImageTable.FlBp3.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B4 = new JButton("FlZi0",ImageTable.FlZi0);
		_B4.setActionCommand("FlZi0");
		_B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FlZi0")) {
					s.im = ImageTable.FlZi0.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B5 = new JButton("FlZi1",ImageTable.FlZi1);
		_B5.setActionCommand("FlZi1");
		_B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FlZi1")) {
					s.im = ImageTable.FlZi1.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B6 = new JButton("FlZi3",ImageTable.FlZi3);
		_B6.setActionCommand("FlZi3");
		_B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FlZi3")) {
					s.im = ImageTable.FlZi3.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B7 = new JButton("FxZi0",ImageTable.FxZi0);
		_B7.setActionCommand("FxZi0");
		_B7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FxZi0")) {
					s.im = ImageTable.FxZi0.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B8 = new JButton("FxZi1",ImageTable.FxZi1);
		_B8.setActionCommand("FxZi1");
		_B8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FxZi1")) {
					s.im = ImageTable.FxZi1.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B9 = new JButton("FxZi3",ImageTable.FxZi3);
		_B9.setActionCommand("FxZi3");
		_B9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FxZi3")) {
					s.im = ImageTable.FxZi3.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B10 = new JButton("FxBp0",ImageTable.FxBp0);
		_B10.setActionCommand("FxBp0");
		_B10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FxBp0")) {
					s.im = ImageTable.FxBp0.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B11 = new JButton("FxBp1",ImageTable.FxBp1);
		_B11.setActionCommand("FxBp1");
		_B11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FxBp1")) {
					s.im = ImageTable.FxBp1.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
		JButton _B12 = new JButton("FxBp3",ImageTable.FxBp3);
		_B12.setActionCommand("FxBp3");
		_B12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd = e.getActionCommand();
				if (cmd.equals("FxBp3")) {
					s.im = ImageTable.FxBp3.getImage();
					s.id =cmd;
					clear();
					f.dispose();
				}
			}
		});
	    f.add(_B1);
	    f.add(_B2);
	    f.add(_B3);
	    f.add(_B4);
	    f.add(_B5);
	    f.add(_B6);
	    f.add(_B7);
	    f.add(_B8);
	    f.add(_B9);
	    f.add(_B10);
	    f.add(_B11);
	    f.add(_B12);
	    f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	    f.setVisible(true);
	    clear();
	}

	
	
	public JMenuBar InternalMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu file = new JMenu("File");
	    mb.add(file);
	    JMenuItem print =new JMenuItem("Print");
	    JMenuItem saveas =new JMenuItem("Save As");
	    file.add(saveas);
	    file.add(print);
	    
	    print.addActionListener(this);
	    print.setActionCommand("print");
	    
	    saveas.addActionListener(this);
	    saveas.setActionCommand("saveas");
	    
	    return mb;
	}
	
	public void saveSCH(String path) {
		Document doc = new Document();
		Element theRoot = new Element("schematic");
		doc.setRootElement(theRoot);
		Element data = new Element("data");
		data.setAttribute("NrZK", NrZK.s);
		data.setAttribute("TypZK", TypZK.s);
		
		for(desc c : node.values()) {
			data.setAttribute(c.name, c.s);
		}
		
		for(desc c : smallnode.values()) {
			data.setAttribute(c.name, c.s);
		}
		
		for(desc c : rnode.values()) {
			data.setAttribute(c.name, c.s);
		}
		
		for(img i : imgnode.values()) {
			data.setAttribute(i.name, i.id);
		}
		
		
		
		theRoot.addContent(data);
		
		XMLOutputter xmlOutput = new XMLOutputter(Format.getPrettyFormat());
		try {
			xmlOutput.output(doc, new FileOutputStream(new File(path)));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void setData(Element elem) {
		NrZK.s = elem.getAttributeValue("NrZK");
		TypZK.s = elem.getAttributeValue("TypZK");
		
		
		for(desc c : node.values()) {
			c.s = elem.getAttributeValue(c.name);
		}
		
		for(desc c : smallnode.values()) {
			c.s = elem.getAttributeValue(c.name);
		}
		
		for(desc c : rnode.values()) {
			c.s = elem.getAttributeValue(c.name);
		}
		
		for(img i : imgnode.values()) {
			i.setImg(elem.getAttributeValue(i.name));
		}
		
		
		
	}

	public int print(Graphics arg0, PageFormat arg1, int arg2) throws PrinterException {
		if (arg2 != 0)
		      return NO_SUCH_PAGE;
		if (image == null) {
		      // image to draw null ==> we create
		      image = createImage(zk.getWidth(null), zk.getHeight(null));
		      g2 = (Graphics2D) image.getGraphics();
		      // enable antialiasing
		      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		      // clear draw area
		      clear();
		    }
		 
		arg0.drawImage(image, 0, 0, null);
		return PAGE_EXISTS;
	}
	
	public String getType() {
		return TypZK.s;
	}
	
	public Image getImage() {
		return zk;
	}
}