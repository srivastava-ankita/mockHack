package com.hcl.demo.runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
features = "src\\main\\java\\com\\hcl\\demo\\features\\UIAutomationWithDatatables.feature"
,glue= {"com.hcl.demo.stepdefinition"},
plugin = { "pretty", "html:target/cucumber-reports" },

  monochrome=true
		  )
public class UIRunner {
	
	

	}

