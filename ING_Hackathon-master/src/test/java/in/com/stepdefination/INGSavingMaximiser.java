package in.com.stepdefination;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ing.com.baseclass.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class INGSavingMaximiser extends TestBase
{

	@Given("Launch the given URL")
	public void launch_the_given_URL() throws IOException 
	{
		startApp();
		System.out.println("url launch suceessfully");

	}

	@When("Navigate to new Customer form in Savings Maximiser")
	public void navigate_to_new_Customer_form_in_Savings_Maximiser() 
	{
		WebElement bankAndSave = driver.findElement(By.xpath("(//div[@class='title-container'])[1]"));
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(bankAndSave));
		bankAndSave.click();
		driver.findElement(By.xpath("//*[contains(text(), 'Personal Savings')]")).click();;
		driver.findElement(By.xpath("//*[@id='menu-personal-savings']/ul/li[2]/a/div/p")).click();
		driver.findElement(By.xpath("//*[contains(text(), 'Open now')]")).click();
		driver.findElement(By.linkText("New customer")).click();
		WebElement rb=driver.findElement(By.cssSelector("input[value='Single']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", rb);
		driver.findElement(By.cssSelector("[aria-label='Nationality (Citizenship)']")).sendKeys("India",Keys.DOWN,Keys.ENTER);
		driver.findElement(By.cssSelector("[id='titleDropdown_targetInput']")).click();	
		driver.findElement(By.cssSelector("#titleDropdown_listboxitem0")).sendKeys("mr",Keys.ENTER);
		driver.findElement(By.cssSelector("[aria-describedby='firstName_validationErrorSpan']")).sendKeys("First name");
		driver.findElement(By.cssSelector("[aria-describedby='middleName_validationErrorSpan']")).sendKeys("Middile name");
		driver.findElement(By.cssSelector("[aria-describedby='surName_validationErrorSpan']")).sendKeys("Sur name");
		driver.findElement(By.cssSelector("[aria-describedby='desktopInput_validationErrorSpan']")).sendKeys("02/05/1980");
		driver.findElement(By.cssSelector("[aria-describedby='placeOfBirth_validationErrorSpan']")).sendKeys("Bangalore");
		driver.findElement(By.cssSelector("[aria-label='Country of birth']")).sendKeys("India",Keys.DOWN,Keys.ENTER);
		driver.findElement(By.cssSelector("[aria-describedby='emailAddress_validationErrorSpan']")).sendKeys("dummymail@gmail.com");
		driver.findElement(By.cssSelector("[aria-describedby='mobilePhoneInput_validationErrorSpan']")).sendKeys("0431231233");
		driver.findElement(By.cssSelector("[aria-describedby='otherPhoneInput_validationErrorSpan']")).sendKeys("0431231234");
		driver.findElement(By.cssSelector("[aria-label='Enter address']")).sendKeys("65 martin", Keys.DOWN,Keys.ENTER);
		driver.findElement(By.cssSelector("[for='template-checkbox-sameAsResidential_checkbox']")).click();
		driver.findElement(By.cssSelector("label[for='greaterThanThree']")).click();
		driver.findElement(By.cssSelector("label[for='taxResidencyYes']")).click();
		driver.findElement(By.cssSelector("[aria-describedby='securityQuestion_validationErrorSpan']")).sendKeys("maiden name");
		driver.findElement(By.cssSelector("#continueButton")).click();


	}

	@When("Fill the form")
	public void fill_the_form() 
	{
		System.out.println("333333333333");

	}

	@Then("Form should be submitted successfully.")
	public void form_should_be_submitted_successfully() 
	{
		System.out.println("333333333333");

	}


}
