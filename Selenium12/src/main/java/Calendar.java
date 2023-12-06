import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class Calendar {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		
//		Thread.sleep(1000);
//		System.out.println(driver.findElement(By.xpath("(//span[@class='ui-datepicker-month'])[2]")).getText());
//		
//		driver.findElement(By.xpath("//td/a[text()='18']")).click();
//		
		
		//places
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		Thread.sleep(2000);
		List<WebElement> places = driver.findElements(By.xpath("//div[@id='dropdownGroup1']//li/a"));
		for(WebElement place : places) {
			System.out.println(place.getText());
		}
		
		WebElement DepartureCity = driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_ddl_originStation1\"]"));
		Select city = new Select(DepartureCity);
		
			
		List<WebElement> list = city.getOptions();
		for(WebElement opt : list) {
			System.out.print(opt.getText()+"  ");
		}
		
	}
	

}
