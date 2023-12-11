package TestNGAnnotation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class first4 {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Beforer suite ...:");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("After Suite print.....");
	}

}
 