package com.qualitymatrix.android.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qualitymatrix.android.screens.AndroidHomePage;
import com.qualitymatrix.listeners.MobileEvent;
import com.qualitymatrix.listeners.SuiteEvent;

@Listeners({SuiteEvent.class,MobileEvent.class})
public class TC_001{

	@Parameters({"platform", "udid", "systemPort","deviceName"})
	@Test(description="This is simple test",groups = { "smoke", "regression","MobileApplication" })
	public void FlipKartLogin() throws InterruptedException{
		AndroidHomePage homePage = new AndroidHomePage();
		homePage.Login();
		
	}

	
}