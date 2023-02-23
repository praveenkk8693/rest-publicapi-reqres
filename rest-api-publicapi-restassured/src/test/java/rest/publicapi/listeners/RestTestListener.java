package rest.publicapi.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import rest.publicapi.extentreport.GenerateRestExtentReport;

public class RestTestListener  implements ITestListener {
	public  void onTestStart(ITestResult result) {
		GenerateRestExtentReport.setReportConfig();
		
	  }

	public  void onTestSuccess(ITestResult result) {
		GenerateRestExtentReport.createTest(result.getTestName());
		GenerateRestExtentReport.OnTestSuccess(result);
	  } 
	public  void onTestFailure(ITestResult result) {
		GenerateRestExtentReport.createTest(result.getTestName());
		GenerateRestExtentReport.OnTestFailure(result);
	  }
}
