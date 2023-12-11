package TestCases;
import java.io.*;
import java.time.Duration;


import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v118.log.Log;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.openqa.selenium.logging.LogEntries.*;

public class Test3  {
	DevTools devtools;
	@Test
	public void logGenerate() {
		
		ChromeOptions option = new ChromeOptions();
		
				//option.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		option.setPageLoadStrategy(PageLoadStrategy.EAGER);
		//option.setPageLoadStrategy(PageLoadStrategy.NONE);
		
		
		//option.addArguments("--start-maximized");
		
		option.setExperimentalOption("excludeSwithes",new String[] {"enable-automation"}); // use one   -- remove automation tag
		//option.setExperimentalOption("excludeSwithes", Collections.singletonList("load-extension"));// -removed plugin
		
		//option.addArguments("--incognito");
		
		System.setProperty("webdriver.chrome.logfile","./chomelog.txt" );
		WebDriver driver = new ChromeDriver();
		
		devtools = ((ChromeDriver)driver).getDevTools();
		devtools.createSession();
		devtools.send(Log.enable());
		devtools.addListener(Log.entryAdded(), 
				logEntry ->{
					System.out.println("Log text :"+logEntry.getText());
					System.out.println("Log level :"+logEntry.getLevel());
				});
		
		
		LogEntries logentry1 = driver.manage().logs().get(LogType.BROWSER);
//		List<LogEntry> logs = logentry1.getAll();
//		for(LogEntry log : logs) {
//			System.out.println("Text of"+log);
//		}
//		for(LogEntry log : logs) {
//			System.out.println("message :"+log.getMessage());
//		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("39847");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		Assert.assertTrue(true);
		driver.close();
	}
}
