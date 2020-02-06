package StepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Utils.FactoryUtility;
import Utils.ReadData_Property;
import Utils.Screenshots;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition  extends AbstractStepDefinition {
	
	WebDriver driver =  getDriver();
	

	@Given(": Launch ChromeBrowser")
	public void launch_ChromeBrowser() throws FileNotFoundException, IOException {
		String envUrl = ReadData_Property.getproper("url");

		driver.get(envUrl);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@When(":Clicking the Savings Accelerator option")
	public void clicking_the_Savings_Accelerator_option() throws Exception {
driver.findElement(By.xpath("//span[contains(text(),'Save') and @class='title']")).click();
		
		driver.findElement(By.xpath("//span[contains(text(),'Personal Savings')]")).click();
	
	    driver.findElement(By.xpath("//*[(text()='Savings Accelerator')]")).click();
	    driver.findElement(By.xpath("//a[text()='Open now']")).click();
	    Screenshots.GetScreenShot(driver, "Saving Accelerator");
	    driver.findElement(By.xpath("//a[text()='New customer']")).click();
	}

	@Then(": Enter the details and close the browser")
	public void enter_the_details_and_close_the_browser() throws InterruptedException {
		FactoryUtility.selectRadioButtonResponses("Single,Female,Three or more years,Yes", driver);
        driver.findElement(By.xpath
                ("//input[@aria-label='Nationality (Citizenship)']")).sendKeys("India");
       
        driver.findElement(By.xpath("//*[@id='dropMenuItem']/div/paper-item[1]")).click();;

          
         driver.findElement(By.xpath("//input[@id='titleDropdown_targetInput']")).click();
         FactoryUtility.selectOption("Mr", driver);
         
         driver.findElement(By.xpath
                      ("//input[@aria-label='Given name']")).sendKeys("INDIA1");
         
         driver.findElement(By.xpath
                      ("//input[@aria-label='Middle name (if you have one)']")).sendKeys("INDIA2");
         driver.findElement(By.xpath
                      ("//input[@aria-label='Family name']")).sendKeys("INDIA3");
         driver.findElement(By.xpath("(//input[contains(@aria-label,'Date of birth')])[1]")).sendKeys("11/12/2008");;
  
         driver.findElement(By.xpath("//input[@aria-label='Place of birth']")).sendKeys("BANGALORE");
         
         driver.findElement(By.xpath("//input[@aria-label='Country of birth']")).sendKeys("INDIA");
            Actions act = new Actions(driver);
            act.sendKeys(Keys.TAB).build().perform();
            act.sendKeys(Keys.ENTER).build().perform();

         
         driver.findElement(By.xpath("//input[@aria-label='Email address']")).sendKeys("abc123@abc.com");
         
         driver.findElement(By.xpath("//input[@aria-label='Mobile']")).sendKeys("0412234567");
         
         driver.findElement(By.xpath("//input[@aria-label='Enter address']")).sendKeys("65 MARTIN");
         Thread.sleep(3000);
         act.sendKeys(Keys.TAB).build().perform();
            act.sendKeys(Keys.ENTER).build().perform();
         
         driver.findElement(By.xpath("//span[text()='Same as residential address']")).click();

         driver.findElement(By.xpath("//input[contains(@aria-label,'maiden name')]")).sendKeys("AMMA");

         driver.findElement(By.xpath("//span[text()='Continue']")).click();
    
         driver.quit(); 
	}

}
