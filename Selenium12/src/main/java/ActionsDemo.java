import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
           
		public static void demo(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D://WebDrivers//chromedriver.exe");
			WebDriver driver =  new ChromeDriver();
			driver.get("https://amazon.com");
			Thread.sleep(3000);
			
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")))
								.build().perform();
			
			
			a.moveToElement(driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]"))).click();
								//.keyDown().sendKeys("Mobile").build().perform();
			
			a.moveToElement(driver.findElement(By.xpath("//span[@id=\"nav-link-accountList-nav-line-1\"]")))
			.contextClick().build().perform();
	}
		}
		
		
