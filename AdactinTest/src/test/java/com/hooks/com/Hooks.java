package com.hooks.com;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.FunctionalLibraries.Base;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends Base{

	public static Scenario scenario; 
	
@Before
public void beforeHook(Scenario sce) {
scenario = sce;
System.out.println("Before Hook");
}
@After
public void afterHook(Scenario sce) {
if(sce.isFailed()) {
	TakesScreenshot ts = (TakesScreenshot)driver;
byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
scenario.embed(screenshotAs, "image/png");
}
System.out.println("After Hook");
}

}
