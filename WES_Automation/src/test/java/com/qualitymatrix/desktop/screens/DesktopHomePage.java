package com.qualitymatrix.desktop.screens;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.qualitymatrix.desktop.utilities.DesktopActions;
import com.qualitymatrix.utilities.DriverFactory;
import com.qualitymatrix.utilities.ReportManager;

public class DesktopHomePage {

	DesktopActions desktopActions = new DesktopActions();

	public void applicationProtected() throws InterruptedException, AWTException, IOException, FindFailed {
		
		ReportManager.logInfo("Test started login");
		Thread.sleep(15000);
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_WINDOWS);
		rb.keyPress(KeyEvent.VK_D);
		Thread.sleep(15000);
		WebElement elm = DriverFactory.getInstance().getWindowDriver().findElement(By.name("M-Files Online (22.9.11816.9)"));
		Actions ac=new Actions(DriverFactory.getInstance().getWindowDriver());
		ac.moveToElement(elm).doubleClick().build().perform();
		Thread.sleep(25000);
		
		//DriverFactory.getInstance().getWindowDriver().findElement(By.xpath("//*[contains(@Name,'Order Line Items (1)')]")).click();
		DriverFactory.getInstance().getWindowDriver().findElement(By.id("//*[contains(@ProcessID,'27760')]")).click();
		
//		DriverFactory.getInstance().getWindowDriver().findElement(By.xpath("//*[contains(@Name,'Edit')]")).click();
//		DriverFactory.getInstance().getWindowDriver().findElement(By.xpath("//*[contains(@Name,'_profile")).click();
//		DriverFactory.getInstance().getWindowDriver().findElement(By.xpath("//*[contains(@Name,'Order Line Items (1)')]")).click();
		
		
		//*[contains(@LocalizedControlType, 'button')]
		//System.out.println(DriverFactory.getInstance().getWindowDriver().getPageSource());
	//	DriverFactory.getInstance().getWindowDriver().findElement(By.className("Edit")).click();
	//	DriverFactory.getInstance().getWindowDriver().findElement(By.id("4317")).click();
	//	Thread.sleep(10000);
	//DriverFactory.getInstance().getWindowDriver().findElement(By.xpath("//*[@AutomationId='_profile']")).click();
//		DriverFactory.getInstance().getWindowDriver().findElement(By.xpath("//*[@ClassName='Edit']")).click();
		
		
		//*[@AutomationId='4317']
		
		ReportManager.logScreenshotInfo1();
		
		
		
		
		
		
		
		
		
	}

}
