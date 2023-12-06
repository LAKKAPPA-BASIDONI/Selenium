package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.BrowserSettings;
import Utils.LoginPageLocators;
import Utils.ProductVerify;


public class ProductVerifyTest extends BrowserSettings {
	
	@Test
	public void loginPage() throws IOException {
		
		ProductVerify prv = launchApplication();
		prv.grabProductsInnerText();
		Assert.assertTrue(true);
		
	}

}
