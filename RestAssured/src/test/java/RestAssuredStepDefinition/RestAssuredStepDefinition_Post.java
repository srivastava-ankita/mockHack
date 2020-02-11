package RestAssuredStepDefinition;

import Pages.PostApi;
import Pages.Post_emp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RestAssuredStepDefinition_Post {

	PostApi post = new PostApi();
	Post_emp postEmp = new Post_emp();

	@Given("^Get the base url for Post Request$")
	public void get_the_base_url_for_Post_Request() {
		post.getPostUrl();
	}

	@When("^Send the request for Post Request$")
	public void send_the_request_for_Post_Request() {
		post.getPostData();
	}

	@Then("^validate the status code of post operations$")
	public void validate_the_status_code_of_post_operations() {
		post.postAPI();
		post.validateResponse();
	}

	@Given("^Get the base url for PostEmp Request$")
	public void get_the_base_url_for_PostEmp_Request() throws Throwable {
		postEmp.getPostEmpUrl();
	}

	@When("^Send the request for PostEMP Request$")
	public void send_the_request_for_PostEMP_Request() throws Throwable {
		postEmp.getPostEmpData();
	}

	@Then("^validate the status code of postEMP operations$")
	public void validate_the_status_code_of_postEMP_operations() throws Throwable {
		postEmp.postEmpAPI();
		postEmp.validateResponse();
	}
}
