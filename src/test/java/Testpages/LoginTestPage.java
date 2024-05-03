package Testpages;

import org.testng.annotations.Test;

import base.Baseclass;
import pages.LoginPage;



public class LoginTestPage extends Baseclass{
	
	LoginPage lp;
	
	@Test
	void verifyLoginFunction() {
		lp=new LoginPage(driver);
		lp.performLogin();	
	}

}
