package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	
	WebDriver driver;
	
	
	public DashboardPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
	WebElement pageText;
	
	@FindBy(xpath = "//a[@href=\"/logout\"]")
    WebElement logoutBtn;
	
	@FindBy(xpath = "//i[@class=\"nav-icon fas fa-book\"]")
   WebElement catalogLink; 	
 	 
	@FindBy(xpath = "//a[@href=\"/Admin/Product/List\"]")
	WebElement productlink;
	
	
	@FindBy(xpath = "//a[@href=\"/Admin/Category/List\"]")
    WebElement categorielink;	
	
	
	public void clickonLogout() {
		logoutBtn.click();
	}
	
	public String getPageTitle() {
		return pageText.getText();
	}
	
	public void clikOnCatalogLink() {
		catalogLink.click();
	}
	
	public void clikOnProductLink() {
		productlink.click();
	}
	public void clikOnCategorieLink() {
		categorielink.click();
	}
	
}

