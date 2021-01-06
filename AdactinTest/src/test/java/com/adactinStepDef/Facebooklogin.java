package com.adactinStepDef;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import com.FunctionalLibraries.Base;
import com.util.JvmReport;
import com.util.SingletonManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Facebooklogin extends Base {

	SingletonManager sm1 = new SingletonManager();
	
	@Given("^user navigate to the site$")
	public void user_navigate_to_the_site() throws Throwable {
		launchUrl("https://www.facebook.com/");
		implicit();

	}

	@When("^submits username and password$")
	public void submits_username_and_password() throws Throwable {
		explicit(sm1.getFb().getUsername());
		sendValues(sm1.getFb().getUsername(), "katrina.sudha@gmail.com");
		sendValues(sm1.getFb().getPassword(), "Sidhere92$$");

	}

	@When("^clicks enter to login$")
	public void clicks_enter_to_login() throws Throwable {
		click(sm1.getFb().getLogin());
	}

	@Then("^checks the username matches or not$")
	public void checks_the_username_matches_or_not() throws Throwable {
		String s =sm1.getFb().getVerifyname().getText();
		String expected="Sudhakar Maheswaran";
		if(s==expected) {
			System.out.println("Username Matched");
		}

	}
}
