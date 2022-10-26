package com.qualitymatrix.web.pages;

import org.openqa.selenium.By;

import com.qualitymatrix.utilities.ConfigReader;
import com.qualitymatrix.utilities.ReportManager;
import com.qualitymatrix.web.utilities.WebActions;

public class Create_Account {

	WebActions webActions = new WebActions();
	
	By btn_Submit = By.xpath("//button[@type=\"submit\"]");
	By lnk_Continue = By.xpath("//a[contains(.,'Continue')]");

	// =====================New Account Creation======================
	//----------------------Validate Email-----------------------------
	By lnk_NewAccountCreation = By.xpath("//a[contains(.,'New to WES? Create an account.')]");
	By button_US = By.xpath("//button[contains(.,'U.S.')]");
	By input_NewAccount_Email = By.id("Email");
	By txt_Verification_Complete = By.xpath("//h2[contains(.,'Verification Complete')]");
	By txt_success_message = By.xpath("//p[contains(.,'Your email address has been successfully verified. Thank you!')]");
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
	By select_Country = By.id("SelectedPhoneCountry");
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
	By select_evaluationPackage=By.xpath("//span[text()=\"Other available evaluation packages:\"]");
	By select_price = By.xpath("(//label[@class=\"btn btn-blue btn-select toggle\"])[3]");
	//-----------------Review Applicant acknowledgement------------------
	By acknowledgement_checkbox1 = By.xpath("//span[text()='I authorize WES to verify the authenticity of my documents with the issuing institutions.']");
	By acknowledgement_checkbox2 = By.xpath("//span[text()='I certify that the information I am submitting is accurate and authentic.']");
	By acknowledgement_checkbox3 = By.xpath("//span[text()='I have read and accept the World Education Services, Inc. ']");
	By acknowledgement_checkbox4 = By.xpath("//label[@for='RequiredDocuments']");
	By next_ReviewBtn=By.xpath("//button[@id='btnConfirmNameAndDob']");
	By confirm_checkbox = By.xpath("//span[text()='I confirm that the name and date of birth listed above is accurate and I understand that changes after I apply will not be made.']");
	By confirm_btn = By.id("btnConfirmAndMoveOn");
	//-----------------------------Payment Confirmation-------------------------------
	By select_payment = By.xpath("//span[text()='Credit Card/Debit Card']");
	By submit_btn = By.cssSelector("[value='Submit']");
	By name_of_card = By.id("trnCardOwner");
	By card_number = By.id("trnCardNumber");
	By exp_date = By.id("trnExpYear");
	By cvv = By.id("trnCardCvd");
	By payment_submit_btn = By.id("submitButton");
	By hold_Message=By.xpath("//h3[@class='media-heading'][contains(.,'Status: On hold')]");
	
	//-----------------------------Return Account-------------------------------
	By get_success_message = By.xpath("//h1[@class='text-center']");
	By get_reference_number = By.xpath("//h1[@class='text-center']");
	By return_MyAccount=By.xpath("//a[@class='exclude btn saveBtn']");
	By logout_MyAccount=By.xpath("//a[@class='saveBtn']");
	By account_TimeLine_Message = By.xpath("//p[@class='evalStatus-subHead red-text']");
	By user_Name=By.xpath("//input[@id='UserLoginID']");
	By login_Btn=By.xpath("//input[@value='Log In']");
	By view_Required_Documents=By.xpath("(//a[@class='btn btn-default'])[3]");
	
