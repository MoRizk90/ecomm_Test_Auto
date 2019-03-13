package tests;

import org.testng.annotations.Test;

import pages.HomePage;

public class ContactUsTestCase extends testBase{

	HomePage homeObj;
	@Test
	public void scrollDown() throws InterruptedException {
		homeObj = new HomePage(testBaseDriver);
		homeObj.openContactUsLink();
	}
}
