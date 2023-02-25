package rest.publicapi.extentreport;

import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateRestExtentReport {
	
	public static ExtentHtmlReporter reporter;
	public static ExtentReports reports;
	public static ExtentTest test;
	
	public static void setReportConfig() {
		System.out.println("configuring report path ....");
		//reporter.loadConfig("D:\\projects\\rest-api-publicapi-restassured\\reports\\RestAPIReport.html");
		reporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\reports\\RestAPIReport.html");
		reporter.config().setDocumentTitle("API TEST RESULTS");
		reporter.config().setReportName("testing all request types");
		reporter.config().setTheme(Theme.DARK);
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		
		
	}
	public static ExtentTest createTest(String testName) {
		System.out.println("creatting report test ....");
		return test =reports.createTest(testName);
	}
	
	public static void OnTestSuccess(ITestResult result) {
		
		test.info("testing ...");
		test.log(Status.PASS, "test is passed.."+result.getName());
		
	}
	public static  void OnTestFailure(ITestResult result) {
		
		test.info("testing ...");
		test.log(Status.FAIL, "test is failed.."+result.getThrowable());
		
	}
	public static void onFlush() {
		reports.flush();
	}

}
