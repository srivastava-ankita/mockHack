package Pages;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import restutills.Restutills;

public class PutApi {

	public static HashMap map = new HashMap();
	Response res;

	public void getPutUrl() {

		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RestAssured.basePath = "/register ";

	}

	public void getPutData() {

		map.put("FirstName", Restutills.getFirstName());

	}

	public void putAPI() {

		res = given().contentType(ContentType.JSON).body(map).when().put();

	}

	public void validateResponse() {
		res.then().body("SuccessCode", equalTo("OPERATION_SUCCESS"));
		/* res.then().body(arguments, responseAwareMatcher) */

	}

}
