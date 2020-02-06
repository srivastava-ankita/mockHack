package StepDefinition;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utils.FactoryUtility;
import Utils.Screenshots;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class INGAustraliaStepDefinition  extends AbstractStepDefinition

{

	WebDriver driver = getDriver();
	private Scenario scenario;

	/*@Then("close browser")
	public void close_browser() throws IOException {
	
	    String pageText=driver.findElement(By.xpath("//h1[text()='Open a Savings Accelerator']")).getText();
        Assert.assertEquals("Open a Savings Accelerator", pageText); 
        Screenshots.GetScreenShot(driver, "TC_NewCustomerPage");
	   
	   
	}*/
  

	@Then("Entering the details")
	public void Entering_the_details() throws IOException {
	
		/*
		 * String pageText=driver.findElement(By.
		 * xpath("//h1[text()='Open a Savings Accelerator']")).getText();
		 * Assert.assertEquals("Open a Savings Accelerator", pageText);
		 * Screenshots.GetScreenShot(driver, "TC_NewCustomerPage");
		 * 
		 * FactoryUtility.
		 * selectRadioButtonResponses("Single,Female,Three or more years,Yes", driver);
		 * driver.findElement(By.xpath
		 * ("//input[@aria-label='Nationality (Citizenship)']")).sendKeys("India");
		 * 
		 * driver.findElement(By.xpath("//*[@id='dropMenuItem']/div/paper-item[1]")).
		 * click();
		 * 
		 */
	}
	
}
