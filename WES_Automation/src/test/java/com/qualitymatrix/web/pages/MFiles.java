package com.qualitymatrix.web.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.qualitymatrix.utilities.ConfigReader;
import com.qualitymatrix.utilities.DriverFactory;
import com.qualitymatrix.utilities.ReportManager;
import com.qualitymatrix.web.utilities.WebActions;

public class MFiles {

	WebActions webActions = new WebActions();

	By mfiles_username = By.id("txtUsername");
	By mfiles_password = By.id("txtPassword");
	By mfiles_login_btn = By.id("btnlogin");

	By search_document = By.id("quickSearch_Top_input");
	By search_click = By.id("searchButton");
	By order_LineItems = By.xpath("//table[@id='mainTable']");
	By logoff_Info = By.xpath("//span[@class='logininfoarrow']");
	By logout_Btn = By.xpath("(//*[contains(text(),'Log Out')])[2]");
	By click_document = By.xpath("//span[@class='list_content cellData']");
	By settings_btn = By.xpath("//div[@class='mf-settings-button']");
	By popout_metadata = By.xpath("//li[@class='mf-popout-button ui-menu-item']");
	By side_ArrowBtn = By.xpath("//div[@class='mf-toggleButton mf-preview-button']");

	By class_name = By.xpath(
			"//input[@class='mf-internal-text mf-property-100-input-0 ui-autocomplete-input multiselectReplace']");
	By class_dropdown = By.xpath("//span[text()='Academic Transcript']");
	By legibility_status = By.xpath(
			"//span[text()='Legibility Status']/../../..//td//div[@class='mf-control mf-dynamic-control mf-lookup']");
	By legibility_dropdown = By.xpath("//span[text()='Legible']");
	By expected_doc = By.xpath(
			"//span[text()='Expected Document Transmission']/../../..//td//div[@class='mf-control mf-dynamic-control mf-lookup']");
	By expdoc_dropdown = By.xpath("//span[text()='SFTP Complete']");
	By verification_needed = By.xpath(
			"//span[text()='Verification Needed']/../../..//td//div[@class='mf-control mf-dynamic-control mf-boolean']");
	By verification_dropdown = By.xpath("//a[text()='Yes']");
	By document_authenticated = By.xpath(
			"//span[text()='Verification Needed']/../../..//td//div[@class='mf-control mf-dynamic-control mf-boolean']");
	By docment_authenticate_dropdown = By.xpath("//a[text()='Yes']");

	By user_Name = By.xpath("//input[@id='UserLoginID']");
	By input_Password = By.id("UserPassword");
	By login_Btn = By.xpath("//input[@value='Log In']");
	By upload_Document = By.xpath("//a[contains(.,'Upload Document')]");
	By upload_File = By.xpath("//a[@class='btn btn-blue'][contains(.,'Upload Document')]");
	By next_Btn = By.xpath("//button[@type='button'][contains(.,'Next')]");
	By browse_File = By.xpath("//label[@class='fileContainer']");
	By accept_Label = By.xpath("//label[contains(.,'I understand.')]");

