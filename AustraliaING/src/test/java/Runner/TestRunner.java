 package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		
	strict = true,
		 features = "C:\\Jack_Selenium\\AustraliaING\\Features\\INGAustralia.feature",
	     glue="StepDefinition",
	     plugin = { "pretty", "html:target/cucumber-reports" },
				 monochrome = true
				 
		 )

public class TestRunner {

}
