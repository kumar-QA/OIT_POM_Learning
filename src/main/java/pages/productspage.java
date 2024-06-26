package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productspage {

	
	 WebDriver driver;
		
		public productspage(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy(id="SearchProductName")
		WebElement productNameFiled;
		
		@FindBy(id="search-products")
		WebElement searchBtn;
		
	
		public String getPageTitle() {
			return driver.getTitle();
		}
		
		public void SearchProduct() {
			productNameFiled.sendKeys("Apple MacBook Pro 13-inch");
			searchBtn.click();
		}
		
}
