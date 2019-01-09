package com.CucumberFramework.stepDefinitions;

import org.apache.log4j.Logger;

import com.CucumberFramework.pageObjects.EribankLoginPage;
import com.CucumberFramework.supportLibraries.DriverManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class EribankLogin extends MasterStepDefs {

	static Logger log = Logger.getLogger(EribankLogin.class);
	@SuppressWarnings("rawtypes")
	AppiumDriver driver = DriverManager.getAppiumDriver();

	@Given("^I launch eribank$")
	public void i_launch_eribank() throws Throwable {
		System.out.println("LAUNCHED");
	}

	@When("^I enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_enter_and(String userName, String password) throws Throwable {
		driver.findElement(EribankLoginPage.userName).sendKeys(userName);
		driver.findElement(EribankLoginPage.password).sendKeys(password);
	}

	@Then("^I click LOGIN$")
	public void i_click_LOGIN() throws Throwable {
		driver.findElement(EribankLoginPage.login).click();
	}

	@Then("^I click LOGOUT$")
	public void i_click_LOGOUT() throws Throwable {
		driver.findElement(EribankLoginPage.logout).click();
	}
}
