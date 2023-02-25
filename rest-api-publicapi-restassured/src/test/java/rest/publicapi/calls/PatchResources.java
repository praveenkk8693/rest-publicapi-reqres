package rest.publicapi.calls;

import org.json.simple.JSONObject;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
//@Listeners(rest.publicapi.listeners.RestTestListener.class)
public class PatchResources {
	
	@Test
	public void patchResourcesCall() {
		RestAssured.baseURI="https://reqres.in";
		
		RequestSpecification patchReq =  RestAssured.given();
		
		JSONObject params = new JSONObject();
		params.put("job", "AST");
		
		patchReq.header("contentType","application/json");
		
		patchReq.body(params.toJSONString());
		
		Response patchRes = patchReq.request(Method.PATCH,"/api/users/2");
		
		
		System.out.println(patchRes.getBody().asString());
		System.out.println(patchRes.getStatusCode());
		System.out.println(patchRes.getHeaders());
	}

}
