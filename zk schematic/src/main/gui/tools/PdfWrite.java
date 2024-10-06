package main.gui.tools;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

public class PdfWrite {
	
	public static void PdfWriter(String s, java.awt.Image im, float size) {
		Document doc = new Document(PageSize.A4, 50, 50, 50, 50);
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(s));
			Image i = Image.getInstance(im,null);
			
			doc.open();
			doc.addAuthor("Antoni Labisz");
			i.scalePercent(size, size);
			doc.add(i);
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
			doc.add(new Paragraph(" "));
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
