package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public void takeScreenshot(WebDriver driver) throws IOException{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File file = new File("C://Users//Lakkappa Y//eclipse-workspace//Selenium//SeleniumJava//test-output//ScreenshotFolder"+".png");
		FileUtils.copyFile(src, file);
		System.out.println("Inside csreenshot method");
	}

}
