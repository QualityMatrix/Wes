package com.qualitymatrix.desktop.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.qualitymatrix.desktop.screens.*;
import com.qualitymatrix.listeners.DesktopEvent;
import com.qualitymatrix.listeners.SuiteEvent;

@Listeners({SuiteEvent.class,DesktopEvent.class})
public class TC_001_Document_Protected_Using_Seclore_agent{

	DesktopHomePage desktopHomePage =  new DesktopHomePage();
	
	@Test(description="Protect desktop document using seclore agent",groups = { "smoke", "regression","DesktopApplication" })
	public void TC_001_Document_Protected_Using_Seclore_Agent() throws InterruptedException, AWTException, IOException, FindFailed{
		desktopHomePage.applicationProtected();
		
	}

	
}