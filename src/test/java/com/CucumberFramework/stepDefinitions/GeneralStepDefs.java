package com.CucumberFramework.stepDefinitions;

import static org.testng.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import com.CucumberFramework.supportLibraries.DriverManager;
import com.CucumberFramework.supportLibraries.Util;

import cucumber.api.java.en.Given;

public class GeneralStepDefs extends MasterStepDefs {

	static Logger log = Logger.getLogger(LoginStepDefs.class);
	WebDriver driver = DriverManager.getWebDriver();

	@Given("^I am in the login page of the application$")
	public void i_am_in_login_page() {
		driver.get("http://newtours.demoaut.com");

		currentScenario.embed(Util.takeScreenshot(driver),
				"image/png");

		assertTrue(driver.getTitle().contains("Welcome")
				|| driver.getTitle().contains("Sign-on"));
	}
}