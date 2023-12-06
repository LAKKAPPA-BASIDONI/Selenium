import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFunction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//a[contains(text(),'Forgot your')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@class,\"go-to\")]")).click();
		driver.findElement(By.xpath("//label[normalize-space()='Remember my username']")).click();
		
		

	}

}
