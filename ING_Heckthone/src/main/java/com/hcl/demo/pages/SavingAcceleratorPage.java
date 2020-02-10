package com.hcl.demo.pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.hcl.demo.basepage.HomePageBase;
import com.hcl.demo.utilities.Utility;

public class SavingAcceleratorPage extends HomePageBase {

	@FindBy(xpath = "//h1[text()='Open a Savings Accelerator']")
	private WebElement savingsAcceleratorText;

	@FindBy(xpath = "//span[text()='No Result']")
	private WebElement noResultSection;

	public WebElement getNoResultSection() {
		return noResultSection;
	}

	@FindBy(xpath = "//span[text()='Please try again - you need a valid country name']")
	private WebElement errorMessageAtNationality;

	public WebElement getErrorMessageAtNationality() {
		return errorMessageAtNationality;
	}

	public WebElement getSavingsAcceleratorText() {
		return savingsAcceleratorText;
	}

	@FindBy(xpath = "//input[@aria-label='Nationality (Citizenship)']")
	private WebElement nationality;
	@FindBy(xpath = "//button[@id='nextStepsButton']")
	private WebElement nextStepsButton;

	public WebElement getNextStepsButton() {
		return nextStepsButton;
	}

	public WebElement getNationality() {
		return nationality;
	}

	@FindBy(xpath = "//*[@id='dropMenuItem']/div/paper-item[1]")
	private WebElement dropMenuItems;

	public WebElement getDropMenuItems() {
		return dropMenuItems;
	}

	@FindBy(xpath = "//input[@id='titleDropdown_targetInput']")
	private WebElement titleDropDown;

	public WebElement getTitleDropDown() {
		return titleDropDown;
	}

	@FindBy(xpath = "//span[text()='Mr']")
	private WebElement salSelection;

	public WebElement getSalSelection() {
		return salSelection;
	}

	@FindBy(xpath = "//input[@aria-label='Given name']")
	private WebElement givenName;

	public WebElement getGivenName() {
		return givenName;
	}

	@FindBy(xpath = "//input[@aria-label='Middle name (if you have one)']")
	private WebElement middleName;

	public WebElement getMiddleName() {
		return middleName;
	}

	public WebElement getFamiltyName() {
		return familtyName;
	}

	public WebElement getDobTextBox() {
		return dobTextBox;
	}

	public WebElement getPlaceOfBirthTextBox() {
		return placeOfBirthTextBox;
	}

	public WebElement getCountryOfBirthTextBox() {
		return countryOfBirthTextBox;
	}

	public WebElement getEmailAddressTextbox() {
		return emailAddressTextbox;
	}

	public WebElement getMobileTextBox() {
		return mobileTextBox;
	}

	public WebElement getAddressTextBox() {
		return addressTextBox;
	}

	public WebElement getSameasResidentialCheckbox() {
		return sameasResidentialCheckbox;
	}

	public WebElement getMaidenName() {
		return maidenName;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	@FindBy(xpath = "//input[@aria-label='Family name']")
	private WebElement familtyName;

	@FindBy(xpath = "(//input[contains(@aria-label,'Date of birth')])[1]")
	private WebElement dobTextBox;

	@FindBy(xpath = "//input[@aria-label='Place of birth']")
	private WebElement placeOfBirthTextBox;

	@FindBy(xpath = "//input[@aria-label='Country of birth']")
	private WebElement countryOfBirthTextBox;

	@FindBy(xpath = "//input[@aria-label='Email address']")
	private WebElement emailAddressTextbox;

	@FindBy(xpath = "//input[@aria-label='Mobile']")
	private WebElement mobileTextBox;

	@FindBy(xpath = "//input[@aria-label='Enter address']")
	private WebElement addressTextBox;

	@FindBy(xpath = "//span[text()='Same as residential address']")
	private WebElement sameasResidentialCheckbox;

	@FindBy(xpath = "//input[contains(@aria-label,'maiden name')]")
	private WebElement maidenName;

	@FindBy(xpath = "//span[text()='Continue']")
	private WebElement continueButton;
	// ivate static WebDriver driver;

	public SavingAcceleratorPage(WebDriver driver) {
		super(driver);
	}

	public void fillDetailsInSAP(List<Map<String, String>> list) throws Exception {

		// ystem.out.println(driver.getTitle());
		Actions actionObject = new Actions(driver);
		if (getSavingsAcceleratorText().getText().equals("Open a Savings Accelerator")) {
			// Radio button Actions
			Utility.selectRadioButtonResponses("Single,Male,Three or more years,No", driver);

			// Text Field Filling
			getNationality().sendKeys(list.get(0).get("Nationality"));
			if (getDropMenuItems().isDisplayed()) {
				getDropMenuItems().click();
				Thread.sleep(3000);
				actionObject.moveToElement(getTitleDropDown()).click().perform();

			} else if (getNoResultSection().isDisplayed()) {
				Thread.sleep(3000);
				actionObject.moveToElement(getTitleDropDown()).click().perform();
				System.out.println("Please Enter Valid country name");

			} else {

				Thread.sleep(3000);
				actionObject.moveToElement(getTitleDropDown()).click().perform();
				System.out.println("Please Enter Valid country name");

			}
		

			// getTitleDropDown().click();
			Utility.selectOption(list.get(0).get("Title"), driver);
			getGivenName().sendKeys(list.get(0).get("GivenName"));
			getMiddleName().sendKeys(list.get(0).get("MiddleName"));
			getFamiltyName().sendKeys(list.get(0).get("FamilyName"));
			getDobTextBox().sendKeys(list.get(0).get("DateOfBirth"));
			getPlaceOfBirthTextBox().sendKeys(list.get(0).get("PlaceOfBirth"));
			getCountryOfBirthTextBox().sendKeys(list.get(0).get("CountryOfBirth"));

			// Actions act = new Actions(driver);
			actionObject.sendKeys(Keys.TAB).build().perform();
			actionObject.sendKeys(Keys.ENTER).build().perform();

			getEmailAddressTextbox().sendKeys(list.get(0).get("EmailAddress"));
			getMobileTextBox().sendKeys(list.get(0).get("Mobile"));
			getAddressTextBox().sendKeys(list.get(0).get("EnterAddress"));

			// Thread.sleep(3000);

			actionObject.sendKeys(Keys.TAB).build().perform();
			actionObject.sendKeys(Keys.ENTER).build().perform();

			getSameasResidentialCheckbox().click();

			getMaidenName().sendKeys(list.get(0).get("MaidenName"));
		}

		}

	public void clickOnContinueButton() {
		// Click on continue
		getContinueButton().click();
	}

}
