package rest.publicapi.calls;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import rest.publicapi.extentreport.GenerateRestExtentReport;
import rest.publicapi.logs.RestLogger;
//@Listeners(rest.publicapi.listeners.RestTestListener.class)
public class DeleteResourcesTest {
	
	@BeforeTest
	public void setupReport() {
		GenerateRestExtentReport.setReportConfig();
		GenerateRestExtentReport.createTest("Deleting resources..");
	}
	@AfterTest
	
	public void generateTestReport() {
		
	}
	@Test
	public void deleteResurcesCall() {
		
		RestLogger.getRestLogger(DeleteResourcesTest.class).info("delete starting.. ");
		
		RestAssured.baseURI="https://reqres.in";
		
		RequestSpecification deleteReq = RestAssured.given();
		
		Response deleteRes =  deleteReq.request(Method.DELETE,"/api/users/2");
		
		System.out.println(deleteRes.getBody().asString());
		System.out.println(deleteRes.getStatusCode());
		
	}
	
	
	

}
