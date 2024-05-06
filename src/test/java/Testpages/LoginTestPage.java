package Testpages;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.LoginPage;



public class LoginTestPage extends Baseclass{
	
	LoginPage lp;
	
	@Test
	void verifyLoginFunction() {
		lp=new LoginPage(driver);
		  String ExpectedValue="Your store. Login";
		  String actualvalue=lp.getPageTitle();
		  Assert.assertEquals(actualvalue, ExpectedValue);
		  lp.performLogin();
		
		
	}

}
