package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
   WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="Email")
	WebElement usernameinputField;
	
	@FindBy(name="Password")
	WebElement passwordInputFiled;
	
	@FindBy(xpath="//button[@type=\"submit\"]")
	WebElement loginBtn;
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public void performLogin() {
		usernameinputField.clear();
		usernameinputField.sendKeys("admin@yourstore.com");
		passwordInputFiled.clear();
		passwordInputFiled.sendKeys("admin");
		loginBtn.click();	
	}
}
