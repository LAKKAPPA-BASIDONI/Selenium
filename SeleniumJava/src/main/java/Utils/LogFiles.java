package Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v118.log.Log;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogFiles  {
	
	public void logGenerate(String testName) {
	DevTools devtools;	
	
	System.setProperty("webdriver.chrome.logfile","C:\\Users\\Lakkappa Y\\eclipse-workspace\\Selenium\\SeleniumJava\\LOGS\\'"+testName+"'_log.txt" );
	WebDriver driver = new ChromeDriver();
	
	devtools = ((ChromeDriver)driver).getDevTools();
	devtools.createSession();
	devtools.send(Log.enable());
	devtools.addListener(Log.entryAdded(), 
			logEntry ->{
				System.out.println("Log text     :  "+logEntry.getText());
				System.out.println("Log level    :  "+logEntry.getLevel());
				System.out.println("Log String   :  "+logEntry.toString());
				System.out.println("Log class    :  "+logEntry.getClass());
				System.out.println("Log lineNum  :  "+logEntry.getLineNumber());
				System.out.println("Log source   :  "+logEntry.getSource());
				System.out.println("--------------------------------------------------------------------------------------------");
				
			});
	
	

	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.name("inputPassword")).sendKeys("39847");
	driver.findElement(By.className("signInBtn")).click();
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	Assert.assertTrue(true);
	driver.close();
	
	}	
	@Test
	public void run12() {
		LogFiles obj = new LogFiles();
		obj.logGenerate("first");
	}
}
