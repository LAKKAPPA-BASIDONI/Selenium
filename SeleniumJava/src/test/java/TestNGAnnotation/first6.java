package TestNGAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class first6 {
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass .....////");
	}
	
	@Test
	public void something2() {
		System.out.println("good Bye");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass......;;;..");
	}
	
	@Test
	public void something() {
		System.out.println("Ok good");
	}

}
