package com.CucumberFramework.stepDefinitions;

import org.apache.log4j.Logger;

import com.CucumberFramework.pageObjects.EribankPaymentPage;
import com.CucumberFramework.supportLibraries.DriverManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;

public class EribankPayment extends MasterStepDefs {

	static Logger log = Logger.getLogger(EribankPayment.class);
	@SuppressWarnings("rawtypes")
	AppiumDriver driver = DriverManager.getAppiumDriver();

	@When("^I click Make Payment$")
	public void i_click_Make_Payment() throws Throwable {
		driver.findElement(EribankPaymentPage.makePayment).click();
	}

	@When("^I enter Phone number as \"([^\"]*)\" name as \"([^\"]*)\" Amount as \"([^\"]*)\"$")
	public void i_enter_Phone_number_as_name_as_Amount_as(String phone,
			String name, String amount) throws Throwable {
		driver.findElement(EribankPaymentPage.phone).sendKeys(phone);
		driver.findElement(EribankPaymentPage.name).sendKeys(name);
		driver.findElement(EribankPaymentPage.amount).sendKeys(amount);
	}

	@Then("^I select country as \"([^\"]*)\"$")
	public void i_select_country_as(String country) throws Throwable {
		driver.findElement(EribankPaymentPage.country).sendKeys(country + "\n");
	}

	@Then("^click Send Payment$")
	public void click_Send_Payment() throws Throwable {
		driver.findElement(EribankPaymentPage.sendPayment).click();
		driver.findElement(EribankPaymentPage.confirmPayment).click();
		driver.navigate().back();
	}
}
