package com.qualitymatrix.web.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qualitymatrix.listeners.SuiteEvent;
import com.qualitymatrix.listeners.WebEvent;
import com.qualitymatrix.utilities.ConfigReader;
import com.qualitymatrix.utilities.ReadXLdata;
import com.qualitymatrix.web.pages.Create_Account;
import com.qualitymatrix.web.pages.Create_wesAndMFiles;
import com.qualitymatrix.web.pages.MFiles;
import com.qualitymatrix.web.utilities.WebActions;

@Listeners({ SuiteEvent.class, WebEvent.class })
public class TC_003_Create_Account_MFiles_Report {

	/**
	 * =============================================================================
	 * Method: TC_001_Login_Logout | Author: Rajesh Buddha | Date:26 May 2020 |
	 * Description: Login into the application and Logout | Parameters: None |
	 * Return: None
	 * =============================================================================
	 * 
	 * @param email
	 * @param firstName
	 * @param lastName
	 * @param month
	 * @param day
	 * @param year
	 * @param password
	 * @param confirmPassword
	 * @param securityAnswer
	 * @param Wes
	 * @param Gender
	 * @param countryCode
	 * @param mobileNumber
	 * @param countryTerritory
	 * @param typeOfEducation
	 * @param applyType
	 * @param institutionName
	 * @param certificateName
	 * @param yearAwarded
	 * @param startYear
	 * @param endYear
	 * @param Street
	 * @param City
	 * @param deliveryMethod
	 * @param cardName
	 * @param cardNumber
	 * @param expDate
	 * @param CVV
	 * @throws Throwable
	 */
	@Test(dataProviderClass = ReadXLdata.class, dataProvider = "WESdata", description = "verify submitted successfully", groups = {
			"smoke", "regression", "Web Application" })

	public void TC_001_Create_account(String email, String firstName, String lastName, String password,
			String confirmPassword, String securityAnswer, String Wes, String Gender, String mobileNumber,
			String countryTerritory, String typeOfEducation, String applyType, String institutionName,
			String certificateName, String Street, String City, String deliveryMethod, String cardName,
			String cardNumber, String CVV) throws Throwable {
		WebActions webActions = new WebActions();
		Create_wesAndMFiles create_wesAndMFiles = new Create_wesAndMFiles();
		webActions.openURL(ConfigReader.getValue("URL"));

		create_wesAndMFiles.createAccount_ValidateEmail(email, firstName, lastName, password, confirmPassword,
				securityAnswer);
		create_wesAndMFiles.createAccount_personal_information(Wes, Gender, mobileNumber);
		create_wesAndMFiles.createAccount_Report_Purpose();
		create_wesAndMFiles.createAccount_Education_Details(countryTerritory, typeOfEducation, applyType,
				institutionName, firstName, lastName, certificateName);
		create_wesAndMFiles.createAccount_Report_Recipients(countryTerritory, Street, City, deliveryMethod);
		create_wesAndMFiles.createAccount_Your_Evaluation();
		create_wesAndMFiles.createAccount_Review_applicant_acknowledgement();
		create_wesAndMFiles.createAccount_payment_confirmation(cardName, cardNumber, CVV);
		create_wesAndMFiles.createAccount_return_account(email, password);
		webActions.openURL(ConfigReader.getValue("MFilesURL"));
		create_wesAndMFiles.login_to_MFiles_Search_ReferenceNumber(email, confirmPassword);
		webActions.openURL(ConfigReader.getValue("URL"));
		create_wesAndMFiles.Login_to_WES_Upload_Documents(email, confirmPassword);
		webActions.openURL(ConfigReader.getValue("MFilesURL"));
//create_wesAndMFiles.login_MFiles();
		create_wesAndMFiles.Open_metadata_card();
		create_wesAndMFiles.Edit_metadata_card();
		create_wesAndMFiles.open_Document_Authentication_card();
		create_wesAndMFiles.Edit_Document_Authentication_card();
		create_wesAndMFiles.open_Crediantial_Document_Packages();
		create_wesAndMFiles.open_Report_Packages();

	}

}