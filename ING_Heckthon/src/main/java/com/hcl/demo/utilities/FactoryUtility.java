package com.hcl.demo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class FactoryUtility {
	
	public static void selectRadioButtonResponses(String stringText,WebDriver driver)
	{
		String strArray[]=stringText.split(",");
		for(int i=0;i<strArray.length;i++)
		{
			String text=strArray[i];
			driver.findElement(By.xpath("//label[contains(text(),'"+text+"')]")).click();
		}
		//driver.findElement(By.xpath("//label[contains(text(),'"+text+"')]/preceding-sibling::input")).click();
	}
	
	public static void selectOption(String text,WebDriver driver)
	{
		driver.findElement(By.xpath("//span[text()='"+text+"']")).click();
	}
	

}
