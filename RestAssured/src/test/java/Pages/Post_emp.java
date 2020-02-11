package Pages;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import restutills.Restutills;

public class Post_emp {
	public static JSONObject map =new JSONObject();
	Response res;

	public void getPostEmpUrl() {
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
		RestAssured.basePath = "/create";
	}

	public void getPostEmpData() {

		map.put("name", Restutills.empName());
		map.put("salary", Restutills.empSal());
		map.put("age", Restutills.empAge());

	}

	public void postEmpAPI() {

		res = given().contentType(ContentType.JSON).body(map.toJSONString()).when().post();
		

	}

	public void validateResponse() {
		System.out.println(res.getStatusCode());
		res.then().body("status", equalTo("success"));
		/* res.then().body(arguments, responseAwareMatcher) */
		System.out.println(res.getBody().prettyPrint());
		JsonPath j=new JsonPath(res.asString());
		System.out.println(j.get("data.id")+".....................");

	}


}
