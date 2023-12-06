import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spiceJet {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='From']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='BLR']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='HYD'])")).click();
		driver.findElement(By.xpath("//div[data-testid='undefined-calendar-day-4']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		Thread.sleep(2000);
		for(int i=1; i<5; i++) {
			driver.findElement(By.xpath("//div[@data-testid='Adult-testID-plus-one-cta']")).click();
		}
		driver.findElement(By.xpath("//div[@data-testid='home-page-travellers-done-cta']")).click();
		driver.findElement(By.xpath("//div[text()='Students']")).click();
		driver.findElement(By.xpath("//div[@data-testid=\"home-page-flight-cta\"]")).click();
		
		driver.close();

	}

}
