package TestCases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.BrowserSettings;
import Utils.ProductVerify;


public class ProductVerifyTest extends BrowserSettings {
	
	@Test
	public void loginPage() throws IOException, InterruptedException {
		System.out.println("lakkkappa");
		ProductVerify prv = launchApplication();
		prv.goTo();
		prv.loginMainAccount("anshika@gmail.com", "Iamking@000");
		prv.grabProductsInnerText();
		prv.cartFirstOne("zara coat 3");
		Assert.assertTrue(true);
		prv.close();
		
	}

}
