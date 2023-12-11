package TestNGAnnotation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class first {
	@Test
	public void demo() {
		System.out.println("good demo");
	}
	@Test
	public void demo1() {
		System.out.println("good bye");
	}
	@BeforeTest
	public void testBefore() {
		System.out.println("Test Before .....");
	}
	
	@AfterTest
	public void testAfter() {
		System.out.println("Test After ....!!");
	}
	

}