	// ==========================================Document
	// MetaCard========================================
	By click_Class = By.xpath("(//span[contains(.,'Class')])[1]");
	By class_Name = By.xpath("//input[contains(@type,'text')]");
	By institute_Name = By.xpath("//span[contains(.,'Institution')]");
	By institute_Name1 = By.xpath("//input[@class='mf-internal-text mf-property-1282-input-0 ui-autocomplete-input']");
	By institute_name2 = By.xpath("//span[text()='20180 - Punjab Technical University']");
	By country_Name = By.xpath("//span[contains(.,'Country')]");
	By legiblity_Status = By.xpath("//span[contains(.,'Legibility Status')]");
	By Select_legible = By.xpath("//span[text()='Legible']");
	By expected_DocumentName = By.xpath("//span[text()='Expected Document Transmission']");
	By document_Name = By.xpath("//span[contains(.,'SFTP Complete')]");
	By verification_Needed = By.xpath("//span[text()='Verification Needed']");
	By select_Verification = By.xpath("//a[text()='No']");
	By document_Authenticated = By.xpath("//span[text()='Document Authenticated']");
	By select_documentAuthenticated = By.xpath("//a[text()='Yes']");
	By credential_PackageName = By.xpath("//span[text()='Credential Package Name']");
	By credential_Document_Package_Name = By.xpath("//span[text()='Credential Document Package(s) (1)']");
	By credential_arrow = By.xpath("(//img[@class='arrow_icon'])[11]");
	By select_CPN = By.xpath("//span[text()='Testing QM - Bachelor of Computer Science and Engineering - 2017']");
	By Save_Button = By.xpath("(//button[text()='Save'])[2]");
	By drop_Down = By.xpath("//ul[@id='icons']");

