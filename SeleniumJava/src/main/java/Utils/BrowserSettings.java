package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSettings {
	
	
	WebDriver driver; 
	public WebDriver initializeDriver() throws IOException {
		
		driver = new ChromeDriver();
		Properties pr = new Properties();
		FileInputStream fl = new FileInputStream("C:\\Users\\Lakkappa Y\\eclipse-workspace\\SeleniumJava\\src\\main\\java\\Utils\\Globaldata.properties");
		pr.load(fl);
		String browserName =  pr.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("browser initialised...");
			
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		return driver;
		
	}
	
	public ProductVerify launchApplication() throws IOException{
		driver = initializeDriver();
		ProductVerify obj = new ProductVerify(driver);
		obj.goTo();
		return obj;
	}

}
