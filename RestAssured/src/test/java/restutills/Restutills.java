package restutills;

import org.apache.commons.lang3.RandomStringUtils;

public class Restutills {
	
	public static String getFirstName(){
		String generatedString=RandomStringUtils.randomAlphabetic(1) ;
		return ("SELVI"+generatedString);
	}
	public static String getLastName(){
		String generatedString=RandomStringUtils.randomAlphabetic(1) ;
		return ("N"+generatedString);
	}
	public static String getUserName(){
		String generatedString=RandomStringUtils.randomAlphabetic(3) ;
		return ("SELVI"+generatedString);
	}
	public static String getPassword(){
		String generatedString=RandomStringUtils.randomAlphabetic(3) ;
		return ("SELVI"+generatedString);
	}
	public static String getEmail(){
		String generatedString=RandomStringUtils.randomAlphabetic(3) ;
		return (generatedString+"@gamil.com");
	}
	public static String empName(){
		String generatedString=RandomStringUtils.randomAlphabetic(1) ;
		return ("SELVI"+generatedString);
	}
	public static String empSal(){
		String generatedString=RandomStringUtils.randomNumeric(5);
		return (generatedString);
	}
	public static String empAge(){
		String generatedString=RandomStringUtils.randomNumeric(2);
		return (generatedString);
	}
}
