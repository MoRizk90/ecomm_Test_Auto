package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class HomePageTestCase extends testBase{

	HomePage homePageObj;
	
	@Test
	public void openRegistrationTestCase() throws InterruptedException {
		homePageObj = new HomePage(testBaseDriver);
		homePageObj.openRegisterationpage();
		Thread.sleep(5000);
	}
}
