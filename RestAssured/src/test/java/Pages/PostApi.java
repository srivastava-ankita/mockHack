package Pages;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.HashMap;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import restutills.Restutills;

public class PostApi {

	public static  HashMap map = new HashMap();
	
	public void getPostUrl() {
		
		 RestAssured.baseURI="http://restapi.demoqa.com/customer";
	      RestAssured.basePath="/register ";
		
	}

	 
	
	public  void getPostData(){
		
		  map.put("FirstName", Restutills.getFirstName());
	      map.put("LastName", Restutills.getLastName());
	      map.put("UserName", Restutills.getUserName());
	      map.put("Password", Restutills.getPassword());
	      map.put("Email", Restutills.getEmail());
	      
	     
	}
	
	
	public void postAPI(){
		given()
        .contentType(ContentType.JSON)
        .body(map)
     .when()
          .post()
     .then()
        
        .body("SuccessCode", equalTo("OPERATION_SUCCESS"))
        .and()
        .body("Message", equalTo("Operation completed successfully"))
        .log().all();
	}

}
