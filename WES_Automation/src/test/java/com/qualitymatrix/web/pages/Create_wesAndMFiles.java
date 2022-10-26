package com.qualitymatrix.web.pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qualitymatrix.utilities.ConfigReader;
import com.qualitymatrix.utilities.DriverFactory;
import com.qualitymatrix.utilities.ReportManager;
import com.qualitymatrix.web.utilities.WebActions;

public class Create_wesAndMFiles {

	WebActions webActions = new WebActions();

	By btn_Submit = By.xpath("//button[@type=\"submit\"]");
	By lnk_Continue = By.xpath("//a[contains(.,'Continue')]");

// =====================New Account Creation======================
//----------------------Validate Email-----------------------------
	By lnk_NewAccountCreation = By.xpath("//a[contains(.,'New to WES? Create an account.')]");
	By button_US = By.xpath("//button[contains(.,'U.S.')]");
	By input_NewAccount_Email = By.id("Email");
	By txt_Verification_Complete = By.xpath("//h2[contains(.,'Verification Complete')]");
	By txt_success_message = By
			.xpath("//p[contains(.,'Your email address has been successfully verified. Thank you!')]");
//----------------------Fill create account form-----------------------------
	By input_UserFirstName = By.name("UserFirstName");
	By input_UserLastName = By.name("UserLastName");
	By dd_db_Month = By.xpath("//select[@name='Month']");
	By dd_db_Day = By.id("Day");
	By dd_db_Year = By.id("Year");
	By input_Password = By.id("UserPassword");
	By input_ConfirmPassword = By.id("ConfirmPassword");
	By dd_UserSecurityQuestion = By.id("UserSecurityQuestion");
	By input_UserSecurityAnswer = By.id("UserSecurityAnswer");
	By create_Account_btn = By.id("btnCreateAccount");
//---------------------Personal Information-------------------------------------
	By about_Wes = By.id("SelectedMarketingCode");
	By gender = By.id("Gender");
	By select_country = By.id("SelectedPhoneCountry");
	By city_Code = By.id("Telephone");
	By next_Btn = By.id("btnMoveToNextTab");
//--------------------Report Purpose-----------------------------
	By application_Type = By.xpath("//span[text()='Education']");
	By level_of_Education = By.id("SelectedLevelEducation");
	By next_btn = By.xpath("//button[@id='btnMoveToNextTab']");
//------------------Your Education----------------------------
	By add_Credential = By.id("loadCredentialPopup");
	By country_territory = By.id("ddlCountry");
	By type_of_Education = By.id("ddlInstType");
	By apply_type = By.id("ddlInstSubType");
	By institution_name = By.id("txtInst");
	By certificate_name = By.xpath("//input[@name='Credential']");
	By given_firstname = By.id("FirstName");
	By given_lastname = By.id("LastName");
	By year_awarded = By.id("ddlAttendedYear");
	By start_year = By.id("SelectedAttendedYearFrom");
	By end_year = By.id("SelectedAttendedYearTo");
	By save_btn = By.id("btnSaveCreden");
//------------------------Report Recipients------------------------
	By add_address = By.id("btnAddMailingAddress");
	By street = By.id("Address1");
	By city = By.id("City");
	By delivery_method = By.id("ddlIntlDeliveryMethod");
	By mail_address_saveBtn = By.xpath("//button[text()='Save']");
//-------------Your Evaluation----------------------------------
	By select_evaluationPackage = By.xpath("//span[text()=\"Other available evaluation packages:\"]");
	By select_price = By.xpath("(//label[@class=\"btn btn-blue btn-select toggle\"])[3]");
//-----------------Review Applicant acknowledgement------------------
	By acknowledgement_checkbox1 = By.xpath(
			"//span[text()='I authorize WES to verify the authenticity of my documents with the issuing institutions.']");
	By acknowledgement_checkbox2 = By
			.xpath("//span[text()='I certify that the information I am submitting is accurate and authentic.']");
	By acknowledgement_checkbox3 = By
			.xpath("//span[text()='I have read and accept the World Education Services, Inc. ']");
	By acknowledgement_checkbox4 = By.xpath("//label[@for='RequiredDocuments']");
	By next_ReviewBtn = By.xpath("//button[@id='btnConfirmNameAndDob']");
	By confirm_checkbox = By.xpath(
			"//span[text()='I confirm that the name and date of birth listed above is accurate and I understand that changes after I apply will not be made.']");
	By confirm_btn = By.id("btnConfirmAndMoveOn");
//-----------------------------Payment Confirmation-------------------------------
	By select_payment = By.xpath("//span[text()='Credit Card/Debit Card']");
	By submit_btn = By.cssSelector("[value='Submit']");
	By name_of_card = By.id("trnCardOwner");
	By card_number = By.id("trnCardNumber");
	By exp_date = By.id("trnExpYear");
	By cvv = By.id("trnCardCvd");
	By payment_submit_btn = By.id("submitButton");
	By hold_Message = By.xpath("//h3[@class='media-heading'][contains(.,'Status: On hold')]");

//-----------------------------Return Account-------------------------------
	By get_success_message = By.xpath("//h1[@class='text-center']");
	By get_reference_number = By.xpath("//h1[@class='text-center']");
	By return_MyAccount = By.xpath("//a[@class='exclude btn saveBtn']");
	By logout_MyAccount = By.xpath("//a[@class='saveBtn']");
	By account_TimeLine_Message = By.xpath("//p[@class='evalStatus-subHead red-text']");
	By user_Name = By.xpath("//input[@id='UserLoginID']");
	By login_Btn = By.xpath("//input[@value='Log In']");
	By view_Required_Documents = By.xpath("(//a[@class='btn btn-default'])[3]");

//==========================M-Files=============================================================
	By mfiles_username = By.id("txtUsername");
	By mfiles_password = By.id("txtPassword");
	By mfiles_login_btn = By.id("btnlogin");
	By search_document = By.id("quickSearch_Top_input");
	By search_click = By.id("searchButton");
	By click_document = By.xpath("//span[@class='list_content cellData']");
	By settings_btn = By.xpath("(//div[@class='mf-settings-button'])[3]");
	By popout_metadata = By.xpath("(//a[text()='Pop Out the Metadata Card'])");
	By class_name = By.xpath("//input[@class='mf-internal-text mf-property-100-input-0 ui-autocomplete-input multiselectReplace']");
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

