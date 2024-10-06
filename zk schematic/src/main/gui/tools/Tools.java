package main.gui.tools;

import java.awt.FlowLayout;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import main.gui.model.ZK;

public final class Tools {
	
	public static Image ScaledImage(Image img, int w, int h) {
		BufferedImage b = new BufferedImage(w,h,BufferedImage.TYPE_INT_RGB);
		Graphics2D g2 = b.createGraphics();
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(img,0,0,w,h,null);
		g2.dispose();
		return b;
	}
	
	public static JPanel getTitlePanel(final JTabbedPane tabbedPane, final ZK panel, String title)
	 {
	  JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
	  titlePanel.setOpaque(false);
	  JLabel titleLbl = new JLabel(title);
	  titleLbl.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
	  titlePanel.add(titleLbl);
	  JButton closeButton = new JButton("x");

	  closeButton.addMouseListener(new MouseAdapter()
	  {
	   @Override
	   public void mouseClicked(MouseEvent e)
	   {
	    tabbedPane.remove(panel);
	   }
	  });
	  titlePanel.add(closeButton);

	  return titlePanel;
	 }
	

}
