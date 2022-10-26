package com.qualitymatrix.web.utilities;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qualitymatrix.utilities.DriverFactory;
import com.qualitymatrix.utilities.ReportManager;

public class WebActions {

	JavascriptExecutor javascriptExecutor = (JavascriptExecutor) DriverFactory.getInstance().getWebDriver();
	Actions action = new Actions(DriverFactory.getInstance().getWebDriver());

	WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getWebDriver(), 60);

	/**
	 * =============================================================================
	 * Method: waitForVisible | Author: Rajesh Buddha | Date:16 Jan 2020 |
	 * Description: This method wait for element it will check every 5 sec its
	 * present or not until 60 sec | Parameters: locator | Return: element
	 * =============================================================================
	 */
	public WebElement waitForClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}

	/**
	 * =============================================================================
	 * Method: waitForVisible | Author: Rajesh Buddha | Date:16 Jan 2020 |
	 * Description: This method wait for element it will check every 5 sec its
	 * present or not until 60 sec | Parameters: locator | Return: element
	 * =============================================================================
	 */
	public void waitForPagetoLoadComplete() {
		JavascriptExecutor j = (JavascriptExecutor) DriverFactory.getInstance().getWebDriver();
		j.executeScript("return document.readyState").toString().equals("complete");
	}

	/**
	 * =============================================================================
	 * Method: waitForVisible | Author: Rajesh Buddha | Date:16 Jan 2020 |
	 * Description: This method wait for element it will check every 5 sec its
	 * present or not until 60 sec | Parameters: locator | Return: element
	 * =============================================================================
	 */
	public WebElement waitForVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * =============================================================================
	 * Method: waitForVisible | Author: Rajesh Buddha | Date:16 Jan 2020 |
	 * Description: This method wait for element it will check every 5 sec its
	 * present or not until 60 sec | Parameters: locator | Return: element
	 * =============================================================================
	 */
	public WebElement waitForVisibleGivenTime(By locator, int time) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getInstance().getWebDriver(), time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	/**
	 * =============================================================================
	 * Method: openURL | Author: Rajesh Buddha | Date:16 Jan 2020 | Description:
	 * This method open url | Parameters: URL | Return: none
	 * =============================================================================
	 */
	public void openURL(String URL) {
		DriverFactory.getInstance().getWebDriver().get(URL);
		DriverFactory.getInstance().getWebDriver().getCurrentUrl();
		ReportManager.logInfo("Successfully Entered URL - " + "<b style=\"color:green;\">" + URL + "</b>");
		System.out.println("Successfully Entered URL - " + URL);
	}

	/**
	 * =============================================================================
	 * Method: Click | Author: Rajesh Buddha | Date:16 Jan 2020 | Description: This
	 * method click on element | Parameters: locator, info | Return: none
	 * =============================================================================
	 * 
	 * @throws IOException
	 */
	public void Click(By locator, String info) throws IOException {
		WebElement elm = waitForClickable(locator);
		elm.click();
		ReportManager.logScreenshot();
		ReportManager.logInfo("Successfully clicked on - " + "<b style=\"color:green;\">" + info + "</b>");
		System.out.println("Successfully clicked on - " + "<b style=\"color:green;\">" + info + "</b>");
	}

	/**
	 * =============================================================================
	 * Method: Click | Author: Rajesh Buddha | Date:16 Jan 2020 | Description: This
	 * method click on element | Parameters: locator, info | Return: none
	 * =============================================================================
	 * 
	 * @throws IOException
	 */
	public void ClickJSE(By locator, String info) throws IOException {
		WebElement elm = waitForClickable(locator);
		ReportManager.logScreenshot();
		javascriptExecutor.executeScript("arguments[0].click();", elm);
		ReportManager.logInfo("Successfully clicked on - " + "<b style=\"color:green;\">" + info + "</b>");
		System.out.println("Successfully clicked on - " + "<b style=\"color:green;\">" + info + "</b>");
	}

	/**
	 * =============================================================================
	 * Method: sendKeys | Author: Rajesh Buddha | Date:16 Jan 2020 | Description:
	 * This method enter text input text using element | Parameters: locator, text |
	 * Return: none
	 * =============================================================================
	 * 
	 * @throws IOException
	 */
	public void sendKeys(By locator, String text, String inputBoxName) throws IOException {
		WebElement elm = waitForVisible(locator);
		elm.click();
		elm.sendKeys(text);
		ReportManager.logScreenshot();
		ReportManager.logInfo(inputBoxName + "Successfully Entered text " + inputBoxName
				+ " - <b style=\"color:green;\">" + text + "</b>");
		System.out.println("Successfully Entered text - " + "<b style=\"color:green;\">" + text + "</b>");
	}

	public void sendKeysJSE(By locator, String text, String inputBoxName) throws IOException {
		WebElement elm = waitForVisible(locator);
		javascriptExecutor.executeScript("arguments[0].click();", elm);
		elm.sendKeys(text);
		ReportManager.logScreenshot();
		ReportManager
				.logInfo("Successfully Entered text " + inputBoxName + " - <b style=\"color:green;\">" + text + "</b>");
		System.out.println("Successfully Entered text - " + "<b style=\"color:green;\">" + text + "</b>");
	}

	/**
	 * =============================================================================
	 * Method: sendKeys | Author: Rajesh Buddha | Date:16 Jan 2020 | Description:
	 * This method enter text input text using element | Parameters: locator, text |
	 * Return: none
	 * =============================================================================
	 * 
	 * @throws IOException
	 */
	public void sendKeyswithoutClick(By locator, String text, String inputBoxName) throws IOException {
		WebElement elm = waitForVisible(locator);
		elm.sendKeys(text);
		ReportManager.logScreenshot();
		ReportManager.logInfo(inputBoxName + "Successfully Entered text " + inputBoxName
				+ " - <b style=\"color:green;\">" + text + "</b>");
		System.out.println("Successfully Entered text - " + "<b style=\"color:green;\">" + text + "</b>");
	}

	/**
	 * =============================================================================
	 * Method: fileUploadsendKeys | Author: Rajesh Buddha | Date:16 Jan 2020 |
	 * Description: This method upload file | Parameters: locator, text | Return:
	 * none
	 * =============================================================================
	 * 
	 * @throws IOException
	 */
	public void fileUploadusingRobot(By locator, String path) throws AWTException, InterruptedException, IOException {
		WebElement elm = waitForVisible(locator);
		Thread.sleep(2000);
		File f = new File(path); // file name will be entered by user at runtime
		// System.out.println(f.exists()); //will print "true" if the file name given by
		// user exists, false otherwise

		if (f.exists()) {
			// javascriptExecutor.executeScript("arguments[0].click();", elm);
			ClickJSE(locator, "");
			elm.click();
			System.out.println("File exists at give path");
			StringSelection ss = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); // copy the above string to clip
																					// board
			Robot robot;
			robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(2000);
			robot.keyRelease(KeyEvent.VK_CONTROL); // paste the copied string into the dialog box
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER); // enter
		}

	}

	/**
	 * =============================================================================
	 * Method: fileUploadsendKeys | Author: Rajesh Buddha | Date:16 Jan 2020 |
	 * Description: This method upload file | Parameters: locator, text | Return:
	 * none
	 * =============================================================================
	 * 
	 * @throws IOException
	 */
	public void fileUploadusingRobotwithoutClick(String path) throws AWTException, InterruptedException, IOException {

		Thread.sleep(2000);
		File f = new File(path); // file name will be entered by user at runtime
		// System.out.println(f.exists()); //will print "true" if the file name given by
		// user exists, false otherwise

		if (f.exists()) {

			System.out.println("File exists at give path");
			StringSelection ss = new StringSelection(path);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null); // copy the above string to clip
																					// board
			Robot robot;
			robot = new Robot();
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(2000);
			robot.keyRelease(KeyEvent.VK_CONTROL); // paste the copied string into the dialog box
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER); // enter
		}

	}

	/**
	 * =============================================================================
	 * Method: sendKeysfromKeyboard | Author: Rajesh Buddha | Date:16 Jan 2020 |
	 * Description: This method will keyboard actions | Parameters: locator, text |
	 * Return: none
	 * =============================================================================
	 */
	public void sendKeysfromKeyboard(By locator, Keys keyboardAction) {
		WebElement elm = waitForVisible(locator);
		elm.sendKeys(keyboardAction);
		ReportManager.logInfo("Successfully Entered keyboardAction - " + keyboardAction);
		System.out.println("Successfully Entered keyboardAction - " + keyboardAction);
	}

	public String getElmText(By locator) {
		WebElement elm = waitForVisible(locator);
		String elamText = elm.getText();
		ReportManager.logInfo("Successfully get element text - " + "<b style=\"color:green;\">" + elamText + "</b>");
		System.out.println("Successfully get element text - " + "<b style=\"color:green;\">" + elamText + "</b>");
		return elamText;
	}

	public void scrollUp() {
		JavascriptExecutor js = (JavascriptExecutor) javascriptExecutor;
		js.executeScript("window.scrollBy(0,0)");
	}

	public boolean isDisplayed(By locator, String info) {
		WebElement elm = waitForVisible(locator);
		boolean isPresent = elm.isDisplayed();
		if (isPresent) {
			ReportManager.logInfo("Successfully element displayed: " + "<b style=\"color:green;\">" + info + "</b>");
			System.out.println("Successfully element displayed: " + "<b style=\"color:green;\">" + info + "</b>");
		} else {
			ReportManager.logInfo("element not displayed: " + "<b style=\"color:green;\">" + info + "</b>");
			System.out.println("element not displayed: " + info);
		}
		return isPresent;
	}

	public boolean isEnabled(By locator, String info) {
		WebElement elm = waitForVisible(locator);
		boolean isPresent = elm.isEnabled();
		if (isPresent) {
			ReportManager.logInfo("Successfully element displayed: " + "<b style=\"color:green;\">" + info + "</b>");
			System.out.println("Successfully element displayed: " + "<b style=\"color:green;\">" + info + "</b>");
		} else {
			ReportManager.logInfo("element not displayed: " + "<b style=\"color:green;\">" + info + "</b>");
			System.out.println("element not displayed: " + "<b style=\"color:green;\">" + info + "</b>");
		}
		return isPresent;
	}

	public void clearAndSendKeys(By locator, String text) {
		WebElement elm = waitForVisible(locator);
		elm.clear();
		elm.sendKeys(text);
		ReportManager.logInfo("Successfully Entered text - " + "<b style=\"color:green;\">" + text + "</b>");
		System.out.println("Successfully Entered text - " + "<b style=\"color:green;\">" + text + "</b>");
	}

	public void verifyText(String actualText, String expectedText) {
		ReportManager.logInfo("Actual Text - " + "<b style=\"color:green;\">" + actualText + "</b>  " + " matched with "
				+ "  Expected Text - " + "<b style=\"color:green;\">" + expectedText + "</b>");
		// ReportManager.logInfo("Expected Text - " + "<b style=\"color:green;\">" +
		// expectedText + "</b>");
		System.out.println("Actual Text - " + actualText);
		System.out.println("Expected Text - " + expectedText);
		assertEquals(expectedText, actualText);
	}

	public void verifyIntValues(int actualValue, int expectedValue) {
		ReportManager.logInfo("Actual Value - " + actualValue);
		ReportManager.logInfo("Expected Value - " + expectedValue);
		System.out.println("Actual Value - " + actualValue);
		System.out.println("Expected Value - " + expectedValue);
		assertEquals(actualValue, expectedValue);
	}

	public String getAttributeValue(By locator, String name) {
		WebElement elm = waitForVisible(locator);
		String attributeText = elm.getAttribute(name);
		ReportManager.logInfo("Successfully get attribute text - " + attributeText);
		System.out.println("Successfully get attribute text - " + attributeText);
		return attributeText;
	}

	public boolean isScrollPresent() throws Exception {
		String execScript = "return document.documentElement.scrollHeight>document.documentElement.clientHeight;";
		Boolean isScroll_Present = (Boolean) (javascriptExecutor.executeScript(execScript));
		return isScroll_Present;

	}

	public void scrollDownUsingJS() {

		javascriptExecutor.executeScript(
				"window.scrollBy(0,document.body.scrollHeight || document.documentElement.scrollHeight)", "");
	}

	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) javascriptExecutor;
		js.executeScript("window.scrollBy(0,500)");
	}

	public void mouseHover(By locator) throws Exception {
		WebElement elm = waitForVisible(locator);
		action.moveToElement(elm).build().perform();
		String elmText = elm.getText();
		ReportManager.logInfo("Successfully mouse hover and get text - " + elmText);
		System.out.println("Successfully mouse hover and get text - " + elmText);
	}

	public void switchToFrame(By locator) throws Exception {
		WebElement elm = waitForVisible(locator);
		DriverFactory.getInstance().getWebDriver().switchTo().frame(elm);
		ReportManager.logInfo("Successfully switched to frame ");
		System.out.println("Successfully switched to frame ");
	}

	public List<WebElement> getListofElements(By locator, String name) {
		//waitForVisible(locator);
		List<WebElement> lst_Elements = DriverFactory.getInstance().getWebDriver().findElements(locator);
		//ReportManager.logInfo("Successfully get element size - " + lst_Elements.size());
		System.out.println("Successfully get element size - " + lst_Elements.size());
		return lst_Elements;
	}

	public void selectByVisibleText(By locator, String value, String dd_text) {
		WebElement elm = waitForVisible(locator);
		Select sel = new Select(DriverFactory.getInstance().getWebDriver().findElement(locator));
		sel.selectByVisibleText(value);
		ReportManager.logInfo("Successfully selected" + dd_text + "dropdown value - " + "<b style=\"color:green;\">"
				+ value + "</b>");

	}

	public void switchTab() {
		String MainWindow = DriverFactory.getInstance().getWebDriver().getWindowHandle();
		String currentHandle = "";
		Set<String> win = DriverFactory.getInstance().getWebDriver().getWindowHandles();
		System.out.println(win.size());
		Iterator<String> it = win.iterator();
		if (win.size() > 1) {
			while (it.hasNext()) {
				String handle = it.next();
				if (!handle.equalsIgnoreCase(MainWindow)) {
					DriverFactory.getInstance().getWebDriver().switchTo().window(handle);
					currentHandle = handle;
				}
			}
		} else {
			System.out.println("Unable to switch");
		}
	}

	public void switchDefaultWindow() {

		DriverFactory.getInstance().getWebDriver().switchTo().defaultContent();

	}

	public void moveToElement(By locator) {
		WebElement elm = waitForVisible(locator);
		action.moveToElement(elm);
	}

	public void doubleClick(By locator) {
		WebElement elm = waitForVisible(locator);
		action.doubleClick(elm);
	}

	public void pressEnterKeyFromKeyboard() throws Exception {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);
	}

}
