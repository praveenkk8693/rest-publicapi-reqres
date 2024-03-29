package rest.publicapi.calls;

import org.json.simple.JSONObject;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import rest.publicapi.logs.RestLogger;
//@Listeners(rest.publicapi.listeners.RestTestListener.class)
public class PostResponseTest {
	@Test
	public void postResponseCall() {
		RestLogger.getRestLogger(PostResponseTest.class).info("post starting.. ");
		RestAssured.baseURI="https://reqres.in";
		
		RequestSpecification reqObj = RestAssured.given();
		
		JSONObject params = new JSONObject();
		params.put("name", "morpheus");
		params.put("job", "leader");
		
		//reqObj.contentType("application/json");
		reqObj.header("contentType","application/json");
		
		reqObj.body(params.toJSONString());
		
		Response res = reqObj.request(Method.POST,"/api/users");
		
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getHeaders());
		
		
		
	}

}
