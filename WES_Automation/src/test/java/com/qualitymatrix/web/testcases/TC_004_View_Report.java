package com.qualitymatrix.web.testcases;	
	
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.qualitymatrix.listeners.SuiteEvent;
import com.qualitymatrix.listeners.WebEvent;
import com.qualitymatrix.utilities.ConfigReader;
import com.qualitymatrix.web.pages.WESReport;
import com.qualitymatrix.web.utilities.WebActions;

	@Listeners({ SuiteEvent.class, WebEvent.class })
	public class TC_004_View_Report {

		/**
		 * =============================================================================
		 * Method: TC_001_MFiles | Author: Rajesh Buddha | Date:05 Oct 2020 |
		 * Description: M-Files | Parameters: None |
		 * Return: None
		 * =============================================================================
		 * @throws Throwable 
		 */
		@Test(description = "View Report", groups = { "smoke", "regression",
		"Web Application" })
		
		public void TC_004_MfilesReport() throws Throwable {
			//WebActions webActions = new WebActions();
			WESReport report = new WESReport();
//			webActions.openURL(ConfigReader.getValue("WESReportURL"));
//			report.Login_To_WESReport();
//			report.Verify_WESReport();
//			report.Preview_WESReport();
			report.Verify_WESreport();
			
			
		}

	}
