package Pages;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import restutills.Restutills;

public class PostApi {

	public static HashMap map = new HashMap();
	Response res;

	public void getPostUrl() {

		RestAssured.baseURI = "http://restapi.demoqa.com/customer";
		RestAssured.basePath = "/register ";

	}

	public void getPostData() {

		map.put("FirstName", Restutills.getFirstName());
		map.put("LastName", Restutills.getLastName());
		map.put("UserName", Restutills.getUserName());
		map.put("Password", Restutills.getPassword());
		map.put("Email", Restutills.getEmail());

	}

	public void postAPI() {

		res = given().contentType(ContentType.JSON).body(map).when().post();
		

	}

	public void validateResponse() {
		System.out.println(res.getStatusCode());
		res.then().body("SuccessCode", equalTo("OPERATION_SUCCESS"));
		/* res.then().body(arguments, responseAwareMatcher) */
		System.out.println(res.getBody().asString());
		JsonPath j=new JsonPath(res.asString());
		System.out.println(j.get("SuccessCode")+".....................");

	}

}
