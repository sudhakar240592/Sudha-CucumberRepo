package com.runner.com;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.FunctionalLibraries.Base;
import com.util.JvmReport;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/com/features/com/Facebook.feature",
					 glue= {"com.adactinStepDef","com.hooks.com"},
					 monochrome=true,
					 dryRun =false,
					 tags= {"@smoke"},
					 plugin = {"pretty", "html:resource/com/report/cucumber-report.html",
									   "junit:resource/com/report/cucumber-report.xml",
									    "json:resource/com/report/cucumber-report.json"})


	public class FacebookTest extends Base {
		public static WebDriver driver;
		@Test
		@BeforeClass
		public static void launchingBrowser() throws Throwable {
			launchBrowser("chrome");
		}
		
		@AfterClass
		
		public static void tearTest() {
			JvmReport.getReport();
			terminteBrowser();
		}
	
		
}