	//==========================M-Files=============================================================
	By mfiles_username = By.id("txtUsername");
	By mfiles_password = By.id("txtPassword");
	By mfiles_login_btn = By.id("btnlogin");
	By search_document = By.id("quickSearch_Top_input");
	By search_click = By.id("searchButton");
	By click_document = By.xpath("//span[@class='list_content cellData']");
	By settings_btn = By.xpath("(//div[@class='mf-settings-button'])[3]");
	By popout_metadata = By.xpath("(//a[text()='Pop Out the Metadata Card'])[3]");
	By class_name = By.xpath("//input[@class='mf-internal-text mf-property-100-input-0 ui-autocomplete-input multiselectReplace']");
	By class_dropdown = By.xpath("//span[text()='Academic Transcript']");
	By legibility_status = By.xpath("//span[text()='Legibility Status']/../../..//td//div[@class='mf-control mf-dynamic-control mf-lookup']");
	By legibility_dropdown = By.xpath("//span[text()='Legible']");
	By expected_doc = By.xpath("//span[text()='Expected Document Transmission']/../../..//td//div[@class='mf-control mf-dynamic-control mf-lookup']");
	By expdoc_dropdown = By.xpath("//span[text()='SFTP Complete']");
	By verification_needed = By.xpath("//span[text()='Verification Needed']/../../..//td//div[@class='mf-control mf-dynamic-control mf-boolean']");
	By verification_dropdown = By.xpath("//a[text()='Yes']");
	By document_authenticated= By.xpath("//span[text()='Verification Needed']/../../..//td//div[@class='mf-control mf-dynamic-control mf-boolean']");
	By docment_authenticate_dropdown = By.xpath("//a[text()='Yes']");
	
	By upload_Document=By.xpath("//a[contains(.,'Upload Document')]");
	By upload_File=By.xpath("//a[@class='btn btn-blue'][contains(.,'Upload Document')]");
	By browse_File=By.xpath("//label[@class='fileContainer']");
	By accept_Label=By.xpath("//label[contains(.,'I understand.')]");
	By submit_button=By.xpath("[value='Submit']");
	By order_Line=By.xpath("(//div[contains(.,'Order Line Items')])[12]");
	
	/**
	 * =============================================================================
	 * Method:createAccount_ValidateEmail | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
	 * @throws Throwable 
	 */
	
	public void createAccount_ValidateEmail(String email,String firstName,String lastName,String password,String confirmPassword,String securityAnswer) throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account validate email===============</b>");

		webActions.ClickJSE(lnk_NewAccountCreation, "New account Creation");
		webActions.Click(button_US, "US");
		webActions.sendKeysJSE(input_NewAccount_Email, email, "Email Address");
		webActions.verifyText(email, email);
		webActions.ClickJSE(btn_Submit, "Submit");
		Thread.sleep(30000);
		webActions.ClickJSE(btn_Submit, "Submit");
		webActions.getElmText(txt_Verification_Complete);
		webActions.getElmText(txt_success_message);
		webActions.ClickJSE(lnk_Continue, "Continue");
		webActions.sendKeysJSE(input_UserFirstName, firstName, "Your First (Given) Name");
		webActions.verifyText(firstName, firstName);
		webActions.sendKeysJSE(input_UserLastName, lastName, "Your Last (Family) Name");
		webActions.verifyText(lastName, lastName);
		
		//=====================Date of Birth=====================
		webActions.selectByVisibleText(dd_db_Month, "January","DOB Day");
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
	 * Method:createAccount_personal_information| Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
	 * @throws Throwable 
	 */
		
	public void createAccount_personal_information(String Wes,String Gender,String mobileNumber) throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account personal information===============</b>");
	
		webActions.selectByVisibleText(about_Wes, Wes, "WES Website");
		webActions.verifyText(Wes, Wes);
		webActions.selectByVisibleText(gender, Gender, "select gender");
		webActions.verifyText(Gender, Gender);
		webActions.selectByVisibleText(select_Country, "India (91)", "select country");
		webActions.sendKeys(city_Code, mobileNumber, "enter telephone number");
		webActions.verifyText(mobileNumber, mobileNumber);
		webActions.Click(next_Btn, "click next button");
		
