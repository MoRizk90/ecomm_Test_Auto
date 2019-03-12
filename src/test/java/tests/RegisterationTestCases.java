package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.registrationPage;

public class RegisterationTestCases extends testBase {
	HomePage homePageObj;
	registrationPage regPageObj;
	
	@Test
	public void registerUSer() throws InterruptedException {
		homePageObj = new HomePage(testBaseDriver);
		regPageObj = new registrationPage(testBaseDriver);
		homePageObj.openRegisterationpage();
		regPageObj.registerNewUser("Fox3", "Last Fox", "Mo2@mo.com", "123456");
		Thread.sleep(5000);
		Assert.assertTrue(regPageObj.forassertion.getText().contains("teez"));
		
	}
}
