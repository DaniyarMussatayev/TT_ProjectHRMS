package com.syntaxx.stepDefinitions;

import org.junit.Assert;

import com.syntaxx.utils.CommonMethods;
import com.syntaxx.utils.ConfigsReader;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinitions extends CommonMethods {

	@When("login with valid credentials")
	public void login_with_valid_credentials() {
		login.loginToHrms(ConfigsReader.getPropValue("username"), ConfigsReader.getPropValue("password"));
	}

	@Then("verify the dashboard logo is displayed")
	public void verify_the_dashboard_logo_is_displayed() {
		Assert.assertTrue(dash.welcome.isDisplayed());
	}

}
