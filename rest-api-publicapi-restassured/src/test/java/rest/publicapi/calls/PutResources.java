package rest.publicapi.calls;

import org.json.simple.JSONObject;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import rest.publicapi.logs.RestLogger;
//@Listeners(rest.publicapi.listeners.RestTestListener.class)
public class PutResources {
	@Test
	public void putResourcesCall() {
		
		RestLogger.getRestLogger(PutResources.class).info("put  starting.. ");
		RestAssured.baseURI =  "https://reqres.in";
		
		RequestSpecification putReq  = RestAssured.given();
		
		JSONObject params = new JSONObject();
		
		params.put("name", "morpheus");
		params.put("job", "zion residen");
		
		putReq.header("contentType","application/json");
		
		putReq.body(params.toJSONString());
		
		Response putRes = putReq.request(Method.PUT,"/api/users/2");
		
		System.out.println(putRes.getBody().asString());
		System.out.println(putRes.getStatusCode());
		System.out.println(putRes.getHeaders());
		
	}

}
