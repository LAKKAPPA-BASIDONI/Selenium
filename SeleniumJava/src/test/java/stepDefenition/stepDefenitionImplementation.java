package stepDefenition;

import java.io.IOException;

import Utils.BrowserSettings;
import Utils.ProductVerify;
import io.cucumber.java.en.Given;

public class stepDefenitionImplementation extends BrowserSettings{
	
	public ProductVerify prv;
	@Given("Landed on Page")
	public void Landed_on_Page() throws IOException {
		 prv = launchApplication();
	}
	
	@Given("^Loged in with userName (.+) and password (.+)$")
	public void Loged_in_with_userName_and_Password(String email, String password) {
		prv.goTo();
		prv.loginMainAccount(email, password);
	}

}
