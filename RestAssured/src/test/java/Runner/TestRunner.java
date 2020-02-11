package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "Features/RestFeature.feature", 
		glue = "RestAssuredStepDefinition", 
		plugin = {"pretty", "html:target/cucumber-reports" },
		monochrome = true,
		tags= {"@PostEmpTest"}

)

public class TestRunner {

}
