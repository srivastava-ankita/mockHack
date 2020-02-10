package com.hcl.demo.stepdefinition;

import java.util.List;
import java.util.Map;

import com.hcl.demo.basepage.HomePageBase;
import com.hcl.demo.pages.SavingAcceleratorPage;
import com.hcl.demo.utilities.ReadData_Property;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDefinitionWithDataTable {

	@Given("I Open the ChromeBrowser and invoke the URL")
	public void i_want_to_Open_the_Chrome_Brow_and_invoke_the_URL() throws Exception {

		HomePageBase.driverInitialization();
	}

	@When("I complete the account creation form with below details and click on continue button")
	public void i_complete_the_account_open_Form_details(DataTable dataTable) throws Exception {

		SavingAcceleratorPage sapObject = new SavingAcceleratorPage(HomePageBase.driver);
		// Fetch data from data table
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		sapObject.fillDetailsInSAP(list);
		sapObject.clickOnContinueButton();
	}

	@Then("Verify Successful Navigation to next page")
	public void verify_successful_navigation_to_next_page() throws Exception {
		SavingAcceleratorPage sapObject = new SavingAcceleratorPage(HomePageBase.driver);
		if (sapObject.getNextStepsButton().isDisplayed()) {
			System.out.println("User navigated successfully to next page");
		} 
		String tcn = ReadData_Property.getproper("tcn");
		// ScreenShot.GetScreenShot(driver, tcn);
		HomePageBase.driver.quit();
	}
	
	@Then("Verify unsuccessful navigation")
	public void verify_unsuccessful_navigation_to_next_page() throws Exception {
		SavingAcceleratorPage sapObject = new SavingAcceleratorPage(HomePageBase.driver);
		if (sapObject.getContinueButton().isDisplayed()) {
			System.out.println("User dint Navigate to next page");

		} 
		String tcn = ReadData_Property.getproper("tcn");
		// ScreenShot.GetScreenShot(driver, tcn);
		HomePageBase.driver.quit();
	}

}
