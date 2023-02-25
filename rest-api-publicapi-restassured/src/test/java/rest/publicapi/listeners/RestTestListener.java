package rest.publicapi.listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import rest.publicapi.extentreport.GenerateRestExtentReport;

public class RestTestListener  implements ITestListener {
	public  void onTestStart(ITestResult result) {
		GenerateRestExtentReport.setReportConfig();
		
	  }

	public  void onTestSuccess(ITestResult result) {
		
		GenerateRestExtentReport.createTest(result.getName());
		GenerateRestExtentReport.OnTestSuccess(result);
		GenerateRestExtentReport.onFlush();
	  } 
	public  void onTestFailure(ITestResult result) {
		
		GenerateRestExtentReport.createTest(result.getName());
		GenerateRestExtentReport.OnTestFailure(result);
		GenerateRestExtentReport.onFlush();
	  }
	
}
