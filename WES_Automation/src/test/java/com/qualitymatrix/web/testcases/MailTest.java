package com.qualitymatrix.web.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.qualitymatrix.utilities.DriverFactory;

public class MailTest {

	@Test
	public void test() throws FindFailed {
		Screen s = new Screen();
	
		Pattern fileInputTextBox = new Pattern("C:\\Users\\QM-Testing\\Documents\\POCs\\WES_Automation\\src\\test\\resources\\SikuliImages\\CitrixFolder.PNG");
		s.click(fileInputTextBox);
	
	}

}
