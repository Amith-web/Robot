package library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public abstract class BaseLib extends LoadClasses{
public static WebDriver driver;
	
	@BeforeMethod
	public void  setUp() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		
	}
	
	
	public void loadWebUrl() {
		//driver.get("http://demowebshop.tricentis.com/");
		driver.get("http////demowebshop.tricentis.com/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
