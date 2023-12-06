package Utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productCartMethods {
	WebDriver driver;
	public productCartMethods(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath= "//input[@id='username']")
	WebElement usrName;
	
	@FindBy(xpath= "//input[@id='password']")
	WebElement usrPwd;
	
	@FindBy(xpath= "//input[@id='signInBtn']")
	WebElement loginBtn;
	
	
	By firstProduct = By.xpath("(//button[text()='Add '])[1]");
	
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
	}
	
	public void login(String userName, String userPassword) {
		usrName.sendKeys(userName);
		usrPwd.sendKeys(userPassword);
		loginBtn.click();
		
	}
	
	public void shouldBeVisible() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(firstProduct));
	}
	
	public void cart() {
		driver.findElement(firstProduct).click();
		
	}

}
