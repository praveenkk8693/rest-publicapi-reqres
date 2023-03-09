package rest.publicapi.calls;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import rest.publicapi.logs.RestLogger;
//@Listeners(rest.publicapi.listeners.RestTestListener.class)
public class GetResourcesTest {
	
	
	
	
	@Test
	public void getResourcesApi() {
		//path 
		///api/users?page=2
		Logger log=RestLogger.getRestLogger(GetResourcesTest.class);
		log.info("getting resources call..."+System.currentTimeMillis());
		RestAssured.baseURI="https://reqres.in";
		
		RequestSpecification reqObject =  RestAssured.given();
		Response responseObject = reqObject.request(Method.GET,"/api/users?page=2");
		System.out.println("response from API Call :" +responseObject.getBody().asString());
		System.out.println("reponse Code : "+ responseObject.getStatusCode());
		System.out.println("response Headers : "+responseObject.getHeaders());
		
		
	
	}

}
