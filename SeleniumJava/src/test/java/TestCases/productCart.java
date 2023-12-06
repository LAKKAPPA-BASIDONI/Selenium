package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils.productCartMethods;

public class productCart  {
	
	@Test
	public void productcart() {
		
		WebDriver driver = new ChromeDriver();
		productCartMethods obj = new productCartMethods(driver);
		obj.goTo();
		obj.login("rahulshettyacademy","learning");
		
		
	}
	
	
}
