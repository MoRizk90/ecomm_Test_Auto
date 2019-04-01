package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.registrationPage;

public class RegisterationTestCases extends testBase {
	HomePage homePageObj;
	registrationPage regPageObj;
	String firstName = "power12	";
	String lastName = "testPower12";
	String email = "fox@Test.com";
	String password = "123456789";
	
	@Test
	public void registerUSer() throws InterruptedException {
		homePageObj = new HomePage(testBaseDriver);
		System.out.println(testBaseDriver);
		regPageObj = new registrationPage(testBaseDriver);
		homePageObj.openRegisterationpage();
		regPageObj.registerNewUser(firstName, lastName, email, password);
		Thread.sleep(5000);
//		Assert.assertTrue(regPageObj.forassertion.getText().contains("teez"));
		
	}
}
