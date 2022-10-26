package com.qualitymatrix.web.pages;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class rep {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		 //File file =new File("C:\\Users\\Krishna_Kishore\\Downloads\\getpdfcontent.pdf");
		 try {

	            // Creating file instance

	            File file = new File("C:\\Users\\Krishna_Kishore\\Downloads\\getpdfcontent.pdf");

	            // Loading pdf file

	            PDDocument document = PDDocument.load(file);

	            PDFTextStripper pdfStripper = new PDFTextStripper();

	            // Fetching PDF document

	            String text = pdfStripper.getText(document);

	            System.out.println(text);

	            // Closing the document

	            document.close();

	        }catch(Exception e) {

	            System.out.println(e);

	        }

	}

}
