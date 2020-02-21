package po;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public enum LoginPage{
	INSTANCE;
	WebDriver driver;
	
	
	public void initialize(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(id = "Email")
	private WebElement emailTxtBox;

	@FindBy(id = "Password")
	private WebElement passwordTxtBox;

	@FindBy(xpath = "//input[@class='button-1 login-button']")
	private WebElement loginBtn;
	
	
	public String getWebtitle() {
		return driver.getTitle();
	}

}
