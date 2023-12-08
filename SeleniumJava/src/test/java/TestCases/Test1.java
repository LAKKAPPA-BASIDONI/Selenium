package TestCases;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utils.LoginPageLocators;
import Utils.Retry;
import Utils.Screenshot;
import jsondata.jsondataclass;


public class Test1  {
	
	ExtentReports extent;
	@BeforeTest
	public void extentRP() {
		String path = System.getProperty("user.dir")+"//Report//index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setDocumentTitle("Test Report");
		report.config().setReportName("Web automation testing");
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester", "Automation Tester");
		
		
	}
	
	@Test
	public void loginPage() throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		LoginPageLocators obj = new LoginPageLocators(driver);
		
		obj.goTo();
		obj.loginApplication("rahul", "rahulshettyacademy");
		
		
		
		Assert.assertTrue(true);
		
	}
	@Test(dataProvider = "getData")
	public void log(HashMap<String,String> hash) throws IOException{
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(hash.get("userName"));
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(hash.get("password"));
		driver.findElement(By.xpath("//input[@id='login']")).click();
		
		Screenshot scr = new Screenshot();
		scr.takeScreenshot(driver);
	
	}
	@Test
	@DataProvider
	public Object[][] getData() throws IOException {
		//Object[][]  obj = { {"anshika@gmail.com","Iamking@000" },{"anshika@gmail.com","Iamking@000" }};
		
		HashMap<Object, Object> hash = new HashMap<>();
		hash.put("usr","anshika@gmail.com" );
		hash.put("pwd","Iamking@000" );
		
		HashMap<Object, Object> hash1 = new HashMap<>();
		hash1.put("usr","anshika@gmail.com" );
		hash1.put("pwd","Iamking@000" );
		
		
		jsondataclass jsclass = new jsondataclass();
		List<HashMap<String,String>> data = jsclass.getJsonDataToHasmap();
		Object obj[][] = { {data.get(0)},{data.get(1)}};
		
		return obj;
		
	}
	
	@Test//(retryAnalyzer = Retry.class)
	public void demo() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		Assertion act = new Assertion();
		//act.assertTrue(false);
		
		
	}

}