	By upload_Document = By.xpath("//a[contains(.,'Upload Document')]");
	By upload_File = By.xpath("//a[@class='btn btn-blue'][contains(.,'Upload Document')]");
	By browse_File = By.xpath("//label[@class='fileContainer']");
	By accept_Label = By.xpath("//label[contains(.,'I understand.')]");
	By submit_button = By.xpath("//button[contains(.,'Submit')]");
	By order_Line = By.xpath("//div[@class=\"group_header\" and contains(.,'Order Line Items')]");
	By order_LineItems = By.xpath("//table[@id='mainTable']");
	By logoff_Info = By.xpath("//span[@class='logininfoarrow']");
	By logout_Btn = By.xpath("(//*[contains(text(),'Log Out')])[2]");
	By side_ArrowBtn = By.xpath("//div[@class='mf-toggleButton mf-preview-button']");
	By docment_authenticate_dropdown = By.xpath("//a[text()='Yes']");
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
	By Equivalency_Summery=By.xpath("(//span[contains(.,'Equivalency Summary')])");
	By text_Equivalency_Summery=By.xpath("//input[@class='mf-internal-text mf-property-1517-input-0']");
	By text_Report_QC_User=By.xpath("//input[@class='mf-internal-text mf-property-1475-input-0 ui-autocomplete-input activeSelectArea']");
	By name_Discrepancy = By.xpath("(//span[contains(.,'Name Discrepancy')])[1]");
	By select_Discrepancy = By.xpath("(//div[contains(.,'Yes')])[15]");
	By credential_Document_Name = By.xpath("(//div[contains(.,'Credential Document Package')])[19]");
	By report_package_arrow = By.xpath("//div[contains(.,'Report Packages (1)')]/../../../../tr[5]/td/div/img");
	By Report_Package_Status = By.xpath("(//th[contains(.,'Report Package Status')])");
	// By report_Status = By.xpath("//div[text()='Yes']");
	By report_QC = By.xpath("(//span[contains(.,'Report QC')])[2]");
	By text_Report_QC=By.xpath("//input[@class='mf-internal-text mf-property-1502-input-0 ui-autocomplete-input activeSelectArea']");
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
	By selectCountry = By.id("SelectedPhoneCountry");
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

	// ====================validate document data====================
	By class_txt = By.xpath("(//span[contains(.,'Class')])[3]/../../../td[3]/div/div/div[2]/div/div/div/span");

	//String reference_Number;

	String reference_Number;
	
	//String reference_Number = "5446916";
	String parentWindow;
	String email;

