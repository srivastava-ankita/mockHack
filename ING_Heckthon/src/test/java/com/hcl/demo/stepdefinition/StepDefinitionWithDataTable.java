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


public class StepDefinitionWithDataTable{
	

	@Given("I Open the ChromeBrowser and invoke the URL")
	public void i_want_to_Open_the_Chrome_Brow_and_invoke_the_URL() throws Exception {
		
		HomePageBase.driverInitialization();
	}

	@When("I complete the account creation form with below details and click on continue button")
	public void i_complete_the_account_open_Form_details(DataTable dataTable) throws Exception {
		
		//Fetch data from data table
		SavingAcceleratorPage sapObject=new SavingAcceleratorPage(HomePageBase.driver);
		       
				//st<MapSString,String>> list =dataTable.asMaps(String.class,String.class);
		List<Map<String,String>> list=dataTable.asMaps(String.class,String.class);
		//stem.out.println(list);
	    //SavingAcceleratorPage sapObject=new SavingAcceleratorPage(HomePageBase.driver);
		sapObject.fillDetailsInSAP(list);
		sapObject.clickOnContinueButton();
	}

	@Then("Verify Successful Navigation to next page")
	public void verify_successful_navigation_to_next_page() throws Exception {
		SavingAcceleratorPage sapObject=new SavingAcceleratorPage(HomePageBase.driver);
		if(sapObject.getNextStepsButton().isDisplayed())
		{
			
		}
		else
		{
			Assert.fail();
		}
		String tcn = ReadData_Property.getproper("tcn");
		//ScreenShot.GetScreenShot(driver, tcn);
		HomePageBase.driver.quit();
	}


}
