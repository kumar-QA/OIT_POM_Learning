package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import pages.LoginPage;

public class Baseclass {
	public WebDriver driver;
	
	@BeforeMethod(alwaysRun = true)
	public void launchBrowser() {
		System.out.println("hi");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		
	}

}
