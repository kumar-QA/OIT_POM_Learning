import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement	 usernameInputFiled=driver.findElement(By.id("Email"));
		WebElement	passwordinputFiled=driver.findElement(By.id("Password"));
		WebElement	   loginButton= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
		usernameInputFiled.clear();
		usernameInputFiled.sendKeys("sai");
		Thread.sleep(2000);
		passwordinputFiled.clear();
		passwordinputFiled.sendKeys("sai1234");
		Thread.sleep(2000);
		loginButton.click();

	}

}



//
//FileInputStream fis=new FileInputStream("D:\\ExcelSheet\\OITTestData.xlsx");
//	XSSFWorkbook wo=new XSSFWorkbook(fis);
//	XSSFSheet s=wo.getSheet("TestDataForLogin");
//	int rowcount=s.getLastRowNum();
//	XSSFRow r;
//	for (int i = 1; i <= rowcount; i++) {
//		     r = s.getRow(i);
//
//
//
//
//	}
//
//

//}
