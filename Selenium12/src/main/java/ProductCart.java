import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Arrays;
import java.util.List;

public class ProductCart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String[] itemNeeded = {"Brocolli", "Cauliflower", "Beans", "Mushroom"};
		List<WebElement> itemList = driver.findElements(By.xpath("//h4[@class=\"product-name\"]"));
		List<String> list = Arrays.asList(itemNeeded);
		int totalPrice =0;
		int count = 0;
		int productSize = list.size();
		
		for(int i=0; i<itemList.size(); i++) {
			
			totalPrice+= Integer.parseInt(driver.findElements(By.xpath("//p[@class=\"product-price\"]")).get(i).getText());
			String name = itemList.get(i).getText().split(" ")[0];
			System.out.println(name);
			if(list.contains(name)) {
				System.out.println(i+" : "+name);
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i-count).click();		
			}
			count++;
			if(count == productSize) {
				break;
			}	
		}
		
		System.out.println("Total price of products : "+totalPrice);
		driver.findElement(By.xpath("//img[@alt=\"Cart\"]")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//input[@class=\"promoCode\"]")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@class=\"promoBtn\"]")).click();
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		
		WebElement opt = driver.findElement(By.xpath("//select"));
		Select option = new Select(opt);
		option.selectByValue("India");
		driver.findElement(By.xpath("//input[@type=\"checkbox\"]")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();	
		
	}
	
}
