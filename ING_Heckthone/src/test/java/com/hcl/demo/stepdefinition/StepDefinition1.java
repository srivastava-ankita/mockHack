package com.hcl.demo.stepdefinition;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;

import com.hcl.demo.basepage.HomePageBase;
import com.hcl.demo.pages.SavingAcceleratorPage;
import com.hcl.demo.utilities.ReadData_Property;
import com.hcl.demo.utilities.ScreenShot;

import cucumber.api.DataTable;
import cucumber.api.java.en.*;
import junit.framework.Assert;

public class StepDefinition1 {

	@Given("I want to open the browser and navigate to ING URL")
	public void i_want_to_open_the_browser_and_navigate_to_ING_URL() throws Exception {

		// HomePageBase base = new HomePageBase();
		HomePageBase.driverInitialization();
	}

	@When("Fill up the the details and contiue")
	public void fill_up_the_the_details_and_contiue(DataTable dataTable) throws Exception {

		SavingAcceleratorPage sapObject = new SavingAcceleratorPage(HomePageBase.driver);
		// Fetch data from data table
		List<Map<String, String>> list = dataTable.asMaps(String.class, String.class);
		sapObject.fillDetailsInSAP(list);
		sapObject.clickOnContinueButton();
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() throws Exception {
		SavingAcceleratorPage sapObject = new SavingAcceleratorPage(HomePageBase.driver);
		if (sapObject.getNextStepsButton().isDisplayed()) {

		} else {
			Assert.fail();
		}
		String tcn = ReadData_Property.getproper("tcn");
		// ScreenShot.GetScreenShot(driver, tcn);
		HomePageBase.driver.quit();

	}

}