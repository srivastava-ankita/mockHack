package runnerTest;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\main\\java\\features\\UIAutomation.feature"
,glue= {"com.ing.test"},
plugin = { "pretty", "html:target/cucumber-reports" },

  monochrome=true
		  )
public class UIRunner {
	
	

	}

