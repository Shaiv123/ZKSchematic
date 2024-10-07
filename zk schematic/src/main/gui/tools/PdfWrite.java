package main.gui.tools;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfWrite {
	
	public static void PdfWriter(String s, java.awt.Image im) {
	
		//Document doc = new Document(PageSize.A4, 50, 50, 50, 50);
		Document doc = new Document(new RectangleReadOnly(283,566), 10, 10, 10, 10);
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(s));
			Image i = Image.getInstance(im,null);
			
			i.scalePercent(50.0f);
			if(doc.getPageSize().getWidth()<i.getScaledWidth()) {
				i.scalePercent(40f);
			}
			if(doc.getPageSize().getWidth()<i.getScaledWidth()) {
				i.setRotationDegrees(90.0f);
			}
			if(doc.getPageSize().getWidth()<i.getScaledWidth()) {
				i.scalePercent(30f);
			}
			
			i.setAbsolutePosition(doc.getPageSize().getWidth()/2-i.getScaledWidth()/2, doc.getPageSize().getHeight()/2-i.getScaledHeight()/2);
			doc.open();
			doc.addAuthor("Antoni Labisz");
			doc.add(i);
			doc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
