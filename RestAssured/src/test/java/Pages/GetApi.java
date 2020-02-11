package Pages;

import static io.restassured.RestAssured.given;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetApi {

	static String ROOT_URI;
	Response res;
	String json;
	JsonPath jsonpath;
	Object res1;

	public void GetBaseURL() {

		
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/employees";

	}

	public void GetApiRequest() {
		res = given().when().get();
	}

	public void ValidateApiResponse() {

		json = res.asString();
		jsonpath = new JsonPath(json);
		res1 = jsonpath.get("data[0]");
		
		Assert.assertEquals(200, res.getStatusCode());
	  //  res.then().body("employee_name",equals("Tiger Nixon"));
		System.out.println(res1);
		System.out.println("asdsfsd");

	}

}
