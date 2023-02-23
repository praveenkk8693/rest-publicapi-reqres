package rest.publicapi.calls;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetResources {
	
	@Test
	public void getResourcesApi() {
		//path 
		///api/users?page=2
		RestAssured.baseURI="https://reqres.in";
		
		RequestSpecification reqObject =  RestAssured.given();
		Response responseObject = reqObject.request(Method.GET,"/api/users?page=2");
		System.out.println("response from API Call :" +responseObject.getBody().asString());
		System.out.println("reponse Code : "+ responseObject.getStatusCode());
		System.out.println("response Headers : "+responseObject.getHeaders());
	}

}
