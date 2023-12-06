import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ProductCartFlipkart {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
//		Proxy proxy = new Proxy();
//		proxy.setHttpProxy("IpAddress : 2223345");
//		options.setCapability("proxy", proxy);
		
		System.setProperty("webdriver.chrome.driver", "/D:/WebDrivers/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		productCart( driver);

	}
	public static void productCart(WebDriver driver) {
		driver.findElement(By.xpath("//div/span[@role='button']")).click();
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobile");
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		
		Set<String> windows = driver.getWindowHandles(); 
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		
		System.out.println(driver.findElement(By.xpath("//div/h1/span")));
		
		driver.findElement(By.xpath("//ul[@class='row']/li/button[text()='Add to cart']")).click();
	}

}
