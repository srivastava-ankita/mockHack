package com.hcl.demo.basepage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class HomePageBase {

	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	// public static WebEventListener eventListener;

	public HomePageBase(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static void driverInitialization() throws Exception {

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					System.getProperty("user.dir") + "./src/main/java/config.properties");
			prop.load(ip);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		String browserName = prop.getProperty("browser");

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Jars/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.chrome.driver", "./Jars/chromedriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,
		// TimeUnit.SECONDS);
		/*
		 * long wt = Long.parseLong(prop.getProperty("browser"));
		 * driver.manage().timeouts().implicitlyWait(wt, TimeUnit.SECONDS);
		 */
		driver.get(prop.getProperty("url"));

	}

}