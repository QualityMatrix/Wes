package com.qualitymatrix.web.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;

import com.qualitymatrix.utilities.ConfigReader;
import com.qualitymatrix.utilities.ReportManager;
import com.qualitymatrix.web.utilities.WebActions;

public class WESReport {

	WebActions webActions = new WebActions();
	
	By Eval_number = By.xpath("//h2[contains(text(), 'Eval Number:')]");
	By Document_holder = By.xpath("//p[contains(text(), 'Document Holder:')]");
	By Equivalency_country = By.xpath("//p[contains(text(), 'Equivalency Country:')]");
	By Evaluation_type = By.xpath("//p[contains(text(), 'Evaluation Type:')]");
	By Evaluation_subType = By.xpath("//p[contains(text(), 'Evaluation Subtype:')]");
	
	By validate_details=By.xpath("(//tr[@class='table-hover'])[1]");
	By Preview_Report=By.xpath("(//a[contains(.,'Preview')])[1]");
	By verify_refID=By.xpath("//h5[contains(@id,'reportPreviewLabel')]");
	

	//p[contains(text(), 'Document Holder:')]
	/**
	 * =============================================================================
	 * Method:createAccount_ValidateEmail | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
	 * @throws Throwable 
	 */
	
	public void Login_To_WESReport() throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============View Report===============</b>");

		//webActions.ClickJSE(lnk_NewAccountCreation, "New account Creation");
		 //create robot for keyboard operations
        Robot rb = new Robot();
        //Enter user name by ctrl-v
        StringSelection username = new StringSelection("krishna_qm@wes.org");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(username, null);            
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        //tab to password entry field
        rb.keyPress(KeyEvent.VK_TAB);
        rb.keyRelease(KeyEvent.VK_TAB);
        Thread.sleep(5000);

        //Enter password by ctrl-v
        StringSelection pwd = new StringSelection("Wkk092022");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(pwd, null);
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);

        //press enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);

        //wait
        Thread.sleep(5000);
		Thread.sleep(10000);
		ReportManager.logScreenshotInfo();
	}
	/**
	 * =============================================================================
	 * Method:createAccount_ValidateEmail | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
	 * @throws Throwable 
	 */
	
	public void Verify_WESReport() throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============Verify Details===============</b>");
		
		String Enumber= webActions.getElmText(Eval_number);
		System.out.println(Enumber);
		String E_number = Enumber.replaceAll("\\D", "");
		System.out.println(E_number);
		
		String Dholder= webActions.getElmText(Document_holder);
		System.out.println(Dholder);
		String D_Holder=Dholder.substring(Dholder.lastIndexOf(":")+1);
		System.out.println(D_Holder);
		
		String Ecountry= webActions.getElmText(Equivalency_country);
		System.out.println(Ecountry);
		String E_Country=Ecountry.substring(Ecountry.lastIndexOf(":")+1);
		System.out.println(E_Country);
		
		String Etype= webActions.getElmText(Evaluation_type);
		System.out.println(Etype);
		String E_type=Etype.substring(Etype.lastIndexOf(":")+1);
		System.out.println(E_type);
		
		String Esubtype= webActions.getElmText(Evaluation_subType);
		System.out.println(Esubtype);
		String E_subtype=Esubtype.substring(Esubtype.lastIndexOf(":")+1);
		System.out.println(E_subtype);
		

		
	}
	public void Preview_WESReport() throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============Verify Details===============</b>");
		
		String V_Details= webActions.getElmText(validate_details);
		System.out.println(V_Details);
		String vdetails = V_Details.replaceAll("\\D", "");
		System.out.println(vdetails);
		Thread.sleep(5000);
		webActions.Click(Preview_Report, "Priview Button");
		String V_RefID= webActions.getElmText(verify_refID);
		System.out.println(V_RefID);
		String vrefid = V_Details.replaceAll("\\D", "");
		System.out.println(vrefid);
		webActions.verifyText(vdetails, vrefid);
		Thread.sleep(10000);
	}
		public void Verify_WESreport() throws InterruptedException, Exception {
			ReportManager
					.logPass("<b style=\"color:blue;\">===============Verify Details===============</b>");
		
		
        File file =new File("C:\\Users\\Krishna_Kishore\\Downloads\\getpdfcontent.pdf");
	//	URL url=new URL("https://testreportviewer.wes.org/?evalNumber=5446824");
		FileInputStream fis = new FileInputStream(file);
		PDFParser parser = new PDFParser((RandomAccessRead) fis);
		parser.parse();
		COSDocument doc= parser.getDocument();
		PDDocument pd=new PDDocument(doc);
		PDFTextStripper strip=new PDFTextStripper();
		String data = strip.getText(pd);
		System.out.println(data);
		
	}
	
	
}
	