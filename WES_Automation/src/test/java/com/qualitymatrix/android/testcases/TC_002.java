package com.qualitymatrix.android.testcases;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qualitymatrix.android.screens.AndroidHomePage;
import com.qualitymatrix.listeners.SuiteEvent;
import com.qualitymatrix.listeners.WebEvent;

@Listeners({ SuiteEvent.class, WebEvent.class })
public class TC_002 {

	@Test(groups = { "regression", "MobileApplication" })
	public void test() throws InterruptedException {
		AndroidHomePage homePage = new AndroidHomePage();
		homePage.invalidLogin();
		
	}

}