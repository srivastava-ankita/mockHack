package com.ing.test;

import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;

import Utils.ReadData_Property;
import Utils.ScreenShot;
import baseTest.BaseTest;
import cucumber.api.java.en.*;
import pages.HomePage;

public class StepDefinition1  extends BaseTest{
	

	

@Given("I want to open the browser and navigate to ING URL")
public void i_want_to_open_the_browser_and_navigate_to_ING_URL() throws Exception {
	
	BaseTest base = new BaseTest();
	initialization();
}
     


@When("Fill up the the details and contiue")
public void fill_up_the_the_details_and_contiue() throws Exception {
	
	
   HomePage home=new HomePage(driver);
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