	// ========================================02.a-Document
	// Authentication====================================
	By state_Transaction = By.xpath("//div[text()='02a. Document Authenticated']");
	By Popup = By.xpath("//button[text()='OK']");
	By language_On_Document = By.xpath("(//span[contains(.,'Language on Document')])");
	By select_Language = By.xpath("//span[text()='English']");
	By proof_Of_Award = By.xpath("(//span[contains(.,'Proof of Award')])");
	By select_ProofOFAward = By.xpath("//div[text()='Yes']");
	By study_Included = By.xpath("(//span[contains(.,'All Study Included')])");
	By select_Study = By.xpath("(//div[text()='Yes'])[2]");
	By unique_Credential_name = By.xpath("(//span[contains(.,'Unique Credential Name')])");
	By select_credential = By.xpath("//span[text()='Bachelor of Business Administration']");
	By major_Name = By.xpath("(//span[contains(.,'Major Name')])");
	By select_MajorName = By.xpath("//span[text()='Business and Industry and International Business - 3A - 547507']");
	By DocumentHandlers = By.xpath("//th[text()='Document Handlers']");
	By classifer_Name = By.xpath("(//span[contains(.,'Doc Classifer Name')])");
	By Authenticator_Name = By.xpath("(//span[contains(.,'Doc Authenticator Name')])");
	By Reviewer_Name = By.xpath("(//span[contains(.,'Doc Reviewer Name')])");
	By select_receiver = By.xpath("//span[text()='krishna_qm']");
	By report_Packages = By.xpath("//div[@class='group_header' and contains(.,'Report Packages')]");
	By order_Line_Package = By.xpath("(//div[contains(.,'Order Line Items')])[12]");
	By crediantial_Package = By.xpath("(//div[contains(.,'Credential Analysis Packages')])[11]");
	By cc_SideArrow = By.xpath("(//img[@class='arrow_icon'])[12]");
	By OrderLine_Arrow = By.xpath("(//img[@class='arrow_icon'])[2]");
	By All_study_Included = By.xpath("(//span[contains(.,'All Study Included')])");
	By select_study = By.xpath("(//div[contains(.,'Yes')])[9]");
	By Authentication_text_method = By.xpath("(//span[contains(.,'Authentication Text Method')])");
	By select_authenticationMethod = By.xpath("//span[contains(.,'Documents were sent directly by the institution')]");
	By name_Discrepancy = By.xpath("(//span[contains(.,'Name Discrepancy')])[1]");
	By select_Discrepancy = By.xpath("(//div[contains(.,'Yes')])[15]");
	By credential_Document_Name = By.xpath("(//div[contains(.,'Credential Document Package')])[19]");
	By report_package_arrow = By.xpath("//table[@id=\"mainTable\"]/tr[48]/td/div/img");
	By Report_Package_Status=By.xpath("(//th[contains(.,'Report Package Status')])");
	//By report_Status = By.xpath("//div[text()='Yes']");
	By report_QC = By.xpath("(//span[contains(.,'Report QC')])[2]");
	By report_QC_ApprovalDate = By.xpath("(//span[contains(.,'Report QC Approval Date')])");
	By report_QC_completed = By.xpath("(//span[contains(.,'Report QC Complete')])");
	By report_status = By.xpath("(//div[text()='Yes'])[1]");
	By report_created_Date = By.xpath("(//span[contains(.,'Report Created Date')])");
	By Cap_Reviewer = By.xpath("(//span[contains(.,'CAP Reviewer')])");
	By Cap_status = By.xpath("(//span[contains(.,'CAP Status')])");
	By select_CAP = By.xpath("(//span[contains(.,'Complete')])");
	By report_completedDate = By.xpath("(//span[contains(.,'Report Created Date')])");
	By Date_of_Issue_Report = By.xpath("(//span[contains(.,'Date of Issue Report')])");
	By report_Package_Status = By.xpath("(//span[contains(.,'Report Package Status')])");
	By package_status = By.xpath("(//span[text()='Complete'])");
	By select_Date = By.xpath("//button[text()='Today']");
	By click_report = By.xpath("//a[contains(.,'https://testreportviewer.wes.org/')]");
	By Major_Name = By.xpath("(//span[contains(.,'Major Name')])");
	By select_majorName = By.xpath("(//span[text()='Business Computer - 3A - 33203'])");
	By Date_OF_Review = By.xpath("(//span[contains(.,'Date of Review')])");
	By document_Package = By.xpath("(//span[contains(.,'Document Package Reviewer Name')])");
	By required_Documents = By.xpath("(//span[contains(.,'Required Documents')])");
	By cred_Arrow = By.xpath("//img[@id='listingTable_row_listing69_plus']");
	By cred_pack = By.xpath("(//img[@class='arrow_icon'])[20]");
	By cred_subpack = By.xpath("(//img[@class='arrow_icon'])[21]");
	By name_Discrepency = By.xpath("//span[text()='Name Discrepancy']");
	By select_nameDiscrepency = By.xpath("//a[@tabindex='-1'][contains(.,'No')]");
	By name_Discrepency_report = By.xpath("//span[text()='Name Discrepancy Reportable']");
	By name_on_credential = By.xpath("//span[text()='Name on Credential']");
	By DOB_Disperency = By.xpath("//span[text()='Date of Birth Discrepancy']");
	By DOB_disperency_reportable = By.xpath("//span[text()='Date of Birth Discrepancy Reportable']");
	By report_country = By.xpath("//span[text()='Report Country']");
	By select_Country = By.xpath("//a[contains(.,'IND - India')]");
	By report_institute = By.xpath("//span[text()='Report Institution']");
	By select_reportInstitute = By.xpath("//span[contains(.,'20180 - Punjab Technical University')]");
	By report_credential_name = By.xpath("//span[text()='Report Credential Name']");
	By select_reportcredential = By
			.xpath("//span[contains(.,'All India Secondary School Examination Certificate - ElemEd+3 yrs=10yrs')]");
	By report_major = By.xpath("//span[text()='Report Major']");
	By select_reportmajor = By.xpath("//span[contains(.,'Business Administration - 3A - 2378')]");
	By year_award = By.xpath("(//span[text()='Year of Award'])");
	By select_year = By.xpath("//a[contains(.,'2017')]");
	By language_Instruction = By.xpath("(//span[text()='Language of Instruction'])");
	By select_language = By.xpath("//span[contains(.,'English')]");
	By CAP_Status = By.xpath("(//span[text()='CAP Status'])");
	By select_CapStatus = By.xpath("//a[contains(.,'Complete')]");
	
	
	//====================validate document data====================
	By class_txt = By.xpath("(//span[contains(.,'Class')])[3]/../../../td[3]/div/div/div[2]/div/div/div/span");
	
	

	String parentWindow;

