package com.pdf.writer.PdfWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFWrapperWriter {

	public static void main(String[] args) {

	    try {
		//Create Document instance.
		
	 
	        //Create Table object, Here 4 specify the no. of columns
	        PdfPTable pdfPTable = new PdfPTable(104);
	        pdfPTable.setWidthPercentage(100);
	        //pdfPTable.setTotalWidth(new float[]{ 720, 2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160,2160, });
	       //pdfPTable.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
	        //pdfPTable.setLockedWidth(true);
	        //Create cells
	       
	        PdfPCell pdfPCell1 = new PdfPCell(new Phrase(new Chunk("Cell 1 adfadf")));
	        
	        PdfPCell pdfPCell2 = new PdfPCell(new Phrase(new Chunk("Cell 2 adfa")));
	        PdfPCell pdfPCell3 = new PdfPCell(new Phrase(new Chunk("Cell 3 asdfasdf afaf afaf afa")));
	        PdfPCell pdfPCell4 = new PdfPCell(new Phrase(new Chunk("Cell 4 afaf afasf afaff afa")));
	        PdfPCell pdfPCell5 = new PdfPCell(new Phrase(new Chunk("Cell 5 afaf afasf afaff afa")));
	        PdfPCell pdfPCell6 = new PdfPCell(new Phrase(new Chunk("Cell 6 afaf afasf afaff afa")));
	        PdfPCell pdfPCell7 = new PdfPCell(new Phrase(new Chunk("Cell 7 afaf afasf afaff afa")));
	        PdfPCell pdfPCell8 = new PdfPCell(new Phrase(new Chunk("Cell 8 afaf afasf afaff afa")));
	        PdfPCell pdfPCell9 = new PdfPCell(new Phrase(new Chunk("Cell 9 afaf afasf afaff afa")));
	        PdfPCell pdfPCell10 = new PdfPCell(new Phrase(new Chunk("Cell 9 afaf afasf afaff afa")));
	        PdfPCell pdfPCell11= new PdfPCell(new Phrase(new Chunk("Cell 9 afaf afasf afaff afa")));
	        PdfPCell pdfPCell12 = new PdfPCell(new Phrase(new Chunk("Cell 9 afaf afasf afaff afa")));
	        PdfPCell pdfPCell13= new PdfPCell(new Phrase(new Chunk("Cell 9 afaf afasf afaff afa")));
	        PdfPCell pdfPCell14= new PdfPCell(new Phrase(new Chunk("Cell 9 afaf afasf afaff afa")));
	        PdfPCell pdfPCell15= new PdfPCell(new Phrase(new Chunk("Cell 9 afaf afasf afaff afa")));
	        
	 
	        //Add cells to table
	        pdfPTable.addCell(pdfPCell1);
	        pdfPTable.addCell(pdfPCell2);
	        pdfPTable.addCell(pdfPCell3);
	        pdfPTable.addCell(pdfPCell4);
	        pdfPTable.addCell(pdfPCell5);
	        pdfPTable.addCell(pdfPCell6);
	        pdfPTable.addCell(pdfPCell7);
	        pdfPTable.addCell(pdfPCell8);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell10);
	        pdfPTable.addCell(pdfPCell11);
	        pdfPTable.addCell(pdfPCell12);
	        pdfPTable.addCell(pdfPCell13);
	        pdfPTable.addCell(pdfPCell14);
	        pdfPTable.addCell(pdfPCell15);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	     
	        pdfPTable.addCell(pdfPCell1);
	        pdfPTable.addCell(pdfPCell2);
	        pdfPTable.addCell(pdfPCell3);
	        pdfPTable.addCell(pdfPCell4);
	        pdfPTable.addCell(pdfPCell5);
	        pdfPTable.addCell(pdfPCell6);
	        pdfPTable.addCell(pdfPCell7);
	        pdfPTable.addCell(pdfPCell8);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell10);
	        pdfPTable.addCell(pdfPCell11);
	        pdfPTable.addCell(pdfPCell12);
	        pdfPTable.addCell(pdfPCell13);
	        pdfPTable.addCell(pdfPCell14);
	        pdfPTable.addCell(pdfPCell15);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        pdfPTable.addCell(pdfPCell9);
	        
	        Rectangle pageSize = PageSize.A0.rotate();
	                Document document = new Document(pageSize, 10, 10, 10, 10);
			//Create OutputStream instance.
			File f = new File("TestTableFile.pdf");
			if (f.exists()) f.delete();
			OutputStream outputStream = 
			    new FileOutputStream(f);
		 
			//Create PDFWriter instance.
		        PdfWriter.getInstance(document, outputStream);
		 
		        //Open the document
		        document.open();
		        document.newPage();
	 
	        //Add content to the document using Table objects.
	        document.add(pdfPTable);
	        //document.add(pdfPTable);
	 
	        //Close document and outputStream.
	        document.close();
	        outputStream.close();
	 
	        System.out.println("Pdf created successfully.");
	    } catch (Exception e) {
		e.printStackTrace();
	    }
	  
	}
}
