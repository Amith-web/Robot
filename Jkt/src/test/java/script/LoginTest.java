package script;


import org.testng.annotations.Test;

import library.BaseLib;
import po.LoginPage;

public class LoginTest extends BaseLib {
	
	LoginPage page;
	@Test(priority=1)
	public void DemoTest1() {
		//LoginPage page = new LoginPage(driver);
		page=LoginPage.INSTANCE;
		loadWebUrl();
		page.initialize(driver);
		System.out.println(page.getWebtitle());
		
	}
	
	
	@Test(priority=2)
	public void DemoTest2() {
		//LoginPage page = new LoginPage(driver);
		page=LoginPage.INSTANCE;
		loadWebUrl();
		page.initialize(driver);
		System.out.println(page.getWebtitle());
	}
	
//	@Test
//	public void DemoTest2() {
//		//LoginPage page = new LoginPage(driver);
//		page.initialize(driver);
//		loadWebUrl();
//		System.out.println(page.getWebtitle());
//	}
}