	/**
	 * =============================================================================
	 * Method: login_MFiles | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: UserName &Password | Return: None
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void login_MFiles() throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============Login to MFiles Web application===============</b>");

		webActions.sendKeys(mfiles_username, ConfigReader.getValue("username"), "Enter username");
		webActions.sendKeys(mfiles_password, ConfigReader.getValue("password"), "Enter password");
		webActions.Click(mfiles_login_btn, "login button");

		ReportManager.logScreenshotInfo();
	}

	/**
	 * =============================================================================
	 * Method:Verify_Reference_Number | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: UserName &Password | Return: None
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void Verify_Reference_Number() throws InterruptedException, Exception {
		ReportManager.logPass("<b style=\"color:blue;\">===============open metadata card document===============</b>");
		webActions.sendKeys(search_document, "5446932", "search document with reference number");
		webActions.Click(search_click, "click search btn");
		webActions.getElmText(order_LineItems);
		webActions.ClickJSE(logoff_Info, "Click on Logoff Info");
		webActions.ClickJSE(logout_Btn, "click on logout button");
		ReportManager.logScreenshotInfo();

	}

	/**
	 * =============================================================================
	 * Method:Open_metadata_card | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: UserName &Password | Return: None
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */
	public void Open_metadata_card() throws InterruptedException, Exception {
		ReportManager.logPass("<b style=\"color:blue;\">===============open metadata card document===============</b>");
		parentWindow = DriverFactory.getInstance().getWebDriver().getWindowHandle();
		webActions.waitForPagetoLoadComplete();
		Thread.sleep(15000);
		webActions.sendKeys(search_document, "5446933", "search document with reference number");
		webActions.Click(search_click, "click search btn");
		webActions.getElmText(order_LineItems);
		Thread.sleep(3000);
		webActions.Click(order_LineItems, "Click on order line items");
		webActions.Click(click_document, "Click on document");
		webActions.switchToFrame(By.xpath("//*[@id='metaCard']/iframe"));
		webActions.Click(settings_btn, "Settings Button");
		webActions.Click(popout_metadata, "");
		webActions.switchToFrame(By.xpath("//div[@class='metadatadialog ui-dialog-content ui-widget-content']/iframe"));
		webActions.Click(side_ArrowBtn, "");
		webActions.switchTab();
		webActions.switchToFrame(By.xpath("//div[@id='metaCard']/iframe"));
		webActions.Click(side_ArrowBtn, "");
		ReportManager.logScreenshotInfo();
	}

