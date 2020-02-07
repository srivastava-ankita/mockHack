package RestAssuredStepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import Pages.GetApi;

public class RestAssuredStepDefinition_Get {

	GetApi get = new GetApi();

	@Given("^Get the base url for get Request$")
	public void get_the_base_url_for_get_Request() {

		get.GetBaseURL();

	}

	@When("^Send the request for get operation$")
	public void send_the_request_for_get_operation() {

		get.GetApiRequest();
	}

	@Then("^validate the status code of get request$")
	public void validate_the_status_code_of_get_request() {

		get.ValidateApiResponse();

	}

}
