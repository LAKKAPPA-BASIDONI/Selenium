package TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.LoginPageLocators;


public class Test1  {
	
	@Test(enabled = false)
	public void loginPage() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		LoginPageLocators obj = new LoginPageLocators(driver);
		
		obj.goTo();
		obj.loginApplication("rahul", "rahulshettyacademy");
		
		Assert.assertTrue(true);
		
	}
	@Test(dataProvider ="getData")
	public void log(String uname, String upwd) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@id='userPassword']")).sendKeys(upwd);
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][]  obj = { {"anshika@gmail.com","Iamking@000" },{"anshika@gmail.com","Iamking@000" }};
		return obj;
		
	}
	
	@Test
	public void demo() {
		System.setProperty("webdriver.chrome.driver", "D:\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	}

}
