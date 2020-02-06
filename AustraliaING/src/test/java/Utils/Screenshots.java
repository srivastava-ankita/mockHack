package Utils;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {


	public static void GetScreenShot(WebDriver driver,String tcn) throws IOException {
		   String path="./target/ScreenShots/";
		   
		   DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyy");
		  
		  //get current date time with Date()
		  Date date = new Date();
		  
		  // Now format the date
		  String date1= dateFormat.format(date);
		 
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(path+tcn+date1+".jpeg");
		
		FileUtils.copyFile(src, dst);

		
		}

}