		ReportManager.logScreenshotInfo();
	}
	/**
	 * =============================================================================
	 * Method:createAccount_Report_Purpose| Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
	 * @throws Throwable 
	 */
	
	public void createAccount_Report_Purpose() throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account select report purpose===============</b>");
		
		Thread.sleep(5000);
		webActions.Click(application_Type, "select application type");
		webActions.selectByVisibleText(level_of_Education, "Graduate Admissions", "select level of education");
		webActions.Click(next_btn, "click next button");
	
		ReportManager.logScreenshotInfo();
	}
	/**
	 * =============================================================================
	 * Method:createAccount_Education_Details| Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
	 * @throws Throwable 
	 */
	
	public void createAccount_Education_Details(String countryTerritory,String typeOfEducation,String applyType,String institutionName,String firstName,String lastName,String certificateName) throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account Educational information===============</b>");
		
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
	 * Method:createAccount_Report_Recipients | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
	 * @throws Throwable 
	 */
	
	public void createAccount_Report_Recipients(String countryTerritory,String Street,String City,String deliveryMethod) throws InterruptedException, Exception {
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
		webActions.Click(next_Btn, "click on next");
		
		ReportManager.logScreenshotInfo();
	}
	/**
	 * =============================================================================
	 * Method:createAccount_Your_Evaluation | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
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
	 * Method:createAccount_Review_applicant_acknowledgement | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
	 * @throws Throwable 
	 */
	
	public void createAccount_Review_applicant_acknowledgement() throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account applicant acknowledgement===============</b>");
		Thread.sleep(5000);
		webActions.ClickJSE(acknowledgement_checkbox1, "click checkbox1");
		webActions.ClickJSE(acknowledgement_checkbox2, "click checkbox2");
		webActions.ClickJSE(acknowledgement_checkbox3, "click checkbox3");
		webActions.ClickJSE(acknowledgement_checkbox4, "click checkbox4");
		Thread.sleep(5000);
		webActions.ClickJSE(next_ReviewBtn, "click on next button");
		Thread.sleep(5000);
		webActions.ClickJSE(confirm_checkbox, "click on confirm checkbox");
		webActions.ClickJSE(confirm_btn, "click confirm button");
		
	}
	/**
	 * =============================================================================
	 * Method:createAccount_payment_confirmation | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
	 * @throws Throwable 
	 */
	
	public void createAccount_payment_confirmation(String cardName,String cardNumber,String CVV) throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account payment confirmation===============</b>");
	
		Thread.sleep(3000);
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
	 * Method:createAccount_return_account | Author: Rajesh Buddha | Date:05 Oct 2020 |
	 * Description: M-Files | Parameters: None |
	 * Return:Report
	 * =============================================================================
	 * @throws Throwable 
	 */
	
	
	public void createAccount_return_account(String email,String password) throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account payment confirmation===============</b>");
	
		Thread.sleep(3000);
		webActions.getElmText(get_success_message);
		String referenceNumber=webActions.getElmText(get_reference_number);
		String reference_Number=referenceNumber.replaceAll("\\D", "");
		System.out.println(reference_Number);
		Thread.sleep(3000);
		webActions.ClickJSE(return_MyAccount, "Return To MyAccount");
		webActions.getElmText(account_TimeLine_Message);
		webActions.ClickJSE(logout_MyAccount, "Logout MyAccount");	
	}
	public void login_to_MFiles(String email,String password) throws InterruptedException, Exception {
		ReportManager
				.logPass("<b style=\"color:blue;\">===============create account payment confirmation===============</b>");
	
			webActions.sendKeys(mfiles_username, ConfigReader.getValue("username"), "Enter username");
			webActions.sendKeys(mfiles_password, ConfigReader.getValue("password"), "Enter password");
			webActions.Click(mfiles_login_btn, "login button");
			webActions.sendKeys(search_document, "5446888", "search document with reference number");
			webActions.Click(search_click, "click search btn");
			webActions.waitForVisibleGivenTime(order_Line, 3600);
			ReportManager.logScreenshotInfo();
		}

	public void Login_to_WES() throws InterruptedException, Exception {
		ReportManager.logPass("<b style=\"color:blue;\">===============open metadata card document===============</b>");
		webActions.sendKeys(user_Name, "qmperformance1+50@gmail.com", "Enter username");
		webActions.sendKeys(input_Password, "Quality@123", "Enter password");
		webActions.Click(login_Btn, "login button");
		webActions.waitForVisibleGivenTime(hold_Message, 3600);
		webActions.ClickJSE(upload_Document, "Click on upload Document");
		webActions.ClickJSE(upload_File, "Click on upload File");
		webActions.ClickJSE(next_Btn, "Click on next Button");
		webActions.ClickJSE(browse_File, "Click on upload file");
		webActions.fileUploadusingRobot(browse_File, "/WES_Automation/src/test/resources/ConfigFiles/1.pdf");
		Thread.sleep(10000);
		webActions.Click(accept_Label, "Accepted Lable");
		webActions.Click(submit_button, "Submit Button");
		Thread.sleep(8000);
		ReportManager.logScreenshotInfo();
	}
	
}
	