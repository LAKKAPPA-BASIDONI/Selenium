import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class BrokenLink {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		String url = driver.findElement(By.xpath("//li/a[text()=\"REST API\"]")).getAttribute("href");
		
		HttpURLConnection con = (HttpURLConnection)new URL(url).openConnection();
		con.setRequestMethod("HEAD");
		con.connect();
		int status = con.getResponseCode();
		
		System.out.println(status);
				
		
		
		
		
		
		
		

	}

}
