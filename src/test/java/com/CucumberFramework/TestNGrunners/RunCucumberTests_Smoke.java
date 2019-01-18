package com.CucumberFramework.TestNGrunners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import com.CucumberFramework.supportLibraries.TimeStamp;
import com.CucumberFramework.supportLibraries.Util;
import com.github.mkolisnyk.cucumber.reporting.CucumberDetailedResults;
import com.github.mkolisnyk.cucumber.reporting.CucumberResultsOverview;
import com.github.mkolisnyk.cucumber.runner.ExtendedCucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@ExtendedCucumberOptions(

		jsonReport = "target/cucumber-report/Smoke/cucumber.json", jsonUsageReport = "target/cucumber-report/Smoke/cucumber-usage.json", outputFolder = "target/cucumber-report/Smoke", detailedReport = true, detailedAggregatedReport = true, overviewReport = true, usageReport = true)

/**
 * Please notice that com.CucumberFramework.stepDefinations.CukeHooks class is in
 * the same package as the steps definitions. It has two methods that are
 * executed before or after scenario. I'm using it to delete cookies and take a
 * screenshot if scenario fails.
 */
@CucumberOptions(

		features = "src/test/resources/features", glue = { "com.CucumberFramework.stepDefinitions" }, tags = {
				"@Feature1" }, monochrome = true, plugin = { "pretty", "pretty:target/cucumber-report/Smoke/pretty.txt",
						"html:target/cucumber-report/Smoke", "json:target/cucumber-report/Smoke/cucumber.json",
						"junit:target/cucumber-report/Smoke/cucumber-junitreport.xml",
						"ru.yandex.qatools.allure.cucumberjvm.AllureReporter" })

public class RunCucumberTests_Smoke extends AbstractTestNGCucumberTests {

	@AfterTest
	private void test() {
		generateCustomReports();
		copyReportsFolder();
	}

	private void generateCustomReports() {

		CucumberResultsOverview overviewReports = new CucumberResultsOverview();
		overviewReports.setOutputDirectory("target");
		overviewReports.setOutputName("cucumber-results");
		overviewReports.setSourceFile("target/cucumber-report/Smoke/cucumber.json");
		try {
			overviewReports.executeFeaturesOverviewReport();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		CucumberDetailedResults detailedResults = new CucumberDetailedResults();
        detailedResults.setOutputDirectory("target");
        detailedResults.setOutputName("cucumber-results");
        detailedResults
                     .setSourceFile("target/cucumber-report/Smoke/cucumber.json");
        detailedResults.setScreenShotLocation("./screenshot");
        try {
               detailedResults.executeDetailedResultsReport(false, true);
        } catch (Exception e) {

               e.printStackTrace();
        }

	}

	private void copyReportsFolder() {

		String timeStampResultPath = TimeStamp.getInstance();

		File sourceCucumber = new File(Util.getTargetPath());

		File destCucumber = new File(timeStampResultPath);

		try {
			FileUtils.copyDirectory(sourceCucumber, destCucumber);
			try {
				FileUtils.cleanDirectory(sourceCucumber);
			} catch (Exception e) {

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		TimeStamp.reportPathWithTimeStamp = null;

	}

	@AfterSuite
	private void copyStoredReports() {
		// Any customizations after execution can be added here
	}

}