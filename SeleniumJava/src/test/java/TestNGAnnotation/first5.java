package TestNGAnnotation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class first5 {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Beforer Method ...:");
	}
	@Test
	public void printSomething() {
		System.out.println("Hello World!....");
	}
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method.....");
	}
	
	@Test
	public void printSomething2() {
		System.out.println(" printSomething2 .....:,,,");
	}

}
 