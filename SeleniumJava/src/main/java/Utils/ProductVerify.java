package Utils;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductVerify {
	WebDriver driver;
	public ProductVerify(WebDriver driver) {
		this.driver = driver;

	}	
	private By user_email = By.xpath("//input[@id=\"userEmail\"]");
	private By user_password = By.xpath("//input[@id=\"userPassword\"]");
	private By signin_btn = By.xpath("//input[@id=\"login\"]");
	
	
	
	private By home_Btn = By.xpath("//button[contains(text(),'HOME')]");
	private By order_Btn = By.xpath("//button[contains(text(),'ORDERS')]");
	private By menuCart = By.xpath("//li/button[contains(text(),'Cart')]");
	private By logout_Btn = By.xpath("//li/button[contains(text(),'Sign Out')]");
	private By view_Btn = By.xpath("//button[contains(text(),'View')]");
	private By addToCartBtn = By.xpath("//button[contains(text(),'Add To Cart')]");
	private By productName = By.xpath("//a/following-sibling::div/h2");
	private By allProductNames = By.xpath("//div[@class='card-body']/h5/b");
	private By pp = By.xpath("//div[@class='card-body']");
	
	
	public WebElement emailBox() {
		return this.driver.findElement(user_email);
	}
	
	public  WebElement passwordBox() {
		return this.driver.findElement(user_password);
	}
	
	public WebElement signinBtn() {
		return driver.findElement(signin_btn);
	}
	
	
	public WebElement homeBtn() {
		return driver.findElement(home_Btn);
	}
	
	public WebElement orderBtn() {
		return driver.findElement(order_Btn);
	}
	
	public WebElement menuCartBtn() {
		return driver.findElement(menuCart);
	}
	
	public WebElement logoutBtn() {
		return driver.findElement(logout_Btn);
	}
	
	public WebElement viewBtn() {
		return driver.findElement(view_Btn);
	}
	
	public WebElement addToCart() {
		return driver.findElement(addToCartBtn);
	}
	
	public WebElement productName() {
		return driver.findElement(productName);
	}
	
	
	public void verifyViewPage() {
		this.driver.findElement(By.xpath("(//div[@class='card-body'])[1]")).findElement(view_Btn).click();
	}
	
	public void goTo() {
		this.driver.get("https://rahulshettyacademy.com/client/");
	}
	
	public  void loginMainAccount(String email, String password) {
		emailBox().sendKeys(email);
		passwordBox().sendKeys(password);
		signinBtn().click();
	}
	
	public void grabProductsInnerText() {
		List<WebElement> list = driver.findElements(allProductNames);
		
		for(WebElement e : list) {
			System.out.println(e.getText());
		}
		
	}
	
	public void cartFirstOne(String NN) throws InterruptedException {
		//pp.findElement(addToCartBtn).click();
//		List<WebElement> list1 = driver.findElements(pp);
//
//		for (WebElement e : list1) {
//			System.out.println(e.findElement(By.xpath("//h5/b")).getText());
//			Thread.sleep(2000);
//			if (e.findElement(By.xpath("//h5/b")).getText() == NN) {
//				e.findElement(addToCartBtn).click();
//				break;
//			}
//
//		}
		
	}
	
	public void close() {
		this.driver.close();
	}

}
