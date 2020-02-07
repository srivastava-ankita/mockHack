package com.hcl.demo.pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.datatable.DataTable;

import com.hcl.demo.basepage.HomePageBase;

public class SavingAcceleratorPage2 extends HomePageBase{

	@FindBy(xpath="//label[contains(text(),'Single')]")
	   private WebElement singleRadioButton;
	   
	public WebElement getSingleRadioButton() {
		return singleRadioButton;
	}

	@FindBy(xpath="//label[contains(text(),'Female')]")
	   private WebElement FemaleRadioButton;
	   
	public WebElement FemaleRadioButton() {
		return FemaleRadioButton;
	}
	
	@FindBy(xpath="//label[contains(text(),'Three or more years')]")
	   private WebElement YearRadioButton;
	   
	public WebElement ThreeRadioButton() {
		return YearRadioButton;
	}
	
	@FindBy(xpath="//label[contains(text(),'Yes')]")
	   private WebElement YesRadioButton;
	   
	public WebElement YesRadioButton() {
		return YesRadioButton;
	}

	@FindBy(xpath="//input[@aria-label='Nationality (Citizenship)']")
	   private WebElement NatTxt;
	   
	public WebElement NatTxt() {
		return NatTxt;
	}
	
	
	@FindBy(xpath="//*[@id='dropMenuItem']/div/paper-item[1]")
	   private WebElement DrpIt;
	   
	public WebElement DrpIt() {
		return DrpIt;
	}

	
	@FindBy(xpath="//input[@id='titleDropdown_targetInput']")
	   private WebElement TiDrp;
	   
	public WebElement TiDrp() {
		return TiDrp;
	}
	
	
	
	@FindBy(xpath="//span[text()='Mr']")
	   private WebElement SalSel;
	   
	public WebElement SalSel() {
		return SalSel;
	}
	
	@FindBy(xpath="//input[@aria-label='Given name']")
	   private WebElement GnName;
	   
	public WebElement GnName() {
		return GnName;
	}
	
	@FindBy(xpath="//input[@aria-label='Middle name (if you have one)']")
	   private WebElement MdName;
	   
	public WebElement MdName() {
		return MdName;
	}
	
	@FindBy(xpath="//input[@aria-label='Family name']")
	   private WebElement FaName;
	   
	public WebElement FaName() {
		return FaName;
	}
	
	@FindBy(xpath="(//input[contains(@aria-label,'Date of birth')])[1]")
	   private WebElement DOBTxt;
	   
	public WebElement DOBTxt() {
		return DOBTxt;
	}
	
	@FindBy(xpath="//input[@aria-label='Place of birth']")
	   private WebElement POBTxt;
	   
	public WebElement POBTxt() {
		return POBTxt;
	}
	
	
	
	@FindBy(xpath="//input[@aria-label='Country of birth']")
	   private WebElement COBTxt;
	   
	public WebElement COBTxt() {
		return COBTxt;
	}
	

	@FindBy(xpath="//input[@aria-label='Email address']")
	   private WebElement EMTxt;
	   
	public WebElement EMTxt() {
		return EMTxt;
	}
	
	
	@FindBy(xpath="//input[@aria-label='Mobile']")
	   private WebElement MBTxt;
	   
	public WebElement MBTxt() {
		return MBTxt;
	}
	
	@FindBy(xpath="//input[@aria-label='Enter address']")
	   private WebElement EADTxt;
	   
	public WebElement EADTxt() {
		return EADTxt;
	}
	
	@FindBy(xpath="//span[text()='Same as residential address']")
	   private WebElement SADChBx;
	   
	public WebElement SADChBx() {
		return SADChBx;
	}
	
	@FindBy(xpath="//input[contains(@aria-label,'maiden name')]")
	   private WebElement MaiNameTx;
	   
	public WebElement MaiNameTx() {
		return MaiNameTx;
	}
	
	@FindBy(xpath="//span[text()='Continue']")
	   private WebElement CnBtn;
	private WebDriver driver;
	   
	public WebElement CnBtn() {
		return CnBtn;
	}
	
	public SavingAcceleratorPage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	   
	   public void fillDetailsInSAP(DataTable dataTable) throws Exception{
	   
		   Properties prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "./src/main/java/config.properties");
			prop.load(ip);
			
		//Radio button Actions
		   singleRadioButton.click();
		   FemaleRadioButton.click();
		   YearRadioButton.click();
		   YesRadioButton.click();
		   
		//Text Field Filling 
		
		  	   
		   NatTxt.sendKeys(prop.getProperty("Nationality"));
		   DrpIt.click();
		   TiDrp.click();
		   SalSel.click();
		   GnName.sendKeys(prop.getProperty("GivenName"));
		   MdName.sendKeys(prop.getProperty("MiddleName"));
		   FaName.sendKeys(prop.getProperty("FamilyName"));
		   DOBTxt.sendKeys(prop.getProperty("DateOfBirth"));
		   POBTxt.sendKeys(prop.getProperty("PlaceOfBirth"));
		   COBTxt.sendKeys(prop.getProperty("CountryOfBirth"));
		   
		   Actions act = new Actions(driver);
           act.sendKeys(Keys.TAB).build().perform();
           act.sendKeys(Keys.ENTER).build().perform();
           
           
		   EMTxt.sendKeys(prop.getProperty("EmailAddress"));
		   MBTxt.sendKeys(prop.getProperty("Mobile"));
		   EADTxt.sendKeys(prop.getProperty("EnterAddress"));
		   
		   Thread.sleep(3000);
		   
		   act.sendKeys(Keys.TAB).build().perform();
           act.sendKeys(Keys.ENTER).build().perform();
           
           SADChBx.click();
           
           MaiNameTx.sendKeys(prop.getProperty("MaidenName"));
		   
         
		   
	   }
	   
	   public void SubmitApplication(){
		   //Click on continue 
		   CnBtn.click();
	   }
	   

	    
}