	/**
	 * =============================================================================
	 * Method:createAccount_ValidateEmail | Author: Rajesh Buddha | Date:05 Oct 2020
	 * | Description: M-Files | Parameters: None | Return:Report
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void createAccount_ValidateEmail(String email, String firstName, String lastName, String password,
			String confirmPassword, String securityAnswer) throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account validate email===============</b>");

		webActions.ClickJSE(lnk_NewAccountCreation, "New account Creation");
		webActions.Click(button_US, "US");
		webActions.sendKeysJSE(input_NewAccount_Email, email, "Email Address");
		webActions.verifyText(email, email);
		webActions.ClickJSE(btn_Submit, "Submit");
		Thread.sleep(20000);
		webActions.ClickJSE(btn_Submit, "Submit");
		webActions.getElmText(txt_Verification_Complete);
		webActions.getElmText(txt_success_message);
		webActions.ClickJSE(lnk_Continue, "Continue");
		webActions.sendKeysJSE(input_UserFirstName, firstName, "Your First (Given) Name");
		webActions.verifyText(firstName, firstName);
		webActions.sendKeysJSE(input_UserLastName, lastName, "Your Last (Family) Name");
		webActions.verifyText(lastName, lastName);

		// =====================Date of Birth=====================
		webActions.selectByVisibleText(dd_db_Month, "January", "DOB Day");
		webActions.selectByVisibleText(dd_db_Day, "1", "DOB Month");
		webActions.selectByVisibleText(dd_db_Year, "1996", "Year");
		webActions.sendKeysJSE(input_Password, password, "Password");
		webActions.verifyText(password, password);
		webActions.sendKeysJSE(input_ConfirmPassword, confirmPassword, "Confirm Password");
		webActions.verifyText(confirmPassword, confirmPassword);
		webActions.selectByVisibleText(dd_UserSecurityQuestion, "What is your favorite color?", "Security Question");
		webActions.sendKeysJSE(input_UserSecurityAnswer, securityAnswer, "Security Answer");
		webActions.verifyText(securityAnswer, securityAnswer);
		webActions.Click(create_Account_btn, "create account submit button");
		ReportManager.logScreenshotInfo();
	}

	/**
	 * =============================================================================
	 * Method:createAccount_personal_information| Author: Rajesh Buddha | Date:05
	 * Oct 2020 | Description: M-Files | Parameters: None | Return:Report
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void createAccount_personal_information(String Wes, String Gender, String mobileNumber)
			throws InterruptedException, Exception {
		ReportManager.logPass(
				"<b style=\"color:blue;\">===============create account personal information===============</b>");

		webActions.selectByVisibleText(about_Wes, Wes, "WES Website");
		webActions.verifyText(Wes, Wes);
		webActions.selectByVisibleText(gender, Gender, "select gender");
		webActions.verifyText(Gender, Gender);
		webActions.selectByVisibleText(selectCountry, "India (91)", "select country");
		webActions.sendKeys(city_Code, mobileNumber, "enter telephone number");
		webActions.verifyText(mobileNumber, mobileNumber);
		webActions.Click(next_Btn, "click next button");

		ReportManager.logScreenshotInfo();
	}

	/**
	 * =============================================================================
	 * Method:createAccount_Report_Purpose| Author: Rajesh Buddha | Date:05 Oct 2020
	 * | Description: M-Files | Parameters: None | Return:Report
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void createAccount_Report_Purpose() throws InterruptedException, Exception {
		ReportManager.logPass(
				"<b style=\"color:blue;\">===============create account select report purpose===============</b>");

		Thread.sleep(5000);
		webActions.Click(application_Type, "select application type");
		webActions.selectByVisibleText(level_of_Education, "Graduate Admissions", "select level of education");
		webActions.Click(next_btn, "click next button");

		ReportManager.logScreenshotInfo();
	}

	/**
	 * =============================================================================
	 * Method:createAccount_Education_Details| Author: Rajesh Buddha | Date:05 Oct
	 * 2020 | Description: M-Files | Parameters: None | Return:Report
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void createAccount_Education_Details(String countryTerritory, String typeOfEducation, String applyType,
			String institutionName, String firstName, String lastName, String certificateName)
			throws InterruptedException, Exception {
		ReportManager.logPass(
				"<b style=\"color:blue;\">===============create account Educational information===============</b>");

		webActions.Click(add_Credential, "add credentials button");
		webActions.selectByVisibleText(country_territory, countryTerritory, "select country");
		webActions.verifyText(countryTerritory, countryTerritory);
		webActions.selectByVisibleText(type_of_Education, typeOfEducation, "select education type");
		webActions.verifyText(typeOfEducation, typeOfEducation);
		Thread.sleep(3000);
		webActions.selectByVisibleText(apply_type, applyType, "select level of education");
		webActions.verifyText(applyType, applyType);
		webActions.sendKeys(institution_name, institutionName, "select institution name");
		webActions.verifyText(institutionName, institutionName);
		webActions.sendKeysJSE(given_firstname, firstName, "Your First (Given) Name");
		webActions.verifyText(firstName, firstName);
		webActions.sendKeysJSE(given_lastname, lastName, "Your Last (Family) Name");
		webActions.verifyText(lastName, lastName);
		webActions.selectByVisibleText(year_awarded, "2017", "completed year");
		webActions.selectByVisibleText(start_year, "2013", "start year");
		webActions.selectByVisibleText(end_year, "2017", "start year");
		webActions.sendKeys(certificate_name, certificateName, "select certificate name");
		webActions.verifyText(certificateName, certificateName);
		webActions.Click(save_btn, "click on save button");
		Thread.sleep(5000);
		webActions.Click(next_Btn, "click next button");

		ReportManager.logScreenshotInfo();
	}

	/**
	 * =============================================================================
	 * Method:createAccount_Report_Recipients | Author: Rajesh Buddha | Date:05 Oct
	 * 2020 | Description: M-Files | Parameters: None | Return:Report
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void createAccount_Report_Recipients(String countryTerritory, String Street, String City,
			String deliveryMethod) throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account Report Recipients===============</b>");

		webActions.ClickJSE(add_address, "Add+Address");
		webActions.selectByVisibleText(country_territory, countryTerritory, "select country");
		webActions.verifyText(countryTerritory, countryTerritory);
		webActions.sendKeys(street, Street, "enter address");
		webActions.verifyText(Street, Street);
		webActions.sendKeys(city, City, "select city");
		webActions.verifyText(City, City);
		Thread.sleep(4000);
		webActions.selectByVisibleText(delivery_method, deliveryMethod, "select delivery method");
		webActions.verifyText(deliveryMethod, deliveryMethod);
		webActions.Click(mail_address_saveBtn, "click on save button");
		Thread.sleep(5000);
		webActions.moveToElement(next_Btn);
		webActions.Click(next_Btn, "click on next");

		ReportManager.logScreenshotInfo();
	}

	/**
	 * =============================================================================
	 * Method:createAccount_Your_Evaluation | Author: Rajesh Buddha | Date:05 Oct
	 * 2020 | Description: M-Files | Parameters: None | Return:Report
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */
	public void createAccount_Your_Evaluation() throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account Report Recipients===============</b>");

