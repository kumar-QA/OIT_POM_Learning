package Testpages;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pages.DashboardPage;
import pages.LoginPage;
import pages.productspage;

public class ProductsTestPage extends Baseclass{
	
	LoginPage lp;
	DashboardPage dp;
	productspage pp;
	
	@Test
	public void VerifyEnterProductFunctionality() {
		lp=new LoginPage(driver);
		dp=new DashboardPage(driver);
		pp=new productspage(driver);
		  String ExpectedValue="Your store. Login";
		  String actualvalue=lp.getPageTitle();
		  Assert.assertEquals(actualvalue, ExpectedValue);
		  lp.performLogin();
		  dp.clikOnCatalogLink();
		  dp.clikOnProductLink();
		  String  Actual=pp.getPageTitle();
		   String Expected="Products / nopCommerce administration";
		  
		  Assert.assertEquals(Actual, Expected);
		  pp.SearchProduct();
		  
		  
		  
		
	}

}
