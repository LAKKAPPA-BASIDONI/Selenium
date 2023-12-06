import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		//driver.findElement(By.xpath("//div[@id='draggable']")).click();
		WebElement src = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, dest).build().perform();
		System.out.println("hello");
		
		driver.switchTo().defaultContent();
		System.out.println(driver.findElement(By.xpath("//h1[@class='entry-title']")).getText());
		boolean  firstTitle = driver.findElement(By.xpath("//h1[@class='entry-title']")).isDisplayed();
		Assert.assertTrue(firstTitle);
		
		List<WebElement> menuTag = driver.findElements(By.xpath("//li[@class=\"menu-item\"]"));
		int i=0;
		String[] arr = {"Demos","Download","API Documentation","Themes", "Development","Support","Blog","About"};
		for(WebElement item : menuTag) {
			Assert.assertEquals(item.getText(), arr[i++]);
			System.out.println(item.getText());
		}
		
		driver.close();

	}

}
