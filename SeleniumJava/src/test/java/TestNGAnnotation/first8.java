package TestNGAnnotation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Utils.Screenshot;

public class first8 {
	@Test
	public void checkScr() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Screenshot obj = new Screenshot();
		obj.takeScreenshot(driver, "amazon");
	}
	
}
