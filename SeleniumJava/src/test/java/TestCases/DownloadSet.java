package TestCases;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadSet {

	public static void main(String[] args) {
		ChromeOptions  option = new ChromeOptions();
		//option.addArguments("--headless");
		String downloadFolder = "D:\\dgfh";
		//option.addArguments("download.default_diretory="+downloadFolder);
		
		File newFolder = new File(downloadFolder);

        // Check if the directory doesn't exist
        if (!newFolder.exists()) {
     
            boolean created = newFolder.mkdirs();  

        }
		
		Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", downloadFolder+"\\newFolder");
        option.setExperimentalOption("prefs", prefs);
		
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://mvnrepository.com/artifact/io.streamnative/pulsar-broker-common/3.1.1.1");
		driver.findElement(By.xpath("//a[contains(@href,'jar')]")).click();
	
	}

}
