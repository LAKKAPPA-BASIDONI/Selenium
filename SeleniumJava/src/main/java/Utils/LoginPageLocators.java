package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import PageObjectMethods.CommonFunction;

public class LoginPageLocators extends CommonFunction {
	
//	By usrName = By.id("inputUsername");
//	By usrPassword = By.name("inputPassword");
//	By loginBtn = By.className("signInBtn");
	WebDriver driver;
	public LoginPageLocators(WebDriver driver) {
		super(driver);
		this.driver = driver;	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id= "inputUsername")
	WebElement usrName;
	
	@FindBy(name= "inputPassword")
	WebElement usrPassword;
	
	@FindBy(className= "signInBtn")
	WebElement loginBtn;
	
	
	
	
	public void loginApplication(String name, String pwd) {
		waitForTimeout(By.id("inputUsername"));
		usrName.sendKeys(name);
		usrPassword.sendKeys(pwd);
		loginBtn.click();
	}
	
	public void goTo() {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
	}

}
