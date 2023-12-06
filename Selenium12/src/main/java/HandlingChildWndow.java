import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildWndow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice");
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> windows = driver.getWindowHandles(); 
		Iterator<String> it = windows.iterator();
		String parentid = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		driver.get("https://rahulshettyacademy.com/");
		String firstCourse = driver.findElement(By.xpath("//div[@class='upper-box']/h2/a")).getText();
		System.out.println("first Course ::"+firstCourse);
		driver.switchTo().window(parentid);
		
		driver.findElement(By.xpath("(//input[@name=\"name\"])[1]")).sendKeys("Rahul Shetty");
		
	}

}

//driver.findElement(By.xpath("//a[@class=\"blinkingText\"]")).click();
//WebElement linkText = driver.findElement(By.xpath("//p[@class=\"im-para red\"]"));