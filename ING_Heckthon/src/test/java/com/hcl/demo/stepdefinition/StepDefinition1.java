package com.hcl.demo.stepdefinition;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import com.hcl.demo.basepage.HomePageBase;
import com.hcl.demo.pages.SavingAcceleratorPage;
import com.hcl.demo.utilities.ReadData_Property;
import com.hcl.demo.utilities.ScreenShot;

import cucumber.api.java.en.*;

public class StepDefinition1{
	

	

@Given("I want to open the browser and navigate to ING URL")
public void i_want_to_open_the_browser_and_navigate_to_ING_URL() throws Exception {
	
	HomePageBase base = new HomePageBase();
	initialization();
}
     


@When("Fill up the the details and contiue")
public void fill_up_the_the_details_and_contiue() throws Exception {
	
	
   SavingAcceleratorPage home=new SavingAcceleratorPage(driver);
   home.FillDetails();
   home.SubmitApplication();
}
@Then("I validate the outcomes")
public void i_validate_the_outcomes() throws Exception {
	String tcn = ReadData_Property.getproper("tcn");
	//ScreenShot.GetScreenShot(driver, tcn);
    driver.quit();
    
}


	
}