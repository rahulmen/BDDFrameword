package com.CucumberFramework.pageObjects;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;

import com.CucumberFramework.stepDefinitions.MasterStepDefs;
import com.CucumberFramework.supportLibraries.DriverManager;

import io.appium.java_client.AppiumDriver;


public class LoginPage extends MasterStepDefs {

	static Logger log = Logger.getLogger(LoginPage.class);

	// Validating
	public static final String notificationPage = "//*[@value=\"“ManulifeMOVE” Would Like to Send You Notifications\"]";
	public static final String allowButton = "//*[@label=\"Allow\"]";
	public static final String continueEnglishBtn = "//*[@label='Continue with English']";
	public static final String moveWelcomePage = "//*[@label='lbl_copyText1']";
	public static final String dashBoardTab = "//*[@label=\"Dashboard\"]";
	public static final String loginpgDash = "//*[@label='Create your MOVE account']";
	public static final String updateaviMsg = "//*[@value='Update available']";

	// buttons
	public static final String settingsButton = "//*[@label=\"Settings\"]";
	public static final String logoutButton = "//UIAButton[@label='Log Out']";
	public static final String loginButton = "//*[@label='Log In']";
	public static final String updateaviignore = "//*[@label='Ignore']";

	// textFields
	public static final String moveID = "//*[@value='MOVE ID']";
	public static final String movePassword = "//*[@value='Password']";

	/*@SuppressWarnings("rawtypes")
	AppiumDriver driver = DriverManager.getAppiumDriver();
	*/
	/*public void login(String userName, String password) {
		//SeleniumTestParameters testParameters = DriverManager.getTestParameters();
		driver.context("NATIVE_APP");
		try {
			if (driver.findElement(By.xpath(LoginPage.updateaviMsg))
					.isDisplayed())
				driver.findElement(By.xpath("//*[@label='Ignore']")).click();
		} catch (Exception e) {
			log.error("Login Page coudln't be located" + e.getMessage());
		}

		try {
			driver.findElementByXPath(LoginPage.loginButton).click();
			driver.findElementByXPath(LoginPage.moveID).sendKeys(userName);
			driver.findElementByXPath(LoginPage.movePassword)
					.sendKeys(password);
			driver.findElementByXPath(LoginPage.loginButton).click();
		} catch (Exception e) {
			log.error("Unable to login " + e.getMessage());
		}
	}*/

}
