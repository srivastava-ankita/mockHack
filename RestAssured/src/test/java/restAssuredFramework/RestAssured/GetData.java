package restAssuredFramework.RestAssured;

import static io.restassured.RestAssured.given;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class GetData {
	

	final static String ROOT_URI = "http://dummy.restapiexample.com/api/v1";

	@Test
	public void getAPI(){
		Response res = given().when().get(ROOT_URI+"/employees");
		String json = res.asString();
		JsonPath jsonpath = new JsonPath(json);
		System.out.println("Response:\n"+json);
		Object res1 = jsonpath.get("data[0]");
		System.out.println("data1: is :\n"+res1);
        Assert.assertEquals(200, res.getStatusCode());
        System.out.println("Response:\n"+res.getStatusLine());
	}
        
      @Test
      public void getAPI1(){
    	  given()
          .when()
            .get(ROOT_URI+"/employees")
         .then()
             .statusCode(200)
          .statusLine("HTTP/1.1 200 OK");
      }
	

}
