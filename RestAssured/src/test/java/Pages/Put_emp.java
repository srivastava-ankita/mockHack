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

public class Put_emp {
	public static JSONObject map = new JSONObject();
	Response res;
	public void getPutUrl() {
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
	//	RestAssured.basePath = "/update/2";
	}

	@SuppressWarnings("unchecked")
	public void getPutData() {

		/*
		 * map.put("name", Restutills.empName()); map.put("salary",
		 * Restutills.empSal()); map.put("age", Restutills.empAge());
		 */

		 map.put("name", "ank");
		 map.put("salary", "234000"); 
		 map.put("age", "21");
		 
	}

	public void putAPI() {
		System.out.println(map);
		res = given().contentType(ContentType.JSON).body(map.toJSONString()).put("/update/2");
	}

	public void validateResponse() {
		System.out.println(res.getStatusCode());
		res.then().body("status", equalTo("success"));
		
		/* res.then().body(arguments, responseAwareMatcher) */
		System.out.println(res.getBody().asString());
		JsonPath j = new JsonPath(res.asString());
		System.out.println(j.get("status"));

	}

}
