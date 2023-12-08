package Utils;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent_Report {
	
	
	public static ExtentReports extentRP() {
		String path = System.getProperty("user.dir")+"//Report//index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setDocumentTitle("Test Report");
		report.config().setReportName("Web automation testing");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Automation Tester");
		
		return extent;
		
	}

}
