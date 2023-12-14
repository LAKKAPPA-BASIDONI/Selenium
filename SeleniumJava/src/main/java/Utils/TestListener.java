package Utils;

import java.io.IOException;


import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;



public class TestListener  implements ITestListener{
	ExtentTest test;
	LogFiles obj;
	ExtentReports extent = Extent_Report.extentRP();
	ThreadLocal<ExtentTest> testThread = new ThreadLocal<>();
	@Override
	public  void onTestStart(ITestResult result) {
	    // not implemented
		LogFiles obj = new LogFiles();
		obj.logGenerate(result.getMethod().getMethodName());
		test = extent.createTest(result.getMethod().getMethodName());
		testThread.set(test);
		
	  }

	@Override
	  public  void onTestSuccess(ITestResult result) {
	    // not implemented
		  test.log(Status.PASS, "test Passed");
		  //test.fail(result.getThrowable());
	  }

	@Override
	  public  void onTestFailure(ITestResult result) {
	    // not implemented
		 // test.log(Status.FAIL, "test Failed");
		  testThread.get().fail(result.getThrowable());
	  }

	@Override
	  public  void onTestSkipped(ITestResult result) {
	    // not implemented
	  }

	@Override
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	    // not implemented
	  }

	@Override
	  public  void onTestFailedWithTimeout(ITestResult result) {
	    onTestFailure(result);
	  }

	@Override
	  public void onStart(ITestContext context) {
	    // not implemented
	  }

	@Override
	  public void onFinish(ITestContext context) {
	    // not implemented
		extent.flush();
	  }
}
