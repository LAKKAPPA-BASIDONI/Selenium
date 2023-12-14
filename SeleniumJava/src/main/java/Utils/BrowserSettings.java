package Utils;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BrowserSettings {
	
	
	WebDriver driver; 
	public WebDriver initializeDriver() throws IOException {
		
		//driver = new ChromeDriver();
		
		Properties pr = new Properties();
		FileReader fl = new FileReader("C:\\Users\\Lakkappa Y\\eclipse-workspace\\Selenium\\SeleniumJava\\src\\main\\java\\Utils\\Globaldata.properties");
		pr.load(fl);

		String browserName = (System.getProperty("browser")!=null)? System.getProperty("browser"): pr.getProperty("browser");
		System.out.println("browser Name"+browserName.getClass()+browserName.getClass().getSimpleName());
		
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\WebDrivers\\chromedriver.exe");
			
			this.driver = new ChromeDriver();
			
			
			System.out.println("browser initialised...");
			
		}else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\WebDrivers\\geckodriver.exe");
			this.driver = new FirefoxDriver();
			
		}else if(browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "D:\\WebDrivers\\msedgedriver.exe");
			this.driver = new EdgeDriver();
		}
		
		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		this.driver.manage().window().maximize();
		return this.driver;
		
	}
	
	public ProductVerify launchApplication() throws IOException{
		this.driver = initializeDriver();
		ProductVerify obj = new ProductVerify(this.driver);
		return obj;
	}
	
	public void run1() throws IOException {
		this.driver = initializeDriver();
		this.driver.get("https://www.google.com");
		
	}
	
	
}