	/**
	 * =============================================================================
	 * Method:Edit_metadata_card | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: UserName &Password | Return: None
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */
	public void Edit_metadata_card() throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============Edit metadata card documents===============</b>");
		Thread.sleep(15000);
		webActions.Click(click_Class, "Click on class Name");
		webActions.clearAndSendKeys(class_Name, "Academic Transcript");
		Thread.sleep(3000);
		webActions.Click(institute_Name, "select InstituteName");
		webActions.Click(drop_Down, "DropDown");
		Thread.sleep(3000);
		webActions.Click(institute_name2, "name");
		webActions.Click(country_Name, "Country");
		webActions.Click(legiblity_Status, "Legibility Status");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(Select_legible, "Select Legible");
		webActions.Click(expected_DocumentName, "Click Expected Document Name");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(document_Name, "SFTP Complete");
		webActions.Click(verification_needed, "Click Verification Needed");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_Verification, "Select type of Verification");
		webActions.Click(credential_PackageName, "Click Credential Package Name");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_CPN, "Select CPN");
		webActions.Click(Save_Button, "Click on Save Button");
		ReportManager.logScreenshotInfo();

	}

	/**
	 * =============================================================================
	 * Method:open_Document_Authentication_card | Author: Rajesh Buddha | Date:05
	 * Oct 2020 | Description: M-Files | Parameters: UserName &Password | Return:
	 * None
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void open_Document_Authentication_card() throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============Edit metadata card documents===============</b>");
		webActions.switchTab();
		//webActions.Click(state_Transaction, "Click on 2a.Document Authentication");
		//webActions.Click(Popup, "Accept Pop-Up");
		webActions.switchToFrame(By.xpath("//*[@id='metaCard']/iframe"));
		List<WebElement> mywebelements = webActions.getListofElements(settings_btn, "");
		System.out.println(mywebelements);
		webActions.Click(settings_btn, "Settings Button");
		webActions.Click(popout_metadata, "");
		Thread.sleep(8000);
		DriverFactory.getInstance().getWebDriver().switchTo().defaultContent();
		boolean isiFrame = webActions.getListofElements(
				By.xpath("(//div[@class='metadatadialog ui-dialog-content ui-widget-content']/iframe)[2]"), "Frame")
				.size() > 0;
		if (isiFrame) {
			webActions.switchToFrame(
					By.xpath("(//div[@class='metadatadialog ui-dialog-content ui-widget-content']/iframe)[2]"));
		} else {
			webActions.switchToFrame(
					By.xpath("//div[@class='metadatadialog ui-dialog-content ui-widget-content']/iframe"));
		}
		List<WebElement> mywebelement = webActions.getListofElements(side_ArrowBtn, "side_ArrowBtn");
		System.out.println(mywebelement);
		webActions.Click(side_ArrowBtn, "");
		webActions.switchTab();
		webActions.switchToFrame(By.xpath("//div[@id='metaCard']/iframe"));
		List<WebElement> myWebelement = webActions.getListofElements(side_ArrowBtn, "");
		System.out.println(mywebelement);
		webActions.Click(side_ArrowBtn, "Side Arrow Button");
		ReportManager.logScreenshotInfo();

	}

	/**
	 * =============================================================================
	 * Method:Edit_Document_Authentication_card | Author: Rajesh Buddha | Date:05
	 * Oct 2020 | Description: M-Files | Parameters: UserName &Password | Return:
	 * None
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */
	public void Edit_Document_Authentication_card() throws InterruptedException, Exception {
		ReportManager.logPass(
				"<b style=\"color:blue;\">===============Edit metadata Document Authentication Card===============</b>");
		webActions.scrollDown();
		webActions.Click(language_On_Document, "Click on Language on Document");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_Language, "English");
		webActions.Click(unique_Credential_name, "");
		webActions.clearAndSendKeys(class_Name, "Bachelor of Business Administration");
		webActions.Click(select_credential, "");
		webActions.Click(major_Name, "");
		webActions.clearAndSendKeys(class_Name, "Business and Industry and International Business - 3A - 547507");
		webActions.Click(select_MajorName, "");
		webActions.Click(DocumentHandlers, "");
		webActions.Click(classifer_Name, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_receiver, "");
		webActions.Click(Authenticator_Name, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.clearAndSendKeys(class_Name, "krishna_qm");
		webActions.Click(Reviewer_Name, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.clearAndSendKeys(class_Name, "krishna_qm");
		webActions.Click(Save_Button, "Click on Save Button");
		ReportManager.logScreenshotInfo();

	}

	/**
	 * =============================================================================
	 * Method:open_Crediantial_Document_Packages | Author: Rajesh Buddha | Date:05
	 * Oct 2020 | Description: M-Files | Parameters: None| Return: None
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */
	public void open_Crediantial_Document_Packages() throws InterruptedException, Exception {
		ReportManager.logPass("<b style=\"color:blue;\">===============Edit Report Packages===============</b>");
		DriverFactory.getInstance().getWebDriver().switchTo().window(parentWindow);
		Thread.sleep(15000);
		webActions.Click(order_Line_Package, "Click on Order Line Packages");
		webActions.Click(OrderLine_Arrow, "");
		webActions.Click(credential_Document_Package_Name, "credential_Document_Package_Name");
		webActions.Click(credential_arrow, "");

		webActions.Click(cc_SideArrow, "Side Arrow Button");
		webActions.switchToFrame(By.xpath("//*[@id='metaCard']/iframe"));
	
		webActions.Click(major_Name, "");
		webActions.clearAndSendKeys(class_Name, "Business Computer - 3A - 33203");
		webActions.Click(Date_OF_Review, "");
		webActions.Click(select_Date, "");
		webActions.Click(required_Documents, "");
		webActions.clearAndSendKeys(class_Name, "Academic Transcript");
		webActions.Click(Save_Button, "Save button");
		Thread.sleep(10000);
		webActions.Click(cred_pack, "");
		
		webActions.Click(cred_subpack, "");
		Thread.sleep(5000);
		webActions.switchToFrame(By.xpath("//*[@id='metaCard']/iframe"));
		Thread.sleep(5000);
		webActions.Click(All_study_Included, "Click on Authentication Text Method");
		webActions.clearAndSendKeys(class_Name, "Yes");
		webActions.Click(Authentication_text_method, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_authenticationMethod, "Documents were sent directly by the institution");
		webActions.Click(name_Discrepency, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_nameDiscrepency, "No");
		webActions.Click(name_Discrepency_report, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_nameDiscrepency, "No");
		webActions.Click(DOB_Disperency, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_nameDiscrepency, "No");
		webActions.Click(DOB_disperency_reportable, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_nameDiscrepency, "No");
		webActions.Click(report_country, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_Country, "IND - India");
		webActions.Click(report_institute, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_reportInstitute, "20180 - Punjab Technical University");
		webActions.Click(report_credential_name, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_reportcredential,
				"All India Secondary School Examination Certificate - ElemEd+3 yrs=10yrs");
		webActions.Click(report_major, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.clearAndSendKeys(class_Name, "Business Administration - 3A - 2378");
		//webActions.Click(select_reportmajor, "Business Administration - 3A - 2378");
		webActions.Click(year_award, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_year, "2017");
		webActions.Click(language_Instruction, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_language, "English");
		webActions.Click(CAP_Status, "");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(By.xpath("//a[contains(.,'Complete')]"), "Complete");
		webActions.Click(Save_Button, "Save button");
		ReportManager.logScreenshotInfo();

	}

	/**
	 * =============================================================================
	 * Method: open_Report_Packages | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None | Return:Report
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */
	public void open_Report_Packages() throws InterruptedException, Exception {
		ReportManager.logPass("<b style=\"color:blue;\">===============Edit Report Packages===============</b>");
		
		Thread.sleep(10000);
		DriverFactory.getInstance().getWebDriver().switchTo().defaultContent();
		webActions.ClickJSE(report_Packages, "Click on Report Packages");
		
		webActions.Click(report_package_arrow, "Side Arrow Button");
		Thread.sleep(5000);
		webActions.switchToFrame(By.xpath("//*[@id='metaCard']/iframe"));
		Thread.sleep(5000);
		webActions.Click(Authentication_text_method, "Click on Authentication Text Method");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(select_authenticationMethod, "Documents were sent directly by the institution");
		Thread.sleep(5000);
		webActions.Click(Report_Package_Status, "Click Report Status");
		Thread.sleep(3000);
		webActions.Click(report_QC_ApprovalDate, "Select Report Date");
		Thread.sleep(3000);
		webActions.Click(select_Date, "Today Date");
		webActions.Click(report_QC_completed, "Report Completed");
		webActions.Click(drop_Down, "DropDown");
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);	
		webActions.Click(report_created_Date, "Report Created Date");
		webActions.Click(select_Date, "Today Date");
		webActions.Click(Date_of_Issue_Report, "Issue Report Date");
		webActions.Click(select_Date, "Today Date");
		webActions.Click(report_Package_Status, "Click on Report Package");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(package_status, "Yes");
		webActions.Click(Save_Button, "Save button");
		Thread.sleep(5000);
		webActions.Click(click_report, "Report");
		ReportManager.logScreenshotInfo();
	}
}
