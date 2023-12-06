import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.*;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		WebElement cr =driver.findElement(By.cssSelector("select[name*='DropDownListCurrency']"));
		Select option = new Select(cr);
		option.selectByIndex(2);
		
		// dynamic drop down
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/a[@value='IXG']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//li/a[@value='BLR'])[2]")).click();
		
		
		//auto suggestive
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
		List<WebElement> autoSg = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for(WebElement a : autoSg) {
			if(a.getText().equalsIgnoreCase("india")) {
				System.out.println(a.getText());
				a.click();
				
				break;
			}
		}
		
		
		
	
		
		
		

	}

}
