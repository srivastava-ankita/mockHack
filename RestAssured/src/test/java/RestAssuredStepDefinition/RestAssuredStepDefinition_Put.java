package RestAssuredStepDefinition;

import Pages.Put_emp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RestAssuredStepDefinition_Put {
	Put_emp put=new Put_emp();
	
	@Given("^Get the base url for Put Request$")
	public void get_the_base_url_for_Put_Request() throws Throwable {
	    put.getPutUrl();
	}

	@When("^Send the request for Put Request$")
	public void send_the_request_for_Put_Request() throws Throwable {
	    put.getPutData();
	}

	@Then("^validate the status code of put operations$")
	public void validate_the_status_code_of_put_operations() throws Throwable {
	   put.putAPI();
	   put.validateResponse();
	}


}


