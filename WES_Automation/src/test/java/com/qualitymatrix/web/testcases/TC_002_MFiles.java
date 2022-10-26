package com.qualitymatrix.web.testcases;	
	
	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	import com.qualitymatrix.listeners.SuiteEvent;
	import com.qualitymatrix.listeners.WebEvent;
	import com.qualitymatrix.utilities.ConfigReader;
	import com.qualitymatrix.web.pages.MFiles;
	
	import com.qualitymatrix.web.utilities.WebActions;

	@Listeners({ SuiteEvent.class, WebEvent.class })
	public class TC_002_MFiles {

		/**
		 * =============================================================================
		 * Method: TC_001_MFiles | Author: Rajesh Buddha | Date:05 Oct 2020 |
		 * Description: M-Files | Parameters: None |
		 * Return: None
		 * =============================================================================
		 * @throws Throwable 
		 */
		@Test(description = "Create new invention and verify submitted successfully", groups = { "smoke", "regression",
		"Web Application" })
		
		public void TC_002_Mfiles() throws Throwable {
			WebActions webActions = new WebActions();
			webActions.openURL(ConfigReader.getValue("MFilesURL"));
			MFiles mfiles = new MFiles();
			mfiles.login_MFiles();
			mfiles.Open_metadata_card();
			mfiles.Edit_metadata_card();
			mfiles.open_Document_Authentication_card();
			mfiles.Edit_Document_Authentication_card();
			mfiles.open_Crediantial_Document_Packages();
			mfiles.open_Report_Packages();
//			webActions.openURL(ConfigReader.getValue("URL"));
//			mfiles.Login_to_WES();
			//mfiles.Open_metadata_card();
			
			
		}

	}
