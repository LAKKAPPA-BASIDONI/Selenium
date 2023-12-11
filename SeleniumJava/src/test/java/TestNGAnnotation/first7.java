package TestNGAnnotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class first7 {
	
	@DataProvider
	public Object getData() {
		Object[][] data = new Object[3][2];
		
		data[0][0] = "first UserName";
		data[0][1] = "first Password";
		
		
		data[1][0] = "Second UserName";
		data[1][1] = "Second Password";
		
		data[2][0] = "Third UserName";
		data[2][1] = "Third Password";
		
		return data;
	}
	
	@Test(dataProvider = "getData")
	public void MobileLogin(String usrName, String usrPassword) {
		System.out.println("Mobile Login <<..");
		System.out.println(usrName+"  ::  "+usrPassword);
	}
	
	@Test
	public void MobileSignin() {
		System.out.println("Mobile Signin <<..");
	}
	
	@Test
	public void MobileSignout() {
		System.out.println("Mobile Signout ////.");
	}
}
