package tests;

import org.testng.annotations.Test;

import data.LoadProperties;
import pages.HomePage;
import pages.registrationPage;

public class RegisterationTestCasesWithDTTandProp extends testBase {
	HomePage homePageObj;
	registrationPage regPageObj;
	String firstName = LoadProperties.userData.getProperty("firstName");
	String lastName = LoadProperties.userData.getProperty("LastName");
	String email = LoadProperties.userData.getProperty("email");
	String password = LoadProperties.userData.getProperty("password");
	
	@Test
	public void registerUSer() throws InterruptedException {
		homePageObj = new HomePage(testBaseDriver);
		regPageObj = new registrationPage(testBaseDriver);
		homePageObj.openRegisterationpage();
		regPageObj.registerNewUser(firstName, lastName, email, password);
		Thread.sleep(5000);
//		Assert.assertTrue(regPageObj.forassertion.getText().contains("teez"));
		
	}
}
