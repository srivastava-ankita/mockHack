package baseTest;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import Utils.ReadData_Property;
import baseTest.BaseTest;
import cucumber.api.java.en.*;
import pages.HomePage;
import io.cucumber.datatable.DataTable;

public class StepDefinitionWithDataTable extends BaseTest{
	
	@Given("I want to Open the Chrome Brow and invoke the URL")
	public void i_want_to_Open_the_Chrome_Brow_and_invoke_the_URL() throws Exception {
		BaseTest base = new BaseTest();
		initialization();
	}

	@When("I complete the account open Form details")
	public void i_complete_the_account_open_Form_details(DataTable dataTable) throws Exception {
		
		//Fetch data from data table
		       
				List<Map<String,String>> list =dataTable.asMaps(String.class,String.class);
				
				
		HomePage home=new HomePage(driver);
		   home.FillDetails();
		   home.SubmitApplication();
	}

	@Then("Submit and validate the details")
	public void submit_and_validate_the_details() throws Exception {
		String tcn = ReadData_Property.getproper("tcn");
		//ScreenShot.GetScreenShot(driver, tcn);
	    driver.quit();
	}


}