		Thread.sleep(5000);
		webActions.Click(select_evaluationPackage, "Other available evaluation packages");
		Thread.sleep(5000);
		webActions.Click(select_price, "selecting price");
		Thread.sleep(5000);
		webActions.Click(next_Btn, "click on next button");
		Thread.sleep(5000);
		webActions.Click(next_Btn, "click on next button");
	}

	/**
	 * =============================================================================
	 * Method:createAccount_Review_applicant_acknowledgement | Author: Rajesh Buddha
	 * | Date:05 Oct 2020 | Description: M-Files | Parameters: None | Return:Report
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void createAccount_Review_applicant_acknowledgement() throws InterruptedException, Exception {
		ReportManager.logPass(
				"<b style=\"color:blue;\">===============create account applicant acknowledgement===============</b>");
		Thread.sleep(5000);
		webActions.ClickJSE(acknowledgement_checkbox1, "click checkbox1");
		webActions.ClickJSE(acknowledgement_checkbox2, "click checkbox2");
		webActions.ClickJSE(acknowledgement_checkbox3, "click checkbox3");
		webActions.ClickJSE(acknowledgement_checkbox4, "click checkbox4");
		Thread.sleep(5000);
		webActions.ClickJSE(next_ReviewBtn, "click on next button");
		Thread.sleep(5000);
		webActions.ClickJSE(confirm_checkbox, "click on confirm checkbox");
		Thread.sleep(5000);
		webActions.ClickJSE(confirm_btn, "click confirm button");

	}

	/**
	 * =============================================================================
	 * Method:createAccount_payment_confirmation | Author: Rajesh Buddha | Date:05
	 * Oct 2020 | Description: M-Files | Parameters: None | Return:Report
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void createAccount_payment_confirmation(String cardName, String cardNumber, String CVV)
			throws InterruptedException, Exception {
		ReportManager.logPass(
				"<b style=\"color:blue;\">===============create account payment confirmation===============</b>");

		Thread.sleep(8000);
		webActions.Click(select_payment, "select payment type");
		Thread.sleep(3000);
		webActions.Click(submit_btn, "click submit");
		webActions.sendKeys(name_of_card, cardName, "name of the card");
		webActions.verifyText(cardName, cardName);
		webActions.sendKeys(card_number, cardNumber, "enter card number");
		webActions.verifyText(cardNumber, cardNumber);
		webActions.selectByVisibleText(exp_date, "2024", "select expiry date");
		Thread.sleep(5000);
		webActions.sendKeys(cvv, CVV, "enter cvv");
		webActions.Click(payment_submit_btn, "payment submit button");
	}

	/**
	 * =============================================================================
	 * Method:createAccount_return_account | Author: Rajesh Buddha | Date:05 Oct
	 * 2020 | Description: M-Files | Parameters: None | Return:Report
	 * =============================================================================
	 * 
	 * @throws Throwable
	 */

	public void createAccount_return_account(String email, String password) throws InterruptedException, Exception {
		ReportManager.logPass(
				"<b style=\"color:blue;\">===============create account payment confirmation===============</b>");

		Thread.sleep(3000);
		webActions.getElmText(get_success_message);
		String referenceNumber = webActions.getElmText(get_reference_number);
		reference_Number = referenceNumber.replaceAll("\\D", "");
		System.out.println(reference_Number);
		Thread.sleep(3000);
		webActions.ClickJSE(return_MyAccount, "Return To MyAccount");
		// webActions.getElmText(account_TimeLine_Message);
		webActions.ClickJSE(logout_MyAccount, "Logout MyAccount");

	}

	public void login_to_MFiles_Search_ReferenceNumber(String email, String password) throws InterruptedException, Exception {
		ReportManager.logPass(
				"<b style=\"color:blue;\">===============create account payment confirmation===============</b>");

		webActions.sendKeys(mfiles_username, ConfigReader.getValue("username"), "Enter username");
		webActions.sendKeys(mfiles_password, ConfigReader.getValue("password"), "Enter password");
		webActions.Click(mfiles_login_btn, "login button");
		for (int i = 0; i < 120; i++) {
			webActions.clearAndSendKeys(search_document, reference_Number);
			webActions.Click(search_click, "click search btn");
			boolean isOrderLine = webActions.getListofElements(order_Line, "Order Line").size() > 0;
			if (isOrderLine) {
				break;
			}
			Thread.sleep(1000);

		}

		ReportManager.logScreenshotInfo();
	}

	public void Login_to_WES_Upload_Documents(String email, String password) throws InterruptedException, Exception {
		ReportManager.logPass("<b style=\"color:blue;\">===============open metadata card document===============</b>");

		webActions.sendKeys(user_Name, email, "Enter username");
		webActions.sendKeys(input_Password, password, "Enter password");
		webActions.Click(login_Btn, "login button");
		for (int i = 0; i < 120; i++) {

			boolean isOrderLine = webActions.getListofElements(upload_Document, "upload_Document").size() > 0;
			if (isOrderLine) {
				break;
			}
			Thread.sleep(1000);
			webActions.ClickJSE(logout_MyAccount, "Logout MyAccount");
			webActions.sendKeys(user_Name, email, "Enter username");
			webActions.sendKeys(input_Password, password, "Enter password");
			webActions.Click(login_Btn, "login button");

		}
		webActions.ClickJSE(upload_Document, "Click on upload Document");
		webActions.ClickJSE(upload_File, "Click on upload File");
		webActions.ClickJSE(By.xpath("//button[contains(.,'Next')]"), "Click on next Button");
		Thread.sleep(3000);
		webActions.ClickJSE(browse_File, "Click on upload file");
		webActions.fileUploadusingRobot(browse_File,
				
				"C:\\Users\\Krishna_Kishore\\OneDrive - Quality Matrix Inc\\Documents\\WES_Automation\\src\\test\\resources\\ConfigFiles\\1.pdf");
		//C:\\Users\\QM-Testing\\Documents\\POCs\\WES_Automation\\src\\test\\resources\\ConfigFiles\\1.pdf
		Thread.sleep(10000);
		webActions.Click(accept_Label, "Accepted Lable");
		webActions.Click(submit_button, "Submit Button");
		Thread.sleep(8000);
		ReportManager.logScreenshotInfo();
	}

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
		webActions.sendKeys(search_document, reference_Number, "search document with reference number");
		webActions.Click(search_click, "click search btn");
		webActions.getElmText(order_LineItems);
		Thread.sleep(3000);
		for (int i = 0; i < 120; i++) {
			webActions.Click(search_click, "click search btn");
			boolean isOrderLine = webActions.getListofElements(click_document, "Document").size() > 0;
			if (isOrderLine) {
				break;
			}
			Thread.sleep(1000);

		}
		//webActions.Click(order_LineItems, "Click on order line items");
		webActions.ClickJSE(click_document, "Click on document");
		webActions.switchToFrame(By.xpath("//*[@id='metaCard']/iframe"));
		
		Thread.sleep(10000);

		boolean issettings_btn = webActions.getListofElements(settings_btn, "settings_btn").size() > 0;
		if (issettings_btn) {
			webActions.Click(settings_btn, "Settings Button");
		}else {
			webActions.Click(By.xpath("(//div[@title=\"Settings\"])"), "Settings Button");
		}
		
		
		webActions.Click(popout_metadata, "");
		webActions.switchToFrame(By.xpath("//div[@class='metadatadialog ui-dialog-content ui-widget-content']/iframe"));
		webActions.Click(side_ArrowBtn, "");
		webActions.switchTab();
		Thread.sleep(10000);
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
		Thread.sleep(25000);
		webActions.Click(click_Class, "Click on class Name");
		webActions.clearAndSendKeys(class_Name, "Academic Transcript");
		Thread.sleep(5000);
		webActions.Click(institute_Name, "select InstituteName");
		webActions.Click(drop_Down, "DropDown");
		Thread.sleep(5000);
		webActions.sendKeys(By.xpath("//div[@class='mf-lookup-item-cell-content']/input"), "20180","");
		Thread.sleep(8000);
		webActions.Click(institute_name2, "name");
		webActions.Click(country_Name, "Country");
		webActions.Click(legiblity_Status, "Legibility Status");
		webActions.Click(drop_Down, "DropDown");
		webActions.Click(Select_legible, "Select Legible");
