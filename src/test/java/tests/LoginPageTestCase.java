package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginPageTestCase extends testBase{
	HomePage homePageObj;
	LoginPage loginPageObj;
	
	@Test
	public void loginignWithCorrectUserCreditintials() throws InterruptedException {
		homePageObj = new HomePage(testBaseDriver);
		loginPageObj = new LoginPage(testBaseDriver);
		homePageObj.openLoginPage();
		loginPageObj.successufulLogin("Mo@mo.com", "123456");
		Thread.sleep(3000);
		
		
	}
}