//		webActions.Click(expected_DocumentName, "Click Expected Document Name");
//		webActions.Click(drop_Down, "DropDown");
//		webActions.Click(document_Name, "SFTP Complete");
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
		DriverFactory.getInstance().getWebDriver().navigate().refresh();
		DriverFactory.getInstance().getWebDriver().navigate().refresh();
		Thread.sleep(5000);
		webActions.Click(click_document, "Click on document");
		Thread.sleep(5000);
		webActions.Click(state_Transaction, "Click on 2a.Document Authentication");
		Thread.sleep(5000);
		webActions.Click(Popup, "Accept Pop-Up");
		Thread.sleep(5000);
		webActions.switchToFrame(By.xpath("//*[@id='metaCard']/iframe"));
		List<WebElement> mywebelements = webActions.getListofElements(settings_btn, "");
		System.out.println(mywebelements);
		Thread.sleep(10000);

		boolean issettings_btn = webActions.getListofElements(settings_btn, "settings_btn").size() > 0;
		if (issettings_btn) {
			webActions.Click(settings_btn, "Settings Button");
		}else {
			webActions.Click(By.xpath("(//div[@title=\"Settings\"])"), "Settings Button");
		}
		webActions.Click(popout_metadata, "");
		Thread.sleep(5000);
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
		Thread.sleep(5000);
		DriverFactory.getInstance().getWebDriver().navigate().refresh();
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
		webActions.sendKeys(text_Equivalency_Summery, "Bachelors degree(Four Years)", "Bachelors degree(Four Years)");
		Thread.sleep(5000);
		webActions.sendKeys(text_Report_QC_User, "krishna_qm","krishna_qm");
		webActions.Click(Report_Package_Status, "Click Report Status");
		Thread.sleep(3000);
		webActions.sendKeys(text_Report_QC, "krishna_qm","krishna_qm");
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
		webActions.Click(package_status, "Complete");
		webActions.Click(Save_Button, "Save button");
		Thread.sleep(10000);
		webActions.moveToElement(click_report);
		webActions.ClickJSE(click_report, "Report");
		Thread.sleep(5000);
		webActions.switchTab();
		 Thread.sleep(10000);

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

}